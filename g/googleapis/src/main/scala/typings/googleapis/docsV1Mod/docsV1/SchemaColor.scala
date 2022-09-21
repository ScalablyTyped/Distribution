package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaColor extends StObject {
  
  /**
    * The RGB color value.
    */
  var rgbColor: js.UndefOr[SchemaRgbColor] = js.undefined
}
object SchemaColor {
  
  inline def apply(): SchemaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColor]
  }
  
  extension [Self <: SchemaColor](x: Self) {
    
    inline def setRgbColor(value: SchemaRgbColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    inline def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
  }
}
