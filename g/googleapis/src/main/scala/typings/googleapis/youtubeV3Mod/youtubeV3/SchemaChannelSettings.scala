package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Branding properties for the channel view.
  */
@js.native
trait SchemaChannelSettings extends StObject {
  
  /**
    * The country of the channel.
    */
  var country: js.UndefOr[String] = js.native
  
  var defaultLanguage: js.UndefOr[String] = js.native
  
  /**
    * Which content tab users should see when viewing the channel.
    */
  var defaultTab: js.UndefOr[String] = js.native
  
  /**
    * Specifies the channel description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Title for the featured channels tab.
    */
  var featuredChannelsTitle: js.UndefOr[String] = js.native
  
  /**
    * The list of featured channels.
    */
  var featuredChannelsUrls: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Lists keywords associated with the channel, comma-separated.
    */
  var keywords: js.UndefOr[String] = js.native
  
  /**
    * Whether user-submitted comments left on the channel page need to be
    * approved by the channel owner to be publicly visible.
    */
  var moderateComments: js.UndefOr[Boolean] = js.native
  
  /**
    * A prominent color that can be rendered on this channel page.
    */
  var profileColor: js.UndefOr[String] = js.native
  
  /**
    * Whether the tab to browse the videos should be displayed.
    */
  var showBrowseView: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether related channels should be proposed.
    */
  var showRelatedChannels: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the channel title.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The ID for a Google Analytics account to track and measure traffic to the
    * channels.
    */
  var trackingAnalyticsAccountId: js.UndefOr[String] = js.native
  
  /**
    * The trailer of the channel, for users that are not subscribers.
    */
  var unsubscribedTrailer: js.UndefOr[String] = js.native
}
object SchemaChannelSettings {
  
  @scala.inline
  def apply(): SchemaChannelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSettings]
  }
  
  @scala.inline
  implicit class SchemaChannelSettingsMutableBuilder[Self <: SchemaChannelSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    @scala.inline
    def setDefaultTab(value: String): Self = StObject.set(x, "defaultTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTabUndefined: Self = StObject.set(x, "defaultTab", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFeaturedChannelsTitle(value: String): Self = StObject.set(x, "featuredChannelsTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedChannelsTitleUndefined: Self = StObject.set(x, "featuredChannelsTitle", js.undefined)
    
    @scala.inline
    def setFeaturedChannelsUrls(value: js.Array[String]): Self = StObject.set(x, "featuredChannelsUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturedChannelsUrlsUndefined: Self = StObject.set(x, "featuredChannelsUrls", js.undefined)
    
    @scala.inline
    def setFeaturedChannelsUrlsVarargs(value: String*): Self = StObject.set(x, "featuredChannelsUrls", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setModerateComments(value: Boolean): Self = StObject.set(x, "moderateComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModerateCommentsUndefined: Self = StObject.set(x, "moderateComments", js.undefined)
    
    @scala.inline
    def setProfileColor(value: String): Self = StObject.set(x, "profileColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileColorUndefined: Self = StObject.set(x, "profileColor", js.undefined)
    
    @scala.inline
    def setShowBrowseView(value: Boolean): Self = StObject.set(x, "showBrowseView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBrowseViewUndefined: Self = StObject.set(x, "showBrowseView", js.undefined)
    
    @scala.inline
    def setShowRelatedChannels(value: Boolean): Self = StObject.set(x, "showRelatedChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRelatedChannelsUndefined: Self = StObject.set(x, "showRelatedChannels", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTrackingAnalyticsAccountId(value: String): Self = StObject.set(x, "trackingAnalyticsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingAnalyticsAccountIdUndefined: Self = StObject.set(x, "trackingAnalyticsAccountId", js.undefined)
    
    @scala.inline
    def setUnsubscribedTrailer(value: String): Self = StObject.set(x, "unsubscribedTrailer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribedTrailerUndefined: Self = StObject.set(x, "unsubscribedTrailer", js.undefined)
  }
}
