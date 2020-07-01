package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SliderOptions> * / any */ trait Slider extends js.Object {
  /**
    * Index of current slide
    */
  var activeIndex: Double
  /**
    * ID of the dropdown element
    */
  var el: Element
  /**
    * ID of the dropdown element
    */
  var options: SliderOptions
  /**
    * Move to next slider
    */
  def next(): Unit
  /**
    * Pause slider autoslide
    */
  def pause(): Unit
  /**
    * Move to prev slider
    */
  def prev(): Unit
  /**
    * Start slider autoslide
    */
  def start(): Unit
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
}

