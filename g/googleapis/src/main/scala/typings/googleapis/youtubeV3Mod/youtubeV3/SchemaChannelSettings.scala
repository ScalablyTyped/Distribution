package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelSettings extends StObject {
  
  /**
    * The country of the channel.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  var defaultLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Which content tab users should see when viewing the channel.
    */
  var defaultTab: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the channel description.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title for the featured channels tab.
    */
  var featuredChannelsTitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of featured channels.
    */
  var featuredChannelsUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Lists keywords associated with the channel, comma-separated.
    */
  var keywords: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether user-submitted comments left on the channel page need to be approved by the channel owner to be publicly visible.
    */
  var moderateComments: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A prominent color that can be rendered on this channel page.
    */
  var profileColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the tab to browse the videos should be displayed.
    */
  var showBrowseView: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether related channels should be proposed.
    */
  var showRelatedChannels: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the channel title.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID for a Google Analytics account to track and measure traffic to the channels.
    */
  var trackingAnalyticsAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The trailer of the channel, for users that are not subscribers.
    */
  var unsubscribedTrailer: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannelSettings {
  
  inline def apply(): SchemaChannelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSettings]
  }
  
  extension [Self <: SchemaChannelSettings](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageNull: Self = StObject.set(x, "defaultLanguage", null)
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDefaultTab(value: String): Self = StObject.set(x, "defaultTab", value.asInstanceOf[js.Any])
    
    inline def setDefaultTabNull: Self = StObject.set(x, "defaultTab", null)
    
    inline def setDefaultTabUndefined: Self = StObject.set(x, "defaultTab", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFeaturedChannelsTitle(value: String): Self = StObject.set(x, "featuredChannelsTitle", value.asInstanceOf[js.Any])
    
    inline def setFeaturedChannelsTitleNull: Self = StObject.set(x, "featuredChannelsTitle", null)
    
    inline def setFeaturedChannelsTitleUndefined: Self = StObject.set(x, "featuredChannelsTitle", js.undefined)
    
    inline def setFeaturedChannelsUrls(value: js.Array[String]): Self = StObject.set(x, "featuredChannelsUrls", value.asInstanceOf[js.Any])
    
    inline def setFeaturedChannelsUrlsNull: Self = StObject.set(x, "featuredChannelsUrls", null)
    
    inline def setFeaturedChannelsUrlsUndefined: Self = StObject.set(x, "featuredChannelsUrls", js.undefined)
    
    inline def setFeaturedChannelsUrlsVarargs(value: String*): Self = StObject.set(x, "featuredChannelsUrls", js.Array(value*))
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsNull: Self = StObject.set(x, "keywords", null)
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setModerateComments(value: Boolean): Self = StObject.set(x, "moderateComments", value.asInstanceOf[js.Any])
    
    inline def setModerateCommentsNull: Self = StObject.set(x, "moderateComments", null)
    
    inline def setModerateCommentsUndefined: Self = StObject.set(x, "moderateComments", js.undefined)
    
    inline def setProfileColor(value: String): Self = StObject.set(x, "profileColor", value.asInstanceOf[js.Any])
    
    inline def setProfileColorNull: Self = StObject.set(x, "profileColor", null)
    
    inline def setProfileColorUndefined: Self = StObject.set(x, "profileColor", js.undefined)
    
    inline def setShowBrowseView(value: Boolean): Self = StObject.set(x, "showBrowseView", value.asInstanceOf[js.Any])
    
    inline def setShowBrowseViewNull: Self = StObject.set(x, "showBrowseView", null)
    
    inline def setShowBrowseViewUndefined: Self = StObject.set(x, "showBrowseView", js.undefined)
    
    inline def setShowRelatedChannels(value: Boolean): Self = StObject.set(x, "showRelatedChannels", value.asInstanceOf[js.Any])
    
    inline def setShowRelatedChannelsNull: Self = StObject.set(x, "showRelatedChannels", null)
    
    inline def setShowRelatedChannelsUndefined: Self = StObject.set(x, "showRelatedChannels", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrackingAnalyticsAccountId(value: String): Self = StObject.set(x, "trackingAnalyticsAccountId", value.asInstanceOf[js.Any])
    
    inline def setTrackingAnalyticsAccountIdNull: Self = StObject.set(x, "trackingAnalyticsAccountId", null)
    
    inline def setTrackingAnalyticsAccountIdUndefined: Self = StObject.set(x, "trackingAnalyticsAccountId", js.undefined)
    
    inline def setUnsubscribedTrailer(value: String): Self = StObject.set(x, "unsubscribedTrailer", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribedTrailerNull: Self = StObject.set(x, "unsubscribedTrailer", null)
    
    inline def setUnsubscribedTrailerUndefined: Self = StObject.set(x, "unsubscribedTrailer", js.undefined)
  }
}
