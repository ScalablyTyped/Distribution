package typings.materializeDashCss.M

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSelectOptions extends js.Object {
  /**
    * Classes to be added to the select wrapper element
    * @default ''
    */
  var classes: String
  /**
    * Pass options object to select dropdown initialization
    * @default {}
    */
  var dropdownOptions: Partial[DropdownOptions]
}

object FormSelectOptions {
  @scala.inline
  def apply(classes: String, dropdownOptions: Partial[DropdownOptions]): FormSelectOptions = {
    val __obj = js.Dynamic.literal(classes = classes, dropdownOptions = dropdownOptions)
  
    __obj.asInstanceOf[FormSelectOptions]
  }
}

