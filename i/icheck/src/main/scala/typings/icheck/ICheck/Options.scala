package typings.icheck.ICheck

import typings.icheck.icheckStrings._empty
import typings.icheck.icheckStrings.checkbox
import typings.icheck.icheckStrings.radio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Class added on active state (mouse button is pressed on an input)
    * @default "active"
    */
  var activeClass: js.UndefOr[String] = js.native
  
  /**
    * Set true to activate ARIA support
    * @default false
    */
  var aria: js.UndefOr[Boolean] = js.native
  
  /**
    * Base class added to customized checkboxes
    * @default "icheckbox"
    */
  var checkboxClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'checkedClass' option (checkbox input specific)
    * @default ""
    */
  var checkedCheckboxClass: js.UndefOr[String] = js.native
  
  /**
    * Class added on checked state (input.checked = true)
    * @default "checked"
    */
  var checkedClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'checkedClass' option (radio button input specific)
    * @default ""
    */
  var checkedRadioClass: js.UndefOr[String] = js.native
  
  /**
    * True to set 'pointer' CSS cursor over enabled inputs and 'default' over disabled
    * @default false
    */
  var cursor: js.UndefOr[Boolean] = js.native
  
  /**
    * If not empty, used instead of 'determinateClass' option (checkbox input specific)
    * @default ""
    */
  var determinateCheckboxClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, added as class name on determinate state (input.indeterminate = false)
    * @default ""
    */
  var determinateClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'determinateClass' option (radio button input specific)
    * @default ""
    */
  var determinateRadioClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'disabledClass' option (checkbox input specific)
    * @default ""
    */
  var disabledCheckboxClass: js.UndefOr[String] = js.native
  
  /**
    * Class added on disabled state (input.disabled = true)
    * @default "disabled"
    */
  var disabledClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'disabledClass' option (radio button input specific)
    * @default ""
    */
  var disabledRadioClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'enabledClass' option (checkbox input specific)
    * @default ""
    */
  var enabledCheckboxClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, added as class name on enabled state (input.disabled = false)
    * @default ""
    */
  var enabledClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'enabledClass' option (radio button input specific)
    * @default ""
    */
  var enabledRadioClass: js.UndefOr[String] = js.native
  
  /**
    * Class added on focus state (input has gained focus)
    * @default "focus"
    */
  var focusClass: js.UndefOr[String] = js.native
  
  /**
    * 'checkbox' or 'radio' to style only checkboxes or radio buttons, both by default
    * @default ""
    */
  var handle: js.UndefOr[_empty | checkbox | radio] = js.native
  
  /**
    * Class added on hover state (pointer is moved onto an input)
    * @default "hover"
    */
  var hoverClass: js.UndefOr[String] = js.native
  
  /**
    * Increase clickable area by given % (negative number to decrease)
    * @default ""
    */
  var increaseArea: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'indeterminateClass' option (checkbox input specific)
    * @default ""
    */
  var indeterminateCheckboxClass: js.UndefOr[String] = js.native
  
  /**
    * Class added on indeterminate state (input.indeterminate = true)
    * @default "indeterminate"
    */
  var indeterminateClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'indeterminateClass' option (radio button input specific)
    * @default ""
    */
  var indeterminateRadioClass: js.UndefOr[String] = js.native
  
  /**
    * Set true to inherit original input's class name
    * @default false
    */
  var inheritClass: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, input's id is prefixed with 'iCheck-' and attached
    * @default false
    */
  var inheritID: js.UndefOr[Boolean] = js.native
  
  /**
    * Add HTML code or text inside customized input
    * @default ""
    */
  var insert: js.UndefOr[String] = js.native
  
  /**
    * Adds hoverClass to customized input on label hover and labelHoverClass to label on input hover
    * @default true
    */
  var labelHover: js.UndefOr[Boolean] = js.native
  
  /**
    * Class added to label if labelHover set to true
    * @default "hover"
    */
  var labelHoverClass: js.UndefOr[String] = js.native
  
  /**
    * Base class added to customized radio buttons
    * @default "iradio"
    */
  var radioClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'uncheckedClass' option (checkbox input specific)
    * @default ""
    */
  var uncheckedCheckboxClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, added as class name on unchecked state (input.checked = false)
    * @default ""
    */
  var uncheckedClass: js.UndefOr[String] = js.native
  
  /**
    * If not empty, used instead of 'uncheckedClass' option (radio button input specific)
    * @default ""
    */
  var uncheckedRadioClass: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    
    @scala.inline
    def setAria(value: Boolean): Self = this.set("aria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAria: Self = this.set("aria", js.undefined)
    
    @scala.inline
    def setCheckboxClass(value: String): Self = this.set("checkboxClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxClass: Self = this.set("checkboxClass", js.undefined)
    
    @scala.inline
    def setCheckedCheckboxClass(value: String): Self = this.set("checkedCheckboxClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedCheckboxClass: Self = this.set("checkedCheckboxClass", js.undefined)
    
    @scala.inline
    def setCheckedClass(value: String): Self = this.set("checkedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedClass: Self = this.set("checkedClass", js.undefined)
    
    @scala.inline
    def setCheckedRadioClass(value: String): Self = this.set("checkedRadioClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedRadioClass: Self = this.set("checkedRadioClass", js.undefined)
    
    @scala.inline
    def setCursor(value: Boolean): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDeterminateCheckboxClass(value: String): Self = this.set("determinateCheckboxClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeterminateCheckboxClass: Self = this.set("determinateCheckboxClass", js.undefined)
    
    @scala.inline
    def setDeterminateClass(value: String): Self = this.set("determinateClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeterminateClass: Self = this.set("determinateClass", js.undefined)
    
    @scala.inline
    def setDeterminateRadioClass(value: String): Self = this.set("determinateRadioClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeterminateRadioClass: Self = this.set("determinateRadioClass", js.undefined)
    
    @scala.inline
    def setDisabledCheckboxClass(value: String): Self = this.set("disabledCheckboxClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledCheckboxClass: Self = this.set("disabledCheckboxClass", js.undefined)
    
    @scala.inline
    def setDisabledClass(value: String): Self = this.set("disabledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledClass: Self = this.set("disabledClass", js.undefined)
    
    @scala.inline
    def setDisabledRadioClass(value: String): Self = this.set("disabledRadioClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledRadioClass: Self = this.set("disabledRadioClass", js.undefined)
    
    @scala.inline
    def setEnabledCheckboxClass(value: String): Self = this.set("enabledCheckboxClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledCheckboxClass: Self = this.set("enabledCheckboxClass", js.undefined)
    
    @scala.inline
    def setEnabledClass(value: String): Self = this.set("enabledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledClass: Self = this.set("enabledClass", js.undefined)
    
    @scala.inline
    def setEnabledRadioClass(value: String): Self = this.set("enabledRadioClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledRadioClass: Self = this.set("enabledRadioClass", js.undefined)
    
    @scala.inline
    def setFocusClass(value: String): Self = this.set("focusClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusClass: Self = this.set("focusClass", js.undefined)
    
    @scala.inline
    def setHandle(value: _empty | checkbox | radio): Self = this.set("handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    
    @scala.inline
    def setHoverClass(value: String): Self = this.set("hoverClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverClass: Self = this.set("hoverClass", js.undefined)
    
    @scala.inline
    def setIncreaseArea(value: String): Self = this.set("increaseArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncreaseArea: Self = this.set("increaseArea", js.undefined)
    
    @scala.inline
    def setIndeterminateCheckboxClass(value: String): Self = this.set("indeterminateCheckboxClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminateCheckboxClass: Self = this.set("indeterminateCheckboxClass", js.undefined)
    
    @scala.inline
    def setIndeterminateClass(value: String): Self = this.set("indeterminateClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminateClass: Self = this.set("indeterminateClass", js.undefined)
    
    @scala.inline
    def setIndeterminateRadioClass(value: String): Self = this.set("indeterminateRadioClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndeterminateRadioClass: Self = this.set("indeterminateRadioClass", js.undefined)
    
    @scala.inline
    def setInheritClass(value: Boolean): Self = this.set("inheritClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritClass: Self = this.set("inheritClass", js.undefined)
    
    @scala.inline
    def setInheritID(value: Boolean): Self = this.set("inheritID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritID: Self = this.set("inheritID", js.undefined)
    
    @scala.inline
    def setInsert(value: String): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setLabelHover(value: Boolean): Self = this.set("labelHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHover: Self = this.set("labelHover", js.undefined)
    
    @scala.inline
    def setLabelHoverClass(value: String): Self = this.set("labelHoverClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelHoverClass: Self = this.set("labelHoverClass", js.undefined)
    
    @scala.inline
    def setRadioClass(value: String): Self = this.set("radioClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadioClass: Self = this.set("radioClass", js.undefined)
    
    @scala.inline
    def setUncheckedCheckboxClass(value: String): Self = this.set("uncheckedCheckboxClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncheckedCheckboxClass: Self = this.set("uncheckedCheckboxClass", js.undefined)
    
    @scala.inline
    def setUncheckedClass(value: String): Self = this.set("uncheckedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncheckedClass: Self = this.set("uncheckedClass", js.undefined)
    
    @scala.inline
    def setUncheckedRadioClass(value: String): Self = this.set("uncheckedRadioClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncheckedRadioClass: Self = this.set("uncheckedRadioClass", js.undefined)
  }
}
