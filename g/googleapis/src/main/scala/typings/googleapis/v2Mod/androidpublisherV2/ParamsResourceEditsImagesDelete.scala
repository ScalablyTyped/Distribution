package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEditsImagesDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Unique identifier for this edit.
    */
  var editId: js.UndefOr[String] = js.native
  /**
    * Unique identifier an image within the set of images attached to this
    * edit.
    */
  var imageId: js.UndefOr[String] = js.native
  /**
    *
    */
  var imageType: js.UndefOr[String] = js.native
  /**
    * The language code (a BCP-47 language tag) of the localized listing whose
    * images are to read or modified. For example, to select Austrian German,
    * pass "de-AT".
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Unique identifier for the Android app that is being updated; for example,
    * "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.native
}

object ParamsResourceEditsImagesDelete {
  @scala.inline
  def apply(): ParamsResourceEditsImagesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsImagesDelete]
  }
  @scala.inline
  implicit class ParamsResourceEditsImagesDeleteOps[Self <: ParamsResourceEditsImagesDelete] (val x: Self) extends AnyVal {
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
    def setEditId(value: String): Self = this.set("editId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditId: Self = this.set("editId", js.undefined)
    @scala.inline
    def setImageId(value: String): Self = this.set("imageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
    @scala.inline
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
  
}

