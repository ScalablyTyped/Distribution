package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDimensions extends StObject {
  
  /**
    * The height in pixels.
    */
  var heightPixels: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The width in pixels.
    */
  var widthPixels: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDimensions {
  
  inline def apply(): SchemaDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensions]
  }
  
  extension [Self <: SchemaDimensions](x: Self) {
    
    inline def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
    
    inline def setHeightPixelsNull: Self = StObject.set(x, "heightPixels", null)
    
    inline def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
    
    inline def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
    
    inline def setWidthPixelsNull: Self = StObject.set(x, "widthPixels", null)
    
    inline def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
  }
}
