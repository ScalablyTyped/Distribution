package typings.highlightJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeHighlightContext extends StObject {
  
  var code: String
  
  var language: String
  
  var result: js.UndefOr[HighlightResult] = js.undefined
}
object BeforeHighlightContext {
  
  inline def apply(code: String, language: String): BeforeHighlightContext = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeHighlightContext]
  }
  
  extension [Self <: BeforeHighlightContext](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setResult(value: HighlightResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
