package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraAnimation extends StObject {
  
  def cameraAnimation(map: Any): Any
}
object CameraAnimation {
  
  inline def apply(cameraAnimation: Any => Any): CameraAnimation = {
    val __obj = js.Dynamic.literal(cameraAnimation = js.Any.fromFunction1(cameraAnimation))
    __obj.asInstanceOf[CameraAnimation]
  }
  
  extension [Self <: CameraAnimation](x: Self) {
    
    inline def setCameraAnimation(value: Any => Any): Self = StObject.set(x, "cameraAnimation", js.Any.fromFunction1(value))
  }
}
