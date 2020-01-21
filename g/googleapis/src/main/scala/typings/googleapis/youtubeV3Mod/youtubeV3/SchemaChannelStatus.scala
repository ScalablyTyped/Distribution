package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for the status part of a channel.
  */
@js.native
trait SchemaChannelStatus extends js.Object {
  /**
    * If true, then the user is linked to either a YouTube username or G+
    * account. Otherwise, the user doesn&#39;t have a public YouTube identity.
    */
  var isLinked: js.UndefOr[Boolean] = js.native
  /**
    * The long uploads status of this channel. See
    */
  var longUploadsStatus: js.UndefOr[String] = js.native
  /**
    * Privacy status of the channel.
    */
  var privacyStatus: js.UndefOr[String] = js.native
}

object SchemaChannelStatus {
  @scala.inline
  def apply(
    isLinked: js.UndefOr[Boolean] = js.undefined,
    longUploadsStatus: String = null,
    privacyStatus: String = null
  ): SchemaChannelStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isLinked)) __obj.updateDynamic("isLinked")(isLinked.asInstanceOf[js.Any])
    if (longUploadsStatus != null) __obj.updateDynamic("longUploadsStatus")(longUploadsStatus.asInstanceOf[js.Any])
    if (privacyStatus != null) __obj.updateDynamic("privacyStatus")(privacyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelStatus]
  }
}

