package typings.icheck

import typings.icheck.icheckStrings._empty
import typings.icheck.icheckStrings.checkbox
import typings.icheck.icheckStrings.radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://github.com/fronteed/icheck
  */
object ICheck {
  
  trait Events extends StObject {
    
    /**
      * input's "checked", "disabled" or "indeterminate" state is changed
      */
    def ifChanged(): Unit
    
    /**
      * input's state is changed to "checked"
      */
    def ifChecked(): Unit
    
    /**
      * user clicked on a customized input or an assigned label
      */
    def ifClicked(): Unit
    
    /**
      * input is just customized
      */
    def ifCreated(): Unit
    
    /**
      * customization is just removed
      */
    def ifDestroyed(): Unit
    
    /**
      * "indeterminate" state is removed
      */
    def ifDeterminate(): Unit
    
    /**
      * input's state is changed to "disabled"
      */
    def ifDisabled(): Unit
    
    /**
      * "disabled" state is removed
      */
    def ifEnabled(): Unit
    
    /**
      * input's state is changed to "indeterminate"
      */
    def ifIndeterminate(): Unit
    
    /**
      * input's "checked" state is changed
      */
    def ifToggled(): Unit
    
    /**
      * "checked" state is removed
      */
    def ifUnchecked(): Unit
  }
  object Events {
    
    inline def apply(
      ifChanged: () => Unit,
      ifChecked: () => Unit,
      ifClicked: () => Unit,
      ifCreated: () => Unit,
      ifDestroyed: () => Unit,
      ifDeterminate: () => Unit,
      ifDisabled: () => Unit,
      ifEnabled: () => Unit,
      ifIndeterminate: () => Unit,
      ifToggled: () => Unit,
      ifUnchecked: () => Unit
    ): Events = {
      val __obj = js.Dynamic.literal(ifChanged = js.Any.fromFunction0(ifChanged), ifChecked = js.Any.fromFunction0(ifChecked), ifClicked = js.Any.fromFunction0(ifClicked), ifCreated = js.Any.fromFunction0(ifCreated), ifDestroyed = js.Any.fromFunction0(ifDestroyed), ifDeterminate = js.Any.fromFunction0(ifDeterminate), ifDisabled = js.Any.fromFunction0(ifDisabled), ifEnabled = js.Any.fromFunction0(ifEnabled), ifIndeterminate = js.Any.fromFunction0(ifIndeterminate), ifToggled = js.Any.fromFunction0(ifToggled), ifUnchecked = js.Any.fromFunction0(ifUnchecked))
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setIfChanged(value: () => Unit): Self = StObject.set(x, "ifChanged", js.Any.fromFunction0(value))
      
      inline def setIfChecked(value: () => Unit): Self = StObject.set(x, "ifChecked", js.Any.fromFunction0(value))
      
      inline def setIfClicked(value: () => Unit): Self = StObject.set(x, "ifClicked", js.Any.fromFunction0(value))
      
      inline def setIfCreated(value: () => Unit): Self = StObject.set(x, "ifCreated", js.Any.fromFunction0(value))
      
      inline def setIfDestroyed(value: () => Unit): Self = StObject.set(x, "ifDestroyed", js.Any.fromFunction0(value))
      
      inline def setIfDeterminate(value: () => Unit): Self = StObject.set(x, "ifDeterminate", js.Any.fromFunction0(value))
      
      inline def setIfDisabled(value: () => Unit): Self = StObject.set(x, "ifDisabled", js.Any.fromFunction0(value))
      
      inline def setIfEnabled(value: () => Unit): Self = StObject.set(x, "ifEnabled", js.Any.fromFunction0(value))
      
      inline def setIfIndeterminate(value: () => Unit): Self = StObject.set(x, "ifIndeterminate", js.Any.fromFunction0(value))
      
      inline def setIfToggled(value: () => Unit): Self = StObject.set(x, "ifToggled", js.Any.fromFunction0(value))
      
      inline def setIfUnchecked(value: () => Unit): Self = StObject.set(x, "ifUnchecked", js.Any.fromFunction0(value))
    }
  }
  
  trait Methods extends StObject {
    
    /**
      * change input's state to 'checked'
      */
    def check(): Unit
    
    /**
      * remove all traces of iCheck
      */
    def destroy(): Unit
    
