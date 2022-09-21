package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateInstanceMetadataItemsRequest extends StObject {
  
  /**
    * Metadata items to add/update for the instance.
    */
  var items: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaUpdateInstanceMetadataItemsRequest {
  
  inline def apply(): SchemaUpdateInstanceMetadataItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateInstanceMetadataItemsRequest]
  }
  
  extension [Self <: SchemaUpdateInstanceMetadataItemsRequest](x: Self) {
    
    inline def setItems(value: StringDictionary[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsNull: Self = StObject.set(x, "items", null)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
  }
}
