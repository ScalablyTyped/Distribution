package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the available datasets.
  */
@js.native
trait SchemaListDatasetsResponse extends js.Object {
  /**
    * The first page of datasets.
    */
  var datasets: js.UndefOr[js.Array[SchemaDataset]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDatasetsResponse {
  @scala.inline
  def apply(): SchemaListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDatasetsResponse]
  }
  @scala.inline
  implicit class SchemaListDatasetsResponseOps[Self <: SchemaListDatasetsResponse] (val x: Self) extends AnyVal {
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
    def setDatasetsVarargs(value: SchemaDataset*): Self = this.set("datasets", js.Array(value :_*))
    @scala.inline
    def setDatasets(value: js.Array[SchemaDataset]): Self = this.set("datasets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasets: Self = this.set("datasets", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

