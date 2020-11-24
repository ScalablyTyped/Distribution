package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgCurrencyEditorMethods extends js.Object {
  
  /**
    * Changes the the regional settings of widget element to the language specified in [options.regional](ui.ignumericeditor#options:regional)
    * Note that this method is for rare scenarios, use [regional](ui.ignumericeditor#options:regional) option setter
    */
  def changeRegional(): Unit = js.native
  
  /**
    * Gets/sets a string that is used as the currency symbol shown with the number in the input. The value provided as a param is propagated to the currencySymbol option and thus has the same priority as the option.
    *
    * @param symbol New currency symbol.
    */
  def currencySymbol(): String = js.native
  def currencySymbol(symbol: js.Object): String = js.native
  
  /**
    * Finds index of list item by text that matches with the search parameters.
    *
    * @param number The text to search for.
    */
  def findListItemIndex(number: Double): Double = js.native
  
  /**
    * Gets current regional.
    */
  def getRegionalOption(): String = js.native
  
  def getSelectedText(): Unit = js.native
  
  def getSelectionEnd(): Unit = js.native
  
  def getSelectionStart(): Unit = js.native
  
  /**
    * This method is deprecated in favor of [spinDown](ui.%%WidgetNameLowered%%#options:spinDown).
    */
  def selectListIndexDown(): Unit = js.native
  
  /**
    * This method is deprecated in favor of [spinUp](ui.%%WidgetNameLowered%%#options:spinUp).
    */
  def selectListIndexUp(): Unit = js.native
  
  /**
    * Decrements value in editor according to the parameter selects the next item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
    *
    * @param delta Decrement value.
    */
  def spinDown(): Unit = js.native
  def spinDown(delta: Double): Unit = js.native
  
  /**
    * Increments value in editor according to the parameter or selects the previous item from the drop-down list if [isLimitedToListValues](ui.%%WidgetNameLowered%%#options:isLimitedToListValues) is enabled.
    *
    * @param delta Increments value.
    */
  def spinUp(): Unit = js.native
  def spinUp(delta: Double): Unit = js.native
  
  /**
    * Gets/Sets editor value.
    *
    * @param newValue New editor value.
    */
  def value(): Double = js.native
  def value(newValue: Double): Double = js.native
}
