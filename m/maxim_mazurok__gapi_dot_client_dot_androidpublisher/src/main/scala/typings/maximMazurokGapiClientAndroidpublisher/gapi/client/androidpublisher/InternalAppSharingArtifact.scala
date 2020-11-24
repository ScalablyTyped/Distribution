package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalAppSharingArtifact extends js.Object {
  
  /** The sha256 fingerprint of the certificate used to sign the generated artifact. */
  var certificateFingerprint: js.UndefOr[String] = js.native
  
  /** The download URL generated for the uploaded artifact. Users that are authorized to download can follow the link to the Play Store app to install it. */
  var downloadUrl: js.UndefOr[String] = js.native
  
  /** The sha256 hash of the artifact represented as a lowercase hexadecimal number, matching the output of the sha256sum command. */
  var sha256: js.UndefOr[String] = js.native
}
object InternalAppSharingArtifact {
  
  @scala.inline
  def apply(): InternalAppSharingArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalAppSharingArtifact]
  }
  
  @scala.inline
  implicit class InternalAppSharingArtifactOps[Self <: InternalAppSharingArtifact] (val x: Self) extends AnyVal {
    
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
    def setCertificateFingerprint(value: String): Self = this.set("certificateFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateFingerprint: Self = this.set("certificateFingerprint", js.undefined)
    
    @scala.inline
    def setDownloadUrl(value: String): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
  }
}
