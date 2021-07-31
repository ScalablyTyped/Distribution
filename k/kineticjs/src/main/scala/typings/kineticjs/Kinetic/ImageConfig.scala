package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var crop: js.UndefOr[js.Any] = js.undefined
  
  var image: js.Any
}
object ImageConfig {
  
  @scala.inline
  def apply(image: js.Any): ImageConfig = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageConfig]
  }
  
  @scala.inline
  implicit class ImageConfigMutableBuilder[Self <: ImageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrop(value: js.Any): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    @scala.inline
    def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
