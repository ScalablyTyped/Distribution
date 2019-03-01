package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsBeforeLoadUIParams extends js.Object {
  var ajaxSettings: js.Any
  var jqXHR: jqueryLib.JQueryXHR
  var panel: jqueryuiLib.JQuery
  var tab: jqueryuiLib.JQuery
}

object TabsBeforeLoadUIParams {
  @scala.inline
  def apply(
    ajaxSettings: js.Any,
    jqXHR: jqueryLib.JQueryXHR,
    panel: jqueryuiLib.JQuery,
    tab: jqueryuiLib.JQuery
  ): TabsBeforeLoadUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ajaxSettings")(ajaxSettings)
    __obj.updateDynamic("jqXHR")(jqXHR)
    __obj.updateDynamic("panel")(panel)
    __obj.updateDynamic("tab")(tab)
    __obj.asInstanceOf[TabsBeforeLoadUIParams]
  }
}

