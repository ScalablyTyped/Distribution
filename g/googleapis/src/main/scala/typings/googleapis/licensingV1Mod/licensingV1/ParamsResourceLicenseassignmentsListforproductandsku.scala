package typings.googleapis.licensingV1Mod.licensingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLicenseassignmentsListforproductandsku extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * CustomerId represents the customer for whom licenseassignments are
    * queried
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Maximum number of campaigns to return at one time. Must be positive.
    * Optional. Default value is 100.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Token to fetch the next page.Optional. By default server will return
    * first page
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Name for product
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Name for sku
    */
  var skuId: js.UndefOr[String] = js.native
}

object ParamsResourceLicenseassignmentsListforproductandsku {
  @scala.inline
  def apply(): ParamsResourceLicenseassignmentsListforproductandsku = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLicenseassignmentsListforproductandsku]
  }
  @scala.inline
  implicit class ParamsResourceLicenseassignmentsListforproductandskuOps[Self <: ParamsResourceLicenseassignmentsListforproductandsku] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setSkuId(value: String): Self = this.set("skuId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkuId: Self = this.set("skuId", js.undefined)
  }
  
}

