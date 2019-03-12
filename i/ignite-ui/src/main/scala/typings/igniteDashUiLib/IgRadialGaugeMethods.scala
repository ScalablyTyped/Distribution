package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialGaugeMethods extends js.Object {
  /**
  	 * Adds a new range to the radial gauge.
  	 *
  	 * @param value
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
  	 * Clears the ranges in the radial gauge.
  	 */
  def clearRanges(): scala.Unit
  /**
  	 * Destroys widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Exports the visual data for the radial gauge.
  	 */
  def exportVisualData(): scala.Unit
  /**
  	 * Flushes the gauge.
  	 */
  def flush(): scala.Unit
  /**
  	 * Gets the point on the gauge for a given scale value and extent.
  	 *
  	 * @param value
  	 * @param extent
  	 */
  def getPointForValue(value: js.Object, extent: js.Object): scala.Unit
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
  	 * @param x
  	 * @param y
  	 */
  def needleContainsPoint(x: js.Object, y: js.Object): scala.Unit
  /**
  	 * Removes a specified range.
  	 *
  	 * @param value
  	 */
  def removeRange(value: js.Object): scala.Unit
  /**
  	 * Scales a value on the gauge's main scale to an angle around the center point of the gauge, in radians.
  	 *
  	 * @param value
  	 */
  def scaleValue(value: js.Object): scala.Unit
  /**
  	 * Returns true if the style was updated for the radial gauge.
  	 */
  def styleUpdated(): scala.Unit
  /**
  	 * Unscales a value from an angle in radians to the represented value along the main scale of the gauge.
  	 *
  	 * @param value
  	 */
  def unscaleValue(value: js.Object): scala.Unit
  /**
  	 * Updates the range.
  	 *
  	 * @param value
  	 */
  def updateRange(value: js.Object): scala.Unit
}

object IgRadialGaugeMethods {
  @scala.inline
  def apply(
    addRange: js.Object => scala.Unit,
    changeGlobalLanguage: () => scala.Unit,
    changeGlobalRegional: () => scala.Unit,
    changeLocale: js.Object => scala.Unit,
    clearRanges: () => scala.Unit,
    destroy: () => scala.Unit,
    exportVisualData: () => scala.Unit,
    flush: () => scala.Unit,
    getPointForValue: (js.Object, js.Object) => scala.Unit,
    getRangeNames: () => java.lang.String,
    getValueForPoint: (js.Object, js.Object) => scala.Double,
    needleContainsPoint: (js.Object, js.Object) => scala.Unit,
    removeRange: js.Object => scala.Unit,
    scaleValue: js.Object => scala.Unit,
    styleUpdated: () => scala.Unit,
    unscaleValue: js.Object => scala.Unit,
    updateRange: js.Object => scala.Unit
  ): IgRadialGaugeMethods = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), clearRanges = js.Any.fromFunction0(clearRanges), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), getPointForValue = js.Any.fromFunction2(getPointForValue), getRangeNames = js.Any.fromFunction0(getRangeNames), getValueForPoint = js.Any.fromFunction2(getValueForPoint), needleContainsPoint = js.Any.fromFunction2(needleContainsPoint), removeRange = js.Any.fromFunction1(removeRange), scaleValue = js.Any.fromFunction1(scaleValue), styleUpdated = js.Any.fromFunction0(styleUpdated), unscaleValue = js.Any.fromFunction1(unscaleValue), updateRange = js.Any.fromFunction1(updateRange))
  
    __obj.asInstanceOf[IgRadialGaugeMethods]
  }
}

