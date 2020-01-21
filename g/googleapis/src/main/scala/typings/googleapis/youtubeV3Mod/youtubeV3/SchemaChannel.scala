package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A channel resource contains information about a YouTube channel.
  */
@js.native
trait SchemaChannel extends js.Object {
  /**
    * The auditionDetails object encapsulates channel data that is relevant for
    * YouTube Partners during the audition process.
    */
  var auditDetails: js.UndefOr[SchemaChannelAuditDetails] = js.native
  /**
    * The brandingSettings object encapsulates information about the branding
    * of the channel.
    */
  var brandingSettings: js.UndefOr[SchemaChannelBrandingSettings] = js.native
  /**
    * The contentDetails object encapsulates information about the
    * channel&#39;s content.
    */
  var contentDetails: js.UndefOr[SchemaChannelContentDetails] = js.native
  /**
    * The contentOwnerDetails object encapsulates channel data that is relevant
    * for YouTube Partners linked with the channel.
    */
  var contentOwnerDetails: js.UndefOr[SchemaChannelContentOwnerDetails] = js.native
  /**
    * The conversionPings object encapsulates information about conversion
    * pings that need to be respected by the channel.
    */
  var conversionPings: js.UndefOr[SchemaChannelConversionPings] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the channel.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The invideoPromotion object encapsulates information about promotion
    * campaign associated with the channel.
    */
  var invideoPromotion: js.UndefOr[SchemaInvideoPromotion] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#channel&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Localizations for different languages
    */
  var localizations: js.UndefOr[StringDictionary[SchemaChannelLocalization]] = js.native
  /**
    * The snippet object contains basic details about the channel, such as its
    * title, description, and thumbnail images.
    */
  var snippet: js.UndefOr[SchemaChannelSnippet] = js.native
  /**
    * The statistics object encapsulates statistics for the channel.
    */
  var statistics: js.UndefOr[SchemaChannelStatistics] = js.native
  /**
    * The status object encapsulates information about the privacy status of
    * the channel.
    */
  var status: js.UndefOr[SchemaChannelStatus] = js.native
  /**
    * The topicDetails object encapsulates information about Freebase topics
    * associated with the channel.
    */
  var topicDetails: js.UndefOr[SchemaChannelTopicDetails] = js.native
}

object SchemaChannel {
  @scala.inline
  def apply(
    auditDetails: SchemaChannelAuditDetails = null,
    brandingSettings: SchemaChannelBrandingSettings = null,
    contentDetails: SchemaChannelContentDetails = null,
    contentOwnerDetails: SchemaChannelContentOwnerDetails = null,
    conversionPings: SchemaChannelConversionPings = null,
    etag: String = null,
    id: String = null,
    invideoPromotion: SchemaInvideoPromotion = null,
    kind: String = null,
    localizations: StringDictionary[SchemaChannelLocalization] = null,
    snippet: SchemaChannelSnippet = null,
    statistics: SchemaChannelStatistics = null,
    status: SchemaChannelStatus = null,
    topicDetails: SchemaChannelTopicDetails = null
  ): SchemaChannel = {
    val __obj = js.Dynamic.literal()
    if (auditDetails != null) __obj.updateDynamic("auditDetails")(auditDetails.asInstanceOf[js.Any])
    if (brandingSettings != null) __obj.updateDynamic("brandingSettings")(brandingSettings.asInstanceOf[js.Any])
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (contentOwnerDetails != null) __obj.updateDynamic("contentOwnerDetails")(contentOwnerDetails.asInstanceOf[js.Any])
    if (conversionPings != null) __obj.updateDynamic("conversionPings")(conversionPings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (invideoPromotion != null) __obj.updateDynamic("invideoPromotion")(invideoPromotion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localizations != null) __obj.updateDynamic("localizations")(localizations.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (statistics != null) __obj.updateDynamic("statistics")(statistics.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (topicDetails != null) __obj.updateDynamic("topicDetails")(topicDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannel]
  }
}

