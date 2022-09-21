package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIndexStatusInspectionResult extends StObject {
  
  /**
    * Could Google find and index the page. More details about page indexing appear in 'indexing_state'.
    */
  var coverageState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Primary crawler that was used by Google to crawl your site.
    */
  var crawledAs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the page that Google selected as canonical. If the page was not indexed, this field is absent.
    */
  var googleCanonical: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not the page blocks indexing through a noindex rule.
    */
  var indexingState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last time this URL was crawled by Google using the [primary crawler](https://support.google.com/webmasters/answer/7440203#primary_crawler). Absent if the URL was never crawled successfully.
    */
  var lastCrawlTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not Google could retrieve the page from your server. Equivalent to ["page fetch"](https://support.google.com/webmasters/answer/9012289#index_coverage) in the URL inspection report.
    */
  var pageFetchState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URLs that link to the inspected URL, directly and indirectly.
    */
  var referringUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether or not the page is blocked to Google by a robots.txt rule.
    */
  var robotsTxtState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Any sitemaps that this URL was listed in, as known by Google. Not guaranteed to be an exhaustive list, especially if Google did not discover this URL through a sitemap. Absent if no sitemaps were found.
    */
  var sitemap: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The URL that your page or site [declares as canonical](https://developers.google.com/search/docs/advanced/crawling/consolidate-duplicate-urls?#define-canonical). If you did not declare a canonical URL, this field is absent.
    */
  var userCanonical: js.UndefOr[String | Null] = js.undefined
  
  /**
    * High level verdict about whether the URL *is* indexed (indexed status), or *can be* indexed (live inspection).
    */
  var verdict: js.UndefOr[String | Null] = js.undefined
}
object SchemaIndexStatusInspectionResult {
  
  inline def apply(): SchemaIndexStatusInspectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIndexStatusInspectionResult]
  }
  
  extension [Self <: SchemaIndexStatusInspectionResult](x: Self) {
    
    inline def setCoverageState(value: String): Self = StObject.set(x, "coverageState", value.asInstanceOf[js.Any])
    
    inline def setCoverageStateNull: Self = StObject.set(x, "coverageState", null)
    
    inline def setCoverageStateUndefined: Self = StObject.set(x, "coverageState", js.undefined)
    
    inline def setCrawledAs(value: String): Self = StObject.set(x, "crawledAs", value.asInstanceOf[js.Any])
    
    inline def setCrawledAsNull: Self = StObject.set(x, "crawledAs", null)
    
    inline def setCrawledAsUndefined: Self = StObject.set(x, "crawledAs", js.undefined)
    
    inline def setGoogleCanonical(value: String): Self = StObject.set(x, "googleCanonical", value.asInstanceOf[js.Any])
    
    inline def setGoogleCanonicalNull: Self = StObject.set(x, "googleCanonical", null)
    
    inline def setGoogleCanonicalUndefined: Self = StObject.set(x, "googleCanonical", js.undefined)
    
    inline def setIndexingState(value: String): Self = StObject.set(x, "indexingState", value.asInstanceOf[js.Any])
    
    inline def setIndexingStateNull: Self = StObject.set(x, "indexingState", null)
    
    inline def setIndexingStateUndefined: Self = StObject.set(x, "indexingState", js.undefined)
    
    inline def setLastCrawlTime(value: String): Self = StObject.set(x, "lastCrawlTime", value.asInstanceOf[js.Any])
    
    inline def setLastCrawlTimeNull: Self = StObject.set(x, "lastCrawlTime", null)
    
    inline def setLastCrawlTimeUndefined: Self = StObject.set(x, "lastCrawlTime", js.undefined)
    
    inline def setPageFetchState(value: String): Self = StObject.set(x, "pageFetchState", value.asInstanceOf[js.Any])
    
    inline def setPageFetchStateNull: Self = StObject.set(x, "pageFetchState", null)
    
    inline def setPageFetchStateUndefined: Self = StObject.set(x, "pageFetchState", js.undefined)
    
    inline def setReferringUrls(value: js.Array[String]): Self = StObject.set(x, "referringUrls", value.asInstanceOf[js.Any])
    
    inline def setReferringUrlsNull: Self = StObject.set(x, "referringUrls", null)
    
    inline def setReferringUrlsUndefined: Self = StObject.set(x, "referringUrls", js.undefined)
    
    inline def setReferringUrlsVarargs(value: String*): Self = StObject.set(x, "referringUrls", js.Array(value*))
    
    inline def setRobotsTxtState(value: String): Self = StObject.set(x, "robotsTxtState", value.asInstanceOf[js.Any])
    
    inline def setRobotsTxtStateNull: Self = StObject.set(x, "robotsTxtState", null)
    
    inline def setRobotsTxtStateUndefined: Self = StObject.set(x, "robotsTxtState", js.undefined)
    
    inline def setSitemap(value: js.Array[String]): Self = StObject.set(x, "sitemap", value.asInstanceOf[js.Any])
    
    inline def setSitemapNull: Self = StObject.set(x, "sitemap", null)
    
    inline def setSitemapUndefined: Self = StObject.set(x, "sitemap", js.undefined)
    
    inline def setSitemapVarargs(value: String*): Self = StObject.set(x, "sitemap", js.Array(value*))
    
    inline def setUserCanonical(value: String): Self = StObject.set(x, "userCanonical", value.asInstanceOf[js.Any])
    
    inline def setUserCanonicalNull: Self = StObject.set(x, "userCanonical", null)
    
    inline def setUserCanonicalUndefined: Self = StObject.set(x, "userCanonical", js.undefined)
    
    inline def setVerdict(value: String): Self = StObject.set(x, "verdict", value.asInstanceOf[js.Any])
    
    inline def setVerdictNull: Self = StObject.set(x, "verdict", null)
    
    inline def setVerdictUndefined: Self = StObject.set(x, "verdict", js.undefined)
  }
}
