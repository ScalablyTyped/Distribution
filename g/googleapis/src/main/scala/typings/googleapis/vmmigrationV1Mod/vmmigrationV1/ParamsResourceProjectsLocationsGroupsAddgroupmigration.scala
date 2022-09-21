package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGroupsAddgroupmigration
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The full path name of the Group to add to.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddGroupMigrationRequest] = js.undefined
}
object ParamsResourceProjectsLocationsGroupsAddgroupmigration {
  
  inline def apply(): ParamsResourceProjectsLocationsGroupsAddgroupmigration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGroupsAddgroupmigration]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGroupsAddgroupmigration](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setRequestBody(value: SchemaAddGroupMigrationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
