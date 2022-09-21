package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the entry group to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and must start with a letter or underscore. The maximum size is 64 bytes when encoded in UTF-8.
    */
  var entryGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The names of the project and location that the new entry group belongs to. Note: The entry group itself and its child resources might not be stored in the location specified in its name.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1EntryGroup] = js.undefined
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
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1EntryGroup): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
