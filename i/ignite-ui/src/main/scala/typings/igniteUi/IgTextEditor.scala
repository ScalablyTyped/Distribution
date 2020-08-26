package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTextEditor
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets/Sets whether the editor value can become null.
    * If that option is false, and editor has no value, then value is set to an empty string.
    *
    */
  var allowNullValue: js.UndefOr[Boolean] = js.native
  /**
    * Fired when the input field of the editor loses focus.
    */
  var blur: js.UndefOr[BlurEvent] = js.native
  /**
    * Gets visibility of the spin, clear and drop-down button. That option can be set only on initialization. Combinations like 'dropdown,spin' or 'spin,clear' are supported too.Note! This option can not be set runtime.
    *
    *
    * Valid values:
    * "dropdown" A button to open/close the list is located on the right side of the editor.
    * "clear" A button to clear the value is located on the right side of the editor.
    * "spin" Spin buttons are located on the right side of the editor.
    */
  var buttonType: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
    *
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets show/hide drop-down list animation duration in milliseconds.
    *
    */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.native
  /**
    * Gets whether the drop-down list element is attached to the body of the document, or to the editor container element.
    * If the option is set to false the editor will attach the drop-down list element to the editor container
    * If the option is set to true the editor will attach its drop-down list to as a child of the body.
    * Note! This option can not be set runtime.
    *
    */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.native
  /**
    * Fired after an item in the drop down list is selected.
    */
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.native
  /**
    * Fired when an item in the drop down list is being selected.
    */
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.native
  /**
    * Fired after the drop down is closed.
    */
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.native
  /**
    * Fired when the drop down is closing.
    */
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.native
  /**
    * Fired after the drop down is opened.
    */
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.native
  /**
    * Fired when the drop down is opening.
    */
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.native
  /**
    * Gets the ability to limit the editor to be used only as a dropdown list. When set to true the editor input is not editable.
    * Note! In case there are no list items - the editor will remain readonly
    * Note! This option can not be set runtime.
    *
    */
  var dropDownOnReadOnly: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the drop-down list opening orientation when the list gets open. If the option is set to auto the editor has priority to open the drop-down list bottom. If the space is not enough it tries to open the list top. If the space is not enough in both directions then the list gets opened at the bottom of the editor.
    *
    *
    * Valid values:
    * "auto" If the option is set to auto the editor has priority to open the drop-down list bottom. If the space is not enough it tries to open the list top. If the space is not enough in both directions then the list gets opened at the bottom of the editor.
    * "bottom" The drop-down list is opened at the bottom of the editor.
    * "top" The drop-down list is opened at the top of the editor.
    */
  var dropDownOrientation: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the ability of the editor to prevent entering specific characters from the keyboard or on paste.
    * Notes:
    * If both "excludeKeys" and "includeKeys" options are used, then "excludeKeys" has priority and includeKeys options is not respected.
    * The option is case sensitive! If the option is set runtime it's not applied on the current value.
    *
    */
  var excludeKeys: js.UndefOr[String] = js.native
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
    * Gets/Sets the ability of the editor to allow entering only specific characters in the input-field from the keyboard and on paste.
    * Notes:
    * If both "excludeKeys" and "includeKeys" options are used, then "excludeKeys" has priority and includeKeys options is not respected.
    * The option is case sensitive! If the option is set runtime it's not applied on the current value.
    *
    */
  var includeKeys: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
    *
    */
  var inputName: js.UndefOr[String] = js.native
  /**
    * Gets/Sets if the editor should only allow values from the list of items. Matching is case-insensitive.
    *
    */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.native
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
    * Gets/Sets the hover/unhover animation duration of a drop-down list item.
    *
    */
  var listItemHoverDuration: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets list of items which are used as a source for the drop-down list.
    * Items in the list can be of type string.
    *
    */
  var listItems: js.UndefOr[js.Array[_]] = js.native
  /**
    * Gets/Sets custom width of the drop-down list in pixels. If the value is equal to 0 or negative, then the width of editor is set as a drop-down width.
    *
    */
  var listWidth: js.UndefOr[Double] = js.native
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  /**
    * Gets/Sets the maximum length of a text which can be entered by the user.
    * Negative values or 0 disables that behavior. If set at runtime the editor doesn't apply the option to the current value.
    *
    */
  var maxLength: js.UndefOr[Double] = js.native
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
  /**
    * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
    *
    */
  var nullValue: js.UndefOr[String | Double] = js.native
  /**
    * Gets/Sets the text which appears in the editor when it has no focus and the "value" is null or empty string.
    *
    */
  var placeHolder: js.UndefOr[String] = js.native
  /**
    * Gets/Sets if the editor should prevent form submit when enter key is pressed.
    *
    */
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the readonly attribute for the input. If set to true the input is readonly, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is submitted.
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
    * Gets/Sets if the editor should revert it's value to the previously valid value in case the value on blur, or enter key is not valid. If the option is set to false, editor calls clear functionality.
    *
    */
  var revertIfNotValid: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the action when the editor gets focused. The default value is selectAll.
    *
    *
    * Valid values:
    * "selectAll" Setting this option will select all the text into the editor when the edit mode gets entered.
    * "atStart" Setting this option will move the cursor at the beginning the text into the editor when the edit mode gets entered.
    * "atEnd" Setting this option will move the cursor at the end the text into the editor when the edit mode gets entered.
    * "browserDefault" Setting this option won't do any extra logic, but proceed with the browser default behavior.
    */
  var selectionOnFocus: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the ability of the editor to automatically move the dropdown list selection item from one end to the opposite side. When the last item is reached and spin down is performed, the first item gets selected and vice versa. This option has no effect there is no drop-down list.
    *
    */
  var spinWrapAround: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets whether the onscreen keyboard (if available on device) should be shown when the dropdown button is clicked/tapped. This option prevents initial focus or removes it when the drop button is clicked/tapped.
    * Note: The option does not perform device detection so its behavior is always active if enabled.
    * Note: When drop down is opened the only way to close it will be using the drop down button.
    *
    */
  var suppressKeyboard: js.UndefOr[Boolean] = js.native
  /**
    * Disables/Enables default notifications for basic validation scenarios built in the editors such as required list selection, value wrapping around or spin limits.
    *
    */
  var suppressNotifications: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets tabIndex attribute for the editor input.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the horizontal alignment of the text in the editor.
    *
    *
    * Valid values:
    * "left" The text into the input gets aligned to the left.
    * "right" The text into the input gets aligned to the right.
    * "center" The text into the input gets aligned to the center.
    */
  var textAlign: js.UndefOr[String] = js.native
  /**
    * Fired after the editor's text has been changed. It can be raised when keyUp event occurs,
    * when the clear button is clicked or when an item from a list is selected.
    */
  var textChanged: js.UndefOr[TextChangedEvent] = js.native
  /**
    * Gets the text mode of the editor such as: single-line text editor, password editor or multiline editor. That option has effect only on initialization. If based element (selector) is TEXTAREA, then it is used as input-field.
    *
    *
    * Valid values:
    * "text" Single line text editor based on INPUT element is created.
    * "password" Editor based on INPUT element with type password is created.
    * "multiline" Multiline editor based on TEXTAREA element is created.
    */
  var textMode: js.UndefOr[String] = js.native
  /**
    * Gets/Sets the ability to convert the input characters to lower case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
    * Note! When the option is set at runtime the editor is not changing the current value.
    *
    */
  var toLower: js.UndefOr[Boolean] = js.native
  /**
    * Gets/Sets the ability to convert the input characters to upper case (true) or keeps the characters as they are (false). The option has effect only while keyboard entries and paste.
    * Note! When the option is set at runtime the editor is not changing the current value.
    *
    */
  var toUpper: js.UndefOr[Boolean] = js.native
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
    * Fired after the editor value is changed. It can be raised after loosing focus or on spin events.
    */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.native
  /**
    * Fired before changing the editor's value.
    * Return false in order to cancel change.
    * It can be raised after loosing focus or on spin events.
    */
  var valueChanging: js.UndefOr[ValueChangingEvent] = js.native
  /**
    * Gets the number of the items to be shown at once when the drop-down list get opened.
    * Notes:
    * This option is overwritten if the number of list items is less than the set value. In that case the drop-down list displays all the items.
    * This option can not be set runtime.
    *
    */
  var visibleItemsCount: js.UndefOr[Double] = js.native
  /**
    * Gets/Sets the width of the control.
    *
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgTextEditor {
  @scala.inline
  def apply(): IgTextEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTextEditor]
  }
  @scala.inline
  implicit class IgTextEditorOps[Self <: IgTextEditor] (val x: Self) extends AnyVal {
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
    def setButtonType(value: String): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonType: Self = this.set("buttonType", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropDownAnimationDuration(value: Double): Self = this.set("dropDownAnimationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownAnimationDuration: Self = this.set("dropDownAnimationDuration", js.undefined)
    @scala.inline
    def setDropDownAttachedToBody(value: Boolean): Self = this.set("dropDownAttachedToBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownAttachedToBody: Self = this.set("dropDownAttachedToBody", js.undefined)
    @scala.inline
    def setDropDownItemSelected(value: (/* event */ Event, /* ui */ DropDownItemSelectedEventUIParam) => Unit): Self = this.set("dropDownItemSelected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownItemSelected: Self = this.set("dropDownItemSelected", js.undefined)
    @scala.inline
    def setDropDownItemSelecting(value: (/* event */ Event, /* ui */ DropDownItemSelectingEventUIParam) => Unit): Self = this.set("dropDownItemSelecting", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownItemSelecting: Self = this.set("dropDownItemSelecting", js.undefined)
    @scala.inline
    def setDropDownListClosed(value: (/* event */ Event, /* ui */ DropDownListClosedEventUIParam) => Unit): Self = this.set("dropDownListClosed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownListClosed: Self = this.set("dropDownListClosed", js.undefined)
    @scala.inline
    def setDropDownListClosing(value: (/* event */ Event, /* ui */ DropDownListClosingEventUIParam) => Unit): Self = this.set("dropDownListClosing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownListClosing: Self = this.set("dropDownListClosing", js.undefined)
    @scala.inline
    def setDropDownListOpened(value: (/* event */ Event, /* ui */ DropDownListOpenedEventUIParam) => Unit): Self = this.set("dropDownListOpened", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownListOpened: Self = this.set("dropDownListOpened", js.undefined)
    @scala.inline
    def setDropDownListOpening(value: (/* event */ Event, /* ui */ DropDownListOpeningEventUIParam) => Unit): Self = this.set("dropDownListOpening", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDropDownListOpening: Self = this.set("dropDownListOpening", js.undefined)
    @scala.inline
    def setDropDownOnReadOnly(value: Boolean): Self = this.set("dropDownOnReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownOnReadOnly: Self = this.set("dropDownOnReadOnly", js.undefined)
    @scala.inline
    def setDropDownOrientation(value: String): Self = this.set("dropDownOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropDownOrientation: Self = this.set("dropDownOrientation", js.undefined)
    @scala.inline
    def setExcludeKeys(value: String): Self = this.set("excludeKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeKeys: Self = this.set("excludeKeys", js.undefined)
    @scala.inline
    def setFocus(value: (/* event */ Event, /* ui */ IgFocusEventUIParam) => Unit): Self = this.set("focus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIncludeKeys(value: String): Self = this.set("includeKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeKeys: Self = this.set("includeKeys", js.undefined)
    @scala.inline
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputName: Self = this.set("inputName", js.undefined)
    @scala.inline
    def setIsLimitedToListValues(value: Boolean): Self = this.set("isLimitedToListValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLimitedToListValues: Self = this.set("isLimitedToListValues", js.undefined)
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
    def setListItemHoverDuration(value: Double): Self = this.set("listItemHoverDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItemHoverDuration: Self = this.set("listItemHoverDuration", js.undefined)
    @scala.inline
    def setListItemsVarargs(value: js.Any*): Self = this.set("listItems", js.Array(value :_*))
    @scala.inline
    def setListItems(value: js.Array[_]): Self = this.set("listItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItems: Self = this.set("listItems", js.undefined)
    @scala.inline
    def setListWidth(value: Double): Self = this.set("listWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListWidth: Self = this.set("listWidth", js.undefined)
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
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
    def setNullValue(value: String | Double): Self = this.set("nullValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullValue: Self = this.set("nullValue", js.undefined)
    @scala.inline
    def setPlaceHolder(value: String): Self = this.set("placeHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceHolder: Self = this.set("placeHolder", js.undefined)
    @scala.inline
    def setPreventSubmitOnEnter(value: Boolean): Self = this.set("preventSubmitOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventSubmitOnEnter: Self = this.set("preventSubmitOnEnter", js.undefined)
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
    def setRevertIfNotValid(value: Boolean): Self = this.set("revertIfNotValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevertIfNotValid: Self = this.set("revertIfNotValid", js.undefined)
    @scala.inline
    def setSelectionOnFocus(value: String): Self = this.set("selectionOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionOnFocus: Self = this.set("selectionOnFocus", js.undefined)
    @scala.inline
    def setSpinWrapAround(value: Boolean): Self = this.set("spinWrapAround", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpinWrapAround: Self = this.set("spinWrapAround", js.undefined)
    @scala.inline
    def setSuppressKeyboard(value: Boolean): Self = this.set("suppressKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressKeyboard: Self = this.set("suppressKeyboard", js.undefined)
    @scala.inline
    def setSuppressNotifications(value: Boolean): Self = this.set("suppressNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressNotifications: Self = this.set("suppressNotifications", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextChanged(value: (/* event */ Event, /* ui */ TextChangedEventUIParam) => Unit): Self = this.set("textChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTextChanged: Self = this.set("textChanged", js.undefined)
    @scala.inline
    def setTextMode(value: String): Self = this.set("textMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextMode: Self = this.set("textMode", js.undefined)
    @scala.inline
    def setToLower(value: Boolean): Self = this.set("toLower", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToLower: Self = this.set("toLower", js.undefined)
    @scala.inline
    def setToUpper(value: Boolean): Self = this.set("toUpper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToUpper: Self = this.set("toUpper", js.undefined)
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
    def setVisibleItemsCount(value: Double): Self = this.set("visibleItemsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleItemsCount: Self = this.set("visibleItemsCount", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

