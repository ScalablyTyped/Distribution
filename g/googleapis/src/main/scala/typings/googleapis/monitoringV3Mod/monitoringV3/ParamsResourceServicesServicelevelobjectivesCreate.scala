package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesServicelevelobjectivesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the parent Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaServiceLevelObjective] = js.undefined
  
  /**
    * Optional. The ServiceLevelObjective id to use for this ServiceLevelObjective. If omitted, an id will be generated instead. Must match the pattern [a-z0-9\-]+
    */
  var serviceLevelObjectiveId: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesServicelevelobjectivesCreate {
  
  inline def apply(): ParamsResourceServicesServicelevelobjectivesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesServicelevelobjectivesCreate]
  }
  
  extension [Self <: ParamsResourceServicesServicelevelobjectivesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaServiceLevelObjective): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setServiceLevelObjectiveId(value: String): Self = StObject.set(x, "serviceLevelObjectiveId", value.asInstanceOf[js.Any])
    
    inline def setServiceLevelObjectiveIdUndefined: Self = StObject.set(x, "serviceLevelObjectiveId", js.undefined)
  }
}
