package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ChannelSection localization setting
  */
@js.native
trait SchemaChannelSectionLocalization extends js.Object {
  /**
    * The localized strings for channel section&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaChannelSectionLocalization {
  @scala.inline
  def apply(title: String = null): SchemaChannelSectionLocalization = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelSectionLocalization]
  }
}

