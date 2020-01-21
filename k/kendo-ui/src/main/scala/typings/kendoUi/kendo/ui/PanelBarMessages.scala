package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarMessages extends js.Object {
  var loading: js.UndefOr[String] = js.undefined
  var requestFailed: js.UndefOr[String] = js.undefined
  var retry: js.UndefOr[String] = js.undefined
}

object PanelBarMessages {
  @scala.inline
  def apply(loading: String = null, requestFailed: String = null, retry: String = null): PanelBarMessages = {
    val __obj = js.Dynamic.literal()
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (requestFailed != null) __obj.updateDynamic("requestFailed")(requestFailed.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBarMessages]
  }
}

