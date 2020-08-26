package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import typings.kiiCloudSdk.KiiCloud.KiiQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `5`[T] extends js.Object {
  def failure(bucket: KiiBucket, anErrorString: String): js.Any = js.native
  def success(queryPerformed: KiiQuery, resultSet: js.Array[T], nextQuery: KiiQuery): js.Any = js.native
}

object `5` {
  @scala.inline
  def apply[T](failure: (KiiBucket, String) => js.Any, success: (KiiQuery, js.Array[T], KiiQuery) => js.Any): `5`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`5`[T]]
  }
  @scala.inline
  implicit class `5Ops`[Self <: `5`[_], T] (val x: Self with `5`[T]) extends AnyVal {
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
    def setFailure(value: (KiiBucket, String) => js.Any): Self = this.set("failure", js.Any.fromFunction2(value))
    @scala.inline
    def setSuccess(value: (KiiQuery, js.Array[T], KiiQuery) => js.Any): Self = this.set("success", js.Any.fromFunction3(value))
  }
  
}

