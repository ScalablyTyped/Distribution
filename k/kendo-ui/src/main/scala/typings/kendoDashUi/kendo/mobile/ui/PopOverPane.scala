package typings.kendoDashUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverPane extends js.Object {
  var initial: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
}

object PopOverPane {
  @scala.inline
  def apply(initial: String = null, layout: String = null, loading: String = null, transition: String = null): PopOverPane = {
    val __obj = js.Dynamic.literal()
    if (initial != null) __obj.updateDynamic("initial")(initial)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[PopOverPane]
  }
}

