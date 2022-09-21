package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGroupsRemovegroupmigration
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the Group.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRemoveGroupMigrationRequest] = js.undefined
}
object ParamsResourceProjectsLocationsGroupsRemovegroupmigration {
  
  inline def apply(): ParamsResourceProjectsLocationsGroupsRemovegroupmigration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGroupsRemovegroupmigration]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGroupsRemovegroupmigration](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setRequestBody(value: SchemaRemoveGroupMigrationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
