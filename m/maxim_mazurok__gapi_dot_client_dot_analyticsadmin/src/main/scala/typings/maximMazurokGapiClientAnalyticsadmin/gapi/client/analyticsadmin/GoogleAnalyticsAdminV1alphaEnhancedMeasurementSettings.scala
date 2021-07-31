package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings extends StObject {
  
  /** Capture events when your visitors view content on your site that has articles or blog posts. */
  var articlesAndBlogsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Capture events when your visitors view content on your site that has structured data (eg, articles, blog posts, product details screens, etc.). */
  var contentViewsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** If enabled, capture a click event each time a visitor clicks a link or element that has data attributes beginning with "data-ga". */
  var dataTaggedElementClicksEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Domains to exclude from measurement. Max length is 1024 characters. */
  var excludedDomains: js.UndefOr[String] = js.undefined
  
  /** If enabled, capture a file download event each time a link is clicked with a common document, compressed file, application, video, or audio extension. */
  var fileDownloadsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** If enabled, capture a view search results event each time a visitor interacts with a form on your site. */
  var formInteractionsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. Resource name of this Data Stream. Format: properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings Example:
    * "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** If enabled, capture an outbound click event each time a visitor clicks a link that leads them away from your domain. */
  var outboundClicksEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** If enabled, capture a page view event each time the website changes the browser history state. */
  var pageChangesEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** If enabled, capture a page view event each time a page loads. */
  var pageLoadsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. If enabled, capture a page view event each time a page loads or the website changes the browser history state. */
  var pageViewsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Capture events when your visitors view content on your site that has product details screens, etc. */
  var productsAndEcommerceEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** If enabled, capture scroll events each time a visitor gets to the bottom of a page. */
  var scrollsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Required. URL query parameters to interpret as site search parameters. Max length is 1024 characters. Must not be empty. */
  var searchQueryParameter: js.UndefOr[String] = js.undefined
  
  /** If enabled, capture a view search results event each time a visitor performs a search on your site (based on a query parameter). */
  var siteSearchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether Enhanced Measurement Settings will be used to automatically measure interactions and content on this web stream. Changing this value does not affect the settings
    * themselves, but determines whether they are respected.
    */
  var streamEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Additional URL query parameters. Max length is 1024 characters. */
  var urlQueryParameter: js.UndefOr[String] = js.undefined
  
  /** If enabled, capture video play, progress, and complete events as visitors view embedded videos on your site. */
  var videoEngagementEnabled: js.UndefOr[Boolean] = js.undefined
}
object GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettingsMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArticlesAndBlogsEnabled(value: Boolean): Self = StObject.set(x, "articlesAndBlogsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArticlesAndBlogsEnabledUndefined: Self = StObject.set(x, "articlesAndBlogsEnabled", js.undefined)
    
    @scala.inline
    def setContentViewsEnabled(value: Boolean): Self = StObject.set(x, "contentViewsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentViewsEnabledUndefined: Self = StObject.set(x, "contentViewsEnabled", js.undefined)
    
    @scala.inline
    def setDataTaggedElementClicksEnabled(value: Boolean): Self = StObject.set(x, "dataTaggedElementClicksEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTaggedElementClicksEnabledUndefined: Self = StObject.set(x, "dataTaggedElementClicksEnabled", js.undefined)
    
    @scala.inline
    def setExcludedDomains(value: String): Self = StObject.set(x, "excludedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedDomainsUndefined: Self = StObject.set(x, "excludedDomains", js.undefined)
    
    @scala.inline
    def setFileDownloadsEnabled(value: Boolean): Self = StObject.set(x, "fileDownloadsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDownloadsEnabledUndefined: Self = StObject.set(x, "fileDownloadsEnabled", js.undefined)
    
    @scala.inline
    def setFormInteractionsEnabled(value: Boolean): Self = StObject.set(x, "formInteractionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormInteractionsEnabledUndefined: Self = StObject.set(x, "formInteractionsEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutboundClicksEnabled(value: Boolean): Self = StObject.set(x, "outboundClicksEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundClicksEnabledUndefined: Self = StObject.set(x, "outboundClicksEnabled", js.undefined)
    
    @scala.inline
    def setPageChangesEnabled(value: Boolean): Self = StObject.set(x, "pageChangesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageChangesEnabledUndefined: Self = StObject.set(x, "pageChangesEnabled", js.undefined)
    
    @scala.inline
    def setPageLoadsEnabled(value: Boolean): Self = StObject.set(x, "pageLoadsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLoadsEnabledUndefined: Self = StObject.set(x, "pageLoadsEnabled", js.undefined)
    
    @scala.inline
    def setPageViewsEnabled(value: Boolean): Self = StObject.set(x, "pageViewsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageViewsEnabledUndefined: Self = StObject.set(x, "pageViewsEnabled", js.undefined)
    
    @scala.inline
    def setProductsAndEcommerceEnabled(value: Boolean): Self = StObject.set(x, "productsAndEcommerceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsAndEcommerceEnabledUndefined: Self = StObject.set(x, "productsAndEcommerceEnabled", js.undefined)
    
    @scala.inline
    def setScrollsEnabled(value: Boolean): Self = StObject.set(x, "scrollsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollsEnabledUndefined: Self = StObject.set(x, "scrollsEnabled", js.undefined)
    
    @scala.inline
    def setSearchQueryParameter(value: String): Self = StObject.set(x, "searchQueryParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchQueryParameterUndefined: Self = StObject.set(x, "searchQueryParameter", js.undefined)
    
    @scala.inline
    def setSiteSearchEnabled(value: Boolean): Self = StObject.set(x, "siteSearchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteSearchEnabledUndefined: Self = StObject.set(x, "siteSearchEnabled", js.undefined)
    
    @scala.inline
    def setStreamEnabled(value: Boolean): Self = StObject.set(x, "streamEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamEnabledUndefined: Self = StObject.set(x, "streamEnabled", js.undefined)
    
    @scala.inline
    def setUrlQueryParameter(value: String): Self = StObject.set(x, "urlQueryParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlQueryParameterUndefined: Self = StObject.set(x, "urlQueryParameter", js.undefined)
    
    @scala.inline
    def setVideoEngagementEnabled(value: Boolean): Self = StObject.set(x, "videoEngagementEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoEngagementEnabledUndefined: Self = StObject.set(x, "videoEngagementEnabled", js.undefined)
  }
}
