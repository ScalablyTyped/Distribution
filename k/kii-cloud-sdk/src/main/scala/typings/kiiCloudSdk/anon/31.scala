package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `31`[T] extends js.Object {
  def failure(error: Error): js.Any = js.native
  def success(topic: KiiTopic, message: T): js.Any = js.native
}

object `31` {
  @scala.inline
  def apply[T](failure: Error => js.Any, success: (KiiTopic, T) => js.Any): `31`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`31`[T]]
  }
  @scala.inline
  implicit class `31Ops`[Self <: `31`[_], T] (val x: Self with `31`[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailure(value: Error => js.Any): Self = this.set("failure", js.Any.fromFunction1(value))
    @scala.inline
    def setSuccess(value: (KiiTopic, T) => js.Any): Self = this.set("success", js.Any.fromFunction2(value))
  }
  
}

