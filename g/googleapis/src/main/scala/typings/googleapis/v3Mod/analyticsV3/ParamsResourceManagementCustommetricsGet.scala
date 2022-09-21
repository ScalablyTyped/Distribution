package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementCustommetricsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID for the custom metric to retrieve.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the custom metric to retrieve.
    */
  var customMetricId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID for the custom metric to retrieve.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementCustommetricsGet {
  
  inline def apply(): ParamsResourceManagementCustommetricsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementCustommetricsGet]
  }
  
  extension [Self <: ParamsResourceManagementCustommetricsGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCustomMetricId(value: String): Self = StObject.set(x, "customMetricId", value.asInstanceOf[js.Any])
    
    inline def setCustomMetricIdUndefined: Self = StObject.set(x, "customMetricId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
