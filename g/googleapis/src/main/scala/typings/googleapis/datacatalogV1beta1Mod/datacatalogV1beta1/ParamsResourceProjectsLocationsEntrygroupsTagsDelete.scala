package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsTagsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the tag to delete. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}/entries/{entry_id\}/tags/{tag_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEntrygroupsTagsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsEntrygroupsTagsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEntrygroupsTagsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEntrygroupsTagsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
