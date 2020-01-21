package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

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
  def apply(datasets: js.Array[SchemaDataset] = null, nextPageToken: String = null): SchemaListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasets != null) __obj.updateDynamic("datasets")(datasets.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDatasetsResponse]
  }
}

