package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesServicelevelobjectivesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the ServiceLevelObjective to get. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * View of the ServiceLevelObjective to return. If DEFAULT, return the ServiceLevelObjective as originally defined. If EXPLICIT and the ServiceLevelObjective is defined in terms of a BasicSli, replace the BasicSli with a RequestBasedSli spelling out how the SLI is computed.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesServicelevelobjectivesGet {
  
  inline def apply(): ParamsResourceServicesServicelevelobjectivesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesServicelevelobjectivesGet]
  }
  
  extension [Self <: ParamsResourceServicesServicelevelobjectivesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
