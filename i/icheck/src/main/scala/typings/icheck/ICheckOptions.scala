package typings.icheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckOptions extends js.Object {
  /**
  	* Class added on active state (mouse button is pressed on an input)
  	*/
  var activeClass: js.UndefOr[String] = js.undefined
  /**
  	* Base class added to customized checkboxes
  	*/
  var checkboxClass: js.UndefOr[String] = js.undefined
  /**
  	* If not empty, used instead of 'checkedClass' option (checkbox input specific)
  	*/
  var checkedCheckboxClass: js.UndefOr[String] = js.undefined
  /**
  	* Class added on checked state (input.checked = true)
  	*/
  var checkedClass: js.UndefOr[String] = js.undefined
  /**
  	* If not empty, used instead of 'checkedClass' option (radio button input specific)
  	*/
  var checkedRadioClass: js.UndefOr[String] = js.undefined
  /**
  	* True to set 'pointer' CSS cursor over enabled inputs and 'default' over disabled
  	*/
  var cursor: js.UndefOr[Boolean] = js.undefined
  /**
  	* If not empty, used instead of 'disabledClass' option (checkbox input specific)
  	*/
  var disabledCheckboxClass: js.UndefOr[String] = js.undefined
  /**
  	* Class added on disabled state (input.disabled = true)
  	*/
  var disabledClass: js.UndefOr[String] = js.undefined
  /**
  	* If not empty, used instead of 'disabledClass' option (radio button input specific)
  	*/
  var disabledRadioClass: js.UndefOr[String] = js.undefined
  /**
  	* If not empty, used instead of 'enabledClass' option (checkbox input specific)
  	*/
  var enabledCheckboxClass: js.UndefOr[String] = js.undefined
  /**
  	* If not empty, added as class name on enabled state (input.disabled = false)
  	*/
  var enabledClass: js.UndefOr[String] = js.undefined
  /**
  	* If not empty, used instead of 'enabledClass' option (radio button input specific)
  	*/
  var enabledRadioClass: js.UndefOr[String] = js.undefined
  /**
  	* Class added on focus state (input has gained focus)
  	*/
  var focusClass: js.UndefOr[String] = js.undefined
  /**
  	* 'checkbox' or 'radio' to style only checkboxes or radio buttons, both by default
  	*/
  var handle: js.UndefOr[String] = js.undefined
  /**
  	* Class added on hover state (pointer is moved onto an input)
  	*/
  var hoverClass: js.UndefOr[String] = js.undefined
  /**
  	* Increase clickable area by given % (negative number to decrease)
  	*/
  var increaseArea: js.UndefOr[String] = js.undefined
  /**
  	* Set true to inherit original input's class name
  	*/
  var inheritClass: js.UndefOr[Boolean] = js.undefined
  /**
  	* If set to true, input's id is prefixed with 'iCheck-' and attached
  	*/
  var inheritID: js.UndefOr[Boolean] = js.undefined
  /**
  	* Add HTML code or text inside customized input
  	*/
  var insert: js.UndefOr[String] = js.undefined
  /**
  	* Adds hoverClass to customized input on label hover and labelHoverClass to label on input hover
  	*/
  var labelHover: js.UndefOr[Boolean] = js.undefined
  /**
  	* Class added to label if labelHover set to true
  	*/
  var labelHoverClass: js.UndefOr[String] = js.undefined
  /**
  	* Base class added to customized radio buttons
  	*/
  var radioClass: js.UndefOr[String] = js.undefined
  /**
  	* If not empty, used instead of 'uncheckedClass' option (checkbox input specific)
  	*/
  var uncheckedCheckboxClass: js.UndefOr[String] = js.undefined
  /**
  	* If not empty, added as class name on unchecked state (input.checked = false)
  	*/
  var uncheckedClass: js.UndefOr[String] = js.undefined
  /**
  	* If not empty, used instead of 'uncheckedClass' option (radio button input specific)
  	*/
  var uncheckedRadioClass: js.UndefOr[String] = js.undefined
}

