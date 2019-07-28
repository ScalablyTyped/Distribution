package typings.jqueryDotValidation.JQueryValidationNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorListItem extends js.Object {
  var element: HTMLElement
  var message: String
}

object ErrorListItem {
  @scala.inline
  def apply(element: HTMLElement, message: String): ErrorListItem = {
    val __obj = js.Dynamic.literal(element = element, message = message)
  
    __obj.asInstanceOf[ErrorListItem]
  }
}

