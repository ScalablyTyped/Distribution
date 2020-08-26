package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import typings.googleapis.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEditsDeobfuscationfilesUpload extends StandardParameters {
  /**
    * The version code of the APK whose deobfuscation file is being uploaded.
    */
  var apkVersionCode: js.UndefOr[Double] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    *
    */
  var deobfuscationFileType: js.UndefOr[String] = js.native
  /**
    * Unique identifier for this edit.
    */
  var editId: js.UndefOr[String] = js.native
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.native
  /**
    * Unique identifier of the Android app for which the deobfuscatiuon files
    * are being uploaded; for example, "com.spiffygame".
    */
  var packageName: js.UndefOr[String] = js.native
}

object ParamsResourceEditsDeobfuscationfilesUpload {
  @scala.inline
  def apply(): ParamsResourceEditsDeobfuscationfilesUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsDeobfuscationfilesUpload]
  }
  @scala.inline
  implicit class ParamsResourceEditsDeobfuscationfilesUploadOps[Self <: ParamsResourceEditsDeobfuscationfilesUpload] (val x: Self) extends AnyVal {
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
    def setDeobfuscationFileType(value: String): Self = this.set("deobfuscationFileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeobfuscationFileType: Self = this.set("deobfuscationFileType", js.undefined)
    @scala.inline
    def setEditId(value: String): Self = this.set("editId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditId: Self = this.set("editId", js.undefined)
    @scala.inline
    def setMedia(value: Body): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
  
}

