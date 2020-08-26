package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `12` extends js.Object {
  def failure(obj: KiiObject, anErrorString: String): js.Any = js.native
  def success(theDeletedObject: KiiObject): js.Any = js.native
}

object `12` {
  @scala.inline
  def apply(failure: (KiiObject, String) => js.Any, success: KiiObject => js.Any): `12` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`12`]
  }
  @scala.inline
  implicit class `12Ops`[Self <: `12`] (val x: Self) extends AnyVal {
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
    def setFailure(value: (KiiObject, String) => js.Any): Self = this.set("failure", js.Any.fromFunction2(value))
    @scala.inline
    def setSuccess(value: KiiObject => js.Any): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

