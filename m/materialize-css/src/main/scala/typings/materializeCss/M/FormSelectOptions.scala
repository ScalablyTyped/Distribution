package typings.materializeCss.M

import typings.materializeCss.PartialDropdownOptionsAlignment
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
  var dropdownOptions: PartialDropdownOptionsAlignment
}

object FormSelectOptions {
  @scala.inline
  def apply(classes: String, dropdownOptions: PartialDropdownOptionsAlignment): FormSelectOptions = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], dropdownOptions = dropdownOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelectOptions]
  }
}

