package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A channel resource contains information about a YouTube channel.
  */
@js.native
trait SchemaChannel extends StObject {
  
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
  implicit class SchemaChannelMutableBuilder[Self <: SchemaChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditDetails(value: SchemaChannelAuditDetails): Self = StObject.set(x, "auditDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditDetailsUndefined: Self = StObject.set(x, "auditDetails", js.undefined)
    
    @scala.inline
    def setBrandingSettings(value: SchemaChannelBrandingSettings): Self = StObject.set(x, "brandingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandingSettingsUndefined: Self = StObject.set(x, "brandingSettings", js.undefined)
    
    @scala.inline
    def setContentDetails(value: SchemaChannelContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    @scala.inline
    def setContentOwnerDetails(value: SchemaChannelContentOwnerDetails): Self = StObject.set(x, "contentOwnerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentOwnerDetailsUndefined: Self = StObject.set(x, "contentOwnerDetails", js.undefined)
    
    @scala.inline
    def setConversionPings(value: SchemaChannelConversionPings): Self = StObject.set(x, "conversionPings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionPingsUndefined: Self = StObject.set(x, "conversionPings", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInvideoPromotion(value: SchemaInvideoPromotion): Self = StObject.set(x, "invideoPromotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvideoPromotionUndefined: Self = StObject.set(x, "invideoPromotion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocalizations(value: StringDictionary[SchemaChannelLocalization]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    @scala.inline
    def setSnippet(value: SchemaChannelSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setStatistics(value: SchemaChannelStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTopicDetails(value: SchemaChannelTopicDetails): Self = StObject.set(x, "topicDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicDetailsUndefined: Self = StObject.set(x, "topicDetails", js.undefined)
  }
}
