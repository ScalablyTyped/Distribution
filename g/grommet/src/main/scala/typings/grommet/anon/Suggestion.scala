package typings.grommet.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suggestion extends StObject {
  
  var suggestion: Any
  
  var target: HTMLElement | Null
}
object Suggestion {
  
  inline def apply(suggestion: Any): Suggestion = {
    val __obj = js.Dynamic.literal(suggestion = suggestion.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[Suggestion]
  }
  
  extension [Self <: Suggestion](x: Self) {
    
    inline def setSuggestion(value: Any): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
  }
}
