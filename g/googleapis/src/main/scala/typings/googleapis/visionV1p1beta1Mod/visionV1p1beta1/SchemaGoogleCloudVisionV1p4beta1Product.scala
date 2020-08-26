package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Product contains ReferenceImages.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1Product extends js.Object {
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
  var productLabels: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1ProductKeyValue]] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1Product {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1Product]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1ProductOps[Self <: SchemaGoogleCloudVisionV1p4beta1Product] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProductCategory(value: String): Self = this.set("productCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCategory: Self = this.set("productCategory", js.undefined)
    @scala.inline
    def setProductLabelsVarargs(value: SchemaGoogleCloudVisionV1p4beta1ProductKeyValue*): Self = this.set("productLabels", js.Array(value :_*))
    @scala.inline
    def setProductLabels(value: js.Array[SchemaGoogleCloudVisionV1p4beta1ProductKeyValue]): Self = this.set("productLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductLabels: Self = this.set("productLabels", js.undefined)
  }
  
}

