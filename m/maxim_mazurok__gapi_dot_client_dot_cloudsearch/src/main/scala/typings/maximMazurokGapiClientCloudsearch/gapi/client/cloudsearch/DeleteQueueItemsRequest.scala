package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueueItemsRequest extends StObject {
  
  /** The name of connector making this call. Format: datasources/{source_id}/connectors/{ID} */
  var connectorName: js.UndefOr[String] = js.undefined
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.undefined
  
  /** The name of a queue to delete items from. */
  var queue: js.UndefOr[String] = js.undefined
}
object DeleteQueueItemsRequest {
  
  inline def apply(): DeleteQueueItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteQueueItemsRequest]
  }
  
  extension [Self <: DeleteQueueItemsRequest](x: Self) {
    
    inline def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    inline def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    inline def setDebugOptions(value: DebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
  }
}
