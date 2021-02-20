package typings.jqueryAjaxfile.anon

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddDisposeCallback extends StObject {
  
  def addDisposeCallback(node: typings.std.Element, callback: js.Function): Unit = js.native
  
  def cleanNode(node: Node): typings.std.Element = js.native
  
  def removeDisposeCallback(node: typings.std.Element, callback: js.Function): Unit = js.native
  
  def removeNode(node: Node): Unit = js.native
}
object AddDisposeCallback {
  
  @scala.inline
  def apply(
    addDisposeCallback: (typings.std.Element, js.Function) => Unit,
    cleanNode: Node => typings.std.Element,
    removeDisposeCallback: (typings.std.Element, js.Function) => Unit,
    removeNode: Node => Unit
  ): AddDisposeCallback = {
    val __obj = js.Dynamic.literal(addDisposeCallback = js.Any.fromFunction2(addDisposeCallback), cleanNode = js.Any.fromFunction1(cleanNode), removeDisposeCallback = js.Any.fromFunction2(removeDisposeCallback), removeNode = js.Any.fromFunction1(removeNode))
    __obj.asInstanceOf[AddDisposeCallback]
  }
  
  @scala.inline
  implicit class AddDisposeCallbackMutableBuilder[Self <: AddDisposeCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDisposeCallback(value: (typings.std.Element, js.Function) => Unit): Self = StObject.set(x, "addDisposeCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCleanNode(value: Node => typings.std.Element): Self = StObject.set(x, "cleanNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveDisposeCallback(value: (typings.std.Element, js.Function) => Unit): Self = StObject.set(x, "removeDisposeCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveNode(value: Node => Unit): Self = StObject.set(x, "removeNode", js.Any.fromFunction1(value))
  }
}
