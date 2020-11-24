package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannel]
  }
  
  @scala.inline
  implicit class SchemaChannelOps[Self <: SchemaChannel] (val x: Self) extends AnyVal {
    
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
    def setAuditDetails(value: SchemaChannelAuditDetails): Self = this.set("auditDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuditDetails: Self = this.set("auditDetails", js.undefined)
    
    @scala.inline
    def setBrandingSettings(value: SchemaChannelBrandingSettings): Self = this.set("brandingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrandingSettings: Self = this.set("brandingSettings", js.undefined)
    
    @scala.inline
    def setContentDetails(value: SchemaChannelContentDetails): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDetails: Self = this.set("contentDetails", js.undefined)
    
    @scala.inline
    def setContentOwnerDetails(value: SchemaChannelContentOwnerDetails): Self = this.set("contentOwnerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentOwnerDetails: Self = this.set("contentOwnerDetails", js.undefined)
    
    @scala.inline
    def setConversionPings(value: SchemaChannelConversionPings): Self = this.set("conversionPings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionPings: Self = this.set("conversionPings", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInvideoPromotion(value: SchemaInvideoPromotion): Self = this.set("invideoPromotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvideoPromotion: Self = this.set("invideoPromotion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocalizations(value: StringDictionary[SchemaChannelLocalization]): Self = this.set("localizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizations: Self = this.set("localizations", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaChannelSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    
    @scala.inline
    def setStatistics(value: SchemaChannelStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaChannelStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTopicDetails(value: SchemaChannelTopicDetails): Self = this.set("topicDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicDetails: Self = this.set("topicDetails", js.undefined)
  }
}
