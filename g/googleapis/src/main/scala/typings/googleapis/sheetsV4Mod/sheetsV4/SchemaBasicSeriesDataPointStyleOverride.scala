package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasicSeriesDataPointStyleOverride extends StObject {
  
  /**
    * Color of the series data point. If empty, the series default is used. Deprecated: Use color_style.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * Color of the series data point. If empty, the series default is used. If color is also set, this field takes precedence.
    */
  var colorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * Zero based index of the series data point.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Point style of the series data point. Valid only if the chartType is AREA, LINE, or SCATTER. COMBO charts are also supported if the series chart type is AREA, LINE, or SCATTER. If empty, the series default is used.
    */
  var pointStyle: js.UndefOr[SchemaPointStyle] = js.undefined
}
object SchemaBasicSeriesDataPointStyleOverride {
  
  inline def apply(): SchemaBasicSeriesDataPointStyleOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicSeriesDataPointStyleOverride]
  }
  
  extension [Self <: SchemaBasicSeriesDataPointStyleOverride](x: Self) {
    
    inline def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    inline def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPointStyle(value: SchemaPointStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
    
    inline def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
  }
}
