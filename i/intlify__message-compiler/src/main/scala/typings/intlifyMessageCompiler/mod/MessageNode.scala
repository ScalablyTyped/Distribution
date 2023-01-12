package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageNode
  extends StObject
     with Node2 {
  
  var items: js.Array[MessageElementNode]
  
  @JSName("type")
  var type_MessageNode: `2`
}
object MessageNode {
  
  inline def apply(end: Double, items: js.Array[MessageElementNode], start: Double): MessageNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(2)
    __obj.asInstanceOf[MessageNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageNode] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[MessageElementNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: MessageElementNode*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setType(value: `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
