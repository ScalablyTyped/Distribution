package typings.materializeCss

import typings.materializeCss.M.Pushpin
import typings.materializeCss.materializeCssStrings.`pin-bottom`
import typings.materializeCss.materializeCssStrings.`pin-top`
import typings.materializeCss.materializeCssStrings.pinned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.PushpinOptions> */
trait PartialPushpinOptionsBottom extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onPositionChange: js.UndefOr[
    js.ThisFunction1[/* this */ Pushpin, /* position */ pinned | `pin-top` | `pin-bottom`, Unit]
  ] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object PartialPushpinOptionsBottom {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    offset: Int | Double = null,
    onPositionChange: js.ThisFunction1[/* this */ Pushpin, /* position */ pinned | `pin-top` | `pin-bottom`, Unit] = null,
    top: Int | Double = null
  ): PartialPushpinOptionsBottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(onPositionChange.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPushpinOptionsBottom]
  }
}

