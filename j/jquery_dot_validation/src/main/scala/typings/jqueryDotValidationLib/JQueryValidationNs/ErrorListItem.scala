package typings
package jqueryDotValidationLib.JQueryValidationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorListItem extends js.Object {
  var element: stdLib.HTMLElement
  var message: java.lang.String
}

object ErrorListItem {
  @scala.inline
  def apply(element: stdLib.HTMLElement, message: java.lang.String): ErrorListItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ErrorListItem]
  }
}

