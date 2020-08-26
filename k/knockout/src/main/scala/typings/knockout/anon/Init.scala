package typings.knockout.anon

import typings.knockout.mod.BindingHandlerControlsDescendant
import typings.knockout.mod.MaybeSubscribable
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Init extends js.Object {
  def init(): BindingHandlerControlsDescendant = js.native
  def update(element: Node, valueAccessor: js.Function0[MaybeSubscribable[String]]): Unit = js.native
}

object Init {
  @scala.inline
  def apply(
    init: () => BindingHandlerControlsDescendant,
    update: (Node, js.Function0[MaybeSubscribable[String]]) => Unit
  ): Init = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Init]
  }
  @scala.inline
  implicit class InitOps[Self <: Init] (val x: Self) extends AnyVal {
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
    def setInit(value: () => BindingHandlerControlsDescendant): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: (Node, js.Function0[MaybeSubscribable[String]]) => Unit): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

