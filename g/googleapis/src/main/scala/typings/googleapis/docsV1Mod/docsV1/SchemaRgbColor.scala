package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRgbColor extends StObject {
  
  /**
    * The blue component of the color, from 0.0 to 1.0.
    */
  var blue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The green component of the color, from 0.0 to 1.0.
    */
  var green: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The red component of the color, from 0.0 to 1.0.
    */
  var red: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRgbColor {
  
  inline def apply(): SchemaRgbColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRgbColor]
  }
  
  extension [Self <: SchemaRgbColor](x: Self) {
    
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
