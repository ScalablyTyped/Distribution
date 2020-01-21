package typings.jqueryColorbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorboxResizeSettings extends js.Object {
  var height: js.UndefOr[Double | String] = js.undefined
  var innerHeight: js.UndefOr[Double | String] = js.undefined
  var innerWidth: js.UndefOr[Double | String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ColorboxResizeSettings {
  @scala.inline
  def apply(
    height: Double | String = null,
    innerHeight: Double | String = null,
    innerWidth: Double | String = null,
    width: Double | String = null
  ): ColorboxResizeSettings = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (innerHeight != null) __obj.updateDynamic("innerHeight")(innerHeight.asInstanceOf[js.Any])
    if (innerWidth != null) __obj.updateDynamic("innerWidth")(innerWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorboxResizeSettings]
  }
}

