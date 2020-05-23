package typings.materialTabScroller.anon

import typings.std.ClientRect
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material/tab-scroller.@material/tab-scroller/adapter.MDCTabScrollerAdapter> */
trait PartialMDCTabScrollerAdap extends js.Object {
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var addScrollAreaClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var computeHorizontalScrollbarHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  var computeScrollAreaClientRect: js.UndefOr[js.Function0[ClientRect]] = js.undefined
  var computeScrollContentClientRect: js.UndefOr[js.Function0[ClientRect]] = js.undefined
  var eventTargetMatchesSelector: js.UndefOr[js.Function2[/* evtTarget */ EventTarget, /* selector */ String, Boolean]] = js.undefined
  var getScrollAreaOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  var getScrollAreaScrollLeft: js.UndefOr[js.Function0[Double]] = js.undefined
  var getScrollContentOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  var getScrollContentStyleValue: js.UndefOr[js.Function1[/* propertyName */ String, String]] = js.undefined
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  var setScrollAreaScrollLeft: js.UndefOr[js.Function1[/* scrollLeft */ Double, Unit]] = js.undefined
  var setScrollAreaStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.undefined
  var setScrollContentStyleProperty: js.UndefOr[js.Function2[/* propName */ String, /* value */ String, Unit]] = js.undefined
}

object PartialMDCTabScrollerAdap {
  @scala.inline
  def apply(
    addClass: /* className */ String => Unit = null,
    addScrollAreaClass: /* className */ String => Unit = null,
    computeHorizontalScrollbarHeight: () => Double = null,
    computeScrollAreaClientRect: () => ClientRect = null,
    computeScrollContentClientRect: () => ClientRect = null,
    eventTargetMatchesSelector: (/* evtTarget */ EventTarget, /* selector */ String) => Boolean = null,
    getScrollAreaOffsetWidth: () => Double = null,
    getScrollAreaScrollLeft: () => Double = null,
    getScrollContentOffsetWidth: () => Double = null,
    getScrollContentStyleValue: /* propertyName */ String => String = null,
    removeClass: /* className */ String => Unit = null,
    setScrollAreaScrollLeft: /* scrollLeft */ Double => Unit = null,
    setScrollAreaStyleProperty: (/* propName */ String, /* value */ String) => Unit = null,
    setScrollContentStyleProperty: (/* propName */ String, /* value */ String) => Unit = null
  ): PartialMDCTabScrollerAdap = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction1(addClass))
    if (addScrollAreaClass != null) __obj.updateDynamic("addScrollAreaClass")(js.Any.fromFunction1(addScrollAreaClass))
    if (computeHorizontalScrollbarHeight != null) __obj.updateDynamic("computeHorizontalScrollbarHeight")(js.Any.fromFunction0(computeHorizontalScrollbarHeight))
    if (computeScrollAreaClientRect != null) __obj.updateDynamic("computeScrollAreaClientRect")(js.Any.fromFunction0(computeScrollAreaClientRect))
    if (computeScrollContentClientRect != null) __obj.updateDynamic("computeScrollContentClientRect")(js.Any.fromFunction0(computeScrollContentClientRect))
    if (eventTargetMatchesSelector != null) __obj.updateDynamic("eventTargetMatchesSelector")(js.Any.fromFunction2(eventTargetMatchesSelector))
    if (getScrollAreaOffsetWidth != null) __obj.updateDynamic("getScrollAreaOffsetWidth")(js.Any.fromFunction0(getScrollAreaOffsetWidth))
    if (getScrollAreaScrollLeft != null) __obj.updateDynamic("getScrollAreaScrollLeft")(js.Any.fromFunction0(getScrollAreaScrollLeft))
    if (getScrollContentOffsetWidth != null) __obj.updateDynamic("getScrollContentOffsetWidth")(js.Any.fromFunction0(getScrollContentOffsetWidth))
    if (getScrollContentStyleValue != null) __obj.updateDynamic("getScrollContentStyleValue")(js.Any.fromFunction1(getScrollContentStyleValue))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction1(removeClass))
    if (setScrollAreaScrollLeft != null) __obj.updateDynamic("setScrollAreaScrollLeft")(js.Any.fromFunction1(setScrollAreaScrollLeft))
    if (setScrollAreaStyleProperty != null) __obj.updateDynamic("setScrollAreaStyleProperty")(js.Any.fromFunction2(setScrollAreaStyleProperty))
    if (setScrollContentStyleProperty != null) __obj.updateDynamic("setScrollContentStyleProperty")(js.Any.fromFunction2(setScrollContentStyleProperty))
    __obj.asInstanceOf[PartialMDCTabScrollerAdap]
  }
}

