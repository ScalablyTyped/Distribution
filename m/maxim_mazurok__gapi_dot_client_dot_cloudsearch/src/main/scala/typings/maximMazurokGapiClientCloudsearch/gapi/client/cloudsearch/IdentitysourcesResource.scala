package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitysourcesResource extends js.Object {
  
  var items: ItemsResource = js.native
  
  var unmappedids: UnmappedidsResource = js.native
}
object IdentitysourcesResource {
  
  @scala.inline
  def apply(items: ItemsResource, unmappedids: UnmappedidsResource): IdentitysourcesResource = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], unmappedids = unmappedids.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitysourcesResource]
  }
  
  @scala.inline
  implicit class IdentitysourcesResourceOps[Self <: IdentitysourcesResource] (val x: Self) extends AnyVal {
    
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
    def setItems(value: ItemsResource): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmappedids(value: UnmappedidsResource): Self = this.set("unmappedids", value.asInstanceOf[js.Any])
  }
}
