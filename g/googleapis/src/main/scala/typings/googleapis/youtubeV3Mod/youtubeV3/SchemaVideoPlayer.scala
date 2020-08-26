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
  def apply(): SchemaVideoPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoPlayer]
  }
  @scala.inline
  implicit class SchemaVideoPlayerOps[Self <: SchemaVideoPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmbedHeight(value: String): Self = this.set("embedHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbedHeight: Self = this.set("embedHeight", js.undefined)
    @scala.inline
    def setEmbedHtml(value: String): Self = this.set("embedHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbedHtml: Self = this.set("embedHtml", js.undefined)
    @scala.inline
    def setEmbedWidth(value: String): Self = this.set("embedWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbedWidth: Self = this.set("embedWidth", js.undefined)
  }
  
}

