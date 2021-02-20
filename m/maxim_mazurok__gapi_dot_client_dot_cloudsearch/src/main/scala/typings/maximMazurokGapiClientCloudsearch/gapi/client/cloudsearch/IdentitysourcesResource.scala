package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitysourcesResource extends StObject {
  
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
  implicit class IdentitysourcesResourceMutableBuilder[Self <: IdentitysourcesResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ItemsResource): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmappedids(value: UnmappedidsResource): Self = StObject.set(x, "unmappedids", value.asInstanceOf[js.Any])
  }
}
