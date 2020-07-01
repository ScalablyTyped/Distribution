package typings.icheck.ICheck

import typings.icheck.icheckStrings._empty
import typings.icheck.icheckStrings.checkbox
import typings.icheck.icheckStrings.radio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Class added on active state (mouse button is pressed on an input)
    * @default "active"
    */
  var activeClass: js.UndefOr[String] = js.undefined
  /**
    * Set true to activate ARIA support
    * @default false
    */
  var aria: js.UndefOr[Boolean] = js.undefined
  /**
    * Base class added to customized checkboxes
    * @default "icheckbox"
    */
  var checkboxClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'checkedClass' option (checkbox input specific)
    * @default ""
    */
  var checkedCheckboxClass: js.UndefOr[String] = js.undefined
  /**
    * Class added on checked state (input.checked = true)
    * @default "checked"
    */
  var checkedClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'checkedClass' option (radio button input specific)
    * @default ""
    */
  var checkedRadioClass: js.UndefOr[String] = js.undefined
  /**
    * True to set 'pointer' CSS cursor over enabled inputs and 'default' over disabled
    * @default false
    */
  var cursor: js.UndefOr[Boolean] = js.undefined
  /**
    * If not empty, used instead of 'determinateClass' option (checkbox input specific)
    * @default ""
    */
  var determinateCheckboxClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, added as class name on determinate state (input.indeterminate = false)
    * @default ""
    */
  var determinateClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'determinateClass' option (radio button input specific)
    * @default ""
    */
  var determinateRadioClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'disabledClass' option (checkbox input specific)
    * @default ""
    */
  var disabledCheckboxClass: js.UndefOr[String] = js.undefined
  /**
    * Class added on disabled state (input.disabled = true)
    * @default "disabled"
    */
  var disabledClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'disabledClass' option (radio button input specific)
    * @default ""
    */
  var disabledRadioClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'enabledClass' option (checkbox input specific)
    * @default ""
    */
  var enabledCheckboxClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, added as class name on enabled state (input.disabled = false)
    * @default ""
    */
  var enabledClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'enabledClass' option (radio button input specific)
    * @default ""
    */
  var enabledRadioClass: js.UndefOr[String] = js.undefined
  /**
    * Class added on focus state (input has gained focus)
    * @default "focus"
    */
  var focusClass: js.UndefOr[String] = js.undefined
  /**
    * 'checkbox' or 'radio' to style only checkboxes or radio buttons, both by default
    * @default ""
    */
  var handle: js.UndefOr[_empty | checkbox | radio] = js.undefined
  /**
    * Class added on hover state (pointer is moved onto an input)
    * @default "hover"
    */
  var hoverClass: js.UndefOr[String] = js.undefined
  /**
    * Increase clickable area by given % (negative number to decrease)
    * @default ""
    */
  var increaseArea: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'indeterminateClass' option (checkbox input specific)
    * @default ""
    */
  var indeterminateCheckboxClass: js.UndefOr[String] = js.undefined
  /**
    * Class added on indeterminate state (input.indeterminate = true)
    * @default "indeterminate"
    */
  var indeterminateClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'indeterminateClass' option (radio button input specific)
    * @default ""
    */
  var indeterminateRadioClass: js.UndefOr[String] = js.undefined
  /**
    * Set true to inherit original input's class name
    * @default false
    */
  var inheritClass: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, input's id is prefixed with 'iCheck-' and attached
    * @default false
    */
  var inheritID: js.UndefOr[Boolean] = js.undefined
  /**
    * Add HTML code or text inside customized input
    * @default ""
    */
  var insert: js.UndefOr[String] = js.undefined
  /**
    * Adds hoverClass to customized input on label hover and labelHoverClass to label on input hover
    * @default true
    */
  var labelHover: js.UndefOr[Boolean] = js.undefined
  /**
    * Class added to label if labelHover set to true
    * @default "hover"
    */
  var labelHoverClass: js.UndefOr[String] = js.undefined
  /**
    * Base class added to customized radio buttons
    * @default "iradio"
    */
  var radioClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'uncheckedClass' option (checkbox input specific)
    * @default ""
    */
  var uncheckedCheckboxClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, added as class name on unchecked state (input.checked = false)
    * @default ""
    */
  var uncheckedClass: js.UndefOr[String] = js.undefined
  /**
    * If not empty, used instead of 'uncheckedClass' option (radio button input specific)
    * @default ""
    */
  var uncheckedRadioClass: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    activeClass: String = null,
    aria: js.UndefOr[Boolean] = js.undefined,
    checkboxClass: String = null,
    checkedCheckboxClass: String = null,
    checkedClass: String = null,
    checkedRadioClass: String = null,
    cursor: js.UndefOr[Boolean] = js.undefined,
    determinateCheckboxClass: String = null,
    determinateClass: String = null,
    determinateRadioClass: String = null,
    disabledCheckboxClass: String = null,
    disabledClass: String = null,
    disabledRadioClass: String = null,
    enabledCheckboxClass: String = null,
    enabledClass: String = null,
    enabledRadioClass: String = null,
    focusClass: String = null,
    handle: _empty | checkbox | radio = null,
    hoverClass: String = null,
    increaseArea: String = null,
    indeterminateCheckboxClass: String = null,
    indeterminateClass: String = null,
    indeterminateRadioClass: String = null,
    inheritClass: js.UndefOr[Boolean] = js.undefined,
    inheritID: js.UndefOr[Boolean] = js.undefined,
    insert: String = null,
    labelHover: js.UndefOr[Boolean] = js.undefined,
    labelHoverClass: String = null,
    radioClass: String = null,
    uncheckedCheckboxClass: String = null,
    uncheckedClass: String = null,
    uncheckedRadioClass: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (!js.isUndefined(aria)) __obj.updateDynamic("aria")(aria.get.asInstanceOf[js.Any])
    if (checkboxClass != null) __obj.updateDynamic("checkboxClass")(checkboxClass.asInstanceOf[js.Any])
    if (checkedCheckboxClass != null) __obj.updateDynamic("checkedCheckboxClass")(checkedCheckboxClass.asInstanceOf[js.Any])
    if (checkedClass != null) __obj.updateDynamic("checkedClass")(checkedClass.asInstanceOf[js.Any])
    if (checkedRadioClass != null) __obj.updateDynamic("checkedRadioClass")(checkedRadioClass.asInstanceOf[js.Any])
    if (!js.isUndefined(cursor)) __obj.updateDynamic("cursor")(cursor.get.asInstanceOf[js.Any])
    if (determinateCheckboxClass != null) __obj.updateDynamic("determinateCheckboxClass")(determinateCheckboxClass.asInstanceOf[js.Any])
    if (determinateClass != null) __obj.updateDynamic("determinateClass")(determinateClass.asInstanceOf[js.Any])
    if (determinateRadioClass != null) __obj.updateDynamic("determinateRadioClass")(determinateRadioClass.asInstanceOf[js.Any])
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
    if (indeterminateCheckboxClass != null) __obj.updateDynamic("indeterminateCheckboxClass")(indeterminateCheckboxClass.asInstanceOf[js.Any])
    if (indeterminateClass != null) __obj.updateDynamic("indeterminateClass")(indeterminateClass.asInstanceOf[js.Any])
    if (indeterminateRadioClass != null) __obj.updateDynamic("indeterminateRadioClass")(indeterminateRadioClass.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritClass)) __obj.updateDynamic("inheritClass")(inheritClass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritID)) __obj.updateDynamic("inheritID")(inheritID.get.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (!js.isUndefined(labelHover)) __obj.updateDynamic("labelHover")(labelHover.get.asInstanceOf[js.Any])
    if (labelHoverClass != null) __obj.updateDynamic("labelHoverClass")(labelHoverClass.asInstanceOf[js.Any])
    if (radioClass != null) __obj.updateDynamic("radioClass")(radioClass.asInstanceOf[js.Any])
    if (uncheckedCheckboxClass != null) __obj.updateDynamic("uncheckedCheckboxClass")(uncheckedCheckboxClass.asInstanceOf[js.Any])
    if (uncheckedClass != null) __obj.updateDynamic("uncheckedClass")(uncheckedClass.asInstanceOf[js.Any])
    if (uncheckedRadioClass != null) __obj.updateDynamic("uncheckedRadioClass")(uncheckedRadioClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

