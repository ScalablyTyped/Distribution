package typings.gradientParser.mod

import typings.gradientParser.gradientParserStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HexNode
  extends StObject
     with ColorStop {
  
  var length: js.UndefOr[PxNode | EmNode | PercentNode] = js.undefined
  
  var `type`: hex
  
  var value: String
}
object HexNode {
  
  inline def apply(value: String): HexNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hex")
    __obj.asInstanceOf[HexNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HexNode] (val x: Self) extends AnyVal {
    
    inline def setLength(value: PxNode | EmNode | PercentNode): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setType(value: hex): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
