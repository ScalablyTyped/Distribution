package typings.jqueryTinyscrollbar.JQueryTinyScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryTinyScrollbarOptions extends js.Object {
  /**
    * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
    */
  var axis: js.UndefOr[String] = js.undefined
  /**
    * Enable mobile invert style scrolling. (default: false)
    */
  var invertscroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Return scrollwheel event to browser if there is no more content. (default: true)
    */
  var lockscroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable the mousewheel. (default: true)
    */
  var scroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the size of the scrollbar to auto or a fixed number. (default: 'auto')
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /**
    * Set the size of the thumb to auto or a fixed number. (default: 'auto')
    */
  var sizethumb: js.UndefOr[js.Any] = js.undefined
  /**
    * How many pixels must the mouswheel scrolls at a time. (default: 40)
    */
  var wheel: js.UndefOr[Double] = js.undefined
}

object JQueryTinyScrollbarOptions {
  @scala.inline
  def apply(
    axis: String = null,
    invertscroll: js.UndefOr[Boolean] = js.undefined,
    lockscroll: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    size: js.Any = null,
    sizethumb: js.Any = null,
    wheel: js.UndefOr[Double] = js.undefined
  ): JQueryTinyScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (!js.isUndefined(invertscroll)) __obj.updateDynamic("invertscroll")(invertscroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockscroll)) __obj.updateDynamic("lockscroll")(lockscroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizethumb != null) __obj.updateDynamic("sizethumb")(sizethumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wheel)) __obj.updateDynamic("wheel")(wheel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryTinyScrollbarOptions]
  }
}

