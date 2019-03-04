package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSelectOptions extends js.Object {
  /**
    * Classes to be added to the select wrapper element
    * @default ''
    */
  var classes: java.lang.String
  /**
    * Pass options object to select dropdown initialization
    * @default {}
    */
  var dropdownOptions: stdLib.Partial[DropdownOptions]
}

object FormSelectOptions {
  @scala.inline
  def apply(classes: java.lang.String, dropdownOptions: stdLib.Partial[DropdownOptions]): FormSelectOptions = {
    val __obj = js.Dynamic.literal(classes = classes, dropdownOptions = dropdownOptions)
  
    __obj.asInstanceOf[FormSelectOptions]
  }
}

