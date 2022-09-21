package typings.juggleResizeObserver

import typings.juggleResizeObserver.anon.ReadonlyDOMRectReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domrectreadonlyMod {
  
  @JSImport("@juggle/resize-observer/lib/DOMRectReadOnly", "DOMRectReadOnly")
  @js.native
  open class DOMRectReadOnly protected () extends StObject {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    
    val bottom: Double = js.native
    
    val height: Double = js.native
    
    val left: Double = js.native
    
    val right: Double = js.native
    
    def toJSON(): DOMRectJSON = js.native
    
    val top: Double = js.native
    
    val width: Double = js.native
    
    val x: Double = js.native
    
    val y: Double = js.native
  }
  object DOMRectReadOnly {
    
    @JSImport("@juggle/resize-observer/lib/DOMRectReadOnly", "DOMRectReadOnly")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromRect(rectangle: Rectangle): ReadonlyDOMRectReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(rectangle.asInstanceOf[js.Any]).asInstanceOf[ReadonlyDOMRectReadOnly]
  }
  
  trait DOMRectJSON extends StObject {
    
    var bottom: Double
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object DOMRectJSON {
    
    inline def apply(
      bottom: Double,
      height: Double,
      left: Double,
      right: Double,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): DOMRectJSON = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMRectJSON]
    }
    
    extension [Self <: DOMRectJSON](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rectangle extends StObject {
    
    val height: Double
    
    val width: Double
    
    val x: Double
    
    val y: Double
  }
  object Rectangle {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Rectangle = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rectangle]
    }
    
    extension [Self <: Rectangle](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
