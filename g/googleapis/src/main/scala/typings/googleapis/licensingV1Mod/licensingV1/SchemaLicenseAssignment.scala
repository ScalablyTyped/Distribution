package typings.googleapis.licensingV1Mod.licensingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for LiscenseAssignment Resource
  */
@js.native
trait SchemaLicenseAssignment extends js.Object {
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a LicenseAssignment.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Id of the product.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Display Name of the product.
    */
  var productName: js.UndefOr[String] = js.native
  /**
    * Link to this page.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Id of the sku of the product.
    */
  var skuId: js.UndefOr[String] = js.native
  /**
    * Display Name of the sku of the product.
    */
  var skuName: js.UndefOr[String] = js.native
  /**
    * Email id of the user.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaLicenseAssignment {
  @scala.inline
  def apply(): SchemaLicenseAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseAssignment]
  }
  @scala.inline
  implicit class SchemaLicenseAssignmentOps[Self <: SchemaLicenseAssignment] (val x: Self) extends AnyVal {
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
    def setEtags(value: String): Self = this.set("etags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtags: Self = this.set("etags", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setSkuId(value: String): Self = this.set("skuId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkuId: Self = this.set("skuId", js.undefined)
    @scala.inline
    def setSkuName(value: String): Self = this.set("skuName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkuName: Self = this.set("skuName", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

