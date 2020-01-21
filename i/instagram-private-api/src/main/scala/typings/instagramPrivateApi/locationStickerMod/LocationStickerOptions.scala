package typings.instagramPrivateApi.locationStickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationStickerOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var locationId: String
  var width: js.UndefOr[Double] = js.undefined
}

object LocationStickerOptions {
  @scala.inline
  def apply(locationId: String, height: Int | Double = null, width: Int | Double = null): LocationStickerOptions = {
    val __obj = js.Dynamic.literal(locationId = locationId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationStickerOptions]
  }
}

