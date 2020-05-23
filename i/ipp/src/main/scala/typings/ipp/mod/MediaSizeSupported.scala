package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaSizeSupported extends js.Object {
  var `x-dimension`: js.UndefOr[Double | String] = js.undefined
  var `y-dimension`: js.UndefOr[Double | String] = js.undefined
}

object MediaSizeSupported {
  @scala.inline
  def apply(`x-dimension`: Double | String = null, `y-dimension`: Double | String = null): MediaSizeSupported = {
    val __obj = js.Dynamic.literal()
    if (`x-dimension` != null) __obj.updateDynamic("x-dimension")(`x-dimension`.asInstanceOf[js.Any])
    if (`y-dimension` != null) __obj.updateDynamic("y-dimension")(`y-dimension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSizeSupported]
  }
}

