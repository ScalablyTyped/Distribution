package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMetadataColumnsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Report type. Allowed Values: 'ga'. Where 'ga' corresponds to the Core
    * Reporting API
    */
  var reportType: js.UndefOr[String] = js.undefined
}
object ParamsResourceMetadataColumnsList {
  
  @scala.inline
  def apply(): ParamsResourceMetadataColumnsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMetadataColumnsList]
  }
  
  @scala.inline
  implicit class ParamsResourceMetadataColumnsListMutableBuilder[Self <: ParamsResourceMetadataColumnsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setReportType(value: String): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
  }
}
