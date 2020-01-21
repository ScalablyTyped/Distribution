package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Branding properties of a YouTube channel.
  */
@js.native
trait SchemaChannelBrandingSettings extends js.Object {
  /**
    * Branding properties for the channel view.
    */
  var channel: js.UndefOr[SchemaChannelSettings] = js.native
  /**
    * Additional experimental branding properties.
    */
  var hints: js.UndefOr[js.Array[SchemaPropertyValue]] = js.native
  /**
    * Branding properties for branding images.
    */
  var image: js.UndefOr[SchemaImageSettings] = js.native
  /**
    * Branding properties for the watch page.
    */
  var watch: js.UndefOr[SchemaWatchSettings] = js.native
}

object SchemaChannelBrandingSettings {
  @scala.inline
  def apply(
    channel: SchemaChannelSettings = null,
    hints: js.Array[SchemaPropertyValue] = null,
    image: SchemaImageSettings = null,
    watch: SchemaWatchSettings = null
  ): SchemaChannelBrandingSettings = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelBrandingSettings]
  }
}

