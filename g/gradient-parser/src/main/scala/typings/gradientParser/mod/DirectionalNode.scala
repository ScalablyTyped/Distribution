package typings.gradientParser.mod

import typings.gradientParser.gradientParserStrings.`bottom left`
import typings.gradientParser.gradientParserStrings.`bottom right`
import typings.gradientParser.gradientParserStrings.`left bottom`
import typings.gradientParser.gradientParserStrings.`left top`
import typings.gradientParser.gradientParserStrings.`right bottom`
import typings.gradientParser.gradientParserStrings.`right top`
import typings.gradientParser.gradientParserStrings.`top left`
import typings.gradientParser.gradientParserStrings.`top right`
import typings.gradientParser.gradientParserStrings.bottom
import typings.gradientParser.gradientParserStrings.directional
import typings.gradientParser.gradientParserStrings.left
import typings.gradientParser.gradientParserStrings.right
import typings.gradientParser.gradientParserStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionalNode extends StObject {
  
  var `type`: directional
  
  var value: left | top | bottom | right | (`left top`) | (`top left`) | (`left bottom`) | (`bottom left`) | (`right top`) | (`top right`) | (`right bottom`) | (`bottom right`)
}
object DirectionalNode {
  
  inline def apply(
    value: left | top | bottom | right | (`left top`) | (`top left`) | (`left bottom`) | (`bottom left`) | (`right top`) | (`top right`) | (`right bottom`) | (`bottom right`)
  ): DirectionalNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("directional")
    __obj.asInstanceOf[DirectionalNode]
  }
  
  extension [Self <: DirectionalNode](x: Self) {
    
    inline def setType(value: directional): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: left | top | bottom | right | (`left top`) | (`top left`) | (`left bottom`) | (`bottom left`) | (`right top`) | (`top right`) | (`right bottom`) | (`bottom right`)
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
