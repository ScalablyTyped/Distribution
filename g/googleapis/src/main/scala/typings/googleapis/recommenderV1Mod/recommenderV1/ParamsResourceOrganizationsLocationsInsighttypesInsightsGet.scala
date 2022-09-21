package typings.googleapis.recommenderV1Mod.recommenderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsLocationsInsighttypesInsightsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the insight.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsLocationsInsighttypesInsightsGet {
  
  inline def apply(): ParamsResourceOrganizationsLocationsInsighttypesInsightsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsLocationsInsighttypesInsightsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsLocationsInsighttypesInsightsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
