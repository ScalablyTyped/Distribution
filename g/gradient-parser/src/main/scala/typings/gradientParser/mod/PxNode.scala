package typings.gradientParser.mod

import typings.gradientParser.gradientParserStrings.px
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PxNode extends StObject {
  
  var `type`: px
  
  var value: String
}
object PxNode {
  
  inline def apply(value: String): PxNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("px")
    __obj.asInstanceOf[PxNode]
  }
  
  extension [Self <: PxNode](x: Self) {
    
    inline def setType(value: px): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
