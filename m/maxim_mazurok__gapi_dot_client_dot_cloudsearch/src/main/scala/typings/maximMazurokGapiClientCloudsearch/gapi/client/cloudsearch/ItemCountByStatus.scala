package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemCountByStatus extends StObject {
  
  /** Number of items matching the status code. */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * Number of items matching the status code for which billing is done. This excludes virtual container items from the total count. This count would not be applicable for items with
    * ERROR or NEW_ITEM status code.
    */
  var indexedItemsCount: js.UndefOr[String] = js.undefined
  
  /** Status of the items. */
  var statusCode: js.UndefOr[String] = js.undefined
}
object ItemCountByStatus {
  
  inline def apply(): ItemCountByStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemCountByStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemCountByStatus] (val x: Self) extends AnyVal {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setIndexedItemsCount(value: String): Self = StObject.set(x, "indexedItemsCount", value.asInstanceOf[js.Any])
    
    inline def setIndexedItemsCountUndefined: Self = StObject.set(x, "indexedItemsCount", js.undefined)
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
