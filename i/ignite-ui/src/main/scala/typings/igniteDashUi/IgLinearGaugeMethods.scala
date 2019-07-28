package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLinearGaugeMethods extends js.Object {
  /**
  	 * Adds a new range to the linear gauge.
  	 *
  	 * @param value The range object to be added.
  	 */
  def addRange(value: js.Object): Unit
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): Unit
  /**
  	 * Destroys widget.
  	 */
  def destroy(): Unit
  /**
  	 * Returns information about how the linear gauge is rendered.
  	 */
  def exportVisualData(): js.Object
  /**
  	 * Causes all pending changes of the linear gauge e.g. by changed property values to be rendered immediately.
  	 */
  def flush(): Unit
  /**
  	 * Returns a string containing the names of all the ranges delimited with a \n symbol.
  	 */
  def getRangeNames(): String
  /**
  	 * Gets the value for the main scale of the gauge for a given point within the bounds of the gauge.
  	 *
  	 * @param x
  	 * @param y
  	 */
  def getValueForPoint(x: js.Object, y: js.Object): Double
  /**
  	 * Returns true if the main gauge needle bounding box contains the point provided, otherwise false.
  	 *
  	 * @param x The x coordinate of the point.
  	 * @param y The y coordinate of the point.
  	 */
  def needleContainsPoint(x: Double, y: Double): Unit
  /**
  	 * Removes a range from the linear gauge.
  	 *
  	 * @param value A JS object with properties set as follows: name: nameOfTheRangeToRemove, remove: true
  	 */
  def removeRange(value: js.Object): Unit
  /**
  	 * Re-polls the css styles for the widget. Use this method when the css styles have been modified.
  	 */
  def styleUpdated(): Unit
  /**
  	 * Updates the specified range of the linear gauge.
  	 *
  	 * @param value The range object to be updated.
  	 */
  def updateRange(value: js.Object): Unit
}

object IgLinearGaugeMethods {
  @scala.inline
  def apply(
    addRange: js.Object => Unit,
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    destroy: () => Unit,
    exportVisualData: () => js.Object,
    flush: () => Unit,
    getRangeNames: () => String,
    getValueForPoint: (js.Object, js.Object) => Double,
    needleContainsPoint: (Double, Double) => Unit,
    removeRange: js.Object => Unit,
    styleUpdated: () => Unit,
    updateRange: js.Object => Unit
  ): IgLinearGaugeMethods = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), getRangeNames = js.Any.fromFunction0(getRangeNames), getValueForPoint = js.Any.fromFunction2(getValueForPoint), needleContainsPoint = js.Any.fromFunction2(needleContainsPoint), removeRange = js.Any.fromFunction1(removeRange), styleUpdated = js.Any.fromFunction0(styleUpdated), updateRange = js.Any.fromFunction1(updateRange))
  
    __obj.asInstanceOf[IgLinearGaugeMethods]
  }
}

