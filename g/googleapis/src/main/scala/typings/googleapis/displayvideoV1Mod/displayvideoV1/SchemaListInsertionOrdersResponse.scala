package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListInsertionOrdersResponse extends StObject {
  
  /**
    * The list of insertion orders. This list will be absent if empty.
    */
  var insertionOrders: js.UndefOr[js.Array[SchemaInsertionOrder]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListInsertionOrders` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListInsertionOrdersResponse {
  
  inline def apply(): SchemaListInsertionOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInsertionOrdersResponse]
  }
  
  extension [Self <: SchemaListInsertionOrdersResponse](x: Self) {
    
    inline def setInsertionOrders(value: js.Array[SchemaInsertionOrder]): Self = StObject.set(x, "insertionOrders", value.asInstanceOf[js.Any])
    
    inline def setInsertionOrdersUndefined: Self = StObject.set(x, "insertionOrders", js.undefined)
    
    inline def setInsertionOrdersVarargs(value: SchemaInsertionOrder*): Self = StObject.set(x, "insertionOrders", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
