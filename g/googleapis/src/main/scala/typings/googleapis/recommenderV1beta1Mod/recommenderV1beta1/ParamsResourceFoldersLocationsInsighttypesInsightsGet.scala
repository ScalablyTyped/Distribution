package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersLocationsInsighttypesInsightsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the insight.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersLocationsInsighttypesInsightsGet {
  
  inline def apply(): ParamsResourceFoldersLocationsInsighttypesInsightsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersLocationsInsighttypesInsightsGet]
  }
  
  extension [Self <: ParamsResourceFoldersLocationsInsighttypesInsightsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
