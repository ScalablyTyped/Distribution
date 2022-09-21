package typings.gradientParser.mod

import typings.gradientParser.gradientParserStrings.`closest-corner`
import typings.gradientParser.gradientParserStrings.`closest-side`
import typings.gradientParser.gradientParserStrings.`extent-keyword`
import typings.gradientParser.gradientParserStrings.`farthest-corner`
import typings.gradientParser.gradientParserStrings.`farthest-side`
import typings.gradientParser.gradientParserStrings.contain
import typings.gradientParser.gradientParserStrings.cover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtentKeywordNode extends StObject {
  
  var at: js.UndefOr[PositionNode] = js.undefined
  
  var `type`: `extent-keyword`
  
  var value: `closest-side` | `closest-corner` | `farthest-side` | `farthest-corner` | contain | cover
}
object ExtentKeywordNode {
  
  inline def apply(value: `closest-side` | `closest-corner` | `farthest-side` | `farthest-corner` | contain | cover): ExtentKeywordNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("extent-keyword")
    __obj.asInstanceOf[ExtentKeywordNode]
  }
  
  extension [Self <: ExtentKeywordNode](x: Self) {
    
    inline def setAt(value: PositionNode): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setType(value: `extent-keyword`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `closest-side` | `closest-corner` | `farthest-side` | `farthest-corner` | contain | cover): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
