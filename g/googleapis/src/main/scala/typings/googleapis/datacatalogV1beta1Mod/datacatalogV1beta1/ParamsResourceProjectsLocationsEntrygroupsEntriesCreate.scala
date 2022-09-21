package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsEntriesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the entry to create.
    */
  var entryId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the entry group this entry is in. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\} Note that this Entry and its child resources may not actually be stored in the location in this name.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1Entry] = js.undefined
}
object ParamsResourceProjectsLocationsEntrygroupsEntriesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsEntrygroupsEntriesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEntrygroupsEntriesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEntrygroupsEntriesCreate](x: Self) {
    
    inline def setEntryId(value: String): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setEntryIdUndefined: Self = StObject.set(x, "entryId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1beta1Entry): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
