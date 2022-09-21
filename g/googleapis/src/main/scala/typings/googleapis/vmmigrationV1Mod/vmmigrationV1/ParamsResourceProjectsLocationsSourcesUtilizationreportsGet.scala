package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSourcesUtilizationreportsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Utilization Report name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The level of details of the report. Defaults to FULL
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSourcesUtilizationreportsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsSourcesUtilizationreportsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSourcesUtilizationreportsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSourcesUtilizationreportsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
