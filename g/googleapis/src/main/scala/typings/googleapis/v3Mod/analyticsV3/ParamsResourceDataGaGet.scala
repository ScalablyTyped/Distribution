package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDataGaGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * A comma-separated list of Analytics dimensions. E.g.,
    * 'ga:browser,ga:city'.
    */
  var dimensions: js.UndefOr[String] = js.undefined
  
  /**
    * End date for fetching Analytics data. Request can should specify an end
    * date formatted as YYYY-MM-DD, or as a relative date (e.g., today,
    * yesterday, or 7daysAgo). The default value is yesterday.
    */
  var `end-date`: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of dimension or metric filters to be applied to
    * Analytics data.
    */
  var filters: js.UndefOr[String] = js.undefined
  
  /**
    * Unique table ID for retrieving Analytics data. Table ID is of the form
    * ga:XXXX, where XXXX is the Analytics view (profile) ID.
    */
  var ids: js.UndefOr[String] = js.undefined
  
  /**
    * The response will include empty rows if this parameter is set to true,
    * the default is true
    */
  var `include-empty-rows`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of entries to include in this feed.
    */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /**
    * A comma-separated list of Analytics metrics. E.g.,
    * 'ga:sessions,ga:pageviews'. At least one metric must be specified.
    */
  var metrics: js.UndefOr[String] = js.undefined
  
  /**
    * The selected format for the response. Default format is JSON.
    */
  var output: js.UndefOr[String] = js.undefined
  
  /**
    * The desired sampling level.
    */
  var samplingLevel: js.UndefOr[String] = js.undefined
  
  /**
    * An Analytics segment to be applied to data.
    */
  var segment: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for Analytics data.
    */
  var sort: js.UndefOr[String] = js.undefined
  
  /**
    * Start date for fetching Analytics data. Requests can specify a start date
    * formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday,
    * or 7daysAgo). The default value is 7daysAgo.
    */
  var `start-date`: js.UndefOr[String] = js.undefined
  
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.undefined
}
object ParamsResourceDataGaGet {
  
  @scala.inline
  def apply(): ParamsResourceDataGaGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDataGaGet]
  }
  
  @scala.inline
  implicit class ParamsResourceDataGaGetMutableBuilder[Self <: ParamsResourceDataGaGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
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
    def `setInclude-empty-rows`(value: Boolean): Self = StObject.set(x, "include-empty-rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setInclude-empty-rowsUndefined`: Self = StObject.set(x, "include-empty-rows", js.undefined)
    
    @scala.inline
    def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    @scala.inline
    def setMetrics(value: String): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setSamplingLevel(value: String): Self = StObject.set(x, "samplingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingLevelUndefined: Self = StObject.set(x, "samplingLevel", js.undefined)
    
    @scala.inline
    def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
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
