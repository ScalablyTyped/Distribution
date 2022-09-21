package typings.juggleResizeObserver

import typings.juggleResizeObserver.domrectreadonlyMod.DOMRectJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<@juggle/resize-observer.@juggle/resize-observer/lib/DOMRectReadOnly.DOMRectReadOnly> */
  trait ReadonlyDOMRectReadOnly extends StObject {
    
    val bottom: Double
    
    val height: Double
    
    val left: Double
    
    val right: Double
    
    def toJSON(): DOMRectJSON
    
    val top: Double
    
    val width: Double
    
    val x: Double
    
    val y: Double
  }
  object ReadonlyDOMRectReadOnly {
    
    inline def apply(
      bottom: Double,
      height: Double,
      left: Double,
      right: Double,
      toJSON: () => DOMRectJSON,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): ReadonlyDOMRectReadOnly = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyDOMRectReadOnly]
    }
    
    extension [Self <: ReadonlyDOMRectReadOnly](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => DOMRectJSON): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
