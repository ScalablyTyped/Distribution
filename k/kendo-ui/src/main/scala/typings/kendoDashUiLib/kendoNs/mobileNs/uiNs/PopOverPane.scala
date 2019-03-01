package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverPane extends js.Object {
  var initial: js.UndefOr[java.lang.String] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[java.lang.String] = js.undefined
  var transition: js.UndefOr[java.lang.String] = js.undefined
}

object PopOverPane {
  @scala.inline
  def apply(
    initial: java.lang.String = null,
    layout: java.lang.String = null,
    loading: java.lang.String = null,
    transition: java.lang.String = null
  ): PopOverPane = {
    val __obj = js.Dynamic.literal()
    if (initial != null) __obj.updateDynamic("initial")(initial)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[PopOverPane]
  }
}

