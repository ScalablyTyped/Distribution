package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. If true, deletes all entries in the entry group.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The name of the entry group. For example, `projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEntrygroupsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsEntrygroupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEntrygroupsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEntrygroupsDelete](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
