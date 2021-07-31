package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnreserveItemsRequest extends StObject {
  
  /**
    * Name of connector making this call. &lt;br /&gt;Format:
    * datasources/{source_id}/connectors/{ID}
    */
  var connectorName: js.UndefOr[String] = js.undefined
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  /**
    * Name of a queue to unreserve items from.
    */
  var queue: js.UndefOr[String] = js.undefined
}
object SchemaUnreserveItemsRequest {
  
  @scala.inline
  def apply(): SchemaUnreserveItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnreserveItemsRequest]
  }
  
  @scala.inline
  implicit class SchemaUnreserveItemsRequestMutableBuilder[Self <: SchemaUnreserveItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    @scala.inline
    def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    @scala.inline
    def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
  }
}
