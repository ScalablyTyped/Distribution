package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var animation: js.UndefOr[Any] = js.undefined
  
  var animations: js.UndefOr[Any] = js.undefined
  
  var frameRate: js.UndefOr[Double] = js.undefined
  
  var image: Any
}
object SpriteConfig {
  
  inline def apply(image: Any): SpriteConfig = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpriteConfig] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAnimations(value: Any): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
