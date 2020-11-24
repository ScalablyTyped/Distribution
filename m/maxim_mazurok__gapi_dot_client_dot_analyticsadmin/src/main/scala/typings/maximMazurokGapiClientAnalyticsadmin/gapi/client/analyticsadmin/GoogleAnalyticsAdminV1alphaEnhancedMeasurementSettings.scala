package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings extends js.Object {
  
  /** Capture events when your visitors view content on your site that has articles or blog posts. */
  var articlesAndBlogsEnabled: js.UndefOr[Boolean] = js.native
  
  /** Capture events when your visitors view content on your site that has structured data (eg, articles, blog posts, product details screens, etc.). */
  var contentViewsEnabled: js.UndefOr[Boolean] = js.native
  
  /** If enabled, capture a click event each time a visitor clicks a link or element that has data attributes beginning with "data-ga". */
  var dataTaggedElementClicksEnabled: js.UndefOr[Boolean] = js.native
  
  /** Domains to exclude from measurement. Max length is 1024 characters. */
  var excludedDomains: js.UndefOr[String] = js.native
  
  /** If enabled, capture a file download event each time a link is clicked with a common document, compressed file, application, video, or audio extension. */
  var fileDownloadsEnabled: js.UndefOr[Boolean] = js.native
  
  /** If enabled, capture a view search results event each time a visitor interacts with a form on your site. */
  var formInteractionsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. Resource name of this Data Stream. Format: properties/{property_id}/webDataStreams/{stream_id}/enhancedMeasurementSettings Example:
    * "properties/1000/webDataStreams/2000/enhancedMeasurementSettings"
    */
  var name: js.UndefOr[String] = js.native
  
  /** If enabled, capture an outbound click event each time a visitor clicks a link that leads them away from your domain. */
  var outboundClicksEnabled: js.UndefOr[Boolean] = js.native
  
  /** If enabled, capture a page view event each time the website changes the browser history state. */
  var pageChangesEnabled: js.UndefOr[Boolean] = js.native
  
  /** If enabled, capture a page view event each time a page loads. */
  var pageLoadsEnabled: js.UndefOr[Boolean] = js.native
  
  /** Output only. If enabled, capture a page view event each time a page loads or the website changes the browser history state. */
  var pageViewsEnabled: js.UndefOr[Boolean] = js.native
  
  /** Capture events when your visitors view content on your site that has product details screens, etc. */
  var productsAndEcommerceEnabled: js.UndefOr[Boolean] = js.native
  
  /** If enabled, capture scroll events each time a visitor gets to the bottom of a page. */
  var scrollsEnabled: js.UndefOr[Boolean] = js.native
  
  /** Required. URL query parameters to interpret as site search parameters. Max length is 1024 characters. Must not be empty. */
  var searchQueryParameter: js.UndefOr[String] = js.native
  
  /** If enabled, capture a view search results event each time a visitor performs a search on your site (based on a query parameter). */
  var siteSearchEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether Enhanced Measurement Settings will be used to automatically measure interactions and content on this web stream. Changing this value does not affect the settings
    * themselves, but determines whether they are respected.
    */
  var streamEnabled: js.UndefOr[Boolean] = js.native
  
  /** Additional URL query parameters. Max length is 1024 characters. */
  var urlQueryParameter: js.UndefOr[String] = js.native
  
  /** If enabled, capture video play, progress, and complete events as visitors view embedded videos on your site. */
  var videoEngagementEnabled: js.UndefOr[Boolean] = js.native
}
object GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettingsOps[Self <: GoogleAnalyticsAdminV1alphaEnhancedMeasurementSettings] (val x: Self) extends AnyVal {
    
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
    def setArticlesAndBlogsEnabled(value: Boolean): Self = this.set("articlesAndBlogsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArticlesAndBlogsEnabled: Self = this.set("articlesAndBlogsEnabled", js.undefined)
    
    @scala.inline
    def setContentViewsEnabled(value: Boolean): Self = this.set("contentViewsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentViewsEnabled: Self = this.set("contentViewsEnabled", js.undefined)
    
    @scala.inline
    def setDataTaggedElementClicksEnabled(value: Boolean): Self = this.set("dataTaggedElementClicksEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTaggedElementClicksEnabled: Self = this.set("dataTaggedElementClicksEnabled", js.undefined)
    
    @scala.inline
    def setExcludedDomains(value: String): Self = this.set("excludedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedDomains: Self = this.set("excludedDomains", js.undefined)
    
    @scala.inline
    def setFileDownloadsEnabled(value: Boolean): Self = this.set("fileDownloadsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileDownloadsEnabled: Self = this.set("fileDownloadsEnabled", js.undefined)
    
    @scala.inline
    def setFormInteractionsEnabled(value: Boolean): Self = this.set("formInteractionsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormInteractionsEnabled: Self = this.set("formInteractionsEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutboundClicksEnabled(value: Boolean): Self = this.set("outboundClicksEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutboundClicksEnabled: Self = this.set("outboundClicksEnabled", js.undefined)
    
    @scala.inline
    def setPageChangesEnabled(value: Boolean): Self = this.set("pageChangesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageChangesEnabled: Self = this.set("pageChangesEnabled", js.undefined)
    
    @scala.inline
    def setPageLoadsEnabled(value: Boolean): Self = this.set("pageLoadsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageLoadsEnabled: Self = this.set("pageLoadsEnabled", js.undefined)
    
    @scala.inline
    def setPageViewsEnabled(value: Boolean): Self = this.set("pageViewsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageViewsEnabled: Self = this.set("pageViewsEnabled", js.undefined)
    
    @scala.inline
    def setProductsAndEcommerceEnabled(value: Boolean): Self = this.set("productsAndEcommerceEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductsAndEcommerceEnabled: Self = this.set("productsAndEcommerceEnabled", js.undefined)
    
    @scala.inline
    def setScrollsEnabled(value: Boolean): Self = this.set("scrollsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollsEnabled: Self = this.set("scrollsEnabled", js.undefined)
    
    @scala.inline
    def setSearchQueryParameter(value: String): Self = this.set("searchQueryParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchQueryParameter: Self = this.set("searchQueryParameter", js.undefined)
    
    @scala.inline
    def setSiteSearchEnabled(value: Boolean): Self = this.set("siteSearchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteSearchEnabled: Self = this.set("siteSearchEnabled", js.undefined)
    
    @scala.inline
    def setStreamEnabled(value: Boolean): Self = this.set("streamEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamEnabled: Self = this.set("streamEnabled", js.undefined)
    
    @scala.inline
    def setUrlQueryParameter(value: String): Self = this.set("urlQueryParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlQueryParameter: Self = this.set("urlQueryParameter", js.undefined)
    
    @scala.inline
    def setVideoEngagementEnabled(value: Boolean): Self = this.set("videoEngagementEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoEngagementEnabled: Self = this.set("videoEngagementEnabled", js.undefined)
  }
}
