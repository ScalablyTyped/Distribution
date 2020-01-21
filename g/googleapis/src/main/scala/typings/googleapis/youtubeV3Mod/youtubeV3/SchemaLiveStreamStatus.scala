package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Brief description of the live stream status.
  */
@js.native
trait SchemaLiveStreamStatus extends js.Object {
  /**
    * The health status of the stream.
    */
  var healthStatus: js.UndefOr[SchemaLiveStreamHealthStatus] = js.native
  var streamStatus: js.UndefOr[String] = js.native
}

object SchemaLiveStreamStatus {
  @scala.inline
  def apply(healthStatus: SchemaLiveStreamHealthStatus = null, streamStatus: String = null): SchemaLiveStreamStatus = {
    val __obj = js.Dynamic.literal()
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    if (streamStatus != null) __obj.updateDynamic("streamStatus")(streamStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveStreamStatus]
  }
}

