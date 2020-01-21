package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results for a product search request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1ProductSearchResults extends js.Object {
  /**
    * Timestamp of the index which provided these results. Changes made after
    * this time are not reflected in the current results.
    */
  var indexTime: js.UndefOr[String] = js.native
  /**
    * List of results grouped by products detected in the query image. Each
    * entry corresponds to one bounding polygon in the query image, and
    * contains the matching products specific to that region. There may be
    * duplicate product matches in the union of all the per-product results.
    */
  var productGroupedResults: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult]] = js.native
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1ProductSearchResults {
  @scala.inline
  def apply(
    indexTime: String = null,
    productGroupedResults: js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult] = null,
    results: js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult] = null
  ): SchemaGoogleCloudVisionV1p1beta1ProductSearchResults = {
    val __obj = js.Dynamic.literal()
    if (indexTime != null) __obj.updateDynamic("indexTime")(indexTime.asInstanceOf[js.Any])
    if (productGroupedResults != null) __obj.updateDynamic("productGroupedResults")(productGroupedResults.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ProductSearchResults]
  }
}

