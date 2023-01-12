package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgRadialGaugeMethods extends StObject {
  
  /**
    * Adds a new range to the radial gauge.
    *
    * @param value
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
    * Clears the ranges in the radial gauge.
    */
  def clearRanges(): Unit
  
  /**
    * Destroys widget.
    */
  def destroy(): Unit
  
  /**
    * Exports the visual data for the radial gauge.
    */
  def exportVisualData(): Unit
  
  /**
    * Flushes the gauge.
    */
  def flush(): Unit
  
  /**
    * Gets the point on the gauge for a given scale value and extent.
    *
    * @param value
    * @param extent
    */
  def getPointForValue(value: js.Object, extent: js.Object): Unit
  
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
    * @param x
    * @param y
    */
  def needleContainsPoint(x: js.Object, y: js.Object): Boolean
  
  /**
    * Removes a specified range.
    *
    * @param value
    */
  def removeRange(value: js.Object): Unit
  
  /**
    * Scales a value on the gauge's main scale to an angle around the center point of the gauge, in radians.
    *
    * @param value
    */
  def scaleValue(value: js.Object): Unit
  
  /**
    * Returns true if the style was updated for the radial gauge.
    */
  def styleUpdated(): Unit
  
  /**
    * Unscales a value from an angle in radians to the represented value along the main scale of the gauge.
    *
    * @param value
    */
  def unscaleValue(value: js.Object): Unit
  
  /**
    * Updates the range.
    *
    * @param value
    */
  def updateRange(value: js.Object): Unit
}
object IgRadialGaugeMethods {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IgRadialGaugeMethods] (val x: Self) extends AnyVal {
    
    inline def setAddRange(value: js.Object => Unit): Self = StObject.set(x, "addRange", js.Any.fromFunction1(value))
    
    inline def setChangeGlobalLanguage(value: () => Unit): Self = StObject.set(x, "changeGlobalLanguage", js.Any.fromFunction0(value))
    
    inline def setChangeGlobalRegional(value: () => Unit): Self = StObject.set(x, "changeGlobalRegional", js.Any.fromFunction0(value))
    
    inline def setChangeLocale(value: js.Object => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction1(value))
    
    inline def setClearRanges(value: () => Unit): Self = StObject.set(x, "clearRanges", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setExportVisualData(value: () => Unit): Self = StObject.set(x, "exportVisualData", js.Any.fromFunction0(value))
    
    inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    inline def setGetPointForValue(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "getPointForValue", js.Any.fromFunction2(value))
    
    inline def setGetRangeNames(value: () => String): Self = StObject.set(x, "getRangeNames", js.Any.fromFunction0(value))
    
    inline def setGetValueForPoint(value: (js.Object, js.Object) => Double): Self = StObject.set(x, "getValueForPoint", js.Any.fromFunction2(value))
    
    inline def setNeedleContainsPoint(value: (js.Object, js.Object) => Boolean): Self = StObject.set(x, "needleContainsPoint", js.Any.fromFunction2(value))
    
    inline def setRemoveRange(value: js.Object => Unit): Self = StObject.set(x, "removeRange", js.Any.fromFunction1(value))
    
    inline def setScaleValue(value: js.Object => Unit): Self = StObject.set(x, "scaleValue", js.Any.fromFunction1(value))
    
    inline def setStyleUpdated(value: () => Unit): Self = StObject.set(x, "styleUpdated", js.Any.fromFunction0(value))
    
    inline def setUnscaleValue(value: js.Object => Unit): Self = StObject.set(x, "unscaleValue", js.Any.fromFunction1(value))
    
    inline def setUpdateRange(value: js.Object => Unit): Self = StObject.set(x, "updateRange", js.Any.fromFunction1(value))
  }
}
