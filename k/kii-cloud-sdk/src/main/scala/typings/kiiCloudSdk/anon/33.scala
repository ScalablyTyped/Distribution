package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `33` extends js.Object {
  def failure(theUser: KiiUser, anErrorString: String): js.Any = js.native
  def success(theUser: KiiUser, groupList: js.Array[KiiGroup]): js.Any = js.native
}

object `33` {
  @scala.inline
  def apply(failure: (KiiUser, String) => js.Any, success: (KiiUser, js.Array[KiiGroup]) => js.Any): `33` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`33`]
  }
  @scala.inline
  implicit class `33Ops`[Self <: `33`] (val x: Self) extends AnyVal {
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
    def setFailure(value: (KiiUser, String) => js.Any): Self = this.set("failure", js.Any.fromFunction2(value))
    @scala.inline
    def setSuccess(value: (KiiUser, js.Array[KiiGroup]) => js.Any): Self = this.set("success", js.Any.fromFunction2(value))
  }
  
}

