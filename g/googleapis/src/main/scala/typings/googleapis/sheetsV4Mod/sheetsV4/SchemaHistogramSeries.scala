package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistogramSeries extends StObject {
  
  /**
    * The color of the column representing this series in each bucket. This field is optional. Deprecated: Use bar_color_style.
    */
  var barColor: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The color of the column representing this series in each bucket. This field is optional. If bar_color is also set, this field takes precedence.
    */
  var barColorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The data for this histogram series.
    */
  var data: js.UndefOr[SchemaChartData] = js.undefined
}
object SchemaHistogramSeries {
  
  inline def apply(): SchemaHistogramSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramSeries]
  }
  
  extension [Self <: SchemaHistogramSeries](x: Self) {
    
    inline def setBarColor(value: SchemaColor): Self = StObject.set(x, "barColor", value.asInstanceOf[js.Any])
    
    inline def setBarColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "barColorStyle", value.asInstanceOf[js.Any])
    
    inline def setBarColorStyleUndefined: Self = StObject.set(x, "barColorStyle", js.undefined)
    
    inline def setBarColorUndefined: Self = StObject.set(x, "barColor", js.undefined)
    
    inline def setData(value: SchemaChartData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
