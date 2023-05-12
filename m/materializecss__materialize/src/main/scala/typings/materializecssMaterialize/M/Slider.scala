package typings.materializecssMaterialize.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slider
  extends StObject
     with Component[SliderOptions] {
  
  /**
    * Index of current slide.
    */
  var activeIndex: Double
  
  /**
    * Move to next slider.
    */
  def next(): Unit
  
  /**
    * Pause slider autoslide.
    */
  def pause(): Unit
  
  /**
    * Move to prev slider.
    */
  def prev(): Unit
  
  /**
    * Start slider autoslide.
    */
  def start(): Unit
}
object Slider {
  
  inline def apply(
    activeIndex: Double,
    destroy: () => Unit,
    el: Element,
    next: () => Unit,
    options: SliderOptions,
    pause: () => Unit,
    prev: () => Unit,
    start: () => Unit
  ): Slider = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), el = el.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), options = options.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), prev = js.Any.fromFunction0(prev), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Slider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slider] (val x: Self) extends AnyVal {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPrev(value: () => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}
