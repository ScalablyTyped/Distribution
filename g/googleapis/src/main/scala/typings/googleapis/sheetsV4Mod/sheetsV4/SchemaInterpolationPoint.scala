package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterpolationPoint extends StObject {
  
  /**
    * The color this interpolation point should use. Deprecated: Use color_style.
    */
  var color: js.UndefOr[SchemaColor] = js.undefined
  
  /**
    * The color this interpolation point should use. If color is also set, this field takes precedence.
    */
  var colorStyle: js.UndefOr[SchemaColorStyle] = js.undefined
  
  /**
    * How the value should be interpreted.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value this interpolation point uses. May be a formula. Unused if type is MIN or MAX.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterpolationPoint {
  
  inline def apply(): SchemaInterpolationPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterpolationPoint]
  }
  
  extension [Self <: SchemaInterpolationPoint](x: Self) {
    
    inline def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorStyle(value: SchemaColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    inline def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
