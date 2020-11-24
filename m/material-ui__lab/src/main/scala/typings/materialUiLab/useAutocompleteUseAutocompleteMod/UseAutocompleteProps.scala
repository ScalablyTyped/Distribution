package typings.materialUiLab.useAutocompleteUseAutocompleteMod

import typings.materialUiLab.materialUiLabBooleans.`false`
import typings.materialUiLab.materialUiLabBooleans.`true`
import typings.materialUiLab.materialUiLabStrings.mouse
import typings.materialUiLab.materialUiLabStrings.touch
import typings.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseAutocompleteProps[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends js.Object {
  
  /**
    * If `true`, the portion of the selected suggestion that has not been typed by the user,
    * known as the completion string, appears inline after the input cursor in the textbox.
    * The inline completion string is visually highlighted and has a selected state.
    */
  var autoComplete: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the first option is automatically highlighted.
    */
  var autoHighlight: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the selected option becomes the value of the input
    * when the Autocomplete loses focus unless the user chooses
    * a different option or changes the character string in the input.
    */
  var autoSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * Control if the input should be blurred when an option is selected:
    *
    * - `false` the input is not blurred.
    * - `true` the input is always blurred.
    * - `touch` the input is blurred after a touch event.
    * - `mouse` the input is blurred after a mouse event.
    */
  var blurOnSelect: js.UndefOr[touch | mouse | `true` | `false`] = js.native
  
  /**
    * If `true`, the input's text will be cleared on blur if no value is selected.
    *
    * Set to `true` if you want to help the user enter a new value.
    * Set to `false` if you want to help the user resume his search.
    */
  var clearOnBlur: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, clear all values when the user presses escape and the popup is closed.
    */
  var clearOnEscape: js.UndefOr[Boolean] = js.native
  
  /**
    * The component name that is using this hook. Used for warnings.
    */
  var componentName: js.UndefOr[String] = js.native
  
  /**
    * If `true`, the popup will ignore the blur event if the input is filled.
    * You can inspect the popup markup with your browser tools.
    * Consider this option when you need to customize the component.
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * The default input value. Use when the component is not controlled.
    */
  var defaultValue: js.UndefOr[Value[T, Multiple, DisableClearable, FreeSolo]] = js.native
  
  /**
    * If `true`, the input can't be cleared.
    */
  var disableClearable: js.UndefOr[DisableClearable] = js.native
  
  /**
    * If `true`, the popup won't close when a value is selected.
    */
  var disableCloseOnSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the list box in the popup will not wrap focus.
    */
  var disableListWrap: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, will allow focus on disabled items.
    */
  var disabledItemsFocusable: js.UndefOr[Boolean] = js.native
  
  /**
    * A filter function that determines the options that are eligible.
    *
    * @param {T[]} options The options to render.
    * @param {object} state The state of the component.
    * @returns {T[]}
    */
  var filterOptions: js.UndefOr[
    js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]
  ] = js.native
  
  /**
    * If `true`, hide the selected options from the list box.
    */
  var filterSelectedOptions: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the Autocomplete is free solo, meaning that the user input is not bound to provided options.
    */
  var freeSolo: js.UndefOr[FreeSolo] = js.native
  
  /**
    * Used to determine the disabled state for a given option.
    *
    * @param {T} option The option to test.
    * @returns {boolean}
    */
  var getOptionDisabled: js.UndefOr[js.Function1[/* option */ T, Boolean]] = js.native
  
  /**
    * Used to determine the string value for a given option.
    * It's used to fill the input (and the list box options if `renderOption` is not provided).
    *
    * @param {T} option
    * @returns {string}
    */
  var getOptionLabel: js.UndefOr[js.Function1[/* option */ T, String]] = js.native
  
  /**
    * Used to determine if an option is selected, considering the current value.
    * Uses strict equality by default.
    *
    * @param {T} option The option to test.
    * @param {T} value The value to test against.
    * @returns {boolean}
    */
  var getOptionSelected: js.UndefOr[js.Function2[/* option */ T, /* value */ T, Boolean]] = js.native
  
  /**
    * If provided, the options will be grouped under the returned string.
    * The groupBy value is also used as the text for group headings when `renderGroup` is not provided.
    *
    * @param {T} options The options to group.
    * @returns {string}
    */
  var groupBy: js.UndefOr[js.Function1[/* option */ T, String]] = js.native
  
  /**
    * If `true`, the component handles the "Home" and "End" keys when the popup is open.
    * It should move focus to the first option and last option, respectively.
    */
  var handleHomeEndKeys: js.UndefOr[Boolean] = js.native
  
  /**
    * This prop is used to help implement the accessibility logic.
    * If you don't provide this prop. It falls back to a randomly generated id.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * If `true`, the highlight can move to the input.
    */
  var includeInputInList: js.UndefOr[Boolean] = js.native
  
  /**
    * The input value.
    */
  var inputValue: js.UndefOr[String] = js.native
  
  /**
    * If `true`, `value` must be an array and the menu will support multiple selections.
    */
  var multiple: js.UndefOr[Multiple] = js.native
  
  /**
    * Callback fired when the value changes.
    *
    * @param {object} event The event source of the callback.
    * @param {T|T[]} value The new value of the component.
    * @param {string} reason One of "create-option", "select-option", "remove-option", "blur" or "clear".
    */
  var onChange: js.UndefOr[
    js.Function4[
      /* event */ ChangeEvent[js.Object], 
      /* value */ Value[T, Multiple, DisableClearable, FreeSolo], 
      /* reason */ AutocompleteChangeReason, 
      /* details */ js.UndefOr[AutocompleteChangeDetails[T]], 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback fired when the popup requests to be closed.
    * Use in controlled mode (see open).
    *
    * @param {object} event The event source of the callback.
    * @param {string} reason Can be: `"toggleInput"`, `"escape"`, `"select-option"`, `"blur"`.
    */
  var onClose: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[js.Object], /* reason */ AutocompleteCloseReason, Unit]
  ] = js.native
  
  /**
    * Callback fired when the highlight option changes.
    *
    * @param {object} event The event source of the callback.
    * @param {T} option The highlighted option.
    * @param {string} reason Can be: `"keyboard"`, `"auto"`, `"mouse"`.
    */
  var onHighlightChange: js.UndefOr[
    js.Function3[
      /* event */ ChangeEvent[js.Object], 
      /* option */ T | Null, 
      /* reason */ AutocompleteHighlightChangeReason, 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback fired when the input value changes.
    *
    * @param {object} event The event source of the callback.
    * @param {string} value The new value of the text input.
    * @param {string} reason Can be: `"input"` (user input), `"reset"` (programmatic change), `"clear"`.
    */
  var onInputChange: js.UndefOr[
    js.Function3[
      /* event */ ChangeEvent[js.Object], 
      /* value */ String, 
      /* reason */ AutocompleteInputChangeReason, 
      Unit
    ]
  ] = js.native
  
  /**
    * Callback fired when the popup requests to be opened.
    * Use in controlled mode (see open).
    *
    * @param {object} event The event source of the callback.
    */
  var onOpen: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  
  /**
    * Control the popup` open state.
    */
  var open: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the popup will open on input focus.
    */
  var openOnFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of options.
    */
  var options: js.Array[T] = js.native
  
  /**
    * If `true`, the input's text will be selected on focus.
    * It helps the user clear the selected value.
    */
  var selectOnFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * The value of the autocomplete.
    *
    * The value must have reference equality with the option in order to be selected.
    * You can customize the equality behavior with the `getOptionSelected` prop.
    */
  var value: js.UndefOr[Value[T, Multiple, DisableClearable, FreeSolo]] = js.native
}
object UseAutocompleteProps {
  
  @scala.inline
  def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](options: js.Array[T]): UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]]
  }
  
  @scala.inline
  implicit class UseAutocompletePropsOps[Self <: UseAutocompleteProps[_, _, _, _], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] (val x: Self with (UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo])) extends AnyVal {
    
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
    def setOptionsVarargs(value: T*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[T]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoComplete(value: Boolean): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    
    @scala.inline
    def setAutoHighlight(value: Boolean): Self = this.set("autoHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHighlight: Self = this.set("autoHighlight", js.undefined)
    
    @scala.inline
    def setAutoSelect(value: Boolean): Self = this.set("autoSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSelect: Self = this.set("autoSelect", js.undefined)
    
    @scala.inline
    def setBlurOnSelect(value: touch | mouse | `true` | `false`): Self = this.set("blurOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurOnSelect: Self = this.set("blurOnSelect", js.undefined)
    
    @scala.inline
    def setClearOnBlur(value: Boolean): Self = this.set("clearOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearOnBlur: Self = this.set("clearOnBlur", js.undefined)
    
    @scala.inline
    def setClearOnEscape(value: Boolean): Self = this.set("clearOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearOnEscape: Self = this.set("clearOnEscape", js.undefined)
    
    @scala.inline
    def setComponentName(value: String): Self = this.set("componentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentName: Self = this.set("componentName", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: Value[T, Multiple, DisableClearable, FreeSolo]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    
    @scala.inline
    def setDisableClearable(value: DisableClearable): Self = this.set("disableClearable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableClearable: Self = this.set("disableClearable", js.undefined)
    
    @scala.inline
    def setDisableCloseOnSelect(value: Boolean): Self = this.set("disableCloseOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCloseOnSelect: Self = this.set("disableCloseOnSelect", js.undefined)
    
    @scala.inline
    def setDisableListWrap(value: Boolean): Self = this.set("disableListWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableListWrap: Self = this.set("disableListWrap", js.undefined)
    
    @scala.inline
    def setDisabledItemsFocusable(value: Boolean): Self = this.set("disabledItemsFocusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledItemsFocusable: Self = this.set("disabledItemsFocusable", js.undefined)
    
    @scala.inline
    def setFilterOptions(value: (/* options */ js.Array[T], /* state */ FilterOptionsState[T]) => js.Array[T]): Self = this.set("filterOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    
    @scala.inline
    def setFilterSelectedOptions(value: Boolean): Self = this.set("filterSelectedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSelectedOptions: Self = this.set("filterSelectedOptions", js.undefined)
    
    @scala.inline
    def setFreeSolo(value: FreeSolo): Self = this.set("freeSolo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreeSolo: Self = this.set("freeSolo", js.undefined)
    
    @scala.inline
    def setGetOptionDisabled(value: /* option */ T => Boolean): Self = this.set("getOptionDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOptionDisabled: Self = this.set("getOptionDisabled", js.undefined)
    
    @scala.inline
    def setGetOptionLabel(value: /* option */ T => String): Self = this.set("getOptionLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOptionLabel: Self = this.set("getOptionLabel", js.undefined)
    
    @scala.inline
    def setGetOptionSelected(value: (/* option */ T, /* value */ T) => Boolean): Self = this.set("getOptionSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetOptionSelected: Self = this.set("getOptionSelected", js.undefined)
    
    @scala.inline
    def setGroupBy(value: /* option */ T => String): Self = this.set("groupBy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setHandleHomeEndKeys(value: Boolean): Self = this.set("handleHomeEndKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleHomeEndKeys: Self = this.set("handleHomeEndKeys", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIncludeInputInList(value: Boolean): Self = this.set("includeInputInList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInputInList: Self = this.set("includeInputInList", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    
    @scala.inline
    def setMultiple(value: Multiple): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* event */ ChangeEvent[js.Object], /* value */ Value[T, Multiple, DisableClearable, FreeSolo], /* reason */ AutocompleteChangeReason, /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClose(value: (/* event */ ChangeEvent[js.Object], /* reason */ AutocompleteCloseReason) => Unit): Self = this.set("onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnHighlightChange(
      value: (/* event */ ChangeEvent[js.Object], /* option */ T | Null, /* reason */ AutocompleteHighlightChangeReason) => Unit
    ): Self = this.set("onHighlightChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnHighlightChange: Self = this.set("onHighlightChange", js.undefined)
    
    @scala.inline
    def setOnInputChange(
      value: (/* event */ ChangeEvent[js.Object], /* value */ String, /* reason */ AutocompleteInputChangeReason) => Unit
    ): Self = this.set("onInputChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnInputChange: Self = this.set("onInputChange", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* event */ ChangeEvent[js.Object] => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOpenOnFocus(value: Boolean): Self = this.set("openOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnFocus: Self = this.set("openOnFocus", js.undefined)
    
    @scala.inline
    def setSelectOnFocus(value: Boolean): Self = this.set("selectOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOnFocus: Self = this.set("selectOnFocus", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Value[T, Multiple, DisableClearable, FreeSolo]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
