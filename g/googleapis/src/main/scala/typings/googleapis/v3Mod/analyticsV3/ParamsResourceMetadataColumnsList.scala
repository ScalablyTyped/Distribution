package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMetadataColumnsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Report type. Allowed Values: 'ga'. Where 'ga' corresponds to the Core
    * Reporting API
    */
  var reportType: js.UndefOr[String] = js.native
}
object ParamsResourceMetadataColumnsList {
  
  @scala.inline
  def apply(): ParamsResourceMetadataColumnsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMetadataColumnsList]
  }
  
  @scala.inline
  implicit class ParamsResourceMetadataColumnsListOps[Self <: ParamsResourceMetadataColumnsList] (val x: Self) extends AnyVal {
    
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
    def setReportType(value: String): Self = this.set("reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportType: Self = this.set("reportType", js.undefined)
  }
}
