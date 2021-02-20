package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnreserveItemsRequest extends StObject {
  
  /** Name of connector making this call. Format: datasources/{source_id}/connectors/{ID} */
  var connectorName: js.UndefOr[String] = js.native
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.native
  
  /** Name of a queue to unreserve items from. */
  var queue: js.UndefOr[String] = js.native
}
object UnreserveItemsRequest {
  
  @scala.inline
  def apply(): UnreserveItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnreserveItemsRequest]
  }
  
  @scala.inline
  implicit class UnreserveItemsRequestMutableBuilder[Self <: UnreserveItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    @scala.inline
    def setDebugOptions(value: DebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
  }
}
