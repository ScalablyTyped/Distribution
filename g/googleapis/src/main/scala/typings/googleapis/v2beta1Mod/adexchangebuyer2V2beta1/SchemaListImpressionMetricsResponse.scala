package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing the metrics that are measured in number of
  * impressions.
  */
@js.native
trait SchemaListImpressionMetricsResponse extends js.Object {
  /**
    * List of rows, each containing a set of impression metrics.
    */
  var impressionMetricsRows: js.UndefOr[js.Array[SchemaImpressionMetricsRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListImpressionMetricsRequest.pageToken field in the subsequent call to
    * the impressionMetrics.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListImpressionMetricsResponse {
  @scala.inline
  def apply(): SchemaListImpressionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListImpressionMetricsResponse]
  }
  @scala.inline
  implicit class SchemaListImpressionMetricsResponseOps[Self <: SchemaListImpressionMetricsResponse] (val x: Self) extends AnyVal {
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
    def setImpressionMetricsRowsVarargs(value: SchemaImpressionMetricsRow*): Self = this.set("impressionMetricsRows", js.Array(value :_*))
    @scala.inline
    def setImpressionMetricsRows(value: js.Array[SchemaImpressionMetricsRow]): Self = this.set("impressionMetricsRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionMetricsRows: Self = this.set("impressionMetricsRows", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

