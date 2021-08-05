package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgBaseEditor
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets whether the editor value can become null.
    * If that option is false, and editor has no value, then value is set to an empty string.
    *
    */
  var allowNullValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Fired when the input field of the editor loses focus.
    */
  var blur: js.UndefOr[BlurEvent] = js.undefined
  
  /**
    * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
    *
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Fired when the input field of the editor gets focus.
    */
  var focus: js.UndefOr[IgFocusEvent] = js.undefined
  
  /**
    * Gets/Sets the height of the control.
    *
    *
    * Valid values:
    * "null" will fit the editor inside its parent container, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
    *
    */
  var inputName: js.UndefOr[String] = js.undefined
  
  /**
    * Fired on keydown event.
    * Return false in order to cancel key action.
    */
  var keydown: js.UndefOr[KeydownEvent] = js.undefined
  
  /**
    * Fired on keypress event.
    * Return false in order to cancel key action.
    */
  var keypress: js.UndefOr[KeypressEvent] = js.undefined
  
  /**
    * Fired on keyup event.
    */
  var keyup: js.UndefOr[KeyupEvent] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Fired on mousedown event.
    */
  var mousedown: js.UndefOr[MousedownEvent] = js.undefined
  
  /**
    * Fired on mousemove at any part of editor including the drop-down list.
    */
  var mousemove: js.UndefOr[MousemoveEvent] = js.undefined
  
  /**
    * Fired on mouseleave at any part of editor including the drop-down list.
    */
  var mouseout: js.UndefOr[MouseoutEvent] = js.undefined
  
  /**
    * Fired on mouseover at any part of editor including the drop-down list.
    */
  var mouseover: js.UndefOr[MouseoverEvent] = js.undefined
  
  /**
    * Fired on mouseup event.
    */
  var mouseup: js.UndefOr[MouseupEvent] = js.undefined
  
  /**
    * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
    *
    */
  var nullValue: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Gets/Sets the readonly attribute for the input. If set to true the input is readonly, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is submitted.
    *
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Fired after rendering of the editor has finished.
    */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  
  /**
    * Fired before rendering of the editor has finished.
    */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  
  /**
    * Gets/Sets tabIndex attribute for the editor input.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets/Sets options supported by the [igValidator](ui.igvalidator#options) widget.
    * Note: Validation rules of [igValidator](ui.igvalidator#options), such as min and max value/length are applied separately triggering errors,
    * while the corresponding options of the editor prevent values violating the defined rules from being entered.
    *
    */
  var validatorOptions: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets/Sets value in editor. The effect of setting/getting that option depends on type of editor and on dataMode options for every type of editor.
    *
    */
  var value: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Fired after the editor value is changed. It can be raised after loosing focus or on spin events.
    */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.undefined
  
  /**
    * Fired before changing the editor's value.
    * Return false in order to cancel change.
    * It can be raised after loosing focus or on spin events.
    */
  var valueChanging: js.UndefOr[ValueChangingEvent] = js.undefined
  
  /**
    * Gets/Sets the width of the control.
    *
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object IgBaseEditor {
  
  inline def apply(): IgBaseEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgBaseEditor]
  }
  
  extension [Self <: IgBaseEditor](x: Self) {
    
    inline def setAllowNullValue(value: Boolean): Self = StObject.set(x, "allowNullValue", value.asInstanceOf[js.Any])
    
    inline def setAllowNullValueUndefined: Self = StObject.set(x, "allowNullValue", js.undefined)
    
    inline def setBlur(value: (/* event */ Event, /* ui */ BlurEventUIParam) => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocus(value: (/* event */ Event, /* ui */ IgFocusEventUIParam) => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    inline def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    inline def setKeydown(value: (/* event */ Event, /* ui */ KeydownEventUIParam) => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction2(value))
    
    inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
    
    inline def setKeypress(value: (/* event */ Event, /* ui */ KeypressEventUIParam) => Unit): Self = StObject.set(x, "keypress", js.Any.fromFunction2(value))
    
    inline def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
    
    inline def setKeyup(value: (/* event */ Event, /* ui */ KeyupEventUIParam) => Unit): Self = StObject.set(x, "keyup", js.Any.fromFunction2(value))
    
    inline def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMousedown(value: (/* event */ Event, /* ui */ MousedownEventUIParam) => Unit): Self = StObject.set(x, "mousedown", js.Any.fromFunction2(value))
    
    inline def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
    
    inline def setMousemove(value: (/* event */ Event, /* ui */ MousemoveEventUIParam) => Unit): Self = StObject.set(x, "mousemove", js.Any.fromFunction2(value))
    
    inline def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
    
    inline def setMouseout(value: (/* event */ Event, /* ui */ MouseoutEventUIParam) => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction2(value))
    
    inline def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    inline def setMouseover(value: (/* event */ Event, /* ui */ MouseoverEventUIParam) => Unit): Self = StObject.set(x, "mouseover", js.Any.fromFunction2(value))
    
    inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
    
    inline def setMouseup(value: (/* event */ Event, /* ui */ MouseupEventUIParam) => Unit): Self = StObject.set(x, "mouseup", js.Any.fromFunction2(value))
    
    inline def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
    
    inline def setNullValue(value: String | Double): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setRendered(value: (/* event */ Event, /* ui */ RenderedEventUIParam) => Unit): Self = StObject.set(x, "rendered", js.Any.fromFunction2(value))
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setRendering(value: (/* event */ Event, /* ui */ RenderingEventUIParam) => Unit): Self = StObject.set(x, "rendering", js.Any.fromFunction2(value))
    
    inline def setRenderingUndefined: Self = StObject.set(x, "rendering", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setValidatorOptions(value: js.Any): Self = StObject.set(x, "validatorOptions", value.asInstanceOf[js.Any])
    
    inline def setValidatorOptionsUndefined: Self = StObject.set(x, "validatorOptions", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueChanged(value: (/* event */ Event, /* ui */ ValueChangedEventUIParam) => Unit): Self = StObject.set(x, "valueChanged", js.Any.fromFunction2(value))
    
    inline def setValueChangedUndefined: Self = StObject.set(x, "valueChanged", js.undefined)
    
    inline def setValueChanging(value: (/* event */ Event, /* ui */ ValueChangingEventUIParam) => Unit): Self = StObject.set(x, "valueChanging", js.Any.fromFunction2(value))
    
    inline def setValueChangingUndefined: Self = StObject.set(x, "valueChanging", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
