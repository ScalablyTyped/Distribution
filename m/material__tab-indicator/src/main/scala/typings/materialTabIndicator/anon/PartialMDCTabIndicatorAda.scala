package typings.materialTabIndicator.anon

import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/tab-indicator.@material/tab-indicator/adapter.MDCTabIndicatorAdapter> */
@js.native
trait PartialMDCTabIndicatorAda extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var computeContentClientRect: js.UndefOr[js.Function0[ClientRect]] = js.native
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.native
  var setContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.native
}

object PartialMDCTabIndicatorAda {
  @scala.inline
  def apply(): PartialMDCTabIndicatorAda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTabIndicatorAda]
  }
  @scala.inline
  implicit class PartialMDCTabIndicatorAdaOps[Self <: PartialMDCTabIndicatorAda] (val x: Self) extends AnyVal {
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
    def setAddClass(value: /* className */ String => Unit): Self = this.set("addClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setComputeContentClientRect(value: () => ClientRect): Self = this.set("computeContentClientRect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComputeContentClientRect: Self = this.set("computeContentClientRect", js.undefined)
    @scala.inline
    def setRemoveClass(value: /* className */ String => Unit): Self = this.set("removeClass", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setSetContentStyleProperty(value: (/* propName */ String, /* value */ String) => Unit): Self = this.set("setContentStyleProperty", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetContentStyleProperty: Self = this.set("setContentStyleProperty", js.undefined)
  }
  
}

