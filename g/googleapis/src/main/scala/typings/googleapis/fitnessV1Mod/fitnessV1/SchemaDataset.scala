package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dataset represents a projection container for data points. They do not
  * carry any info of their own. Datasets represent a set of data points from a
  * particular data source. A data point can be found in more than one dataset.
  */
@js.native
trait SchemaDataset extends js.Object {
  /**
    * The data stream ID of the data source that created the points in this
    * dataset.
    */
  var dataSourceId: js.UndefOr[String] = js.native
  /**
    * The largest end time of all data points in this possibly partial
    * representation of the dataset. Time is in nanoseconds from epoch. This
    * should also match the second part of the dataset identifier.
    */
  var maxEndTimeNs: js.UndefOr[String] = js.native
  /**
    * The smallest start time of all data points in this possibly partial
    * representation of the dataset. Time is in nanoseconds from epoch. This
    * should also match the first part of the dataset identifier.
    */
  var minStartTimeNs: js.UndefOr[String] = js.native
  /**
    * This token will be set when a dataset is received in response to a GET
    * request and the dataset is too large to be included in a single response.
    * Provide this value in a subsequent GET request to return the next page of
    * data points within this dataset.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A partial list of data points contained in the dataset, ordered by
    * largest endTimeNanos first. This list is considered complete when
    * retrieving a small dataset and partial when patching a dataset or
    * retrieving a dataset that is too large to include in a single response.
    */
  var point: js.UndefOr[js.Array[SchemaDataPoint]] = js.native
}

object SchemaDataset {
  @scala.inline
  def apply(): SchemaDataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataset]
  }
  @scala.inline
  implicit class SchemaDatasetOps[Self <: SchemaDataset] (val x: Self) extends AnyVal {
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
    def setDataSourceId(value: String): Self = this.set("dataSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceId: Self = this.set("dataSourceId", js.undefined)
    @scala.inline
    def setMaxEndTimeNs(value: String): Self = this.set("maxEndTimeNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxEndTimeNs: Self = this.set("maxEndTimeNs", js.undefined)
    @scala.inline
    def setMinStartTimeNs(value: String): Self = this.set("minStartTimeNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinStartTimeNs: Self = this.set("minStartTimeNs", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setPointVarargs(value: SchemaDataPoint*): Self = this.set("point", js.Array(value :_*))
    @scala.inline
    def setPoint(value: js.Array[SchemaDataPoint]): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
  }
  
}

