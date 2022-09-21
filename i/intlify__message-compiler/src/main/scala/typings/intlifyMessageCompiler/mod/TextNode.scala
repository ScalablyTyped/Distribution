package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextNode
  extends StObject
     with Node2
     with MessageElementNode {
  
  @JSName("type")
  var type_TextNode: `3`
  
  var value: String
}
object TextNode {
  
  inline def apply(end: Double, start: Double, value: String): TextNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(3)
    __obj.asInstanceOf[TextNode]
  }
  
  extension [Self <: TextNode](x: Self) {
    
    inline def setType(value: `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
