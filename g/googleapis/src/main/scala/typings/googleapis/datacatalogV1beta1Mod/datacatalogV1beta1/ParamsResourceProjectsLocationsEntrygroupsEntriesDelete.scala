package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsEntriesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the entry. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}/entries/{entry_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEntrygroupsEntriesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsEntrygroupsEntriesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEntrygroupsEntriesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEntrygroupsEntriesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
