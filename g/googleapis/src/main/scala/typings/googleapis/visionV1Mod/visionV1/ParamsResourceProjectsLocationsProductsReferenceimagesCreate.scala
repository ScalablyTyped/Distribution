package typings.googleapis.visionV1Mod.visionV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsProductsReferenceimagesCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Resource name of the product in which to create the reference image.
    * Format is `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * A user-supplied resource id for the ReferenceImage to be added. If set,
    * the server will attempt to use this value as the resource id. If it is
    * already in use, an error is returned with code ALREADY_EXISTS. Must be at
    * most 128 characters long. It cannot contain the character `/`.
    */
  var referenceImageId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReferenceImage] = js.native
}

object ParamsResourceProjectsLocationsProductsReferenceimagesCreate {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsProductsReferenceimagesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProductsReferenceimagesCreate]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsProductsReferenceimagesCreateOps[Self <: ParamsResourceProjectsLocationsProductsReferenceimagesCreate] (val x: Self) extends AnyVal {
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setReferenceImageId(value: String): Self = this.set("referenceImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceImageId: Self = this.set("referenceImageId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaReferenceImage): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

