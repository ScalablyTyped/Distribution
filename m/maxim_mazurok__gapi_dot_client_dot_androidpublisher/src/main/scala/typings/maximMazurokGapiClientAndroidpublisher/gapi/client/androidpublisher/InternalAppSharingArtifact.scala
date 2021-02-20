package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalAppSharingArtifact extends StObject {
  
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
  implicit class InternalAppSharingArtifactMutableBuilder[Self <: InternalAppSharingArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateFingerprint(value: String): Self = StObject.set(x, "certificateFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateFingerprintUndefined: Self = StObject.set(x, "certificateFingerprint", js.undefined)
    
    @scala.inline
    def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
