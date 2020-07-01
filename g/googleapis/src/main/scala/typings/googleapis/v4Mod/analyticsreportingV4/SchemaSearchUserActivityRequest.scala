package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to fetch User Report from Reporting API `userActivity:get`
  * call.
  */
@js.native
trait SchemaSearchUserActivityRequest extends js.Object {
  /**
    * Set of all activity types being requested. Only acvities matching these
    * types will be returned in the response. If empty, all activies will be
    * returned.
    */
  var activityTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Date range for which to retrieve the user activity. If a date range is
    * not provided, the default date range is (startDate: current date - 7
    * days, endDate: current date - 1 day).
    */
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  /**
    * Page size is for paging and specifies the maximum number of returned
    * rows. Page size should be &gt; 0. If the value is 0 or if the field
    * isn&#39;t specified, the request returns the default of 1000 rows per
    * page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A continuation token to get the next page of the results. Adding this to
    * the request will return the rows after the pageToken. The pageToken
    * should be the value returned in the nextPageToken parameter in the
    * response to the [SearchUserActivityRequest](#SearchUserActivityRequest)
    * request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. Unique user Id to query for. Every
    * [SearchUserActivityRequest](#SearchUserActivityRequest) must contain this
    * field.
    */
  var user: js.UndefOr[SchemaUser] = js.native
  /**
    * Required. The Analytics [view
    * ID](https://support.google.com/analytics/answer/1009618) from which to
    * retrieve data. Every
    * [SearchUserActivityRequest](#SearchUserActivityRequest) must contain the
    * `viewId`.
    */
  var viewId: js.UndefOr[String] = js.native
}

object SchemaSearchUserActivityRequest {
  @scala.inline
  def apply(
    activityTypes: js.Array[String] = null,
    dateRange: SchemaDateRange = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null,
    user: SchemaUser = null,
    viewId: String = null
  ): SchemaSearchUserActivityRequest = {
    val __obj = js.Dynamic.literal()
    if (activityTypes != null) __obj.updateDynamic("activityTypes")(activityTypes.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (viewId != null) __obj.updateDynamic("viewId")(viewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSearchUserActivityRequest]
  }
}

