package typings.maximMazurokGapiClientBooks.gapi.client.books

import typings.maximMazurokGapiClientBooks.anon.ArtUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offers extends StObject {
  
  /** A list of offers. */
  var items: js.UndefOr[js.Array[ArtUrl]] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}
object Offers {
  
  inline def apply(): Offers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Offers] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[ArtUrl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ArtUrl*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
