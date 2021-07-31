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
  
  @scala.inline
  def apply(): Bookshelves = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bookshelves]
  }
  
  @scala.inline
  implicit class BookshelvesMutableBuilder[Self <: Bookshelves] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Bookshelf]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Bookshelf*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
