package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBorder extends StObject {
  
  /**
    * The color of the border. Deprecated: Use color_style.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The color of the border. If color is also set, this field takes precedence.
    */
  var colorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * The style of the border.
    */
  var style: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The width of the border, in pixels. Deprecated; the width is determined by the "style" field.
    */
  var width: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBorder {
  
  inline def apply(): SchemaBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBorder]
  }
  
  extension [Self <: SchemaBorder](x: Self) {
    
    inline def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    inline def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
