package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for a product search request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1ProductSearchParams extends js.Object {
  /**
    * The bounding polygon around the area of interest in the image. Optional.
    * If it is not specified, system discretion will be applied.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1BoundingPoly] = js.native
  /**
    * The filtering expression. This can be used to restrict search results
    * based on Product labels. We currently support an AND of OR of key-value
    * expressions, where each expression within an OR must have the same key.
    * For example, &quot;(color = red OR color = blue) AND brand = Google&quot;
    * is acceptable, but not &quot;(color = red OR brand = Google)&quot; or
    * &quot;color: red&quot;.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The list of product categories to search in. Currently, we only consider
    * the first category, and either &quot;homegoods&quot;,
    * &quot;apparel&quot;, or &quot;toys&quot; should be specified.
    */
  var productCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * The resource name of a ProductSet to be searched for similar images.
    * Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.
    */
  var productSet: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1ProductSearchParams {
  @scala.inline
  def apply(
    boundingPoly: SchemaGoogleCloudVisionV1p2beta1BoundingPoly = null,
    filter: String = null,
    productCategories: js.Array[String] = null,
    productSet: String = null
  ): SchemaGoogleCloudVisionV1p2beta1ProductSearchParams = {
    val __obj = js.Dynamic.literal()
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (productCategories != null) __obj.updateDynamic("productCategories")(productCategories.asInstanceOf[js.Any])
    if (productSet != null) __obj.updateDynamic("productSet")(productSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ProductSearchParams]
  }
}

