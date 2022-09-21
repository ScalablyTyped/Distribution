package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var crop: js.UndefOr[Any] = js.undefined
  
  var image: Any
}
object ImageConfig {
  
  inline def apply(image: Any): ImageConfig = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageConfig]
  }
  
  extension [Self <: ImageConfig](x: Self) {
    
    inline def setCrop(value: Any): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
