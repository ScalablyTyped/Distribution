package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisPlotLinePathOptionsObject extends StObject {
  
  /**
    * Used in Highstock. When `true`, plot paths (crosshair, plotLines,
    * gridLines) will be rendered on all axes when defined on the first axis.
    */
  var acrossPanes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `false`, the function will return null when it falls outside the axis
    * bounds. If `true`, the function will return a path aligned to the plot
    * area sides if it falls outside. If `pass`, it will return a path outside.
    */
  var force: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * Line width used for calculation crisp line coordinates. Defaults to 1.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Use old coordinates (for resizing and rescaling). If not set, defaults to
    * `false`.
    */
  var old: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used in Polar axes. Reverse the positions for concatenation of polygonal
    * plot bands
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If given, return the plot line path of a pixel position on the axis.
    */
  var translatedValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Axis value.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object AxisPlotLinePathOptionsObject {
  
  @scala.inline
  def apply(): AxisPlotLinePathOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisPlotLinePathOptionsObject]
  }
  
  @scala.inline
  implicit class AxisPlotLinePathOptionsObjectMutableBuilder[Self <: AxisPlotLinePathOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcrossPanes(value: Boolean): Self = StObject.set(x, "acrossPanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcrossPanesUndefined: Self = StObject.set(x, "acrossPanes", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean | String): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setOld(value: Boolean): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setTranslatedValue(value: Double): Self = StObject.set(x, "translatedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslatedValueUndefined: Self = StObject.set(x, "translatedValue", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
