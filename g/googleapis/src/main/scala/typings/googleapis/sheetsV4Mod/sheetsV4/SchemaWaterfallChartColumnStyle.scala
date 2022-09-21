package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWaterfallChartColumnStyle extends StObject {
  
  /**
    * The color of the column. Deprecated: Use color_style.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The color of the column. If color is also set, this field takes precedence.
    */
  var colorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The label of the column's legend.
    */
  var label: js.UndefOr[String | Null] = js.undefined
}
object SchemaWaterfallChartColumnStyle {
  
  inline def apply(): SchemaWaterfallChartColumnStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaterfallChartColumnStyle]
  }
  
  extension [Self <: SchemaWaterfallChartColumnStyle](x: Self) {
    
    inline def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    inline def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
