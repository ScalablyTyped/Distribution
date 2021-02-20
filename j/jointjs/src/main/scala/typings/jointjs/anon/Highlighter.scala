package typings.jointjs.anon

import typings.jointjs.mod.highlighters.HighlighterJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Highlighter extends StObject {
  
  var highlighter: js.UndefOr[HighlighterJSON] = js.native
}
object Highlighter {
  
  @scala.inline
  def apply(): Highlighter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Highlighter]
  }
  
  @scala.inline
  implicit class HighlighterMutableBuilder[Self <: Highlighter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlighter(value: HighlighterJSON): Self = StObject.set(x, "highlighter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlighterUndefined: Self = StObject.set(x, "highlighter", js.undefined)
  }
}
