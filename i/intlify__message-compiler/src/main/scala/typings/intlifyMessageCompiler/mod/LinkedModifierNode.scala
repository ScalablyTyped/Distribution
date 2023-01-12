package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedModifierNode
  extends StObject
     with Node2 {
  
  @JSName("type")
  var type_LinkedModifierNode: `8`
  
  var value: Identifier
}
object LinkedModifierNode {
  
  inline def apply(end: Double, start: Double, value: Identifier): LinkedModifierNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(8)
    __obj.asInstanceOf[LinkedModifierNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedModifierNode] (val x: Self) extends AnyVal {
    
    inline def setType(value: `8`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Identifier): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
