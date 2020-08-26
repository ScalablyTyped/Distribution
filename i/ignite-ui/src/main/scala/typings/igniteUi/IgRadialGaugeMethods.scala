package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgRadialGaugeMethods extends js.Object {
  /**
    * Adds a new range to the radial gauge.
    *
    * @param value
    */
  def addRange(value: js.Object): Unit = js.native
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit = js.native
  /**
    * Clears the ranges in the radial gauge.
    */
  def clearRanges(): Unit = js.native
  /**
    * Destroys widget.
    */
  def destroy(): Unit = js.native
  /**
    * Exports the visual data for the radial gauge.
    */
  def exportVisualData(): Unit = js.native
  /**
    * Flushes the gauge.
    */
  def flush(): Unit = js.native
  /**
    * Gets the point on the gauge for a given scale value and extent.
    *
    * @param value
    * @param extent
    */
  def getPointForValue(value: js.Object, extent: js.Object): Unit = js.native
  /**
    * Returns a string containing the names of all the ranges delimited with a \n symbol.
    */
  def getRangeNames(): String = js.native
  /**
    * Gets the value for the main scale of the gauge for a given point within the bounds of the gauge.
    *
    * @param x
    * @param y
    */
  def getValueForPoint(x: js.Object, y: js.Object): Double = js.native
  /**
    * Returns true if the main gauge needle bounding box contains the point provided, otherwise false.
    *
    * @param x
    * @param y
    */
  def needleContainsPoint(x: js.Object, y: js.Object): Boolean = js.native
  /**
    * Removes a specified range.
    *
    * @param value
    */
  def removeRange(value: js.Object): Unit = js.native
  /**
    * Scales a value on the gauge's main scale to an angle around the center point of the gauge, in radians.
    *
    * @param value
    */
  def scaleValue(value: js.Object): Unit = js.native
  /**
    * Returns true if the style was updated for the radial gauge.
    */
  def styleUpdated(): Unit = js.native
  /**
    * Unscales a value from an angle in radians to the represented value along the main scale of the gauge.
    *
    * @param value
    */
  def unscaleValue(value: js.Object): Unit = js.native
  /**
    * Updates the range.
    *
    * @param value
    */
  def updateRange(value: js.Object): Unit = js.native
}

object IgRadialGaugeMethods {
  @scala.inline
  def apply(
    addRange: js.Object => Unit,
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    clearRanges: () => Unit,
    destroy: () => Unit,
    exportVisualData: () => Unit,
    flush: () => Unit,
    getPointForValue: (js.Object, js.Object) => Unit,
    getRangeNames: () => String,
    getValueForPoint: (js.Object, js.Object) => Double,
    needleContainsPoint: (js.Object, js.Object) => Boolean,
    removeRange: js.Object => Unit,
    scaleValue: js.Object => Unit,
    styleUpdated: () => Unit,
    unscaleValue: js.Object => Unit,
    updateRange: js.Object => Unit
  ): IgRadialGaugeMethods = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), clearRanges = js.Any.fromFunction0(clearRanges), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), getPointForValue = js.Any.fromFunction2(getPointForValue), getRangeNames = js.Any.fromFunction0(getRangeNames), getValueForPoint = js.Any.fromFunction2(getValueForPoint), needleContainsPoint = js.Any.fromFunction2(needleContainsPoint), removeRange = js.Any.fromFunction1(removeRange), scaleValue = js.Any.fromFunction1(scaleValue), styleUpdated = js.Any.fromFunction0(styleUpdated), unscaleValue = js.Any.fromFunction1(unscaleValue), updateRange = js.Any.fromFunction1(updateRange))
    __obj.asInstanceOf[IgRadialGaugeMethods]
  }
  @scala.inline
  implicit class IgRadialGaugeMethodsOps[Self <: IgRadialGaugeMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddRange(value: js.Object => Unit): Self = this.set("addRange", js.Any.fromFunction1(value))
    @scala.inline
    def setChangeGlobalLanguage(value: () => Unit): Self = this.set("changeGlobalLanguage", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeGlobalRegional(value: () => Unit): Self = this.set("changeGlobalRegional", js.Any.fromFunction0(value))
    @scala.inline
    def setChangeLocale(value: js.Object => Unit): Self = this.set("changeLocale", js.Any.fromFunction1(value))
    @scala.inline
    def setClearRanges(value: () => Unit): Self = this.set("clearRanges", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setExportVisualData(value: () => Unit): Self = this.set("exportVisualData", js.Any.fromFunction0(value))
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPointForValue(value: (js.Object, js.Object) => Unit): Self = this.set("getPointForValue", js.Any.fromFunction2(value))
    @scala.inline
    def setGetRangeNames(value: () => String): Self = this.set("getRangeNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValueForPoint(value: (js.Object, js.Object) => Double): Self = this.set("getValueForPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setNeedleContainsPoint(value: (js.Object, js.Object) => Boolean): Self = this.set("needleContainsPoint", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveRange(value: js.Object => Unit): Self = this.set("removeRange", js.Any.fromFunction1(value))
    @scala.inline
    def setScaleValue(value: js.Object => Unit): Self = this.set("scaleValue", js.Any.fromFunction1(value))
    @scala.inline
    def setStyleUpdated(value: () => Unit): Self = this.set("styleUpdated", js.Any.fromFunction0(value))
    @scala.inline
    def setUnscaleValue(value: js.Object => Unit): Self = this.set("unscaleValue", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateRange(value: js.Object => Unit): Self = this.set("updateRange", js.Any.fromFunction1(value))
  }
  
}

