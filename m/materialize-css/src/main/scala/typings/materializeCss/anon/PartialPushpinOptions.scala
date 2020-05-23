package typings.materializeCss.anon

import typings.materializeCss.materializeCssStrings.`pin-bottom`
import typings.materializeCss.materializeCssStrings.`pin-top`
import typings.materializeCss.materializeCssStrings.pinned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.PushpinOptions> */
trait PartialPushpinOptions extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onPositionChange: js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* position */ pinned | `pin-top` | `pin-bottom`, Unit]
  ] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object PartialPushpinOptions {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    onPositionChange: js.ThisFunction1[PartialPushpinOptions, /* position */ pinned | `pin-top` | `pin-bottom`, Unit] = null,
    top: js.UndefOr[Double] = js.undefined
  ): PartialPushpinOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(onPositionChange.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPushpinOptions]
  }
}

