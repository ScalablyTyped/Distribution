package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannel extends StObject {
  
  /**
    * The auditionDetails object encapsulates channel data that is relevant for YouTube Partners during the audition process.
    */
  var auditDetails: js.UndefOr[SchemaChannelAuditDetails] = js.undefined
  
  /**
    * The brandingSettings object encapsulates information about the branding of the channel.
    */
  var brandingSettings: js.UndefOr[SchemaChannelBrandingSettings] = js.undefined
  
  /**
    * The contentDetails object encapsulates information about the channel's content.
    */
  var contentDetails: js.UndefOr[SchemaChannelContentDetails] = js.undefined
  
  /**
    * The contentOwnerDetails object encapsulates channel data that is relevant for YouTube Partners linked with the channel.
    */
  var contentOwnerDetails: js.UndefOr[SchemaChannelContentOwnerDetails] = js.undefined
  
  /**
    * The conversionPings object encapsulates information about conversion pings that need to be respected by the channel.
    */
  var conversionPings: js.UndefOr[SchemaChannelConversionPings] = js.undefined
  
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID that YouTube uses to uniquely identify the channel.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "youtube#channel".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Localizations for different languages
    */
  var localizations: js.UndefOr[StringDictionary[SchemaChannelLocalization] | Null] = js.undefined
  
  /**
    * The snippet object contains basic details about the channel, such as its title, description, and thumbnail images.
    */
  var snippet: js.UndefOr[SchemaChannelSnippet] = js.undefined
  
  /**
    * The statistics object encapsulates statistics for the channel.
    */
  var statistics: js.UndefOr[SchemaChannelStatistics] = js.undefined
  
  /**
    * The status object encapsulates information about the privacy status of the channel.
    */
  var status: js.UndefOr[SchemaChannelStatus] = js.undefined
  
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the channel.
    */
  var topicDetails: js.UndefOr[SchemaChannelTopicDetails] = js.undefined
}
object SchemaChannel {
  
  inline def apply(): SchemaChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannel]
  }
  
  extension [Self <: SchemaChannel](x: Self) {
    
    inline def setAuditDetails(value: SchemaChannelAuditDetails): Self = StObject.set(x, "auditDetails", value.asInstanceOf[js.Any])
    
    inline def setAuditDetailsUndefined: Self = StObject.set(x, "auditDetails", js.undefined)
    
    inline def setBrandingSettings(value: SchemaChannelBrandingSettings): Self = StObject.set(x, "brandingSettings", value.asInstanceOf[js.Any])
    
    inline def setBrandingSettingsUndefined: Self = StObject.set(x, "brandingSettings", js.undefined)
    
    inline def setContentDetails(value: SchemaChannelContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
    
    inline def setContentOwnerDetails(value: SchemaChannelContentOwnerDetails): Self = StObject.set(x, "contentOwnerDetails", value.asInstanceOf[js.Any])
    
    inline def setContentOwnerDetailsUndefined: Self = StObject.set(x, "contentOwnerDetails", js.undefined)
    
    inline def setConversionPings(value: SchemaChannelConversionPings): Self = StObject.set(x, "conversionPings", value.asInstanceOf[js.Any])
    
    inline def setConversionPingsUndefined: Self = StObject.set(x, "conversionPings", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocalizations(value: StringDictionary[SchemaChannelLocalization]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    inline def setLocalizationsNull: Self = StObject.set(x, "localizations", null)
    
    inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    inline def setSnippet(value: SchemaChannelSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    inline def setStatistics(value: SchemaChannelStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setStatus(value: SchemaChannelStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTopicDetails(value: SchemaChannelTopicDetails): Self = StObject.set(x, "topicDetails", value.asInstanceOf[js.Any])
    
    inline def setTopicDetailsUndefined: Self = StObject.set(x, "topicDetails", js.undefined)
  }
}
