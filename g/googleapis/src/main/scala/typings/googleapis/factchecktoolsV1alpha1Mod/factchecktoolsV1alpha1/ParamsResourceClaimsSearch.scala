package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceClaimsSearch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". Can be used to
    * restrict results by language, though we do not currently consider the
    * region.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * The maximum age of the returned search results, in days. Age is
    * determined by either claim date or review date, whichever is newer.
    */
  var maxAgeDays: js.UndefOr[Double] = js.native
  
  /**
    * An integer that specifies the current offset (that is, starting result
    * location) in search results. This field is only considered if
    * `page_token` is unset. For example, 0 means to return results starting
    * from the first matching result, and 10 means to return from the 11th
    * result.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * The pagination size. We will return up to that many results. Defaults to
    * 10 if not set.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * The pagination token. You may provide the `next_page_token` returned from
    * a previous List request, if any, in order to get the next page. All other
    * fields must have the same values as in the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Textual query string. Required unless `review_publisher_site_filter` is
    * specified.
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * The review publisher site to filter results by, e.g. nytimes.com.
    */
  var reviewPublisherSiteFilter: js.UndefOr[String] = js.native
}
object ParamsResourceClaimsSearch {
  
  @scala.inline
  def apply(): ParamsResourceClaimsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceClaimsSearch]
  }
  
  @scala.inline
  implicit class ParamsResourceClaimsSearchMutableBuilder[Self <: ParamsResourceClaimsSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setMaxAgeDays(value: Double): Self = StObject.set(x, "maxAgeDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeDaysUndefined: Self = StObject.set(x, "maxAgeDays", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setReviewPublisherSiteFilter(value: String): Self = StObject.set(x, "reviewPublisherSiteFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewPublisherSiteFilterUndefined: Self = StObject.set(x, "reviewPublisherSiteFilter", js.undefined)
  }
}
