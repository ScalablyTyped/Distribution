package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A solid color fill. The page or page element is filled entirely with the
  * specified color value.  If any field is unset, its value may be inherited
  * from a parent placeholder if it exists.
  */
trait SchemaSolidFill extends StObject {
  
  /**
    * The fraction of this `color` that should be applied to the pixel. That
    * is, the final pixel color is defined by the equation:    pixel color =
    * alpha * (color) + (1.0 - alpha) * (background color)  This means that a
    * value of 1.0 corresponds to a solid color, whereas a value of 0.0
    * corresponds to a completely transparent color.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * The color value of the solid fill.
    */
  var color: js.UndefOr[SchemaOpaqueColor] = js.undefined
}
object SchemaSolidFill {
  
  inline def apply(): SchemaSolidFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSolidFill]
  }
  
  extension [Self <: SchemaSolidFill](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setColor(value: SchemaOpaqueColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
