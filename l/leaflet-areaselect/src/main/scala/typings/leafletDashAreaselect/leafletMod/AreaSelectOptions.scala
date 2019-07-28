package typings.leafletDashAreaselect.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaSelectOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AreaSelectOptions {
  @scala.inline
  def apply(
    height: Int | Double = null,
    keepAspectRatio: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AreaSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAspectRatio)) __obj.updateDynamic("keepAspectRatio")(keepAspectRatio)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaSelectOptions]
  }
}

