package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientTexture extends StObject {
  
  var gradient: js.UndefOr[RGBAImage] = js.undefined
  
  var texture: js.UndefOr[Texture] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object GradientTexture {
  
  inline def apply(): GradientTexture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientTexture]
  }
  
  extension [Self <: GradientTexture](x: Self) {
    
    inline def setGradient(value: RGBAImage): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
    
    inline def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
