package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalAppSharingArtifact extends StObject {
  
  /** The sha256 fingerprint of the certificate used to sign the generated artifact. */
  var certificateFingerprint: js.UndefOr[String] = js.undefined
  
  /** The download URL generated for the uploaded artifact. Users that are authorized to download can follow the link to the Play Store app to install it. */
  var downloadUrl: js.UndefOr[String] = js.undefined
  
  /** The sha256 hash of the artifact represented as a lowercase hexadecimal number, matching the output of the sha256sum command. */
  var sha256: js.UndefOr[String] = js.undefined
}
object InternalAppSharingArtifact {
  
  inline def apply(): InternalAppSharingArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalAppSharingArtifact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalAppSharingArtifact] (val x: Self) extends AnyVal {
    
    inline def setCertificateFingerprint(value: String): Self = StObject.set(x, "certificateFingerprint", value.asInstanceOf[js.Any])
    
    inline def setCertificateFingerprintUndefined: Self = StObject.set(x, "certificateFingerprint", js.undefined)
    
    inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
