package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgBaseEditorMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit = js.native
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): scala.Unit = js.native
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
  def setFocus(delay: scala.Double): scala.Unit = js.native
  /**
  	 * Shows the editor.
  	 */
  def show(): scala.Unit = js.native
  /**
  	 * Triggers validation for the editor. If validatorOptions are set will also call validate on the [igValidator](ui.igvalidator).
  	 */
  def validate(): scala.Boolean = js.native
  /**
  	 * Gets a reference to [igValidator](ui.igvalidator) used by the editor.
  	 */
  def validator(): js.Object = js.native
  def value(newValue: js.Object): scala.Unit = js.native
}

