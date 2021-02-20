package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBindingProvider extends StObject {
  
  def getBindingAccessors(node: Node, bindingContext: BindingContext[_]): BindingAccessors = js.native
  
  var getBindings: js.UndefOr[js.Function2[/* node */ Node, /* bindingContext */ BindingContext[_], js.Object]] = js.native
  
  def nodeHasBindings(node: Node): Boolean = js.native
  
  var preprocessNode: js.UndefOr[js.Function1[/* node */ Node, js.UndefOr[js.Array[Node]]]] = js.native
}
object IBindingProvider {
  
  @scala.inline
  def apply(
    getBindingAccessors: (Node, BindingContext[_]) => BindingAccessors,
    nodeHasBindings: Node => Boolean
  ): IBindingProvider = {
    val __obj = js.Dynamic.literal(getBindingAccessors = js.Any.fromFunction2(getBindingAccessors), nodeHasBindings = js.Any.fromFunction1(nodeHasBindings))
    __obj.asInstanceOf[IBindingProvider]
  }
  
  @scala.inline
  implicit class IBindingProviderMutableBuilder[Self <: IBindingProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBindingAccessors(value: (Node, BindingContext[_]) => BindingAccessors): Self = StObject.set(x, "getBindingAccessors", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBindings(value: (/* node */ Node, /* bindingContext */ BindingContext[_]) => js.Object): Self = StObject.set(x, "getBindings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBindingsUndefined: Self = StObject.set(x, "getBindings", js.undefined)
    
    @scala.inline
    def setNodeHasBindings(value: Node => Boolean): Self = StObject.set(x, "nodeHasBindings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreprocessNode(value: /* node */ Node => js.UndefOr[js.Array[Node]]): Self = StObject.set(x, "preprocessNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreprocessNodeUndefined: Self = StObject.set(x, "preprocessNode", js.undefined)
  }
}
