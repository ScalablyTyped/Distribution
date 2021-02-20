package typings.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceReportsQuery extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The currency to which financial metrics should be converted. The default
    * is US Dollar (USD). If the result contains no financial metrics, this
    * flag will be ignored. Responds with an error if the specified currency is
    * not recognized.
    */
  var currency: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of YouTube Analytics dimensions, such as views or
    * ageGroup,gender. See the Available Reports document for a list of the
    * reports that you can retrieve and the dimensions used for those reports.
    * Also see the Dimensions document for definitions of those dimensions.
    */
  var dimensions: js.UndefOr[String] = js.native
  
  /**
    * The end date for fetching YouTube Analytics data. The value should be in
    * YYYY-MM-DD format.
    */
  var `end-date`: js.UndefOr[String] = js.native
  
  /**
    * A list of filters that should be applied when retrieving YouTube
    * Analytics data. The Available Reports document identifies the dimensions
    * that can be used to filter each report, and the Dimensions document
    * defines those dimensions. If a request uses multiple filters, join them
    * together with a semicolon (;), and the returned result table will satisfy
    * both filters. For example, a filters parameter value of
    * video==dMH0bHeiRNg;country==IT restricts the result set to include data
    * for the given video in Italy.
    */
  var filters: js.UndefOr[String] = js.native
  
  /**
    * Identifies the YouTube channel or content owner for which you are
    * retrieving YouTube Analytics data. - To request data for a YouTube user,
    * set the ids parameter value to channel==CHANNEL_ID, where CHANNEL_ID
    * specifies the unique YouTube channel ID. - To request data for a YouTube
    * CMS content owner, set the ids parameter value to
    * contentOwner==OWNER_NAME, where OWNER_NAME is the CMS name of the content
    * owner.
    */
  var ids: js.UndefOr[String] = js.native
  
  /**
    * If set to true historical data (i.e. channel data from before the linking
    * of the channel to the content owner) will be retrieved.
    */
  var `include-historical-channel-data`: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of rows to include in the response.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  
  /**
    * A comma-separated list of YouTube Analytics metrics, such as views or
    * likes,dislikes. See the Available Reports document for a list of the
    * reports that you can retrieve and the metrics available in each report,
    * and see the Metrics document for definitions of those metrics.
    */
  var metrics: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for YouTube Analytics data. By default the sort order is ascending.
    * The '-' prefix causes descending sort order.
    */
  var sort: js.UndefOr[String] = js.native
  
  /**
    * The start date for fetching YouTube Analytics data. The value should be
    * in YYYY-MM-DD format.
    */
  var `start-date`: js.UndefOr[String] = js.native
  
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter (one-based,
    * inclusive).
    */
  var `start-index`: js.UndefOr[Double] = js.native
}
object ParamsResourceReportsQuery {
  
  @scala.inline
  def apply(): ParamsResourceReportsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsQuery]
  }
  
  @scala.inline
  implicit class ParamsResourceReportsQueryMutableBuilder[Self <: ParamsResourceReportsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDimensions(value: String): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def `setEnd-date`(value: String): Self = StObject.set(x, "end-date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEnd-dateUndefined`: Self = StObject.set(x, "end-date", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setIds(value: String): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def `setInclude-historical-channel-data`(value: Boolean): Self = StObject.set(x, "include-historical-channel-data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInclude-historical-channel-dataUndefined`: Self = StObject.set(x, "include-historical-channel-data", js.undefined)
    
    @scala.inline
    def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    @scala.inline
    def setMetrics(value: String): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-dateUndefined`: Self = StObject.set(x, "start-date", js.undefined)
    
    @scala.inline
    def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
  }
}
