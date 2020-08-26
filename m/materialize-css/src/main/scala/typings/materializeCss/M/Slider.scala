package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<SliderOptions> * / any */ @js.native
trait Slider extends js.Object {
  /**
    * Index of current slide
    */
  var activeIndex: Double = js.native
  /**
    * ID of the dropdown element
    */
  var el: Element = js.native
  /**
    * ID of the dropdown element
    */
  var options: SliderOptions = js.native
  /**
    * Move to next slider
    */
  def next(): Unit = js.native
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
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setEl(value: Element): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: SliderOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setPrev(value: () => Unit): Self = this.set("prev", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
  }
  
}

