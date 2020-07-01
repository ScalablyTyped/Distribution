package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a channel section, including title, style and position.
  */
@js.native
trait SchemaChannelSectionSnippet extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel that published
    * the channel section.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The language of the channel section&#39;s default title and description.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  /**
    * Localized title, read-only.
    */
  var localized: js.UndefOr[SchemaChannelSectionLocalization] = js.native
  /**
    * The position of the channel section in the channel.
    */
  var position: js.UndefOr[Double] = js.native
  /**
    * The style of the channel section.
    */
  var style: js.UndefOr[String] = js.native
  /**
    * The channel section&#39;s title for multiple_playlists and
    * multiple_channels.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of the channel section.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaChannelSectionSnippet {
  @scala.inline
  def apply(
    channelId: String = null,
    defaultLanguage: String = null,
    localized: SchemaChannelSectionLocalization = null,
    position: js.UndefOr[Double] = js.undefined,
    style: String = null,
    title: String = null,
    `type`: String = null
  ): SchemaChannelSectionSnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelSectionSnippet]
  }
}

