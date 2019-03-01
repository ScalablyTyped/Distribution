package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTiming extends js.Object {
  var _startRender: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Content of the page loaded. Number of milliseconds since page load
    * started (`page.startedDateTime`).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var onContentLoad: js.UndefOr[scala.Double] = js.undefined
  /**
    * Page is loaded (`onLoad` event fired). Number of milliseconds since
    * page load started (`page.startedDateTime`).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var onLoad: js.UndefOr[scala.Double] = js.undefined
}

object PageTiming {
  @scala.inline
  def apply(
    _startRender: scala.Int | scala.Double = null,
    comment: java.lang.String = null,
    onContentLoad: scala.Int | scala.Double = null,
    onLoad: scala.Int | scala.Double = null
  ): PageTiming = {
    val __obj = js.Dynamic.literal()
    if (_startRender != null) __obj.updateDynamic("_startRender")(_startRender.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (onContentLoad != null) __obj.updateDynamic("onContentLoad")(onContentLoad.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageTiming]
  }
}

