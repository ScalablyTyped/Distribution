package typings.materialUiLab

import typings.materialUiLab.anon.AnchorEl
import typings.materialUiLab.materialUiLabBooleans.`false`
import typings.materialUiLab.materialUiLabBooleans.`true`
import typings.materialUiLab.materialUiLabStrings.any
import typings.materialUiLab.materialUiLabStrings.mouse
import typings.materialUiLab.materialUiLabStrings.start
import typings.materialUiLab.materialUiLabStrings.touch
import typings.react.mod.ChangeEvent
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAutocompleteUseAutocompleteMod {
  
  @JSImport("@material-ui/lab/useAutocomplete/useAutocomplete", JSImport.Default)
  @js.native
  def default[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): AnchorEl[T, Multiple, DisableClearable, FreeSolo] = js.native
  
  @JSImport("@material-ui/lab/useAutocomplete/useAutocomplete", "createFilterOptions")
  @js.native
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  @JSImport("@material-ui/lab/useAutocomplete/useAutocomplete", "createFilterOptions")
  @js.native
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = js.native
  
  @js.native
  trait AutocompleteChangeDetails[T] extends StObject {
    
    var option: T = js.native
  }
  object AutocompleteChangeDetails {
    
    @scala.inline
    def apply[T](option: T): AutocompleteChangeDetails[T] = {
      val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteChangeDetails[T]]
    }
    
    @scala.inline
    implicit class AutocompleteChangeDetailsMutableBuilder[Self <: AutocompleteChangeDetails[_], T] (val x: Self with AutocompleteChangeDetails[T]) extends AnyVal {
      
      @scala.inline
      def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.`create-option`
    - typings.materialUiLab.materialUiLabStrings.`select-option`
    - typings.materialUiLab.materialUiLabStrings.`remove-option`
    - typings.materialUiLab.materialUiLabStrings.clear
    - typings.materialUiLab.materialUiLabStrings.blur
  */
  trait AutocompleteChangeReason extends StObject
  object AutocompleteChangeReason {
    
    @scala.inline
    def blur: typings.materialUiLab.materialUiLabStrings.blur = "blur".asInstanceOf[typings.materialUiLab.materialUiLabStrings.blur]
    
    @scala.inline
    def clear: typings.materialUiLab.materialUiLabStrings.clear = "clear".asInstanceOf[typings.materialUiLab.materialUiLabStrings.clear]
    
    @scala.inline
    def `create-option`: typings.materialUiLab.materialUiLabStrings.`create-option` = "create-option".asInstanceOf[typings.materialUiLab.materialUiLabStrings.`create-option`]
    
    @scala.inline
    def `remove-option`: typings.materialUiLab.materialUiLabStrings.`remove-option` = "remove-option".asInstanceOf[typings.materialUiLab.materialUiLabStrings.`remove-option`]
    
    @scala.inline
    def `select-option`: typings.materialUiLab.materialUiLabStrings.`select-option` = "select-option".asInstanceOf[typings.materialUiLab.materialUiLabStrings.`select-option`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.toggleInput
    - typings.materialUiLab.materialUiLabStrings.escape
    - typings.materialUiLab.materialUiLabStrings.`select-option`
    - typings.materialUiLab.materialUiLabStrings.blur
  */
  trait AutocompleteCloseReason extends StObject
  object AutocompleteCloseReason {
    
    @scala.inline
    def blur: typings.materialUiLab.materialUiLabStrings.blur = "blur".asInstanceOf[typings.materialUiLab.materialUiLabStrings.blur]
    
    @scala.inline
    def escape: typings.materialUiLab.materialUiLabStrings.escape = "escape".asInstanceOf[typings.materialUiLab.materialUiLabStrings.escape]
    
    @scala.inline
    def `select-option`: typings.materialUiLab.materialUiLabStrings.`select-option` = "select-option".asInstanceOf[typings.materialUiLab.materialUiLabStrings.`select-option`]
    
    @scala.inline
    def toggleInput: typings.materialUiLab.materialUiLabStrings.toggleInput = "toggleInput".asInstanceOf[typings.materialUiLab.materialUiLabStrings.toggleInput]
  }
  
  type AutocompleteFreeSoloValueMapping[FreeSolo] = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.keyboard
    - typings.materialUiLab.materialUiLabStrings.mouse
    - typings.materialUiLab.materialUiLabStrings.auto
  */
  trait AutocompleteHighlightChangeReason extends StObject
  object AutocompleteHighlightChangeReason {
    
    @scala.inline
    def auto: typings.materialUiLab.materialUiLabStrings.auto = "auto".asInstanceOf[typings.materialUiLab.materialUiLabStrings.auto]
    
    @scala.inline
    def keyboard: typings.materialUiLab.materialUiLabStrings.keyboard = "keyboard".asInstanceOf[typings.materialUiLab.materialUiLabStrings.keyboard]
    
    @scala.inline
    def mouse: typings.materialUiLab.materialUiLabStrings.mouse = "mouse".asInstanceOf[typings.materialUiLab.materialUiLabStrings.mouse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.input
    - typings.materialUiLab.materialUiLabStrings.reset
    - typings.materialUiLab.materialUiLabStrings.clear
  */
  trait AutocompleteInputChangeReason extends StObject
  object AutocompleteInputChangeReason {
    
    @scala.inline
    def clear: typings.materialUiLab.materialUiLabStrings.clear = "clear".asInstanceOf[typings.materialUiLab.materialUiLabStrings.clear]
    
    @scala.inline
    def input: typings.materialUiLab.materialUiLabStrings.input = "input".asInstanceOf[typings.materialUiLab.materialUiLabStrings.input]
    
    @scala.inline
    def reset: typings.materialUiLab.materialUiLabStrings.reset = "reset".asInstanceOf[typings.materialUiLab.materialUiLabStrings.reset]
  }
  
  @js.native
  trait CreateFilterOptionsConfig[T] extends StObject {
    
    var ignoreAccents: js.UndefOr[Boolean] = js.native
    
    var ignoreCase: js.UndefOr[Boolean] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var matchFrom: js.UndefOr[any | start] = js.native
    
    var stringify: js.UndefOr[js.Function1[/* option */ T, String]] = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
  }
  object CreateFilterOptionsConfig {
    
    @scala.inline
    def apply[T](): CreateFilterOptionsConfig[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateFilterOptionsConfig[T]]
    }
    
    @scala.inline
    implicit class CreateFilterOptionsConfigMutableBuilder[Self <: CreateFilterOptionsConfig[_], T] (val x: Self with CreateFilterOptionsConfig[T]) extends AnyVal {
      
      @scala.inline
      def setIgnoreAccents(value: Boolean): Self = StObject.set(x, "ignoreAccents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAccentsUndefined: Self = StObject.set(x, "ignoreAccents", js.undefined)
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMatchFrom(value: any | start): Self = StObject.set(x, "matchFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchFromUndefined: Self = StObject.set(x, "matchFrom", js.undefined)
      
      @scala.inline
      def setStringify(value: /* option */ T => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
  
  @js.native
  trait FilterOptionsState[T] extends StObject {
    
    def getOptionLabel(option: T): String = js.native
    
    var inputValue: String = js.native
  }
  object FilterOptionsState {
    
    @scala.inline
    def apply[T](getOptionLabel: T => String, inputValue: String): FilterOptionsState[T] = {
      val __obj = js.Dynamic.literal(getOptionLabel = js.Any.fromFunction1(getOptionLabel), inputValue = inputValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterOptionsState[T]]
    }
    
    @scala.inline
    implicit class FilterOptionsStateMutableBuilder[Self <: FilterOptionsState[_], T] (val x: Self with FilterOptionsState[T]) extends AnyVal {
      
      @scala.inline
      def setGetOptionLabel(value: T => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UseAutocompleteProps[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] extends StObject {
    
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
    implicit class UseAutocompletePropsMutableBuilder[Self <: UseAutocompleteProps[_, _, _, _], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */] (val x: Self with (UseAutocompleteProps[T, Multiple, DisableClearable, FreeSolo])) extends AnyVal {
      
      @scala.inline
      def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoHighlight(value: Boolean): Self = StObject.set(x, "autoHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHighlightUndefined: Self = StObject.set(x, "autoHighlight", js.undefined)
      
      @scala.inline
      def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      @scala.inline
      def setBlurOnSelect(value: touch | mouse | `true` | `false`): Self = StObject.set(x, "blurOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurOnSelectUndefined: Self = StObject.set(x, "blurOnSelect", js.undefined)
      
      @scala.inline
      def setClearOnBlur(value: Boolean): Self = StObject.set(x, "clearOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnBlurUndefined: Self = StObject.set(x, "clearOnBlur", js.undefined)
      
      @scala.inline
      def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Value[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDisableClearable(value: DisableClearable): Self = StObject.set(x, "disableClearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableClearableUndefined: Self = StObject.set(x, "disableClearable", js.undefined)
      
      @scala.inline
      def setDisableCloseOnSelect(value: Boolean): Self = StObject.set(x, "disableCloseOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCloseOnSelectUndefined: Self = StObject.set(x, "disableCloseOnSelect", js.undefined)
      
      @scala.inline
      def setDisableListWrap(value: Boolean): Self = StObject.set(x, "disableListWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableListWrapUndefined: Self = StObject.set(x, "disableListWrap", js.undefined)
      
      @scala.inline
      def setDisabledItemsFocusable(value: Boolean): Self = StObject.set(x, "disabledItemsFocusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledItemsFocusableUndefined: Self = StObject.set(x, "disabledItemsFocusable", js.undefined)
      
      @scala.inline
      def setFilterOptions(value: (/* options */ js.Array[T], /* state */ FilterOptionsState[T]) => js.Array[T]): Self = StObject.set(x, "filterOptions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
      
      @scala.inline
      def setFilterSelectedOptions(value: Boolean): Self = StObject.set(x, "filterSelectedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterSelectedOptionsUndefined: Self = StObject.set(x, "filterSelectedOptions", js.undefined)
      
      @scala.inline
      def setFreeSolo(value: FreeSolo): Self = StObject.set(x, "freeSolo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeSoloUndefined: Self = StObject.set(x, "freeSolo", js.undefined)
      
      @scala.inline
      def setGetOptionDisabled(value: /* option */ T => Boolean): Self = StObject.set(x, "getOptionDisabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOptionDisabledUndefined: Self = StObject.set(x, "getOptionDisabled", js.undefined)
      
      @scala.inline
      def setGetOptionLabel(value: /* option */ T => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOptionLabelUndefined: Self = StObject.set(x, "getOptionLabel", js.undefined)
      
      @scala.inline
      def setGetOptionSelected(value: (/* option */ T, /* value */ T) => Boolean): Self = StObject.set(x, "getOptionSelected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetOptionSelectedUndefined: Self = StObject.set(x, "getOptionSelected", js.undefined)
      
      @scala.inline
      def setGroupBy(value: /* option */ T => String): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setHandleHomeEndKeys(value: Boolean): Self = StObject.set(x, "handleHomeEndKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleHomeEndKeysUndefined: Self = StObject.set(x, "handleHomeEndKeys", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIncludeInputInList(value: Boolean): Self = StObject.set(x, "includeInputInList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeInputInListUndefined: Self = StObject.set(x, "includeInputInList", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setMultiple(value: Multiple): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* event */ ChangeEvent[js.Object], /* value */ Value[T, Multiple, DisableClearable, FreeSolo], /* reason */ AutocompleteChangeReason, /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClose(value: (/* event */ ChangeEvent[js.Object], /* reason */ AutocompleteCloseReason) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnHighlightChange(
        value: (/* event */ ChangeEvent[js.Object], /* option */ T | Null, /* reason */ AutocompleteHighlightChangeReason) => Unit
      ): Self = StObject.set(x, "onHighlightChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnHighlightChangeUndefined: Self = StObject.set(x, "onHighlightChange", js.undefined)
      
      @scala.inline
      def setOnInputChange(
        value: (/* event */ ChangeEvent[js.Object], /* value */ String, /* reason */ AutocompleteInputChangeReason) => Unit
      ): Self = StObject.set(x, "onInputChange", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* event */ ChangeEvent[js.Object] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSelectOnFocus(value: Boolean): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
      
      @scala.inline
      def setValue(value: Value[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type Value[T, Multiple, DisableClearable, FreeSolo] = (js.Array[T | AutocompleteFreeSoloValueMapping[FreeSolo]]) | T | Null | AutocompleteFreeSoloValueMapping[FreeSolo] | (NonNullable[T | AutocompleteFreeSoloValueMapping[FreeSolo]])
}
