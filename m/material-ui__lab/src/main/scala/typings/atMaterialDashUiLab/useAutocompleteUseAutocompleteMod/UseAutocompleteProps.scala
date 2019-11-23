package typings.atMaterialDashUiLab.useAutocompleteUseAutocompleteMod

import typings.react.reactMod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseAutocompleteProps extends js.Object {
  /**
    * If `true`, the portion of the selected suggestion that has not been typed by the user,
    * known as the completion string, appears inline after the input cursor in the textbox.
    * The inline completion string is visually highlighted and has a selected state.
    */
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the first option is automatically highlighted.
    */
  var autoHighlight: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the selected option becomes the value of the input
    * when the Autocomplete loses focus unless the user chooses
    * a different option or changes the character string in the input.
    */
  var autoSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, clear all values when the user presses escape and the popup is closed.
    */
  var clearOnEscape: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the popup will ignore the blur event if the input if filled.
    * You can inspect the popup markup with your browser tools.
    * Consider this option when you need to customize the component.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * The default input value. Use when the component is not controlled.
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    * If `true`, the input can't be cleared.
    */
  var disableClearable: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the popup won't close when a value is selected.
    */
  var disableCloseOnSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the list box in the popup will not wrap focus.
    */
  var disableListWrap: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the popup won't open on input focus.
    */
  var disableOpenOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * A filter function that determines the options that are eligible.
    *
    * @param {any[]} options The options to render.
    * @param {object} state The state of the component.
    * @returns {any[]}
    */
  var filterOptions: js.UndefOr[
    js.Function2[/* options */ js.Array[_], /* state */ FilterOptionsState, js.Array[_]]
  ] = js.undefined
  /**
    * If `true`, hide the selected options from the list box.
    */
  var filterSelectedOptions: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the Autocomplete is free solo, meaning that the user input is not bound to provided options.
    */
  var freeSolo: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to determine the disabled state for a given option.
    */
  var getOptionDisabled: js.UndefOr[js.Function1[/* option */ js.Any, Boolean]] = js.undefined
  /**
    * Used to determine the string value for a given option.
    * It's used to fill the input (and the list box options if `renderOption` is not provided).
    */
  var getOptionLabel: js.UndefOr[js.Function1[/* option */ js.Any, String]] = js.undefined
  /**
    * If provided, the options will be grouped under the returned string.
    * The groupBy value is also used as the text for group headings when `renderGroup` is not provided.
    *
    * @param {any} options The option to group.
    * @returns {string}
    */
  var groupBy: js.UndefOr[js.Function1[/* option */ js.Any, String]] = js.undefined
  /**
    * This prop is used to help implement the accessibility logic.
    * If you don't provide this prop. It falls back to a randomly generated id.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * If `true`, the highlight can move to the input.
    */
  var includeInputInList: js.UndefOr[Boolean] = js.undefined
  /**
    * The input value.
    */
  var inputValue: js.UndefOr[String] = js.undefined
  /**
    * If `true`, `value` must be an array and the menu will support multiple selections.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback fired when the value changes.
    *
    * @param {object} event The event source of the callback
    * @param {any} value
    */
  var onChange: js.UndefOr[js.Function2[/* event */ ChangeEvent[js.Object], /* value */ js.Any, Unit]] = js.undefined
  /**
    * Callback fired when the popup requests to be closed.
    * Use in controlled mode (see open).
    *
    * @param {object} event The event source of the callback.
    */
  var onClose: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.undefined
  /**
    * Callback fired when the input value changes.
    *
    * @param {object} event The event source of the callback.
    * @param {string} value
    */
  var onInputChange: js.UndefOr[js.Function2[/* event */ ChangeEvent[js.Object], /* value */ js.Any, Unit]] = js.undefined
  /**
    * Callback fired when the popup requests to be opened.
    * Use in controlled mode (see open).
    *
    * @param {object} event The event source of the callback.
    */
  var onOpen: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.undefined
  /**
    * Control the popup` open state.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of options.
    */
  var options: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The value of the autocomplete.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object UseAutocompleteProps {
  @scala.inline
  def apply(
    autoComplete: js.UndefOr[Boolean] = js.undefined,
    autoHighlight: js.UndefOr[Boolean] = js.undefined,
    autoSelect: js.UndefOr[Boolean] = js.undefined,
    clearOnEscape: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Any = null,
    disableClearable: js.UndefOr[Boolean] = js.undefined,
    disableCloseOnSelect: js.UndefOr[Boolean] = js.undefined,
    disableListWrap: js.UndefOr[Boolean] = js.undefined,
    disableOpenOnFocus: js.UndefOr[Boolean] = js.undefined,
    filterOptions: (/* options */ js.Array[_], /* state */ FilterOptionsState) => js.Array[_] = null,
    filterSelectedOptions: js.UndefOr[Boolean] = js.undefined,
    freeSolo: js.UndefOr[Boolean] = js.undefined,
    getOptionDisabled: /* option */ js.Any => Boolean = null,
    getOptionLabel: /* option */ js.Any => String = null,
    groupBy: /* option */ js.Any => String = null,
    id: String = null,
    includeInputInList: js.UndefOr[Boolean] = js.undefined,
    inputValue: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ ChangeEvent[js.Object], /* value */ js.Any) => Unit = null,
    onClose: /* event */ ChangeEvent[js.Object] => Unit = null,
    onInputChange: (/* event */ ChangeEvent[js.Object], /* value */ js.Any) => Unit = null,
    onOpen: /* event */ ChangeEvent[js.Object] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    options: js.Array[_] = null,
    value: js.Any = null
  ): UseAutocompleteProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoComplete)) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoHighlight)) __obj.updateDynamic("autoHighlight")(autoHighlight)
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect)
    if (!js.isUndefined(clearOnEscape)) __obj.updateDynamic("clearOnEscape")(clearOnEscape)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disableClearable)) __obj.updateDynamic("disableClearable")(disableClearable)
    if (!js.isUndefined(disableCloseOnSelect)) __obj.updateDynamic("disableCloseOnSelect")(disableCloseOnSelect)
    if (!js.isUndefined(disableListWrap)) __obj.updateDynamic("disableListWrap")(disableListWrap)
    if (!js.isUndefined(disableOpenOnFocus)) __obj.updateDynamic("disableOpenOnFocus")(disableOpenOnFocus)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(js.Any.fromFunction2(filterOptions))
    if (!js.isUndefined(filterSelectedOptions)) __obj.updateDynamic("filterSelectedOptions")(filterSelectedOptions)
    if (!js.isUndefined(freeSolo)) __obj.updateDynamic("freeSolo")(freeSolo)
    if (getOptionDisabled != null) __obj.updateDynamic("getOptionDisabled")(js.Any.fromFunction1(getOptionDisabled))
    if (getOptionLabel != null) __obj.updateDynamic("getOptionLabel")(js.Any.fromFunction1(getOptionLabel))
    if (groupBy != null) __obj.updateDynamic("groupBy")(js.Any.fromFunction1(groupBy))
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(includeInputInList)) __obj.updateDynamic("includeInputInList")(includeInputInList)
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction2(onInputChange))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (options != null) __obj.updateDynamic("options")(options)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UseAutocompleteProps]
  }
}

