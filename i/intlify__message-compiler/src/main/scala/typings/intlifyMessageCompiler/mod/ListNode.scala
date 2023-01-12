package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNode
  extends StObject
     with Node2
     with MessageElementNode {
  
  var index: Double
  
  @JSName("type")
  var type_ListNode: `5`
}
object ListNode {
  
  inline def apply(end: Double, index: Double, start: Double): ListNode = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(5)
    __obj.asInstanceOf[ListNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNode] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setType(value: `5`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
