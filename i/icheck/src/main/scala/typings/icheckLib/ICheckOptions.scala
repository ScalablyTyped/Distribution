package typings
package icheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICheckOptions extends js.Object {
  /**
  	* Class added on active state (mouse button is pressed on an input)
  	*/
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Base class added to customized checkboxes
  	*/
  var checkboxClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* If not empty, used instead of 'checkedClass' option (checkbox input specific)
  	*/
  var checkedCheckboxClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Class added on checked state (input.checked = true)
  	*/
  var checkedClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* If not empty, used instead of 'checkedClass' option (radio button input specific)
  	*/
  var checkedRadioClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* True to set 'pointer' CSS cursor over enabled inputs and 'default' over disabled
  	*/
  var cursor: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	* If not empty, used instead of 'disabledClass' option (checkbox input specific)
  	*/
  var disabledCheckboxClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Class added on disabled state (input.disabled = true)
  	*/
  var disabledClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* If not empty, used instead of 'disabledClass' option (radio button input specific)
  	*/
  var disabledRadioClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* If not empty, used instead of 'enabledClass' option (checkbox input specific)
  	*/
  var enabledCheckboxClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* If not empty, added as class name on enabled state (input.disabled = false)
  	*/
  var enabledClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* If not empty, used instead of 'enabledClass' option (radio button input specific)
  	*/
  var enabledRadioClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Class added on focus state (input has gained focus)
  	*/
  var focusClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* 'checkbox' or 'radio' to style only checkboxes or radio buttons, both by default
  	*/
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Class added on hover state (pointer is moved onto an input)
  	*/
  var hoverClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Increase clickable area by given % (negative number to decrease)
  	*/
  var increaseArea: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Set true to inherit original input's class name
  	*/
  var inheritClass: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	* If set to true, input's id is prefixed with 'iCheck-' and attached
  	*/
  var inheritID: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	* Add HTML code or text inside customized input
  	*/
  var insert: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Adds hoverClass to customized input on label hover and labelHoverClass to label on input hover
  	*/
  var labelHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	* Class added to label if labelHover set to true
  	*/
  var labelHoverClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* Base class added to customized radio buttons
  	*/
  var radioClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* If not empty, used instead of 'uncheckedClass' option (checkbox input specific)
  	*/
  var uncheckedCheckboxClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* If not empty, added as class name on unchecked state (input.checked = false)
  	*/
  var uncheckedClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	* If not empty, used instead of 'uncheckedClass' option (radio button input specific)
  	*/
  var uncheckedRadioClass: js.UndefOr[java.lang.String] = js.undefined
}

