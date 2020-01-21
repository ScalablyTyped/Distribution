package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Player to be used for a video playback.
  */
@js.native
trait SchemaVideoPlayer extends js.Object {
  var embedHeight: js.UndefOr[String] = js.native
  /**
    * An &lt;iframe&gt; tag that embeds a player that will play the video.
    */
  var embedHtml: js.UndefOr[String] = js.native
  /**
    * The embed width
    */
  var embedWidth: js.UndefOr[String] = js.native
}

object SchemaVideoPlayer {
  @scala.inline
  def apply(embedHeight: String = null, embedHtml: String = null, embedWidth: String = null): SchemaVideoPlayer = {
    val __obj = js.Dynamic.literal()
    if (embedHeight != null) __obj.updateDynamic("embedHeight")(embedHeight.asInstanceOf[js.Any])
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml.asInstanceOf[js.Any])
    if (embedWidth != null) __obj.updateDynamic("embedWidth")(embedWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoPlayer]
  }
}

