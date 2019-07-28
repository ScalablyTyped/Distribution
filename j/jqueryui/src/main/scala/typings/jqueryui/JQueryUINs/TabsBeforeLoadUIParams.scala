package typings.jqueryui.JQueryUINs

import typings.jquery.JQueryXHR
import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsBeforeLoadUIParams extends js.Object {
  var ajaxSettings: js.Any
  var jqXHR: JQueryXHR
  var panel: JQuery
  var tab: JQuery
}

object TabsBeforeLoadUIParams {
  @scala.inline
  def apply(ajaxSettings: js.Any, jqXHR: JQueryXHR, panel: JQuery, tab: JQuery): TabsBeforeLoadUIParams = {
    val __obj = js.Dynamic.literal(ajaxSettings = ajaxSettings, jqXHR = jqXHR, panel = panel, tab = tab)
  
    __obj.asInstanceOf[TabsBeforeLoadUIParams]
  }
}

