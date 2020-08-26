package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `34` extends js.Object {
  def failure(error: String, statusCode: Double): js.Any = js.native
  def success(adminContext: KiiAppAdminContext): js.Any = js.native
}

object `34` {
  @scala.inline
  def apply(failure: (String, Double) => js.Any, success: KiiAppAdminContext => js.Any): `34` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`34`]
  }
  @scala.inline
  implicit class `34Ops`[Self <: `34`] (val x: Self) extends AnyVal {
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
    def setFailure(value: (String, Double) => js.Any): Self = this.set("failure", js.Any.fromFunction2(value))
    @scala.inline
    def setSuccess(value: KiiAppAdminContext => js.Any): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

