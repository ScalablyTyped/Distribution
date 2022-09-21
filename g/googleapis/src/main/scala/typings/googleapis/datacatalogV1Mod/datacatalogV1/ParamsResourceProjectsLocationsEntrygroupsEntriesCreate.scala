package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsEntriesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the entry to create. The ID must contain only letters (a-z, A-Z), numbers (0-9), and underscores (_). The maximum size is 64 bytes when encoded in UTF-8.
    */
  var entryId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the entry group this entry belongs to. Note: The entry itself and its child resources might not be stored in the location specified in its name.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDatacatalogV1Entry] = js.undefined
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
    
    inline def setRequestBody(value: SchemaGoogleCloudDatacatalogV1Entry): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
