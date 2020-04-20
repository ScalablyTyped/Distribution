package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionUIParams extends js.Object {
  var newHeader: JQuery
  var newPanel: JQuery
  var oldHeader: JQuery
  var oldPanel: JQuery
}

object AccordionUIParams {
  @scala.inline
  def apply(newHeader: JQuery, newPanel: JQuery, oldHeader: JQuery, oldPanel: JQuery): AccordionUIParams = {
    val __obj = js.Dynamic.literal(newHeader = newHeader.asInstanceOf[js.Any], newPanel = newPanel.asInstanceOf[js.Any], oldHeader = oldHeader.asInstanceOf[js.Any], oldPanel = oldPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionUIParams]
  }
}

