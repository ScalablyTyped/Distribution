package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementCustomdatasourcesList
  extends StObject
     with StandardParameters {
  
  /**
    * Account Id for the custom data sources to retrieve.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The maximum number of custom data sources to include in this response.
    */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /**
    * A 1-based index of the first custom data source to retrieve. Use this
    * parameter as a pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.undefined
  
  /**
    * Web property Id for the custom data sources to retrieve.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementCustomdatasourcesList {
  
  @scala.inline
  def apply(): ParamsResourceManagementCustomdatasourcesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementCustomdatasourcesList]
  }
  
  @scala.inline
  implicit class ParamsResourceManagementCustomdatasourcesListMutableBuilder[Self <: ParamsResourceManagementCustomdatasourcesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    @scala.inline
    def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
