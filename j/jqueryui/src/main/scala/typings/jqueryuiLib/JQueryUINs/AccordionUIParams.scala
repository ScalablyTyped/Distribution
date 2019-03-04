package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionUIParams extends js.Object {
  var newHeader: jqueryuiLib.JQuery
  var newPanel: jqueryuiLib.JQuery
  var oldHeader: jqueryuiLib.JQuery
  var oldPanel: jqueryuiLib.JQuery
}

object AccordionUIParams {
  @scala.inline
  def apply(
    newHeader: jqueryuiLib.JQuery,
    newPanel: jqueryuiLib.JQuery,
    oldHeader: jqueryuiLib.JQuery,
    oldPanel: jqueryuiLib.JQuery
  ): AccordionUIParams = {
    val __obj = js.Dynamic.literal(newHeader = newHeader, newPanel = newPanel, oldHeader = oldHeader, oldPanel = oldPanel)
  
    __obj.asInstanceOf[AccordionUIParams]
  }
}

