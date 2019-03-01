package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitViewOptions extends js.Object {
  var init: js.UndefOr[js.Function1[/* e */ SplitViewInitEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var show: js.UndefOr[js.Function1[/* e */ SplitViewShowEvent, scala.Unit]] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
}

object SplitViewOptions {
  @scala.inline
  def apply(
    init: js.Function1[/* e */ SplitViewInitEvent, scala.Unit] = null,
    name: java.lang.String = null,
    show: js.Function1[/* e */ SplitViewShowEvent, scala.Unit] = null,
    style: java.lang.String = null
  ): SplitViewOptions = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(init)
    if (name != null) __obj.updateDynamic("name")(name)
    if (show != null) __obj.updateDynamic("show")(show)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SplitViewOptions]
  }
}

