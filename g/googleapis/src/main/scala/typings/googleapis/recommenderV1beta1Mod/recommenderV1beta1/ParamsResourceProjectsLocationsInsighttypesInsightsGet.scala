package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInsighttypesInsightsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the insight.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInsighttypesInsightsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsInsighttypesInsightsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInsighttypesInsightsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInsighttypesInsightsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
