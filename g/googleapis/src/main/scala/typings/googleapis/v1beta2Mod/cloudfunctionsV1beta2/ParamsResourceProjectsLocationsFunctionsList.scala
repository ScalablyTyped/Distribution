package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsFunctionsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The project and location from which the function should be listed,
    * specified in the format `projects/x/locations/x` If you want to list
    * functions in all locations, use "-" in place of a location.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of functions to return per call.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The value returned by the last `ListFunctionsResponse`; indicates that
    * this is a continuation of a prior `ListFunctions` call, and that the
    * system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsFunctionsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsFunctionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFunctionsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsFunctionsListMutableBuilder[Self <: ParamsResourceProjectsLocationsFunctionsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
