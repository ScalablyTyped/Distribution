package typings.imagemagickNative

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    @scala.inline
    def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Orientation extends StObject {
    
    var orientation: Double
  }
  object Orientation {
    
    @scala.inline
    def apply(orientation: Double): Orientation = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Orientation]
    }
    
    @scala.inline
    implicit class OrientationMutableBuilder[Self <: Orientation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    }
  }
}
