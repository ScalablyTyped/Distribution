package typings.googleapis.v24Mod.analyticsV24

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDataGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A comma-separated list of Analytics dimensions. E.g.,
    * 'ga:browser,ga:city'.
    */
  var dimensions: js.UndefOr[String] = js.native
  
  /**
    * End date for fetching report data. All requests should specify an end
    * date formatted as YYYY-MM-DD.
    */
  var `end-date`: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of dimension or metric filters to be applied to
    * the report data.
    */
  var filters: js.UndefOr[String] = js.native
  
  /**
    * Unique table ID for retrieving report data. Table ID is of the form
    * ga:XXXX, where XXXX is the Analytics view (profile) ID.
    */
  var ids: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of entries to include in this feed.
    */
  var `max-results`: js.UndefOr[Double] = js.native
  
  /**
    * A comma-separated list of Analytics metrics. E.g.,
    * 'ga:sessions,ga:pageviews'. At least one metric must be specified to
    * retrieve a valid Analytics report.
    */
  var metrics: js.UndefOr[String] = js.native
  
  /**
    * An Analytics advanced segment to be applied to the report data.
    */
  var segment: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of dimensions or metrics that determine the sort
    * order for the report data.
    */
  var sort: js.UndefOr[String] = js.native
  
  /**
    * Start date for fetching report data. All requests should specify a start
    * date formatted as YYYY-MM-DD.
    */
  var `start-date`: js.UndefOr[String] = js.native
  
  /**
    * An index of the first entity to retrieve. Use this parameter as a
    * pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.native
}
object ParamsResourceDataGet {
  
  @scala.inline
  def apply(): ParamsResourceDataGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDataGet]
  }
  
  @scala.inline
  implicit class ParamsResourceDataGetOps[Self <: ParamsResourceDataGet] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDimensions(value: String): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def `setEnd-date`(value: String): Self = this.set("end-date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteEnd-date`: Self = this.set("end-date", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setIds(value: String): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
    
    @scala.inline
    def `setMax-results`(value: Double): Self = this.set("max-results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMax-results`: Self = this.set("max-results", js.undefined)
    
    @scala.inline
    def setMetrics(value: String): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setSegment(value: String): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def `setStart-date`(value: String): Self = this.set("start-date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStart-date`: Self = this.set("start-date", js.undefined)
    
    @scala.inline
    def `setStart-index`(value: Double): Self = this.set("start-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteStart-index`: Self = this.set("start-index", js.undefined)
  }
}