object ICheckOptions {
  @scala.inline
  def apply(
    activeClass: String = null,
    checkboxClass: String = null,
    checkedCheckboxClass: String = null,
    checkedClass: String = null,
    checkedRadioClass: String = null,
    cursor: js.UndefOr[Boolean] = js.undefined,
    disabledCheckboxClass: String = null,
    disabledClass: String = null,
    disabledRadioClass: String = null,
    enabledCheckboxClass: String = null,
    enabledClass: String = null,
    enabledRadioClass: String = null,
    focusClass: String = null,
    handle: String = null,
    hoverClass: String = null,
    increaseArea: String = null,
    inheritClass: js.UndefOr[Boolean] = js.undefined,
    inheritID: js.UndefOr[Boolean] = js.undefined,
    insert: String = null,
    labelHover: js.UndefOr[Boolean] = js.undefined,
    labelHoverClass: String = null,
    radioClass: String = null,
    uncheckedCheckboxClass: String = null,
    uncheckedClass: String = null,
    uncheckedRadioClass: String = null
  ): ICheckOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (checkboxClass != null) __obj.updateDynamic("checkboxClass")(checkboxClass.asInstanceOf[js.Any])
    if (checkedCheckboxClass != null) __obj.updateDynamic("checkedCheckboxClass")(checkedCheckboxClass.asInstanceOf[js.Any])
    if (checkedClass != null) __obj.updateDynamic("checkedClass")(checkedClass.asInstanceOf[js.Any])
    if (checkedRadioClass != null) __obj.updateDynamic("checkedRadioClass")(checkedRadioClass.asInstanceOf[js.Any])
    if (!js.isUndefined(cursor)) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (disabledCheckboxClass != null) __obj.updateDynamic("disabledCheckboxClass")(disabledCheckboxClass.asInstanceOf[js.Any])
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass.asInstanceOf[js.Any])
    if (disabledRadioClass != null) __obj.updateDynamic("disabledRadioClass")(disabledRadioClass.asInstanceOf[js.Any])
    if (enabledCheckboxClass != null) __obj.updateDynamic("enabledCheckboxClass")(enabledCheckboxClass.asInstanceOf[js.Any])
    if (enabledClass != null) __obj.updateDynamic("enabledClass")(enabledClass.asInstanceOf[js.Any])
    if (enabledRadioClass != null) __obj.updateDynamic("enabledRadioClass")(enabledRadioClass.asInstanceOf[js.Any])
    if (focusClass != null) __obj.updateDynamic("focusClass")(focusClass.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (hoverClass != null) __obj.updateDynamic("hoverClass")(hoverClass.asInstanceOf[js.Any])
    if (increaseArea != null) __obj.updateDynamic("increaseArea")(increaseArea.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritClass)) __obj.updateDynamic("inheritClass")(inheritClass.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritID)) __obj.updateDynamic("inheritID")(inheritID.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (!js.isUndefined(labelHover)) __obj.updateDynamic("labelHover")(labelHover.asInstanceOf[js.Any])
    if (labelHoverClass != null) __obj.updateDynamic("labelHoverClass")(labelHoverClass.asInstanceOf[js.Any])
    if (radioClass != null) __obj.updateDynamic("radioClass")(radioClass.asInstanceOf[js.Any])
    if (uncheckedCheckboxClass != null) __obj.updateDynamic("uncheckedCheckboxClass")(uncheckedCheckboxClass.asInstanceOf[js.Any])
    if (uncheckedClass != null) __obj.updateDynamic("uncheckedClass")(uncheckedClass.asInstanceOf[js.Any])
    if (uncheckedRadioClass != null) __obj.updateDynamic("uncheckedRadioClass")(uncheckedRadioClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckOptions]
  }
}

