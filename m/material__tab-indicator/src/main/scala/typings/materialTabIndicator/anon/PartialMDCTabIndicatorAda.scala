package typings.materialTabIndicator.anon

import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/tab-indicator.@material/tab-indicator/adapter.MDCTabIndicatorAdapter> */
trait PartialMDCTabIndicatorAda extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var computeContentClientRect: js.UndefOr[js.Function0[ClientRect]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var setContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.undefined
}

object PartialMDCTabIndicatorAda {
  @scala.inline
  def apply(
    addClass: /* className */ String => Unit = null,
    computeContentClientRect: () => ClientRect = null,
    removeClass: /* className */ String => Unit = null,
    setContentStyleProperty: (/* propName */ String, /* value */ String) => Unit = null
  ): PartialMDCTabIndicatorAda = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1(addClass))
    if (computeContentClientRect != null) __obj.updateDynamic("computeContentClientRect")(js.Any.fromFunction0(computeContentClientRect))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1(removeClass))
    if (setContentStyleProperty != null) __obj.updateDynamic("setContentStyleProperty")(js.Any.fromFunction2(setContentStyleProperty))
    __obj.asInstanceOf[PartialMDCTabIndicatorAda]
  }
}

