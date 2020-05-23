package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgMaskEditorMethods extends js.Object {
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igtexteditor#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igtexteditor#options:language) or [locale](ui.igtexteditor#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  /**
    * Returns a reference to the clear button UI element of the editor.
    */
  def clearButton(): String = js.native
  /**
    * Gets the visible text in the editor.
    */
  def displayValue(): String = js.native
  def dropDownButton(): Unit = js.native
  def dropDownContainer(): Unit = js.native
  def dropDownVisible(): Unit = js.native
  def findListItemIndex(): Unit = js.native
  def getSelectedListItem(): Unit = js.native
  /**
    * Gets the selected text from the editor in edit mode. This can be done inside key event handlers, like keydown or keyup. This method can be used only when the editor is focused. If you invoke this method in display mode, when the editor input is blurred, the returned value will be an empty string.
    */
  def getSelectedText(): String = js.native
  /**
    * Gets the end index of the selected text in the editor.
    */
  def getSelectionEnd(): Double = js.native
  /**
    * Gets the start index of the selected text in the editor.
    */
  def getSelectionStart(): Double = js.native
  def hideDropDown(): Unit = js.native
  /**
    * Inserts the text at the location of the caret or over the current selection. If the editor is focused the method will insert the text over the current selection. If the editor is not focused the method will set the text as value of the editor.
    * Note: The method raises [textChanged](ui.igtexteditor#events:textChanged) event.
    *
    * @param string The string to be inserted.
    */
  def insert(string: String): Unit = js.native
  /**
    * Checks if the value in the editor is valid. Note: This function will not trigger automatic notifications.
    */
  def isValid(): Boolean = js.native
  /**
    * Selects the text between start and end indices in the editor. If the parameters are equal, then the method sets location of caret. The method has effect only when the editor has focus.
    *
    * @param start Start of the selection.
    * @param end End of the selection.
    */
  def select(start: Double, end: Double): Unit = js.native
  def selectedListIndex(): Unit = js.native
  def showDropDown(): Unit = js.native
  def spinDown(): Unit = js.native
  def spinDownButton(): Unit = js.native
  def spinUp(): Unit = js.native
  def spinUpButton(): Unit = js.native
  /**
    * Gets/Sets mask editor value.
    *
    * @param newValue New mask editor value.
    */
  def value(): String = js.native
  def value(newValue: String): String = js.native
}

