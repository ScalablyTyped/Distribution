package typings.jui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checked extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  var toggleEvent: js.UndefOr[String] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object Anon_Checked {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    event: js.Any = null,
    toggleEvent: String = null,
    tpl: js.Any = null
  ): Anon_Checked = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (event != null) __obj.updateDynamic("event")(event)
    if (toggleEvent != null) __obj.updateDynamic("toggleEvent")(toggleEvent)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[Anon_Checked]
  }
}

