package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutHideEvent extends LayoutEvent {
  var layout: js.UndefOr[JQuery] = js.undefined
  var view: js.UndefOr[JQuery] = js.undefined
}

object LayoutHideEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typings.kendoDashUi.kendo.mobile.ui.Layout,
    layout: JQuery = null,
    view: JQuery = null
  ): LayoutHideEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[LayoutHideEvent]
  }
}

