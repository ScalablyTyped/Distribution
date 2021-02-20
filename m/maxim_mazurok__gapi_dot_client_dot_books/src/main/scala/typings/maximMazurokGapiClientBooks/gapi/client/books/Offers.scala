package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.ArtUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offers extends StObject {
  
  /** A list of offers. */
  var items: js.UndefOr[js.Array[ArtUrl]] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
}
object Offers {
  
  @scala.inline
  def apply(): Offers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offers]
  }
  
  @scala.inline
  implicit class OffersMutableBuilder[Self <: Offers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ArtUrl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ArtUrl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
