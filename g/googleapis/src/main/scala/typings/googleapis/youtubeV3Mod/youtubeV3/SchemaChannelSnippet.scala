package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a channel, including title, description and thumbnails.
  */
@js.native
trait SchemaChannelSnippet extends js.Object {
  /**
    * The country of the channel.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The custom url of the channel.
    */
  var customUrl: js.UndefOr[String] = js.native
  /**
    * The language of the channel&#39;s default title and description.
    */
  var defaultLanguage: js.UndefOr[String] = js.native
  /**
    * The description of the channel.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Localized title and description, read-only.
    */
  var localized: js.UndefOr[SchemaChannelLocalization] = js.native
  /**
    * The date and time that the channel was created. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * A map of thumbnail images associated with the channel. For each object in
    * the map, the key is the name of the thumbnail image, and the value is an
    * object that contains other information about the thumbnail.  When
    * displaying thumbnails in your application, make sure that your code uses
    * the image URLs exactly as they are returned in API responses. For
    * example, your application should not use the http domain instead of the
    * https domain in a URL returned in an API response.  Beginning in July
    * 2018, channel thumbnail URLs will only be available in the https domain,
    * which is how the URLs appear in API responses. After that time, you might
    * see broken images in your application if it tries to load YouTube images
    * from the http domain.
    */
  var thumbnails: js.UndefOr[SchemaThumbnailDetails] = js.native
  /**
    * The channel&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaChannelSnippet {
  @scala.inline
  def apply(
    country: String = null,
    customUrl: String = null,
    defaultLanguage: String = null,
    description: String = null,
    localized: SchemaChannelLocalization = null,
    publishedAt: String = null,
    thumbnails: SchemaThumbnailDetails = null,
    title: String = null
  ): SchemaChannelSnippet = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (customUrl != null) __obj.updateDynamic("customUrl")(customUrl.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(localized.asInstanceOf[js.Any])
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelSnippet]
  }
}

