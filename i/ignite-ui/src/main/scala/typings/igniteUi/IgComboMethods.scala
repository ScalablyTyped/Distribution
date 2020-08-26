package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgComboMethods extends js.Object {
  /**
    * Gets/Sets index of active item in list.
    *
    * @param index New active index for list. In order to clear active item, use -1.
    * @return number|object Returns index of active item in list or -1, if parameter is undefined. Otherwise, it returns reference to this igCombo.
    */
  def activeIndex(): Double | js.Object = js.native
  def activeIndex(index: Double): Double | js.Object = js.native
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igcombo#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igcombo#options:language) or [locale](ui.igcombo#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  /**
    * Changes the the regional settings of widget element to the language specified in [options.regional](ui.igcombo#options:regional)
    * Note that this method is for rare scenarios, use [regional](ui.igcombo#options:regional) option setter
    */
  def changeRegional(): Unit = js.native
  /**
    * Clears filtering.
    *
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [filtering](ui.igcombo#events:filtering) and [filtered](ui.igcombo#events:filtered) events.
    */
  def clearFiltering(): js.Object = js.native
  def clearFiltering(event: js.Object): js.Object = js.native
  /**
    * Clears the input text, resets highlighting, filtering and selection.
    *
    * @param options Object with set of options controlling the behavior of this api method.
    * focusCombo (boolean): Set to true to focus combo after clearing the input.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [selectionChanging](ui.igcombo#events:selectionChanging) and [selectionChanged](ui.igcombo#events:selectionChanged) events.
    */
  def clearInput(): js.Object = js.native
  def clearInput(options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def clearInput(options: js.Object): js.Object = js.native
  def clearInput(options: js.Object, event: js.Object): js.Object = js.native
  /**
    * Closes the drop down.
    *
    * @param callback Specifies callback function to be executed when close animation is completed.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [dropDownClosing](ui.igcombo#events:dropDownClosing) and [dropDownClosed](ui.igcombo#events:dropDownClosed) events.
    */
  def closeDropDown(): js.Object = js.native
  def closeDropDown(callback: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def closeDropDown(callback: js.Function): js.Object = js.native
  def closeDropDown(callback: js.Function, event: js.Object): js.Object = js.native
  /**
    * Gets jQuery object of the outer element of the combo.
    */
  def comboWrapper(): js.Object = js.native
  /**
    * Performs databinding on the combo box. The [databinding](ui.igcombo#events:dataBinding) and [dataBound](ui.igcombo#events:dataBound) events are always raised.
    */
  def dataBind(): js.Object = js.native
  /**
    * Gets the associated data of li element in the combo.
    *
    * @param $element jQuery element of item in the drop down list
    */
  def dataForElement($element: js.Object): js.Object = js.native
  /**
    * Gets the associated data of an item by value matching it's [valueKey](ui.igcombo#options:valueKey) property.
    *
    * @param value Value matching the valueKey property of item to be tested if it is selected
    */
  def dataForValue(value: js.Object): js.Object = js.native
  /**
    * Deselects a list item from the drop down list.
    *
    * @param $items jQuery object with item or items to be deselected
    * @param options Object with set of options controlling the behavior of this api method.
    * focusCombo (boolean): Set to true to focus combo after the deselection.
    * keepInputText (boolean): Set to true to keep input text unchanged after the deselection. By default input text is updated.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [selectionChanging](ui.igcombo#events:selectionChanging) and [selectionChanged](ui.igcombo#events:selectionChanged) events.
    */
  def deselect($items: js.Object): js.Object = js.native
  def deselect($items: js.Object, options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def deselect($items: js.Object, options: js.Object): js.Object = js.native
  def deselect($items: js.Object, options: js.Object, event: js.Object): js.Object = js.native
  /**
    * Deselects all selected items from the drop down list.
    *
    * @param options Object with set of options controlling the behavior of this api method.
    * focusCombo (boolean): Set to true to focus combo after the deselection.
    * keepInputText (boolean): Set to true to keep input text unchanged after the deselection. By default input text is updated.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [selectionChanging](ui.igcombo#events:selectionChanging) and [selectionChanged](ui.igcombo#events:selectionChanged) events.
    */
  def deselectAll(): js.Object = js.native
  def deselectAll(options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def deselectAll(options: js.Object): js.Object = js.native
  def deselectAll(options: js.Object, event: js.Object): js.Object = js.native
  /**
    * Deselects a list item from the drop down list by index.
    *
    * @param index Index or array of indexes of items to be selected
    * @param options Object with set of options controlling the behavior of this api method.
    * focusCombo (boolean): Set to true to focus combo after the deselection.
    * keepInputText (boolean): Set to true to keep input text unchanged after the deselection. By default input text is updated.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [selectionChanging](ui.igcombo#events:selectionChanging) and [selectionChanged](ui.igcombo#events:selectionChanged) events.
    */
  def deselectByIndex(index: js.Object): js.Object = js.native
  def deselectByIndex(index: js.Object, options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def deselectByIndex(index: js.Object, options: js.Object): js.Object = js.native
  def deselectByIndex(index: js.Object, options: js.Object, event: js.Object): js.Object = js.native
  /**
    * Deselects a list item from the drop down list by value.
    *
    * @param value Value or array of values matching the [valueKey](ui.igcombo#options:valueKey) property of item/items to be deselected
    * @param options Object with set of options controlling the behavior of this api method.
    * focusCombo (boolean): Set to true to focus combo after the deselection.
    * keepInputText (boolean): Set to true to keep input text unchanged after the deselection. By default input text is updated.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [selectionChanging](ui.igcombo#events:selectionChanging) and [selectionChanged](ui.igcombo#events:selectionChanged) events.
    */
  def deselectByValue(value: js.Object): js.Object = js.native
  def deselectByValue(value: js.Object, options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def deselectByValue(value: js.Object, options: js.Object): js.Object = js.native
  def deselectByValue(value: js.Object, options: js.Object, event: js.Object): js.Object = js.native
  /**
    * Destroys the igCombo widget.
    */
  def destroy(): js.Object = js.native
  /**
    * Gets jQuery object of the drop down associated with this combo widget
    */
  def dropDown(): js.Object = js.native
  /**
    * Returns boolean representing whether the combo drop down list is opened.
    */
  def dropDownOpened(): Boolean = js.native
  /**
    * Triggers filtering.
    *
    * @param texts Filter by string, or array of strings.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [filtering](ui.igcombo#events:filtering) and [filtered](ui.igcombo#events:filtered) events.
    */
  def filter(): js.Object = js.native
  def filter(texts: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def filter(texts: js.Object): js.Object = js.native
  def filter(texts: js.Object, event: js.Object): js.Object = js.native
  /**
    * Creates expressions for filtering.
    *
    * @param expressions Filter by array of objects, such as each object represents filtering expression.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [filtering](ui.igcombo#events:filtering) and [filtered](ui.igcombo#events:filtered) events.
    */
  def filterByExpressions(expressions: js.Array[_]): js.Object = js.native
  def filterByExpressions(expressions: js.Array[_], event: js.Object): js.Object = js.native
  /**
    * Gets array with objects representing the filtered li elements in combo box.
    */
  def filteredItems(): js.Array[_] = js.native
  /**
    * Gets/Sets selected item/s from the drop-down list by specified index.
    *
    * @param index Index or array of indexes of items to be selected
    * @param options Object with set of options controlling the behavior of this api method.
    * closeDropDown (boolean): Set to true to close the drop down list after the selection.
    * focusCombo (boolean): Set to true to focus combo after the selection.
    * additive (boolean): Set to true to select the item without losing other selection. Works only when multi selection is enabled.
    * keepFiltering (boolean): Set to true to keep filtering after the selection. By default the filtering is cleared.
    * keepInputText (boolean): Set to true to keep input text unchanged after the selection. By default input text is updated.
    * keepHighlighting (boolean): Set to true to keep highlighting unchanged after the selection. By default highlighting is removed.
    * keepNavItem (boolean): Set to true to keep current navigation item unchanged after the selection. By default the navigation item is changed to the new selected item.
    * keepScrollPosition (boolean): Set to true to keep current scroll position. By default the scroll position will change so that the last selected item is visible.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [selectionChanging](ui.igcombo#events:selectionChanging) and [selectionChanged](ui.igcombo#events:selectionChanged) events.
    */
  def index(): js.Object = js.native
  def index(index: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def index(index: js.UndefOr[scala.Nothing], options: js.Object): js.Object = js.native
  def index(index: js.UndefOr[scala.Nothing], options: js.Object, event: js.Object): js.Object = js.native
  def index(index: js.Object): js.Object = js.native
  def index(index: js.Object, options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def index(index: js.Object, options: js.Object): js.Object = js.native
  def index(index: js.Object, options: js.Object, event: js.Object): js.Object = js.native
  /**
    * Verifies whether the li representing the data source's record at the specified index is selected.
    *
    * @param index Index of data source record
    */
  def isIndexSelected(index: js.Object): Boolean = js.native
  /**
    * Verifies whether the specified li is selected.
    *
    * @param $item jQuery object with item to verify whether it is selected.
    */
  def isSelected($item: js.Object): Boolean = js.native
  /**
    * Verifies whether a specified value is selected.
    *
    * @param value Value matching the [valueKey](ui.igcombo#options:valueKey) property of item to be tested if it is selected
    */
  def isValueSelected(value: js.Object): Boolean = js.native
  /**
    * Gets array with data and objects representing li elements in combo box.
    */
  def items(): js.Array[_] = js.native
  /**
    * Gets object/s containing data and list item in the combo by element/s.
    *
    * @param $element jQuery object with drop down list item element or elements
    */
  def itemsFromElement($element: js.Object): js.Object = js.native
  /**
    * Gets object/s containing data and list item in the combo by index/es.
    *
    * @param index Index or array of indexes of items in the drop down list
    */
  def itemsFromIndex(index: Double): js.Object = js.native
  /**
    * Gets object/s containing data and list item in the combo by value/s.
    *
    * @param value Value of item in the drop down list or array with values.
    */
  def itemsFromValue(value: js.Object): js.Object = js.native
  /**
    * Gets jQuery object of the container that holds the list with items.
    */
  def list(): js.Object = js.native
  /**
    * Gets jQuery objects representing all rendered list items in the combo drop down list.
    */
  def listItems(): js.Object = js.native
  /**
    * Gets/Sets scrollTop attribute of html element, which scrolls drop-down list of items.
    *
    * @param value New value for scroll top in list. Note: if list is closed and new value is provided, then openDropDown() is called automatically.
    * @return number|object If parameter is undefined, then scrollTop is returned. Otherwise, it returns reference to this igCombo.
    */
  def listScrollTop(): Double | js.Object = js.native
  def listScrollTop(value: Double): Double | js.Object = js.native
  /**
    * Opens the drop-down.
    *
    * @param callback Specifies callback function to be executed when open animation is completed.
    * @param focusCombo Set to false to not focus combo"s text input after the drop down is opened. By default the combo's input is focused.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [dropDownOpening](ui.igcombo#events:dropDownOpening) and [dropDownOpened](ui.igcombo#events:dropDownOpened) events.
    */
  def openDropDown(): js.Object = js.native
  def openDropDown(callback: js.UndefOr[scala.Nothing], focusCombo: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def openDropDown(callback: js.UndefOr[scala.Nothing], focusCombo: Boolean): js.Object = js.native
  def openDropDown(callback: js.UndefOr[scala.Nothing], focusCombo: Boolean, event: js.Object): js.Object = js.native
  def openDropDown(callback: js.Function): js.Object = js.native
  def openDropDown(callback: js.Function, focusCombo: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def openDropDown(callback: js.Function, focusCombo: Boolean): js.Object = js.native
  def openDropDown(callback: js.Function, focusCombo: Boolean, event: js.Object): js.Object = js.native
  /**
    * Repositions drop down under combo input. Has effect only when the drop down is attached to body.
    */
  def positionDropDown(): js.Object = js.native
  /**
    * Forces an update of the igCombo value according to the current text in the igCombo input.
    *
    * The refresh is primarily intended to be used with [allowCustomValue](ui.igcombo#options:allowCustomValue) set to true.
    * The refresh will take the current text and, if no selection is applied, will set it as igCombo value provided that [allowCustomValue](ui.igcombo#options:allowCustomValue) true.
    */
  def refreshValue(): js.Object = js.native
  /**
    * Selects a list item from the drop-down list.
    *
    * @param $items jQuery object with item or items to be selected.
    * @param options Object with set of options controlling the behavior of this api method.
    * closeDropDown (boolean): Set to true to close the drop down list after the selection.
    * focusCombo (boolean): Set to true to focus combo after the selection.
    * additive (boolean): Set to true to select the item without losing other selection. Works only when multi selection is enabled.
    * keepFiltering (boolean): Set to true to keep filtering after the selection. By default the filtering is cleared.
    * keepInputText (boolean): Set to true to keep input text unchanged after the selection. By default input text is updated.
    * keepHighlighting (boolean): Set to true to keep highlighting unchanged after the selection. By default highlighting is removed.
    * keepNavItem (boolean): Set to true to keep current navigation item unchanged after the selection. By default the navigation item is changed to the new selected item.
    * keepScrollPosition (boolean): Set to true to keep current scroll position. By default the scroll position will change so that the last selected item is visible.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [selectionChanging](ui.igcombo#events:selectionChanging) and [selectionChanged](ui.igcombo#events:selectionChanged) events.
    */
  def select($items: js.Object): js.Object = js.native
  def select($items: js.Object, options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def select($items: js.Object, options: js.Object): js.Object = js.native
  def select($items: js.Object, options: js.Object, event: js.Object): js.Object = js.native
  /**
    * Selects all items from the drop-down list.
    *
    * @param options Object with set of options controlling the behavior of this api method.
    * closeDropDown (boolean): Set to true to close the drop down list after the selection.
    * focusCombo (boolean): Set to true to focus combo after the selection.
    * keepFiltering (boolean): Set to true to keep filtering after the selection. By default the filtering is cleared.
    * keepInputText (boolean): Set to true to keep input text unchanged after the selection. By default input text is updated.
    * keepHighlighting (boolean): Set to true to keep highlighting unchanged after the selection. By default highlighting is removed.
    * keepNavItem (boolean): Set to true to keep current navigation item unchanged after the selection. By default the navigation item is changed to the new selected item.
    * keepScrollPosition (boolean): Set to true to keep current scroll position. By default the scroll position will change so that the last selected item is visible.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [selectionChanging](ui.igcombo#events:selectionChanging) and [selectionChanged](ui.igcombo#events:selectionChanged) events.
    */
  def selectAll(): js.Object = js.native
  def selectAll(options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def selectAll(options: js.Object): js.Object = js.native
  def selectAll(options: js.Object, event: js.Object): js.Object = js.native
  /**
    * Gets array with objects representing selected li elements in combo box.
    */
  def selectedItems(): js.Array[_] = js.native
  /**
    * Gets/Sets text in text input field.
    *
    * @param text New text value for combo's input field.
    * @return string|object If parameter is undefined, then current text in field is returned. Otherwise, it returns reference to this igCombo.
    */
  def text(): String | js.Object = js.native
  def text(text: String): String | js.Object = js.native
  /**
    * Gets jQuery object of the text input associated with this combo widget.
    */
  def textInput(): js.Object = js.native
  /**
    * Trigger validation.
    */
  def validate(): Boolean = js.native
  /**
    * Gets reference to [igValidator](ui.igvalidator) used by igCombo.
    *
    * @param destroy Request to destroy validator.
    */
  def validator(): js.Object = js.native
  def validator(destroy: Boolean): js.Object = js.native
  /**
    * Selects list item/items from the drop-down list by specified value or array of values. When called witout params will return the value of the selected item or if [multiSelection](ui.igcombo#options:multiSelection) is enabled array of selected values.
    *
    * @param value Value or array of values matching the valueKey property of item/items to be selected
    * @param options Object with set of options controlling the behavior of this api method.
    * closeDropDown (boolean): Set to true to close the drop down list after the selection.
    * focusCombo (boolean): Set to true to focus combo after the selection.
    * additive (boolean): Set to true to select the item without losing other selection. Works only when multi selection is enabled.
    * keepFiltering (boolean): Set to true to keep filtering after the selection. By default the filtering is cleared.
    * keepInputText (boolean): Set to true to keep input text unchanged after the selection. By default input text is updated.
    * keepHighlighting (boolean): Set to true to keep highlighting unchanged after the selection. By default highlighting is removed.
    * keepNavItem (boolean): Set to true to keep current navigation item unchanged after the selection. By default the navigation item is changed to the new selected item.
    * keepScrollPosition (boolean): Set to true to keep current scroll position. By default the scroll position will change so that the last selected item is visible.
    * @param event Indicates the browser event which triggered this action (not API). Calling the method with this param set to "true" will trigger [selectionChanging](ui.igcombo#events:selectionChanging) and [selectionChanged](ui.igcombo#events:selectionChanged) events.
    */
  def value(): js.Object = js.native
  def value(value: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def value(value: js.UndefOr[scala.Nothing], options: js.Object): js.Object = js.native
  def value(value: js.UndefOr[scala.Nothing], options: js.Object, event: js.Object): js.Object = js.native
  def value(value: js.Object): js.Object = js.native
  def value(value: js.Object, options: js.UndefOr[scala.Nothing], event: js.Object): js.Object = js.native
  def value(value: js.Object, options: js.Object): js.Object = js.native
  def value(value: js.Object, options: js.Object, event: js.Object): js.Object = js.native
  /**
    * Gets jQuery object of the value input associated with this combo widget.
    */
  def valueInput(): js.Object = js.native
}

