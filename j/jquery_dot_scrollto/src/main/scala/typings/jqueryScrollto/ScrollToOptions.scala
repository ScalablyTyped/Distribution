package typings.jqueryScrollto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollToOptions extends js.Object {
  /**
    * Which axis must be scrolled, use 'x', 'y', 'xy' or 'yx'.
    */
  var axis: js.UndefOr[String] = js.native
  /**
    * The OVERALL length of the animation.
    */
  var duration: js.UndefOr[js.Any] = js.native
  /**
    * The easing method for the animation.
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * If true, the margin of the target element will be deducted from the final position.
    */
  var margin: js.UndefOr[Boolean] = js.native
  /**
    * Add/deduct from the end position. 
    * One number for both axes or { top:x, left:y }.
    */
  var offset: js.UndefOr[js.Any] = js.native
  /**
    * Function to be called after the scrolling ends. 
    */
  var onAfter: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    *  If queuing is activated, this function will be called after the first scrolling ends.
    */
  var onAfterFirst: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Add/deduct the height/width multiplied by 'over'.
    * Can be { top:x, left:y } when using both axes.
    */
  var over: js.UndefOr[js.Any] = js.native
  /**
    * If true, and both axis are given.
    * The 2nd axis will only be animated after the first one ends.
    */
  var queue: js.UndefOr[Boolean] = js.native
}

object ScrollToOptions {
  @scala.inline
  def apply(): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToOptions]
  }
  @scala.inline
  implicit class ScrollToOptionsOps[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
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
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setDuration(value: js.Any): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setMargin(value: Boolean): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOffset(value: js.Any): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnAfter(value: () => Unit): Self = this.set("onAfter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAfter: Self = this.set("onAfter", js.undefined)
    @scala.inline
    def setOnAfterFirst(value: () => Unit): Self = this.set("onAfterFirst", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAfterFirst: Self = this.set("onAfterFirst", js.undefined)
    @scala.inline
    def setOver(value: js.Any): Self = this.set("over", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOver: Self = this.set("over", js.undefined)
    @scala.inline
    def setQueue(value: Boolean): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueue: Self = this.set("queue", js.undefined)
  }
  
}

