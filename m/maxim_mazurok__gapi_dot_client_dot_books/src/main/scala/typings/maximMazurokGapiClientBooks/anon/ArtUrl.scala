package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtUrl extends StObject {
  
  var artUrl: js.UndefOr[String] = js.native
  
  var gservicesKey: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[Author]] = js.native
}
object ArtUrl {
  
  @scala.inline
  def apply(): ArtUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtUrl]
  }
  
  @scala.inline
  implicit class ArtUrlMutableBuilder[Self <: ArtUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtUrl(value: String): Self = StObject.set(x, "artUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtUrlUndefined: Self = StObject.set(x, "artUrl", js.undefined)
    
    @scala.inline
    def setGservicesKey(value: String): Self = StObject.set(x, "gservicesKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGservicesKeyUndefined: Self = StObject.set(x, "gservicesKey", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Author]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Author*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
