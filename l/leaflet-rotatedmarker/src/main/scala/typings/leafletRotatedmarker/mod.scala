package typings.leafletRotatedmarker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait Marker extends StObject {
    
    /*
      * Sets the rotation angle value.
      */
    def setRotationAngle(newAngle: Double): this.type = js.native
    
    /**
      * Sets the rotation origin value.
      */
    def setRotationOrigin(newOrigin: String): this.type = js.native
  }
  object Marker {
    
    @scala.inline
    def apply(setRotationAngle: Double => Marker, setRotationOrigin: String => Marker): Marker = {
      val __obj = js.Dynamic.literal(setRotationAngle = js.Any.fromFunction1(setRotationAngle), setRotationOrigin = js.Any.fromFunction1(setRotationOrigin))
      __obj.asInstanceOf[Marker]
    }
    
    @scala.inline
    implicit class MarkerMutableBuilder[Self <: Marker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetRotationAngle(value: Double => Marker): Self = StObject.set(x, "setRotationAngle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRotationOrigin(value: String => Marker): Self = StObject.set(x, "setRotationOrigin", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MarkerOptions extends StObject {
    
    var rotationAngle: js.UndefOr[Double] = js.native
    
    // Rotation angle, in degrees, clockwise. (Default = 0)
    var rotationOrigin: js.UndefOr[String] = js.native
  }
  object MarkerOptions {
    
    @scala.inline
    def apply(): MarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerOptions]
    }
    
    @scala.inline
    implicit class MarkerOptionsMutableBuilder[Self <: MarkerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRotationAngle(value: Double): Self = StObject.set(x, "rotationAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationAngleUndefined: Self = StObject.set(x, "rotationAngle", js.undefined)
      
      @scala.inline
      def setRotationOrigin(value: String): Self = StObject.set(x, "rotationOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationOriginUndefined: Self = StObject.set(x, "rotationOrigin", js.undefined)
    }
  }
}
