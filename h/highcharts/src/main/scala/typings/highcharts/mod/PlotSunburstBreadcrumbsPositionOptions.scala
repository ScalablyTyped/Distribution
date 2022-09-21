package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSunburstBreadcrumbsPositionOptions extends StObject {
  
  /**
    * (Highcharts, Highmaps) Horizontal alignment of the breadcrumbs buttons.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Vertical alignment of the breadcrumbs buttons.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The X offset of the breadcrumbs button group.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The Y offset of the breadcrumbs button group. When
    * `undefined`, and `floating` is `false`, the `y` position is adapted so
    * that the breadcrumbs are rendered outside the target area.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object PlotSunburstBreadcrumbsPositionOptions {
  
  inline def apply(): PlotSunburstBreadcrumbsPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstBreadcrumbsPositionOptions]
  }
  
  extension [Self <: PlotSunburstBreadcrumbsPositionOptions](x: Self) {
    
    inline def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
