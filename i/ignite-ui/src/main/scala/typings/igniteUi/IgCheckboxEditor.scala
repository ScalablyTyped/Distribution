package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgCheckboxEditor
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var allowNullValue: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired when the input field of the editor loses focus.
    */
  var blur: js.UndefOr[BlurEvent] = js.native
  
  /**
    * Gets/Sets whether the checkbox is checked.
    *
    */
  var checked: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
    *
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired when the input field of the editor gets focus.
    */
  var focus: js.UndefOr[IgFocusEvent] = js.native
  
  /**
    * Gets/Sets the height of the control.
    *
    *
    * Valid values:
    * "null" will fit the editor inside its parent container, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Gets/Sets a custom class on the checkbox. Custom image can be used this way.
    * The following jQuery classes can be used in addition http://api.jqueryui.com/theming/icons/
    *
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
    *
    */
  var inputName: js.UndefOr[String] = js.native
  
  /**
    * Fired on keydown event.
    * Return false in order to cancel key action.
    */
  var keydown: js.UndefOr[KeydownEvent] = js.native
  
  /**
    * Fired on keypress event.
    * Return false in order to cancel key action.
    */
  var keypress: js.UndefOr[KeypressEvent] = js.native
  
  /**
    * Fired on keyup event.
    */
  var keyup: js.UndefOr[KeyupEvent] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired on mousedown event.
    */
  var mousedown: js.UndefOr[MousedownEvent] = js.native
  
  /**
    * Fired on mousemove at any part of editor including the drop-down list.
    */
  var mousemove: js.UndefOr[MousemoveEvent] = js.native
  
  /**
    * Fired on mouseleave at any part of editor including the drop-down list.
    */
  var mouseout: js.UndefOr[MouseoutEvent] = js.native
  
  /**
    * Fired on mouseover at any part of editor including the drop-down list.
    */
  var mouseover: js.UndefOr[MouseoverEvent] = js.native
  
  /**
    * Fired on mouseup event.
    */
  var mouseup: js.UndefOr[MouseupEvent] = js.native
  
  var nullValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets the readonly attribute. Does not allow editing. Disables changing the checkbox state as an interaction, but it still can be changed programmatically. On submit the current value is sent into the request.
    *
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Fired after rendering of the editor has finished.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.native
  
  /**
    * Fired before rendering of the editor has finished.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.native
  
  /**
    * Gets/Sets size of the checkbox based on preset styles.For different sizes, define 'width' and 'height' options instead.
    *
    *
    * Valid values:
    * "verysmall" The size of the Checkbox editor is very small.
    * "small" The size of the Checkbox editor is small.
    * "normal" The size of the Checkbox editor is normal.
    * "large" The size of the Checkbox editor is large.
    */
  var size: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets tabIndex attribute for the editor input.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets options supported by the [igValidator](ui.igvalidator#options) widget.
    * Note: Validation rules of [igValidator](ui.igvalidator#options), such as min and max value/length are applied separately triggering errors,
    * while the corresponding options of the editor prevent values violating the defined rules from being entered.
    *
    */
  var validatorOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets value in editor. The effect of setting/getting that option depends on type of editor and on dataMode options for every type of editor.
    *
    */
  var value: js.UndefOr[js.Any] = js.native
  
  /**
    * Fired after the editor's value has been changed.
    */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.native
  
  /**
    * Fired before changing the editor's value.
    * Return false in order to cancel change.
    */
  var valueChanging: js.UndefOr[ValueChangingEvent] = js.native
  
  /**
    * Gets/Sets the width of the control.
    *
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgCheckboxEditor {
  
  @scala.inline
  def apply(): IgCheckboxEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgCheckboxEditor]
  }
  
  @scala.inline
  implicit class IgCheckboxEditorOps[Self <: IgCheckboxEditor] (val x: Self) extends AnyVal {
    
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
    def setAllowNullValue(value: Boolean): Self = this.set("allowNullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNullValue: Self = this.set("allowNullValue", js.undefined)
    
    @scala.inline
    def setBlur(value: (/* event */ Event, /* ui */ BlurEventUIParam) => Unit): Self = this.set("blur", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFocus(value: (/* event */ Event, /* ui */ IgFocusEventUIParam) => Unit): Self = this.set("focus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputName: Self = this.set("inputName", js.undefined)
    
    @scala.inline
    def setKeydown(value: (/* event */ Event, /* ui */ KeydownEventUIParam) => Unit): Self = this.set("keydown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    
    @scala.inline
    def setKeypress(value: (/* event */ Event, /* ui */ KeypressEventUIParam) => Unit): Self = this.set("keypress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteKeypress: Self = this.set("keypress", js.undefined)
    
    @scala.inline
    def setKeyup(value: (/* event */ Event, /* ui */ KeyupEventUIParam) => Unit): Self = this.set("keyup", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteKeyup: Self = this.set("keyup", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMousedown(value: (/* event */ Event, /* ui */ MousedownEventUIParam) => Unit): Self = this.set("mousedown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMousedown: Self = this.set("mousedown", js.undefined)
    
    @scala.inline
    def setMousemove(value: (/* event */ Event, /* ui */ MousemoveEventUIParam) => Unit): Self = this.set("mousemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMousemove: Self = this.set("mousemove", js.undefined)
    
    @scala.inline
    def setMouseout(value: (/* event */ Event, /* ui */ MouseoutEventUIParam) => Unit): Self = this.set("mouseout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMouseout: Self = this.set("mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(value: (/* event */ Event, /* ui */ MouseoverEventUIParam) => Unit): Self = this.set("mouseover", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMouseover: Self = this.set("mouseover", js.undefined)
    
    @scala.inline
    def setMouseup(value: (/* event */ Event, /* ui */ MouseupEventUIParam) => Unit): Self = this.set("mouseup", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMouseup: Self = this.set("mouseup", js.undefined)
    
    @scala.inline
    def setNullValue(value: js.Any): Self = this.set("nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullValue: Self = this.set("nullValue", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = this.set("rendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRendered: Self = this.set("rendered", js.undefined)
    
    @scala.inline
    def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = this.set("rendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRendering: Self = this.set("rendering", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setValidatorOptions(value: js.Any): Self = this.set("validatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidatorOptions: Self = this.set("validatorOptions", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueChanged(value: (/* event */ Event, /* ui */ ValueChangedEventUIParam) => Unit): Self = this.set("valueChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteValueChanged: Self = this.set("valueChanged", js.undefined)
    
    @scala.inline
    def setValueChanging(value: (/* event */ Event, /* ui */ ValueChangingEventUIParam) => Unit): Self = this.set("valueChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteValueChanging: Self = this.set("valueChanging", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
