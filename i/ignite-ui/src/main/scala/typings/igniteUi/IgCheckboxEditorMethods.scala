package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgCheckboxEditorMethods extends js.Object {
  /**
    * Destroys the widget
    */
  def destroy(): Unit = js.native
  /**
    * Gets a reference to the jQuery element that wraps the editor.
    */
  def editorContainer(): String = js.native
  /**
    * Gets the input element of the editor.
    */
  def field(): String = js.native
  /**
    * Gets whether the editor has focus.
    */
  def hasFocus(): Boolean = js.native
  /**
    * Hides the editor.
    */
  def hide(): Unit = js.native
  /**
    * Gets/Sets name attribute applied to the editor element.
    *
    * @param newValue The new input name.
    */
  def inputName(): String = js.native
  def inputName(newValue: String): String = js.native
  /**
    * Checks if the value in the editor is valid. Note: This function will not trigger automatic notifications.
    */
  def isValid(): Boolean = js.native
  /**
    * Sets focus to the editor after the specified delay.
    *
    * @param delay The delay before focusing the editor.
    */
  def setFocus(): Unit = js.native
  def setFocus(delay: Double): Unit = js.native
  /**
    * Shows the editor.
    */
  def show(): Unit = js.native
  /**
    * Toggles the state of the checkbox.
    */
  def toggle(): Unit = js.native
  /**
    * Triggers validation for the editor. If validatorOptions are set will also call validate on the [igValidator](ui.igvalidator).
    */
  def validate(): Boolean = js.native
  /**
    * Gets a reference to [igValidator](ui.igvalidator) used by the editor.
    */
  def validator(): js.Object = js.native
  /**
    * Gets/Sets Current checked state/Value of the igCheckboxEditor that will be submitted by the HTML form.
    * 1. If the [value](ui.igcheckboxeditor#options:value) option IS NOT defined, then 'value' method will match the checked state of the editor.
    * This option is used when the checkbox is intended to operate as a Boolean editor. In that case the return type is bool.
    * 2. If the [value](ui.igcheckboxeditor#options:value) option IS defined, then 'value' method will return the value that will be submitted when the editor is checked and the form is submitted.
    * To get checked state regardless of the 'value' option, use $(".selector").igCheckboxEditor("option", "checked");
    *
    * @param newValue
    */
  def value(newValue: js.Object): String = js.native
}

