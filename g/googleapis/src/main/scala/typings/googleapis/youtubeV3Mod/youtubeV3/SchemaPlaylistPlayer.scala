package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPlaylistPlayer extends js.Object {
  /**
    * An &lt;iframe&gt; tag that embeds a player that will play the playlist.
    */
  var embedHtml: js.UndefOr[String] = js.native
}

object SchemaPlaylistPlayer {
  @scala.inline
  def apply(embedHtml: String = null): SchemaPlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlaylistPlayer]
  }
}

