package typings.gradientParser.mod

import typings.gradientParser.gradientParserStrings.`position-keyword`
import typings.gradientParser.gradientParserStrings.bottom
import typings.gradientParser.gradientParserStrings.center
import typings.gradientParser.gradientParserStrings.left
import typings.gradientParser.gradientParserStrings.right
import typings.gradientParser.gradientParserStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionKeywordNode extends StObject {
  
  var `type`: `position-keyword`
  
  var value: center | left | top | bottom | right
}
object PositionKeywordNode {
  
  inline def apply(value: center | left | top | bottom | right): PositionKeywordNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("position-keyword")
    __obj.asInstanceOf[PositionKeywordNode]
  }
  
  extension [Self <: PositionKeywordNode](x: Self) {
    
    inline def setType(value: `position-keyword`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: center | left | top | bottom | right): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
