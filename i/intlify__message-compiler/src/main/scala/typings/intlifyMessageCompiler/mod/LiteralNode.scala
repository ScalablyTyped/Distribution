package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralNode
  extends StObject
     with Node2
     with MessageElementNode {
  
  @JSName("type")
  var type_LiteralNode: `9`
  
  var value: String
}
object LiteralNode {
  
  inline def apply(end: Double, start: Double, value: String): LiteralNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[LiteralNode]
  }
  
  extension [Self <: LiteralNode](x: Self) {
    
    inline def setType(value: `9`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
