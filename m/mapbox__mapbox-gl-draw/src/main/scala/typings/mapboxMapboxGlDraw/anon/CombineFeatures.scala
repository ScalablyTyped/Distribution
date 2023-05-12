package typings.mapboxMapboxGlDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombineFeatures extends StObject {
  
  def click(event: Any): Unit
  
  def combineFeatures(): Unit
  
  def drag(event: Any): Unit
  
  def keydown(event: Any): Unit
  
  def keyup(event: Any): Unit
  
  def mousedown(event: Any): Unit
  
  def mousemove(event: Any): Unit
  
  def mouseout(event: Any): Unit
  
  def mouseup(event: Any): Unit
  
  var render: Any
  
  def stop(): Unit
  
  def tap(event: Any): Unit
  
  def touchend(event: Any): Unit
  
  def touchmove(event: Any): Unit
  
  def touchstart(event: Any): Unit
  
  def trash(): Unit
  
  def uncombineFeatures(): Unit
}
object CombineFeatures {
  
  inline def apply(
    click: Any => Unit,
    combineFeatures: () => Unit,
    drag: Any => Unit,
    keydown: Any => Unit,
    keyup: Any => Unit,
    mousedown: Any => Unit,
    mousemove: Any => Unit,
    mouseout: Any => Unit,
    mouseup: Any => Unit,
    render: Any,
    stop: () => Unit,
    tap: Any => Unit,
    touchend: Any => Unit,
    touchmove: Any => Unit,
    touchstart: Any => Unit,
    trash: () => Unit,
    uncombineFeatures: () => Unit
  ): CombineFeatures = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), combineFeatures = js.Any.fromFunction0(combineFeatures), drag = js.Any.fromFunction1(drag), keydown = js.Any.fromFunction1(keydown), keyup = js.Any.fromFunction1(keyup), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseup = js.Any.fromFunction1(mouseup), render = render.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), tap = js.Any.fromFunction1(tap), touchend = js.Any.fromFunction1(touchend), touchmove = js.Any.fromFunction1(touchmove), touchstart = js.Any.fromFunction1(touchstart), trash = js.Any.fromFunction0(trash), uncombineFeatures = js.Any.fromFunction0(uncombineFeatures))
    __obj.asInstanceOf[CombineFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CombineFeatures] (val x: Self) extends AnyVal {
    
    inline def setClick(value: Any => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
    
    inline def setCombineFeatures(value: () => Unit): Self = StObject.set(x, "combineFeatures", js.Any.fromFunction0(value))
    
    inline def setDrag(value: Any => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    inline def setKeydown(value: Any => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
    
    inline def setKeyup(value: Any => Unit): Self = StObject.set(x, "keyup", js.Any.fromFunction1(value))
    
    inline def setMousedown(value: Any => Unit): Self = StObject.set(x, "mousedown", js.Any.fromFunction1(value))
    
    inline def setMousemove(value: Any => Unit): Self = StObject.set(x, "mousemove", js.Any.fromFunction1(value))
    
    inline def setMouseout(value: Any => Unit): Self = StObject.set(x, "mouseout", js.Any.fromFunction1(value))
    
    inline def setMouseup(value: Any => Unit): Self = StObject.set(x, "mouseup", js.Any.fromFunction1(value))
    
    inline def setRender(value: Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setTap(value: Any => Unit): Self = StObject.set(x, "tap", js.Any.fromFunction1(value))
    
    inline def setTouchend(value: Any => Unit): Self = StObject.set(x, "touchend", js.Any.fromFunction1(value))
    
    inline def setTouchmove(value: Any => Unit): Self = StObject.set(x, "touchmove", js.Any.fromFunction1(value))
    
    inline def setTouchstart(value: Any => Unit): Self = StObject.set(x, "touchstart", js.Any.fromFunction1(value))
    
    inline def setTrash(value: () => Unit): Self = StObject.set(x, "trash", js.Any.fromFunction0(value))
    
    inline def setUncombineFeatures(value: () => Unit): Self = StObject.set(x, "uncombineFeatures", js.Any.fromFunction0(value))
  }
}
