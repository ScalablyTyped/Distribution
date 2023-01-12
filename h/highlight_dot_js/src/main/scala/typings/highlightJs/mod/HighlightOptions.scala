package typings.highlightJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightOptions extends StObject {
  
  var ignoreIllegals: js.UndefOr[Boolean] = js.undefined
  
  var language: String
}
object HighlightOptions {
  
  inline def apply(language: String): HighlightOptions = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighlightOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreIllegals(value: Boolean): Self = StObject.set(x, "ignoreIllegals", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIllegalsUndefined: Self = StObject.set(x, "ignoreIllegals", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
