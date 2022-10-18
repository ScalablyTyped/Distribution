package typings.lonaSvgModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPrimitivesMod {
  
  @JSImport("@lona/svg-model/lib/primitives", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def point(x: Double, y: Double): Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Point_]
  
  inline def rect(x: Double, y: Double, width: Double, height: Double): Rect_ = (^.asInstanceOf[js.Dynamic].applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Rect_]
  
  trait Point_ extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point_ {
    
    inline def apply(x: Double, y: Double): Point_ = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point_]
    }
    
    extension [Self <: Point_](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect_
    extends StObject
       with Point_
       with Size
  object Rect_ {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Rect_ = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect_]
    }
  }
  
  trait Size extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Size {
    
    inline def apply(height: Double, width: Double): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
