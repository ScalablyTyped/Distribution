package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchUserActivityRequest extends js.Object {
  
  /** Set of all activity types being requested. Only acvities matching these types will be returned in the response. If empty, all activies will be returned. */
  var activityTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Date range for which to retrieve the user activity. If a date range is not provided, the default date range is (startDate: current date - 7 days, endDate: current date - 1 day). */
  var dateRange: js.UndefOr[DateRange] = js.native
  
  /**
    * Page size is for paging and specifies the maximum number of returned rows. Page size should be > 0. If the value is 0 or if the field isn't specified, the request returns the
    * default of 1000 rows per page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * A continuation token to get the next page of the results. Adding this to the request will return the rows after the pageToken. The pageToken should be the value returned in the
    * nextPageToken parameter in the response to the [SearchUserActivityRequest](#SearchUserActivityRequest) request.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Required. Unique user Id to query for. Every [SearchUserActivityRequest](#SearchUserActivityRequest) must contain this field. */
  var user: js.UndefOr[User] = js.native
  
  /**
    * Required. The Analytics [view ID](https://support.google.com/analytics/answer/1009618) from which to retrieve data. Every [SearchUserActivityRequest](#SearchUserActivityRequest)
    * must contain the `viewId`.
    */
  var viewId: js.UndefOr[String] = js.native
}
object SearchUserActivityRequest {
  
  @scala.inline
  def apply(): SearchUserActivityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUserActivityRequest]
  }
  
  @scala.inline
  implicit class SearchUserActivityRequestOps[Self <: SearchUserActivityRequest] (val x: Self) extends AnyVal {
    
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
    def setActivityTypesVarargs(value: String*): Self = this.set("activityTypes", js.Array(value :_*))
    
    @scala.inline
    def setActivityTypes(value: js.Array[String]): Self = this.set("activityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityTypes: Self = this.set("activityTypes", js.undefined)
    
    @scala.inline
    def setDateRange(value: DateRange): Self = this.set("dateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateRange: Self = this.set("dateRange", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setViewId(value: String): Self = this.set("viewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewId: Self = this.set("viewId", js.undefined)
  }
}
