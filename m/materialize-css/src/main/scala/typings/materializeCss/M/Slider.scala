package typings.materializeCss.M

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SliderOptions> * / any */ @js.native
trait Slider extends StObject {
  
  /**
    * Index of current slide
    */
  var activeIndex: Double = js.native
  
  /**
    * ID of the dropdown element
    */
  var el: Element = js.native
  
  /**
    * Move to next slider
    */
  def next(): Unit = js.native
  
  /**
    * ID of the dropdown element
    */
  var options: SliderOptions = js.native
  
  /**
    * Pause slider autoslide
    */
  def pause(): Unit = js.native
  
  /**
    * Move to prev slider
    */
  def prev(): Unit = js.native
  
  /**
    * Start slider autoslide
    */
  def start(): Unit = js.native
}
object Slider {
  
  @scala.inline
  def apply(
    activeIndex: Double,
    el: Element,
    next: () => Unit,
    options: SliderOptions,
    pause: () => Unit,
    prev: () => Unit,
    start: () => Unit
  ): Slider = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), options = options.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), prev = js.Any.fromFunction0(prev), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Slider]
  }
  
  @scala.inline
  implicit class SliderMutableBuilder[Self <: Slider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: SliderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}
