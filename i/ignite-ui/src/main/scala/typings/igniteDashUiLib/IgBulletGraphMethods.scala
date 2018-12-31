package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgBulletGraphMethods extends js.Object {
  /**
  	 * Adds a new range to the bullet graph.
  	 *
  	 * @param value The range object to be added.
  	 */
  def addRange(value: js.Object): scala.Unit
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): scala.Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): scala.Unit
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): scala.Unit
  /**
  	 * Destroys widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Returns information about how the bullet graph is rendered.
  	 */
  def exportVisualData(): js.Object
  /**
  	 * Causes all pending changes of the bullet graph e.g. by changed property values to be rendered immediately.
  	 */
  def flush(): scala.Unit
  /**
  	 * Returns a string containing the names of all the ranges delimited with a \n symbol.
  	 */
  def getRangeNames(): scala.Unit
  /**
  	 * Removes a range from the bullet graph.
  	 *
  	 * @param value A JS object with properties set as follows: name: nameOfTheRangeToRemove, remove: true
  	 */
  def removeRange(value: js.Object): scala.Unit
  /**
  	 * Re-polls the css styles for the widget. Use this method when the css styles have been modified.
  	 */
  def styleUpdated(): scala.Unit
  /**
  	 * Updates the specified range of the bullet graph.
  	 *
  	 * @param value The range object to be updated.
  	 */
  def updateRange(value: js.Object): scala.Unit
}

