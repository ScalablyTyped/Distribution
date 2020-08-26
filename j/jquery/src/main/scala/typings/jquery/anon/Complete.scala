package typings.jquery.anon

import typings.jquery.JQuery._SpeedSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Complete[TElement] extends _SpeedSettings[TElement] {
  /**
    * A function to call once the animation is complete.
    */
  def complete(): Unit = js.native
}

object Complete {
  @scala.inline
  def apply[TElement](complete: () => Unit): Complete[TElement] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[Complete[TElement]]
  }
  @scala.inline
  implicit class CompleteOps[Self <: Complete[_], TElement] (val x: Self with Complete[TElement]) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
  }
  
}

