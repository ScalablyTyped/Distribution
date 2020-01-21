package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about monetization of a YouTube Video.
  */
@js.native
trait SchemaVideoMonetizationDetails extends js.Object {
  /**
    * The value of access indicates whether the video can be monetized or not.
    */
  var access: js.UndefOr[SchemaAccessPolicy] = js.native
}

object SchemaVideoMonetizationDetails {
  @scala.inline
  def apply(access: SchemaAccessPolicy = null): SchemaVideoMonetizationDetails = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoMonetizationDetails]
  }
}

