package typings.jointjs.anon

import typings.jointjs.mod.highlighters.HighlighterJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlighter extends StObject {
  
  var highlighter: js.UndefOr[HighlighterJSON] = js.undefined
}
object Highlighter {
  
  inline def apply(): Highlighter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Highlighter]
  }
  
  extension [Self <: Highlighter](x: Self) {
    
    inline def setHighlighter(value: HighlighterJSON): Self = StObject.set(x, "highlighter", value.asInstanceOf[js.Any])
    
    inline def setHighlighterUndefined: Self = StObject.set(x, "highlighter", js.undefined)
  }
}
