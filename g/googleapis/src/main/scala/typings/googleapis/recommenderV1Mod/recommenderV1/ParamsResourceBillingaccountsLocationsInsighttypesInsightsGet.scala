package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the insight.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet {
  
  inline def apply(): ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet]
  }
  
  extension [Self <: ParamsResourceBillingaccountsLocationsInsighttypesInsightsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
