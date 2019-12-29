package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutShowEvent extends LayoutEvent {
  var layout: js.UndefOr[JQuery] = js.undefined
  var view: js.UndefOr[JQuery] = js.undefined
}

object LayoutShowEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Layout,
    layout: JQuery = null,
    view: JQuery = null
  ): LayoutShowEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutShowEvent]
  }
}

