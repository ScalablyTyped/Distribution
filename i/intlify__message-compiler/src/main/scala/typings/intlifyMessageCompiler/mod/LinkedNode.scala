package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedNode
  extends StObject
     with Node2
     with MessageElementNode {
  
  var key: LinkedKeyNode | NamedNode | ListNode | LiteralNode
  
  var modifier: js.UndefOr[LinkedModifierNode] = js.undefined
  
  @JSName("type")
  var type_LinkedNode: `6`
}
object LinkedNode {
  
  inline def apply(end: Double, key: LinkedKeyNode | NamedNode | ListNode | LiteralNode, start: Double): LinkedNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(6)
    __obj.asInstanceOf[LinkedNode]
  }
  
  extension [Self <: LinkedNode](x: Self) {
    
    inline def setKey(value: LinkedKeyNode | NamedNode | ListNode | LiteralNode): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setModifier(value: LinkedModifierNode): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setType(value: `6`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
