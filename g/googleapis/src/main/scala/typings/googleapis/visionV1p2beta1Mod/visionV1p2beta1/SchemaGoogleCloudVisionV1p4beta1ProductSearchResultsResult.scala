package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a product.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsResult extends js.Object {
  /**
    * The resource name of the image from the product that is the closest match
    * to the query.
    */
  var image: js.UndefOr[String] = js.native
  /**
    * The Product.
    */
  var product: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1Product] = js.native
  /**
    * A confidence level on the match, ranging from 0 (no confidence) to 1
    * (full confidence).
    */
  var score: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsResult {
  @scala.inline
  def apply(
    image: String = null,
    product: SchemaGoogleCloudVisionV1p4beta1Product = null,
    score: Int | Double = null
  ): SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsResult = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsResult]
  }
}

