package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageTiming extends js.Object {
  var _startRender: js.UndefOr[Double | Null] = js.undefined
  /** A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Content of the page loaded. Number of milliseconds since page load
    * started (`page.startedDateTime`).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var onContentLoad: js.UndefOr[Double] = js.undefined
  /**
    * Page is loaded (`onLoad` event fired). Number of milliseconds since
    * page load started (`page.startedDateTime`).
    *
    * Use `-1` if the timing does not apply to the current request.
    */
  var onLoad: js.UndefOr[Double] = js.undefined
}

object PageTiming {
  @scala.inline
  def apply(
    _startRender: js.UndefOr[Null | Double] = js.undefined,
    comment: String = null,
    onContentLoad: js.UndefOr[Double] = js.undefined,
    onLoad: js.UndefOr[Double] = js.undefined
  ): PageTiming = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_startRender)) __obj.updateDynamic("_startRender")(_startRender.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(onContentLoad)) __obj.updateDynamic("onContentLoad")(onContentLoad.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onLoad)) __obj.updateDynamic("onLoad")(onLoad.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageTiming]
  }
}

