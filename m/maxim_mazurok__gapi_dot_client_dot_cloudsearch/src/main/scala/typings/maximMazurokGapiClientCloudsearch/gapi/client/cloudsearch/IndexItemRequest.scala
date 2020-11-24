package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexItemRequest extends js.Object {
  
  /** Name of connector making this call. Format: datasources/{source_id}/connectors/{ID} */
  var connectorName: js.UndefOr[String] = js.native
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.native
  
  var indexItemOptions: js.UndefOr[IndexItemOptions] = js.native
  
  /** Name of the item. Format: datasources/{source_id}/items/{item_id} */
  var item: js.UndefOr[Item] = js.native
  
  /** Required. The RequestMode for this request. */
  var mode: js.UndefOr[String] = js.native
}
object IndexItemRequest {
  
  @scala.inline
  def apply(): IndexItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexItemRequest]
  }
  
  @scala.inline
  implicit class IndexItemRequestOps[Self <: IndexItemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectorName(value: String): Self = this.set("connectorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorName: Self = this.set("connectorName", js.undefined)
    
    @scala.inline
    def setDebugOptions(value: DebugOptions): Self = this.set("debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugOptions: Self = this.set("debugOptions", js.undefined)
    
    @scala.inline
    def setIndexItemOptions(value: IndexItemOptions): Self = this.set("indexItemOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexItemOptions: Self = this.set("indexItemOptions", js.undefined)
    
    @scala.inline
    def setItem(value: Item): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
