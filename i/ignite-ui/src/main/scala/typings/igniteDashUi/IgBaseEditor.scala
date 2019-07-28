package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBaseEditor
  extends /**
	 * Option for igBaseEditor
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
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igBaseEditor
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowNullValue: js.UndefOr[Boolean] = js.undefined,
    blur: BlurEvent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focus: IgFocusEvent = null,
    height: String | Double = null,
    inputName: String = null,
    keydown: KeydownEvent = null,
    keypress: KeypressEvent = null,
    keyup: KeyupEvent = null,
    language: String = null,
    locale: js.Any = null,
    mousedown: MousedownEvent = null,
    mousemove: MousemoveEvent = null,
    mouseout: MouseoutEvent = null,
    mouseover: MouseoverEvent = null,
    mouseup: MouseupEvent = null,
    nullValue: String | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    regional: String | js.Object = null,
    rendered: RenderedEvent = null,
    rendering: RenderingEvent = null,
    tabIndex: Int | Double = null,
    validatorOptions: js.Any = null,
    value: js.Any = null,
    valueChanged: ValueChangedEvent = null,
    valueChanging: ValueChangingEvent = null,
    width: String | Double = null
  ): IgBaseEditor = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowNullValue)) __obj.updateDynamic("allowNullValue")(allowNullValue)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName)
    if (keydown != null) __obj.updateDynamic("keydown")(keydown)
    if (keypress != null) __obj.updateDynamic("keypress")(keypress)
    if (keyup != null) __obj.updateDynamic("keyup")(keyup)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mousedown != null) __obj.updateDynamic("mousedown")(mousedown)
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove)
    if (mouseout != null) __obj.updateDynamic("mouseout")(mouseout)
    if (mouseover != null) __obj.updateDynamic("mouseover")(mouseover)
    if (mouseup != null) __obj.updateDynamic("mouseup")(mouseup)
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered)
    if (rendering != null) __obj.updateDynamic("rendering")(rendering)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (validatorOptions != null) __obj.updateDynamic("validatorOptions")(validatorOptions)
    if (value != null) __obj.updateDynamic("value")(value)
    if (valueChanged != null) __obj.updateDynamic("valueChanged")(valueChanged)
    if (valueChanging != null) __obj.updateDynamic("valueChanging")(valueChanging)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgBaseEditor]
  }
}

