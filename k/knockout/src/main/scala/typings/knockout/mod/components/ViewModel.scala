package typings.knockout.mod.components

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModel extends js.Object {
  var dispose: js.UndefOr[js.Function0[Unit]] = js.native
  var koDescendantsComplete: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
}

object ViewModel {
  @scala.inline
  def apply(): ViewModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewModel]
  }
  @scala.inline
  implicit class ViewModelOps[Self <: ViewModel] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
    @scala.inline
    def setKoDescendantsComplete(value: /* node */ Node => Unit): Self = this.set("koDescendantsComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKoDescendantsComplete: Self = this.set("koDescendantsComplete", js.undefined)
  }
  
}

