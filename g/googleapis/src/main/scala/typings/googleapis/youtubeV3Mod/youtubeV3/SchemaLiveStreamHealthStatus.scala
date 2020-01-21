package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveStreamHealthStatus extends js.Object {
  /**
    * The configurations issues on this stream
    */
  var configurationIssues: js.UndefOr[js.Array[SchemaLiveStreamConfigurationIssue]] = js.native
  /**
    * The last time this status was updated (in seconds)
    */
  var lastUpdateTimeSeconds: js.UndefOr[String] = js.native
  /**
    * The status code of this stream
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaLiveStreamHealthStatus {
  @scala.inline
  def apply(
    configurationIssues: js.Array[SchemaLiveStreamConfigurationIssue] = null,
    lastUpdateTimeSeconds: String = null,
    status: String = null
  ): SchemaLiveStreamHealthStatus = {
    val __obj = js.Dynamic.literal()
    if (configurationIssues != null) __obj.updateDynamic("configurationIssues")(configurationIssues.asInstanceOf[js.Any])
    if (lastUpdateTimeSeconds != null) __obj.updateDynamic("lastUpdateTimeSeconds")(lastUpdateTimeSeconds.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveStreamHealthStatus]
  }
}

