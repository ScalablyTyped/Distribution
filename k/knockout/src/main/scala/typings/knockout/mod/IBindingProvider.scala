package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBindingProvider extends js.Object {
  var getBindings: js.UndefOr[js.Function2[/* node */ Node, /* bindingContext */ BindingContext[_], js.Object]] = js.native
  var preprocessNode: js.UndefOr[js.Function1[/* node */ Node, js.UndefOr[js.Array[Node]]]] = js.native
  def getBindingAccessors(node: Node, bindingContext: BindingContext[_]): BindingAccessors = js.native
  def nodeHasBindings(node: Node): Boolean = js.native
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
  implicit class IBindingProviderOps[Self <: IBindingProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetBindingAccessors(value: (Node, BindingContext[_]) => BindingAccessors): Self = this.set("getBindingAccessors", js.Any.fromFunction2(value))
    @scala.inline
    def setNodeHasBindings(value: Node => Boolean): Self = this.set("nodeHasBindings", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBindings(value: (/* node */ Node, /* bindingContext */ BindingContext[_]) => js.Object): Self = this.set("getBindings", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetBindings: Self = this.set("getBindings", js.undefined)
    @scala.inline
    def setPreprocessNode(value: /* node */ Node => js.UndefOr[js.Array[Node]]): Self = this.set("preprocessNode", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreprocessNode: Self = this.set("preprocessNode", js.undefined)
  }
  
}

