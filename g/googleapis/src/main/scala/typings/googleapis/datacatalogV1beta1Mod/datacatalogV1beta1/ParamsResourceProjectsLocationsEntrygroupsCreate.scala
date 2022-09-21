package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the entry group to create. The id must begin with a letter or underscore, contain only English letters, numbers and underscores, and be at most 64 characters.
    */
  var entryGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the project this entry group is in. Example: * projects/{project_id\}/locations/{location\} Note that this EntryGroup and its child resources may not actually be stored in the location in this name.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1EntryGroup] = js.undefined
}
object ParamsResourceProjectsLocationsEntrygroupsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsEntrygroupsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEntrygroupsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEntrygroupsCreate](x: Self) {
    
    inline def setEntryGroupId(value: String): Self = StObject.set(x, "entryGroupId", value.asInstanceOf[js.Any])
    
    inline def setEntryGroupIdUndefined: Self = StObject.set(x, "entryGroupId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1beta1EntryGroup): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
