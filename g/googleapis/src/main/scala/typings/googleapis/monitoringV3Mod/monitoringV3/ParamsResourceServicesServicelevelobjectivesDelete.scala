package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesServicelevelobjectivesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the ServiceLevelObjective to delete. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesServicelevelobjectivesDelete {
  
  inline def apply(): ParamsResourceServicesServicelevelobjectivesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesServicelevelobjectivesDelete]
  }
  
  extension [Self <: ParamsResourceServicesServicelevelobjectivesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
