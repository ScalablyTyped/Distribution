package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
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
  implicit class IgCheckboxEditorMutableBuilder[Self <: IgCheckboxEditor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNullValue(value: Boolean): Self = StObject.set(x, "allowNullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullValueUndefined: Self = StObject.set(x, "allowNullValue", js.undefined)
    
    @scala.inline
    def setBlur(value: (/* event */ Event, /* ui */ BlurEventUIParam) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFocus(value: (/* event */ Event, /* ui */ IgFocusEventUIParam) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    @scala.inline
    def setKeydown(value: (/* event */ Event, /* ui */ KeydownEventUIParam) => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    @scala.inline
    def setKeypress(value: (/* event */ Event, /* ui */ KeypressEventUIParam) => Unit): Self = StObject.set(x, "keypress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
    
    @scala.inline
    def setKeyup(value: (/* event */ Event, /* ui */ KeyupEventUIParam) => Unit): Self = StObject.set(x, "keyup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMousedown(value: (/* event */ Event, /* ui */ MousedownEventUIParam) => Unit): Self = StObject.set(x, "mousedown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
    
    @scala.inline
    def setMousemove(value: (/* event */ Event, /* ui */ MousemoveEventUIParam) => Unit): Self = StObject.set(x, "mousemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
    
    @scala.inline
    def setMouseout(value: (/* event */ Event, /* ui */ MouseoutEventUIParam) => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(value: (/* event */ Event, /* ui */ MouseoverEventUIParam) => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
    
    @scala.inline
    def setMouseup(value: (/* event */ Event, /* ui */ MouseupEventUIParam) => Unit): Self = StObject.set(x, "mouseup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
    
    @scala.inline
    def setNullValue(value: js.Any): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    @scala.inline
    def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = StObject.set(x, "rendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderingUndefined: Self = StObject.set(x, "rendering", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setValidatorOptions(value: js.Any): Self = StObject.set(x, "validatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorOptionsUndefined: Self = StObject.set(x, "validatorOptions", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: (/* event */ Event, /* ui */ ValueChangedEventUIParam) => Unit): Self = StObject.set(x, "valueChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueChangedUndefined: Self = StObject.set(x, "valueChanged", js.undefined)
    
    @scala.inline
    def setValueChanging(value: (/* event */ Event, /* ui */ ValueChangingEventUIParam) => Unit): Self = StObject.set(x, "valueChanging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueChangingUndefined: Self = StObject.set(x, "valueChanging", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