    /**
      * remove 'indeterminate' state
      */
    def determinate(): Unit
    
    /**
      * change input's state to 'disabled'
      */
    def disable(): Unit
    
    /**
      * remove 'disabled' state
      */
    def enable(): Unit
    
    /**
      * change input's state to 'indeterminate'
      */
    def indeterminate(): Unit
    
    /**
      * toggle 'checked' state
      */
    def toggle(): Unit
    
    /**
      * remove 'checked' state
      */
    def uncheck(): Unit
    
    /**
      * apply input changes, which were done outside the plugin
      */
    def update(): Unit
  }
  object Methods {
    
    inline def apply(
      check: () => Unit,
      destroy: () => Unit,
      determinate: () => Unit,
      disable: () => Unit,
      enable: () => Unit,
      indeterminate: () => Unit,
      toggle: () => Unit,
      uncheck: () => Unit,
      update: () => Unit
    ): Methods = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), destroy = js.Any.fromFunction0(destroy), determinate = js.Any.fromFunction0(determinate), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), indeterminate = js.Any.fromFunction0(indeterminate), toggle = js.Any.fromFunction0(toggle), uncheck = js.Any.fromFunction0(uncheck), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setCheck(value: () => Unit): Self = StObject.set(x, "check", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDeterminate(value: () => Unit): Self = StObject.set(x, "determinate", js.Any.fromFunction0(value))
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setIndeterminate(value: () => Unit): Self = StObject.set(x, "indeterminate", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      inline def setUncheck(value: () => Unit): Self = StObject.set(x, "uncheck", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
      
      inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
      
      inline def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setCheckboxClass(value: String): Self = StObject.set(x, "checkboxClass", value.asInstanceOf[js.Any])
      
      inline def setCheckboxClassUndefined: Self = StObject.set(x, "checkboxClass", js.undefined)
      
      inline def setCheckedCheckboxClass(value: String): Self = StObject.set(x, "checkedCheckboxClass", value.asInstanceOf[js.Any])
      
      inline def setCheckedCheckboxClassUndefined: Self = StObject.set(x, "checkedCheckboxClass", js.undefined)
      
      inline def setCheckedClass(value: String): Self = StObject.set(x, "checkedClass", value.asInstanceOf[js.Any])
      
      inline def setCheckedClassUndefined: Self = StObject.set(x, "checkedClass", js.undefined)
      
      inline def setCheckedRadioClass(value: String): Self = StObject.set(x, "checkedRadioClass", value.asInstanceOf[js.Any])
      
      inline def setCheckedRadioClassUndefined: Self = StObject.set(x, "checkedRadioClass", js.undefined)
      
      inline def setCursor(value: Boolean): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDeterminateCheckboxClass(value: String): Self = StObject.set(x, "determinateCheckboxClass", value.asInstanceOf[js.Any])
      
      inline def setDeterminateCheckboxClassUndefined: Self = StObject.set(x, "determinateCheckboxClass", js.undefined)
      
      inline def setDeterminateClass(value: String): Self = StObject.set(x, "determinateClass", value.asInstanceOf[js.Any])
      
      inline def setDeterminateClassUndefined: Self = StObject.set(x, "determinateClass", js.undefined)
      
      inline def setDeterminateRadioClass(value: String): Self = StObject.set(x, "determinateRadioClass", value.asInstanceOf[js.Any])
      
      inline def setDeterminateRadioClassUndefined: Self = StObject.set(x, "determinateRadioClass", js.undefined)
      
      inline def setDisabledCheckboxClass(value: String): Self = StObject.set(x, "disabledCheckboxClass", value.asInstanceOf[js.Any])
      
      inline def setDisabledCheckboxClassUndefined: Self = StObject.set(x, "disabledCheckboxClass", js.undefined)
      
      inline def setDisabledClass(value: String): Self = StObject.set(x, "disabledClass", value.asInstanceOf[js.Any])
      
      inline def setDisabledClassUndefined: Self = StObject.set(x, "disabledClass", js.undefined)
      
      inline def setDisabledRadioClass(value: String): Self = StObject.set(x, "disabledRadioClass", value.asInstanceOf[js.Any])
      
      inline def setDisabledRadioClassUndefined: Self = StObject.set(x, "disabledRadioClass", js.undefined)
      
      inline def setEnabledCheckboxClass(value: String): Self = StObject.set(x, "enabledCheckboxClass", value.asInstanceOf[js.Any])
      
      inline def setEnabledCheckboxClassUndefined: Self = StObject.set(x, "enabledCheckboxClass", js.undefined)
      
      inline def setEnabledClass(value: String): Self = StObject.set(x, "enabledClass", value.asInstanceOf[js.Any])
      
      inline def setEnabledClassUndefined: Self = StObject.set(x, "enabledClass", js.undefined)
      
      inline def setEnabledRadioClass(value: String): Self = StObject.set(x, "enabledRadioClass", value.asInstanceOf[js.Any])
      
      inline def setEnabledRadioClassUndefined: Self = StObject.set(x, "enabledRadioClass", js.undefined)
      
      inline def setFocusClass(value: String): Self = StObject.set(x, "focusClass", value.asInstanceOf[js.Any])
      
      inline def setFocusClassUndefined: Self = StObject.set(x, "focusClass", js.undefined)
      
      inline def setHandle(value: _empty | checkbox | radio): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setHoverClass(value: String): Self = StObject.set(x, "hoverClass", value.asInstanceOf[js.Any])
      
      inline def setHoverClassUndefined: Self = StObject.set(x, "hoverClass", js.undefined)
      
      inline def setIncreaseArea(value: String): Self = StObject.set(x, "increaseArea", value.asInstanceOf[js.Any])
      
      inline def setIncreaseAreaUndefined: Self = StObject.set(x, "increaseArea", js.undefined)
      
      inline def setIndeterminateCheckboxClass(value: String): Self = StObject.set(x, "indeterminateCheckboxClass", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateCheckboxClassUndefined: Self = StObject.set(x, "indeterminateCheckboxClass", js.undefined)
      
      inline def setIndeterminateClass(value: String): Self = StObject.set(x, "indeterminateClass", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateClassUndefined: Self = StObject.set(x, "indeterminateClass", js.undefined)
      
      inline def setIndeterminateRadioClass(value: String): Self = StObject.set(x, "indeterminateRadioClass", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateRadioClassUndefined: Self = StObject.set(x, "indeterminateRadioClass", js.undefined)
      
      inline def setInheritClass(value: Boolean): Self = StObject.set(x, "inheritClass", value.asInstanceOf[js.Any])
      
      inline def setInheritClassUndefined: Self = StObject.set(x, "inheritClass", js.undefined)
      
      inline def setInheritID(value: Boolean): Self = StObject.set(x, "inheritID", value.asInstanceOf[js.Any])
      
      inline def setInheritIDUndefined: Self = StObject.set(x, "inheritID", js.undefined)
      
      inline def setInsert(value: String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setLabelHover(value: Boolean): Self = StObject.set(x, "labelHover", value.asInstanceOf[js.Any])
      
      inline def setLabelHoverClass(value: String): Self = StObject.set(x, "labelHoverClass", value.asInstanceOf[js.Any])
      
      inline def setLabelHoverClassUndefined: Self = StObject.set(x, "labelHoverClass", js.undefined)
      
      inline def setLabelHoverUndefined: Self = StObject.set(x, "labelHover", js.undefined)
      
      inline def setRadioClass(value: String): Self = StObject.set(x, "radioClass", value.asInstanceOf[js.Any])
      
      inline def setRadioClassUndefined: Self = StObject.set(x, "radioClass", js.undefined)
      
      inline def setUncheckedCheckboxClass(value: String): Self = StObject.set(x, "uncheckedCheckboxClass", value.asInstanceOf[js.Any])
      
      inline def setUncheckedCheckboxClassUndefined: Self = StObject.set(x, "uncheckedCheckboxClass", js.undefined)
      
      inline def setUncheckedClass(value: String): Self = StObject.set(x, "uncheckedClass", value.asInstanceOf[js.Any])
      
      inline def setUncheckedClassUndefined: Self = StObject.set(x, "uncheckedClass", js.undefined)
      
      inline def setUncheckedRadioClass(value: String): Self = StObject.set(x, "uncheckedRadioClass", value.asInstanceOf[js.Any])
      
      inline def setUncheckedRadioClassUndefined: Self = StObject.set(x, "uncheckedRadioClass", js.undefined)
    }
  }
}
