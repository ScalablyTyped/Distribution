package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitViewOptions extends js.Object {
  var init: js.UndefOr[js.Function1[/* e */ SplitViewInitEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ SplitViewShowEvent, Unit]] = js.undefined
  var style: js.UndefOr[String] = js.undefined
}

object SplitViewOptions {
  @scala.inline
  def apply(
    init: /* e */ SplitViewInitEvent => Unit = null,
    name: String = null,
    show: /* e */ SplitViewShowEvent => Unit = null,
    style: String = null
  ): SplitViewOptions = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (name != null) __obj.updateDynamic("name")(name)
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SplitViewOptions]
  }
}

