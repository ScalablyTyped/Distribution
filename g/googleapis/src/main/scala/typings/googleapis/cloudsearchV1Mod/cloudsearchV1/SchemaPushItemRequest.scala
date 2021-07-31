package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPushItemRequest extends StObject {
  
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
    * Item to push onto the queue.
    */
  var item: js.UndefOr[SchemaPushItem] = js.undefined
}
object SchemaPushItemRequest {
  
  @scala.inline
  def apply(): SchemaPushItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPushItemRequest]
  }
  
  @scala.inline
  implicit class SchemaPushItemRequestMutableBuilder[Self <: SchemaPushItemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorName(value: String): Self = StObject.set(x, "connectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorNameUndefined: Self = StObject.set(x, "connectorName", js.undefined)
    
    @scala.inline
    def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    @scala.inline
    def setItem(value: SchemaPushItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
