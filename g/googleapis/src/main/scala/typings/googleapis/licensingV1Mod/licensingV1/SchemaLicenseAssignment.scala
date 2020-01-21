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
  def apply(
    etags: String = null,
    kind: String = null,
    productId: String = null,
    productName: String = null,
    selfLink: String = null,
    skuId: String = null,
    skuName: String = null,
    userId: String = null
  ): SchemaLicenseAssignment = {
    val __obj = js.Dynamic.literal()
    if (etags != null) __obj.updateDynamic("etags")(etags.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (skuId != null) __obj.updateDynamic("skuId")(skuId.asInstanceOf[js.Any])
    if (skuName != null) __obj.updateDynamic("skuName")(skuName.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLicenseAssignment]
  }
}

