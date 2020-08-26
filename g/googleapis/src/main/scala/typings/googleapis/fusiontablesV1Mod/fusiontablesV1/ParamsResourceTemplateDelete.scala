package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTemplateDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Table from which the template is being deleted
    */
  var tableId: js.UndefOr[String] = js.native
  /**
    * Identifier for the template which is being deleted
    */
  var templateId: js.UndefOr[Double] = js.native
}

object ParamsResourceTemplateDelete {
  @scala.inline
  def apply(): ParamsResourceTemplateDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTemplateDelete]
  }
  @scala.inline
  implicit class ParamsResourceTemplateDeleteOps[Self <: ParamsResourceTemplateDelete] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setTableId(value: String): Self = this.set("tableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableId: Self = this.set("tableId", js.undefined)
    @scala.inline
    def setTemplateId(value: Double): Self = this.set("templateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
  
}

