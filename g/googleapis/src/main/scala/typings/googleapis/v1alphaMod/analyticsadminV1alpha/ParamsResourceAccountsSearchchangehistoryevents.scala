package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsSearchchangehistoryevents
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The account resource for which to return change history resources.
    */
  var account: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsRequest] = js.undefined
}
object ParamsResourceAccountsSearchchangehistoryevents {
  
  inline def apply(): ParamsResourceAccountsSearchchangehistoryevents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsSearchchangehistoryevents]
  }
  
  extension [Self <: ParamsResourceAccountsSearchchangehistoryevents](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaSearchChangeHistoryEventsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
