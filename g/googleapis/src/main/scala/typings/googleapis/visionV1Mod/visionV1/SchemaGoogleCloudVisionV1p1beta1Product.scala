package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Product contains ReferenceImages.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1Product extends js.Object {
  /**
    * User-provided metadata to be stored with this product. Must be at most
    * 4096 characters long.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The user-provided name for this Product. Must not be empty. Must be at
    * most 4096 characters long.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The resource name of the product.  Format is:
    * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.  This field
    * is ignored when creating a product.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The category for the product identified by the reference image. This
    * should be either &quot;homegoods&quot;, &quot;apparel&quot;, or
    * &quot;toys&quot;.  This field is immutable.
    */
  var productCategory: js.UndefOr[String] = js.native
  /**
    * Key-value pairs that can be attached to a product. At query time,
    * constraints can be specified based on the product_labels.  Note that
    * integer values can be provided as strings, e.g. &quot;1199&quot;. Only
    * strings with integer values can match a range-based restriction which is
    * to be supported soon.  Multiple values can be assigned to the same key.
    * One product may have up to 100 product_labels.
    */
  var productLabels: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1ProductKeyValue]] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1Product {
  @scala.inline
  def apply(
    description: String = null,
    displayName: String = null,
    name: String = null,
    productCategory: String = null,
    productLabels: js.Array[SchemaGoogleCloudVisionV1p1beta1ProductKeyValue] = null
  ): SchemaGoogleCloudVisionV1p1beta1Product = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (productCategory != null) __obj.updateDynamic("productCategory")(productCategory.asInstanceOf[js.Any])
    if (productLabels != null) __obj.updateDynamic("productLabels")(productLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1Product]
  }
}

