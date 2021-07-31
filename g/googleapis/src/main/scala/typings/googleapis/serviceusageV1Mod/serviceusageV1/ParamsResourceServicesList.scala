package typings.googleapis.serviceusageV1Mod.serviceusageV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Only list services that conform to the given filter. The allowed filter
    * strings are `state:ENABLED` and `state:DISABLED`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Requested size of the next page of data. Requested page size cannot
    * exceed 200.  If not set, the default page size is 50.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token identifying which result to start with, which is returned by a
    * previous list call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Parent to search for services on.  An example name would be:
    * `projects/123` where `123` is the project number (not project ID).
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesList {
  
  @scala.inline
  def apply(): ParamsResourceServicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesList]
  }
  
  @scala.inline
  implicit class ParamsResourceServicesListMutableBuilder[Self <: ParamsResourceServicesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
