package typings.googleapis.fcmV1Mod.fcmV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColor extends StObject {
  
  /**
    * The fraction of this color that should be applied to the pixel. That is, the final pixel color is defined by the equation: `pixel color = alpha * (this color) + (1.0 - alpha) * (background color)` This means that a value of 1.0 corresponds to a solid color, whereas a value of 0.0 corresponds to a completely transparent color. This uses a wrapper message rather than a simple float scalar so that it is possible to distinguish between a default value and the value being unset. If omitted, this color object is rendered as a solid color (as if the alpha value had been explicitly given a value of 1.0).
    */
  var alpha: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount of blue in the color as a value in the interval [0, 1].
    */
  var blue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount of green in the color as a value in the interval [0, 1].
    */
  var green: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount of red in the color as a value in the interval [0, 1].
    */
  var red: js.UndefOr[Double | Null] = js.undefined
}
object SchemaColor {
  
  inline def apply(): SchemaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColor]
  }
  
  extension [Self <: SchemaColor](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaNull: Self = StObject.set(x, "alpha", null)
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    inline def setBlueNull: Self = StObject.set(x, "blue", null)
    
    inline def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setGreenNull: Self = StObject.set(x, "green", null)
    
    inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setRedNull: Self = StObject.set(x, "red", null)
    
    inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
  }
}
