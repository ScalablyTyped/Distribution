package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch products response.
  */
@js.native
trait SchemaProductsCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productsCustomBatchResponseEntry&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The inserted product. Only defined if the method is insert and if the
    * request was successful.
    */
  var product: js.UndefOr[SchemaProduct] = js.native
}

object SchemaProductsCustomBatchResponseEntry {
  @scala.inline
  def apply(): SchemaProductsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductsCustomBatchResponseEntry]
  }
  @scala.inline
  implicit class SchemaProductsCustomBatchResponseEntryOps[Self <: SchemaProductsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    @scala.inline
    def setErrors(value: SchemaErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProduct(value: SchemaProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
  }
  
}

