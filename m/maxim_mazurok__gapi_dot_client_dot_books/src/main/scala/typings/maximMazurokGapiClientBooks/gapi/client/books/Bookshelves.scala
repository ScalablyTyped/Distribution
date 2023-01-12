package typings.maximMazurokGapiClientBooks.gapi.client.books

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bookshelves extends StObject {
  
  /** A list of bookshelves. */
  var items: js.UndefOr[js.Array[Bookshelf]] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}
object Bookshelves {
  
  inline def apply(): Bookshelves = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bookshelves]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bookshelves] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Bookshelf]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Bookshelf*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
