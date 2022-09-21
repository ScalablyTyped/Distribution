package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Conditions to be used when deleting entities. From a proto standpoint, There are no restrictions on what can be passed using this field. The connector documentation should have information about what format of filters/conditions are supported. Note: If this conditions field is left empty, an exception is thrown. We don't want to consider 'empty conditions' to be a match-all case. Connector developers can determine and document what a match-all case constraint would be.
    */
  var conditions: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}
    */
  var entityType: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesDeleteentitieswithconditions](x: Self) {
    
    inline def setConditions(value: String): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
  }
}
