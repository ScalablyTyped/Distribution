package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var animation: js.UndefOr[js.Any] = js.undefined
  
  var animations: js.UndefOr[js.Any] = js.undefined
  
  var frameRate: js.UndefOr[Double] = js.undefined
  
  var image: js.Any
}
object SpriteConfig {
  
  @scala.inline
  def apply(image: js.Any): SpriteConfig = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteConfig]
  }
  
  @scala.inline
  implicit class SpriteConfigMutableBuilder[Self <: SpriteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: js.Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAnimations(value: js.Any): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
