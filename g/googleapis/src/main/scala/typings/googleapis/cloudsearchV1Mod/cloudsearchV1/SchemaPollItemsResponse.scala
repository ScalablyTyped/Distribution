package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPollItemsResponse extends StObject {
  
  /**
    * Set of items from the queue available for connector to process. These items have the following subset of fields populated: version metadata.hash structured_data.hash content.hash payload status queue
    */
  var items: js.UndefOr[js.Array[SchemaItem]] = js.undefined
}
object SchemaPollItemsResponse {
  
  inline def apply(): SchemaPollItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollItemsResponse]
  }
  
  extension [Self <: SchemaPollItemsResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
