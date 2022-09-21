package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateInstanceMetadataItemsResponse extends StObject {
  
  /**
    * Map of items that were added/updated to/in the metadata.
    */
  var items: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaUpdateInstanceMetadataItemsResponse {
  
  inline def apply(): SchemaUpdateInstanceMetadataItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateInstanceMetadataItemsResponse]
  }
  
  extension [Self <: SchemaUpdateInstanceMetadataItemsResponse](x: Self) {
    
    inline def setItems(value: StringDictionary[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsNull: Self = StObject.set(x, "items", null)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
  }
}
