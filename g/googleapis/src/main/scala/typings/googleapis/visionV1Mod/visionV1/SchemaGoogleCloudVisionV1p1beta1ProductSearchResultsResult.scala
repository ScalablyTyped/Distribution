package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a product.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult extends js.Object {
  /**
    * The resource name of the image from the product that is the closest match
    * to the query.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The Product.
    */
  var product: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1Product] = js.native
  /**
    * A confidence level on the match, ranging from 0 (no confidence) to 1
    * (full confidence).
    */
  var score: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult {
  @scala.inline
  def apply(
    image: String = null,
    product: SchemaGoogleCloudVisionV1p1beta1Product = null,
    score: js.UndefOr[Double] = js.undefined
  ): SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult]
  }
}

