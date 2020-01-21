package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaChannelSection extends js.Object {
  /**
    * The contentDetails object contains details about the channel section
    * content, such as a list of playlists or channels featured in the section.
    */
  var contentDetails: js.UndefOr[SchemaChannelSectionContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel section.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channelSection&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Localizations for different languages
    */
  var localizations: js.UndefOr[StringDictionary[SchemaChannelSectionLocalization]] = js.native
  /**
    * The snippet object contains basic details about the channel section, such
    * as its type, style and title.
    */
  var snippet: js.UndefOr[SchemaChannelSectionSnippet] = js.native
  /**
    * The targeting object contains basic targeting settings about the channel
    * section.
    */
  var targeting: js.UndefOr[SchemaChannelSectionTargeting] = js.native
}

object SchemaChannelSection {
  @scala.inline
  def apply(
    contentDetails: SchemaChannelSectionContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    localizations: StringDictionary[SchemaChannelSectionLocalization] = null,
    snippet: SchemaChannelSectionSnippet = null,
    targeting: SchemaChannelSectionTargeting = null
  ): SchemaChannelSection = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localizations != null) __obj.updateDynamic("localizations")(localizations.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (targeting != null) __obj.updateDynamic("targeting")(targeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelSection]
  }
}

