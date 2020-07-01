package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings and Info of the monitor stream
  */
@js.native
trait SchemaMonitorStreamInfo extends js.Object {
  /**
    * If you have set the enableMonitorStream property to true, then this
    * property determines the length of the live broadcast delay.
    */
  var broadcastStreamDelayMs: js.UndefOr[Double] = js.native
  /**
    * HTML code that embeds a player that plays the monitor stream.
    */
  var embedHtml: js.UndefOr[String] = js.native
  /**
    * This value determines whether the monitor stream is enabled for the
    * broadcast. If the monitor stream is enabled, then YouTube will broadcast
    * the event content on a special stream intended only for the
    * broadcaster&#39;s consumption. The broadcaster can use the stream to
    * review the event content and also to identify the optimal times to insert
    * cuepoints.  You need to set this value to true if you intend to have a
    * broadcast delay for your event.  Note: This property cannot be updated
    * once the broadcast is in the testing or live state.
    */
  var enableMonitorStream: js.UndefOr[Boolean] = js.native
}

object SchemaMonitorStreamInfo {
  @scala.inline
  def apply(
    broadcastStreamDelayMs: js.UndefOr[Double] = js.undefined,
    embedHtml: String = null,
    enableMonitorStream: js.UndefOr[Boolean] = js.undefined
  ): SchemaMonitorStreamInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(broadcastStreamDelayMs)) __obj.updateDynamic("broadcastStreamDelayMs")(broadcastStreamDelayMs.get.asInstanceOf[js.Any])
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMonitorStream)) __obj.updateDynamic("enableMonitorStream")(enableMonitorStream.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMonitorStreamInfo]
  }
}

