package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for a product search request.
  */
@js.native
trait SchemaProductSearchParams extends js.Object {
  /**
    * The bounding polygon around the area of interest in the image. Optional.
    * If it is not specified, system discretion will be applied.
    */
  var boundingPoly: js.UndefOr[SchemaBoundingPoly] = js.native
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

object SchemaProductSearchParams {
  @scala.inline
  def apply(): SchemaProductSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSearchParams]
  }
  @scala.inline
  implicit class SchemaProductSearchParamsOps[Self <: SchemaProductSearchParams] (val x: Self) extends AnyVal {
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
    def setBoundingPoly(value: SchemaBoundingPoly): Self = this.set("boundingPoly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingPoly: Self = this.set("boundingPoly", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setProductCategoriesVarargs(value: String*): Self = this.set("productCategories", js.Array(value :_*))
    @scala.inline
    def setProductCategories(value: js.Array[String]): Self = this.set("productCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCategories: Self = this.set("productCategories", js.undefined)
    @scala.inline
    def setProductSet(value: String): Self = this.set("productSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductSet: Self = this.set("productSet", js.undefined)
  }
  
}

