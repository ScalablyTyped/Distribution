package typings.grommet.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Suggestion extends StObject {
  
  var suggestion: js.Any = js.native
  
  var target: HTMLElement | Null = js.native
}
object Suggestion {
  
  @scala.inline
  def apply(suggestion: js.Any): Suggestion = {
    val __obj = js.Dynamic.literal(suggestion = suggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestion]
  }
  
  @scala.inline
  implicit class SuggestionMutableBuilder[Self <: Suggestion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestion(value: js.Any): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
  }
}
