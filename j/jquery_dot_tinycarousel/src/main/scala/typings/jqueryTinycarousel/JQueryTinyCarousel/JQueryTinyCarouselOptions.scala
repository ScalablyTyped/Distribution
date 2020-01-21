package typings.jqueryTinycarousel.JQueryTinyCarousel

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryTinyCarouselOptions extends js.Object {
  /**
    * Show animation when changing block? (default: true)
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
    */
  var axis: js.UndefOr[String] = js.undefined
  /**
    * Function that executes after every move (default: null)
    */
  var callback: js.UndefOr[js.Function2[/* element */ HTMLElement, /* index */ Double, Unit]] = js.undefined
  /**
    * Show left and right navigation buttons? (default: true)
    */
  var controls: js.UndefOr[Boolean] = js.undefined
  /**
    * How many blocks do you want to move at a time? (default: 1)
    */
  var display: js.UndefOr[Double] = js.undefined
  /**
    * Time of the animation in miliseconds (default: 1000)
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Move to the next block on an interval. (default: false)
    */
  var interval: js.UndefOr[Boolean] = js.undefined
  /**
    * Interval time in milliseconds. (default: 3000)
    */
  var intervaltime: js.UndefOr[Double] = js.undefined
  /**
    * Show page number navigation buttons? (default: false)
    */
  var pager: js.UndefOr[Boolean] = js.undefined
  /**
    * If interval is true and rewind is true it will play in reverse if the last slide is reached. (default: false)
    */
  var rewind: js.UndefOr[Boolean] = js.undefined
  /**
    * Start block of the carousel. (default: 1)
    */
  var start: js.UndefOr[Double] = js.undefined
}

object JQueryTinyCarouselOptions {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    axis: String = null,
    callback: (/* element */ HTMLElement, /* index */ Double) => Unit = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    display: Int | Double = null,
    duration: Int | Double = null,
    interval: js.UndefOr[Boolean] = js.undefined,
    intervaltime: Int | Double = null,
    pager: js.UndefOr[Boolean] = js.undefined,
    rewind: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null
  ): JQueryTinyCarouselOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (intervaltime != null) __obj.updateDynamic("intervaltime")(intervaltime.asInstanceOf[js.Any])
    if (!js.isUndefined(pager)) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    if (!js.isUndefined(rewind)) __obj.updateDynamic("rewind")(rewind.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryTinyCarouselOptions]
  }
}

