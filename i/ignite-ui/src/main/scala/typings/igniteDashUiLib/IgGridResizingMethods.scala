package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridResizingMethods extends js.Object {
  def changeGlobalLanguage(): scala.Unit = js.native
  def changeGlobalRegional(): scala.Unit = js.native
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): scala.Unit = js.native
  /**
  	 * Destroys the resizing widget
  	 */
  def destroy(): scala.Unit = js.native
  /**
  	 * Resizes a column to a specified width in pixels, percents or auto if no width is specified.
  	 *
  	 * @param column An identifier for the column. If a number is provided it will be used as a columnIndex else if a strings is provided it will be used as a columnKey.
  	 * @param width Width of the column in pixels or percents. If no width or "*" is specified the column will be auto-sized to the width of the data in it (including header and footer cells).
  	 */
  def resize(column: js.Object): scala.Unit = js.native
  /**
  	 * Resizes a column to a specified width in pixels, percents or auto if no width is specified.
  	 *
  	 * @param column An identifier for the column. If a number is provided it will be used as a columnIndex else if a strings is provided it will be used as a columnKey.
  	 * @param width Width of the column in pixels or percents. If no width or "*" is specified the column will be auto-sized to the width of the data in it (including header and footer cells).
  	 */
  def resize(column: js.Object, width: js.Object): scala.Unit = js.native
}

