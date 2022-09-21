package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Conditions to be used when updating entities. From a proto standpoint, There are no restrictions on what can be passed using this field. The connector documentation should have information about what format of filters/conditions are supported. Note: If this conditions field is left empty, an exception is thrown. We don't want to consider 'empty conditions' to be a match-all case. Connector developers can determine and document what a match-all case constraint would be.
    */
  var conditions: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}
    */
  var entityType: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEntity] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesUpdateentitieswithconditions](x: Self) {
    
    inline def setConditions(value: String): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    inline def setRequestBody(value: SchemaEntity): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
