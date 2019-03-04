package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLinearGaugeMethods extends js.Object {
  /**
  	 * Adds a new range to the linear gauge.
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
  	 * Returns information about how the linear gauge is rendered.
  	 */
  def exportVisualData(): js.Object
  /**
  	 * Causes all pending changes of the linear gauge e.g. by changed property values to be rendered immediately.
  	 */
  def flush(): scala.Unit
  /**
  	 * Returns a string containing the names of all the ranges delimited with a \n symbol.
  	 */
  def getRangeNames(): java.lang.String
  /**
  	 * Gets the value for the main scale of the gauge for a given point within the bounds of the gauge.
  	 *
  	 * @param x
  	 * @param y
  	 */
  def getValueForPoint(x: js.Object, y: js.Object): scala.Double
  /**
  	 * Returns true if the main gauge needle bounding box contains the point provided, otherwise false.
  	 *
  	 * @param x The x coordinate of the point.
  	 * @param y The y coordinate of the point.
  	 */
  def needleContainsPoint(x: scala.Double, y: scala.Double): scala.Unit
  /**
  	 * Removes a range from the linear gauge.
  	 *
  	 * @param value A JS object with properties set as follows: name: nameOfTheRangeToRemove, remove: true
  	 */
  def removeRange(value: js.Object): scala.Unit
  /**
  	 * Re-polls the css styles for the widget. Use this method when the css styles have been modified.
  	 */
  def styleUpdated(): scala.Unit
  /**
  	 * Updates the specified range of the linear gauge.
  	 *
  	 * @param value The range object to be updated.
  	 */
  def updateRange(value: js.Object): scala.Unit
}

object IgLinearGaugeMethods {
  @scala.inline
  def apply(
    addRange: js.Function1[js.Object, scala.Unit],
    changeGlobalLanguage: js.Function0[scala.Unit],
    changeGlobalRegional: js.Function0[scala.Unit],
    changeLocale: js.Function1[js.Object, scala.Unit],
    destroy: js.Function0[scala.Unit],
    exportVisualData: js.Function0[js.Object],
    flush: js.Function0[scala.Unit],
    getRangeNames: js.Function0[java.lang.String],
    getValueForPoint: js.Function2[js.Object, js.Object, scala.Double],
    needleContainsPoint: js.Function2[scala.Double, scala.Double, scala.Unit],
    removeRange: js.Function1[js.Object, scala.Unit],
    styleUpdated: js.Function0[scala.Unit],
    updateRange: js.Function1[js.Object, scala.Unit]
  ): IgLinearGaugeMethods = {
    val __obj = js.Dynamic.literal(addRange = addRange, changeGlobalLanguage = changeGlobalLanguage, changeGlobalRegional = changeGlobalRegional, changeLocale = changeLocale, destroy = destroy, exportVisualData = exportVisualData, flush = flush, getRangeNames = getRangeNames, getValueForPoint = getValueForPoint, needleContainsPoint = needleContainsPoint, removeRange = removeRange, styleUpdated = styleUpdated, updateRange = updateRange)
  
    __obj.asInstanceOf[IgLinearGaugeMethods]
  }
}

