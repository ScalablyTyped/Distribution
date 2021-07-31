package typings.materialUiCore.anon

import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var node: HTMLInputElement
  
  var value: js.UndefOr[(js.Array[String | Double | Boolean]) | String | Double | Boolean] = js.undefined
}
object Node {
  
  @scala.inline
  def apply(node: HTMLInputElement): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: HTMLInputElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: (js.Array[String | Double | Boolean]) | String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
