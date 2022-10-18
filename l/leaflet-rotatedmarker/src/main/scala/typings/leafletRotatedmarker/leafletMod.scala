package typings.leafletRotatedmarker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  trait Marker extends StObject {
    
    /*
      * Sets the rotation angle value.
      */
    def setRotationAngle(newAngle: Double): this.type
    
    /**
      * Sets the rotation origin value.
      */
    def setRotationOrigin(newOrigin: String): this.type
  }
  object Marker {
    
    inline def apply(setRotationAngle: Double => Marker, setRotationOrigin: String => Marker): Marker = {
      val __obj = js.Dynamic.literal(setRotationAngle = js.Any.fromFunction1(setRotationAngle), setRotationOrigin = js.Any.fromFunction1(setRotationOrigin))
      __obj.asInstanceOf[Marker]
    }
    
    extension [Self <: Marker](x: Self) {
      
      inline def setSetRotationAngle(value: Double => Marker): Self = StObject.set(x, "setRotationAngle", js.Any.fromFunction1(value))
      
      inline def setSetRotationOrigin(value: String => Marker): Self = StObject.set(x, "setRotationOrigin", js.Any.fromFunction1(value))
    }
  }
  
  trait MarkerOptions extends StObject {
    
    var rotationAngle: js.UndefOr[Double] = js.undefined
    
    // Rotation angle, in degrees, clockwise. (Default = 0)
    var rotationOrigin: js.UndefOr[String] = js.undefined
  }
  object MarkerOptions {
    
    inline def apply(): MarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerOptions]
    }
    
    extension [Self <: MarkerOptions](x: Self) {
      
      inline def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      inline def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
      
      inline def setRotationOrigin(value: String): Self = StObject.set(x, "rotationOrigin", value.asInstanceOf[js.Any])
      
      inline def setRotationOriginUndefined: Self = StObject.set(x, "rotationOrigin", js.undefined)
    }
  }
}
