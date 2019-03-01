package typings
package jqueryDotTinyscrollbarLib.JQueryTinyScrollbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryTinyScrollbarOptions extends js.Object {
  /**
    * Vertical or horizontal scroller? 'x' or 'y'. (default: 'x')
    */
  var axis: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable mobile invert style scrolling. (default: false)
    */
  var invertscroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Return scrollwheel event to browser if there is no more content. (default: true)
    */
  var lockscroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable or disable the mousewheel. (default: true)
    */
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
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
  var wheel: js.UndefOr[scala.Double] = js.undefined
}

object JQueryTinyScrollbarOptions {
  @scala.inline
  def apply(
    axis: java.lang.String = null,
    invertscroll: js.UndefOr[scala.Boolean] = js.undefined,
    lockscroll: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: js.UndefOr[scala.Boolean] = js.undefined,
    size: js.Any = null,
    sizethumb: js.Any = null,
    wheel: scala.Int | scala.Double = null
  ): JQueryTinyScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (!js.isUndefined(invertscroll)) __obj.updateDynamic("invertscroll")(invertscroll)
    if (!js.isUndefined(lockscroll)) __obj.updateDynamic("lockscroll")(lockscroll)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (size != null) __obj.updateDynamic("size")(size)
    if (sizethumb != null) __obj.updateDynamic("sizethumb")(sizethumb)
    if (wheel != null) __obj.updateDynamic("wheel")(wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryTinyScrollbarOptions]
  }
}

