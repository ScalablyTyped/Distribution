package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBindingProvider extends StObject {
  
  def getBindingAccessors(node: Node, bindingContext: BindingContext[Any]): BindingAccessors
  
  var getBindings: js.UndefOr[
    js.Function2[/* node */ Node, /* bindingContext */ BindingContext[Any], js.Object]
  ] = js.undefined
  
  def nodeHasBindings(node: Node): Boolean
  
  var preprocessNode: js.UndefOr[js.Function1[/* node */ Node, js.UndefOr[js.Array[Node]]]] = js.undefined
}
object IBindingProvider {
  
  inline def apply(
    getBindingAccessors: (Node, BindingContext[Any]) => BindingAccessors,
    nodeHasBindings: Node => Boolean
  ): IBindingProvider = {
    val __obj = js.Dynamic.literal(getBindingAccessors = js.Any.fromFunction2(getBindingAccessors), nodeHasBindings = js.Any.fromFunction1(nodeHasBindings))
    __obj.asInstanceOf[IBindingProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBindingProvider] (val x: Self) extends AnyVal {
    
    inline def setGetBindingAccessors(value: (Node, BindingContext[Any]) => BindingAccessors): Self = StObject.set(x, "getBindingAccessors", js.Any.fromFunction2(value))
    
    inline def setGetBindings(value: (/* node */ Node, /* bindingContext */ BindingContext[Any]) => js.Object): Self = StObject.set(x, "getBindings", js.Any.fromFunction2(value))
    
    inline def setGetBindingsUndefined: Self = StObject.set(x, "getBindings", js.undefined)
    
    inline def setNodeHasBindings(value: Node => Boolean): Self = StObject.set(x, "nodeHasBindings", js.Any.fromFunction1(value))
    
    inline def setPreprocessNode(value: /* node */ Node => js.UndefOr[js.Array[Node]]): Self = StObject.set(x, "preprocessNode", js.Any.fromFunction1(value))
    
    inline def setPreprocessNodeUndefined: Self = StObject.set(x, "preprocessNode", js.undefined)
  }
}
