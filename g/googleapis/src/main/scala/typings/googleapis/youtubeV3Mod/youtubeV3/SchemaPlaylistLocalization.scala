package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Playlist localization setting
  */
@js.native
trait SchemaPlaylistLocalization extends js.Object {
  /**
    * The localized strings for playlist&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The localized strings for playlist&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaPlaylistLocalization {
  @scala.inline
  def apply(description: String = null, title: String = null): SchemaPlaylistLocalization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlaylistLocalization]
  }
}

