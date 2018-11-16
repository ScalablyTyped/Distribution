package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgCheckboxEditorMethods extends js.Object {
  /**
  	 * Destroys the widget
  	 */
  def destroy(): scala.Unit = js.native
  /**
  	 * Gets a reference to the jQuery element that wraps the editor.
  	 */
  def editorContainer(): java.lang.String = js.native
  /**
  	 * Gets the input element of the editor.
  	 */
  def field(): java.lang.String = js.native
  /**
  	 * Gets whether the editor has focus.
  	 */
  def hasFocus(): scala.Boolean = js.native
  /**
  	 * Hides the editor.
  	 */
  def hide(): scala.Unit = js.native
  /**
  	 * Gets/Sets name attribute applied to the editor element.
  	 *
  	 * @param newValue The new input name.
  	 */
  def inputName(): java.lang.String = js.native
  /**
  	 * Gets/Sets name attribute applied to the editor element.
  	 *
  	 * @param newValue The new input name.
  	 */
  def inputName(newValue: java.lang.String): java.lang.String = js.native
  /**
  	 * Checks if the value in the editor is valid. Note: This function will not trigger automatic notifications.
  	 */
  def isValid(): scala.Boolean = js.native
  /**
  	 * Sets focus to the editor after the specified delay.
  	 *
  	 * @param delay The delay before focusing the editor.
  	 */
  def setFocus(): scala.Unit = js.native
  /**
  	 * Sets focus to the editor after the specified delay.
  	 *
  	 * @param delay The delay before focusing the editor.
  	 */
  def setFocus(delay: scala.Double): scala.Unit = js.native
  /**
  	 * Shows the editor.
  	 */
  def show(): scala.Unit = js.native
  /**
  	 * Toggles the state of the checkbox.
  	 */
  def toggle(): scala.Unit = js.native
  /**
  	 * Triggers validation for the editor. If validatorOptions are set will also call validate on the [igValidator](ui.igvalidator).
  	 */
  def validate(): scala.Boolean = js.native
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
  def value(newValue: js.Object): java.lang.String = js.native
}

