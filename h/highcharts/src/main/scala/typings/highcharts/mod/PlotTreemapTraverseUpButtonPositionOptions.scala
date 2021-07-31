package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreemapTraverseUpButtonPositionOptions extends StObject {
  
  /**
    * (Highcharts) Horizontal alignment of the button.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highcharts) Vertical alignment of the button.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  
  /**
    * (Highcharts) Horizontal offset of the button.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Vertical offset of the button.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object PlotTreemapTraverseUpButtonPositionOptions {
  
  @scala.inline
  def apply(): PlotTreemapTraverseUpButtonPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapTraverseUpButtonPositionOptions]
  }
  
  @scala.inline
  implicit class PlotTreemapTraverseUpButtonPositionOptionsMutableBuilder[Self <: PlotTreemapTraverseUpButtonPositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
