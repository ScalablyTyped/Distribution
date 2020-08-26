package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEditsExpansionfilesUpdate extends StandardParameters {
  /**
    * The version code of the APK whose Expansion File configuration is being
    * read or modified.
    */
  var apkVersionCode: js.UndefOr[Double] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Unique identifier for this edit.
    */
  var editId: js.UndefOr[String] = js.native
  /**
    *
    */
  var expansionFileType: js.UndefOr[String] = js.native
  /**
    * Unique identifier for the Android app that is being updated; for example,
    * "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExpansionFile] = js.native
}

object ParamsResourceEditsExpansionfilesUpdate {
  @scala.inline
  def apply(): ParamsResourceEditsExpansionfilesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsExpansionfilesUpdate]
  }
  @scala.inline
  implicit class ParamsResourceEditsExpansionfilesUpdateOps[Self <: ParamsResourceEditsExpansionfilesUpdate] (val x: Self) extends AnyVal {
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
    def setApkVersionCode(value: Double): Self = this.set("apkVersionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApkVersionCode: Self = this.set("apkVersionCode", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setEditId(value: String): Self = this.set("editId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditId: Self = this.set("editId", js.undefined)
    @scala.inline
    def setExpansionFileType(value: String): Self = this.set("expansionFileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpansionFileType: Self = this.set("expansionFileType", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaExpansionFile): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

