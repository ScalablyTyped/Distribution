package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSnippet extends StObject {
  
  /** A text snippet containing the search query. */
  var textSnippet: js.UndefOr[String] = js.undefined
}
object TextSnippet {
  
  inline def apply(): TextSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSnippet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextSnippet] (val x: Self) extends AnyVal {
    
    inline def setTextSnippet(value: String): Self = StObject.set(x, "textSnippet", value.asInstanceOf[js.Any])
    
    inline def setTextSnippetUndefined: Self = StObject.set(x, "textSnippet", js.undefined)
  }
}
