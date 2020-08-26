package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.BindingContext
import typings.knockout.mod.BindingHandlerControlsDescendant
import typings.knockout.mod.MaybeSubscribable
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `5` extends js.Object {
  def init(
    element: Node,
    valueAccessor: js.Function0[MaybeSubscribable[js.Object]],
    allBindings: AllBindings,
    viewModel: js.Any,
    bindingContext: BindingContext[_]
  ): BindingHandlerControlsDescendant = js.native
}

object `5` {
  @scala.inline
  def apply(
    init: (Node, js.Function0[MaybeSubscribable[js.Object]], AllBindings, js.Any, BindingContext[_]) => BindingHandlerControlsDescendant
  ): `5` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction5(init))
    __obj.asInstanceOf[`5`]
  }
  @scala.inline
  implicit class `5Ops`[Self <: `5`] (val x: Self) extends AnyVal {
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
    def setInit(
      value: (Node, js.Function0[MaybeSubscribable[js.Object]], AllBindings, js.Any, BindingContext[_]) => BindingHandlerControlsDescendant
    ): Self = this.set("init", js.Any.fromFunction5(value))
  }
  
}

