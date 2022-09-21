package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedApksPerSigningKey extends StObject {
  
  /** SHA256 hash of the APK signing public key certificate. */
  var certificateSha256Hash: js.UndefOr[String] = js.undefined
  
  /** List of asset pack slices which will be served for this app bundle, signed with a key corresponding to certificate_sha256_hash. */
  var generatedAssetPackSlices: js.UndefOr[js.Array[GeneratedAssetPackSlice]] = js.undefined
  
  /** List of generated split APKs, signed with a key corresponding to certificate_sha256_hash. */
  var generatedSplitApks: js.UndefOr[js.Array[GeneratedSplitApk]] = js.undefined
  
  /** List of generated standalone APKs, signed with a key corresponding to certificate_sha256_hash. */
  var generatedStandaloneApks: js.UndefOr[js.Array[GeneratedStandaloneApk]] = js.undefined
  
  /** Generated universal APK, signed with a key corresponding to certificate_sha256_hash. This field is not set if no universal APK was generated for this signing key. */
  var generatedUniversalApk: js.UndefOr[GeneratedUniversalApk] = js.undefined
}
object GeneratedApksPerSigningKey {
  
  inline def apply(): GeneratedApksPerSigningKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedApksPerSigningKey]
  }
  
  extension [Self <: GeneratedApksPerSigningKey](x: Self) {
    
    inline def setCertificateSha256Hash(value: String): Self = StObject.set(x, "certificateSha256Hash", value.asInstanceOf[js.Any])
    
    inline def setCertificateSha256HashUndefined: Self = StObject.set(x, "certificateSha256Hash", js.undefined)
    
    inline def setGeneratedAssetPackSlices(value: js.Array[GeneratedAssetPackSlice]): Self = StObject.set(x, "generatedAssetPackSlices", value.asInstanceOf[js.Any])
    
    inline def setGeneratedAssetPackSlicesUndefined: Self = StObject.set(x, "generatedAssetPackSlices", js.undefined)
    
    inline def setGeneratedAssetPackSlicesVarargs(value: GeneratedAssetPackSlice*): Self = StObject.set(x, "generatedAssetPackSlices", js.Array(value*))
    
    inline def setGeneratedSplitApks(value: js.Array[GeneratedSplitApk]): Self = StObject.set(x, "generatedSplitApks", value.asInstanceOf[js.Any])
    
    inline def setGeneratedSplitApksUndefined: Self = StObject.set(x, "generatedSplitApks", js.undefined)
    
    inline def setGeneratedSplitApksVarargs(value: GeneratedSplitApk*): Self = StObject.set(x, "generatedSplitApks", js.Array(value*))
    
    inline def setGeneratedStandaloneApks(value: js.Array[GeneratedStandaloneApk]): Self = StObject.set(x, "generatedStandaloneApks", value.asInstanceOf[js.Any])
    
    inline def setGeneratedStandaloneApksUndefined: Self = StObject.set(x, "generatedStandaloneApks", js.undefined)
    
    inline def setGeneratedStandaloneApksVarargs(value: GeneratedStandaloneApk*): Self = StObject.set(x, "generatedStandaloneApks", js.Array(value*))
    
    inline def setGeneratedUniversalApk(value: GeneratedUniversalApk): Self = StObject.set(x, "generatedUniversalApk", value.asInstanceOf[js.Any])
    
    inline def setGeneratedUniversalApkUndefined: Self = StObject.set(x, "generatedUniversalApk", js.undefined)
  }
}
