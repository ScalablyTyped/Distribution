package typings.jqueryTinycarousel.JQueryTinyCarousel

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryTinyCarouselOptions extends js.Object {
  /**
    * Show animation when changing block? (default: true)
    */
  var animation: js.UndefOr[Boolean] = js.native
  /**
    * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
    */
  var axis: js.UndefOr[String] = js.native
  /**
    * Function that executes after every move (default: null)
    */
  var callback: js.UndefOr[js.Function2[/* element */ HTMLElement, /* index */ Double, Unit]] = js.native
  /**
    * Show left and right navigation buttons? (default: true)
    */
  var controls: js.UndefOr[Boolean] = js.native
  /**
    * How many blocks do you want to move at a time? (default: 1)
    */
  var display: js.UndefOr[Double] = js.native
  /**
    * Time of the animation in miliseconds (default: 1000)
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Move to the next block on an interval. (default: false)
    */
  var interval: js.UndefOr[Boolean] = js.native
  /**
    * Interval time in milliseconds. (default: 3000)
    */
  var intervaltime: js.UndefOr[Double] = js.native
  /**
    * Show page number navigation buttons? (default: false)
    */
  var pager: js.UndefOr[Boolean] = js.native
  /**
    * If interval is true and rewind is true it will play in reverse if the last slide is reached. (default: false)
    */
  var rewind: js.UndefOr[Boolean] = js.native
  /**
    * Start block of the carousel. (default: 1)
    */
  var start: js.UndefOr[Double] = js.native
}

object JQueryTinyCarouselOptions {
  @scala.inline
  def apply(): JQueryTinyCarouselOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryTinyCarouselOptions]
  }
  @scala.inline
  implicit class JQueryTinyCarouselOptionsOps[Self <: JQueryTinyCarouselOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setCallback(value: (/* element */ HTMLElement, /* index */ Double) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setDisplay(value: Double): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setInterval(value: Boolean): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setIntervaltime(value: Double): Self = this.set("intervaltime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntervaltime: Self = this.set("intervaltime", js.undefined)
    @scala.inline
    def setPager(value: Boolean): Self = this.set("pager", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    @scala.inline
    def setRewind(value: Boolean): Self = this.set("rewind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRewind: Self = this.set("rewind", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

