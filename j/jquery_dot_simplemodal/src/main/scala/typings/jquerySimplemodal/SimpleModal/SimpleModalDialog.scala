package typings.jquerySimplemodal.SimpleModal

import typings.jquerySimplemodal.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Sent to callbacks as a parameter. */
trait SimpleModalDialog extends js.Object {
  var container: JQuery
  var data: js.Any
  var iframe: JQuery
  var overlay: JQuery
}

object SimpleModalDialog {
  @scala.inline
  def apply(container: JQuery, data: js.Any, iframe: JQuery, overlay: JQuery): SimpleModalDialog = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SimpleModalDialog]
  }
}

