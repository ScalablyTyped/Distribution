package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternallyHostedApk extends StObject {
  
  /** The application label. */
  var applicationLabel: js.UndefOr[String] = js.undefined
  
  /** A certificate (or array of certificates if a certificate-chain is used) used to sign this APK, represented as a base64 encoded byte array. */
  var certificateBase64s: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The URL at which the APK is hosted. This must be an https URL. */
  var externallyHostedUrl: js.UndefOr[String] = js.undefined
  
  /** The sha1 checksum of this APK, represented as a base64 encoded byte array. */
  var fileSha1Base64: js.UndefOr[String] = js.undefined
  
  /** The sha256 checksum of this APK, represented as a base64 encoded byte array. */
  var fileSha256Base64: js.UndefOr[String] = js.undefined
  
  /** The file size in bytes of this APK. */
  var fileSize: js.UndefOr[String] = js.undefined
  
  /** The icon image from the APK, as a base64 encoded byte array. */
  var iconBase64: js.UndefOr[String] = js.undefined
  
  /** The maximum SDK supported by this APK (optional). */
  var maximumSdk: js.UndefOr[Double] = js.undefined
  
  /** The minimum SDK targeted by this APK. */
  var minimumSdk: js.UndefOr[Double] = js.undefined
  
  /** The native code environments supported by this APK (optional). */
  var nativeCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The package name. */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** The features required by this APK (optional). */
  var usesFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The permissions requested by this APK. */
  var usesPermissions: js.UndefOr[js.Array[UsesPermission]] = js.undefined
  
  /** The version code of this APK. */
  var versionCode: js.UndefOr[Double] = js.undefined
  
  /** The version name of this APK. */
  var versionName: js.UndefOr[String] = js.undefined
}
object ExternallyHostedApk {
  
  @scala.inline
  def apply(): ExternallyHostedApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternallyHostedApk]
  }
  
  @scala.inline
  implicit class ExternallyHostedApkMutableBuilder[Self <: ExternallyHostedApk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationLabel(value: String): Self = StObject.set(x, "applicationLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationLabelUndefined: Self = StObject.set(x, "applicationLabel", js.undefined)
    
    @scala.inline
    def setCertificateBase64s(value: js.Array[String]): Self = StObject.set(x, "certificateBase64s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateBase64sUndefined: Self = StObject.set(x, "certificateBase64s", js.undefined)
    
    @scala.inline
    def setCertificateBase64sVarargs(value: String*): Self = StObject.set(x, "certificateBase64s", js.Array(value :_*))
    
    @scala.inline
    def setExternallyHostedUrl(value: String): Self = StObject.set(x, "externallyHostedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternallyHostedUrlUndefined: Self = StObject.set(x, "externallyHostedUrl", js.undefined)
    
    @scala.inline
    def setFileSha1Base64(value: String): Self = StObject.set(x, "fileSha1Base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSha1Base64Undefined: Self = StObject.set(x, "fileSha1Base64", js.undefined)
    
    @scala.inline
    def setFileSha256Base64(value: String): Self = StObject.set(x, "fileSha256Base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSha256Base64Undefined: Self = StObject.set(x, "fileSha256Base64", js.undefined)
    
    @scala.inline
    def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    @scala.inline
    def setIconBase64(value: String): Self = StObject.set(x, "iconBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconBase64Undefined: Self = StObject.set(x, "iconBase64", js.undefined)
    
    @scala.inline
    def setMaximumSdk(value: Double): Self = StObject.set(x, "maximumSdk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSdkUndefined: Self = StObject.set(x, "maximumSdk", js.undefined)
    
    @scala.inline
    def setMinimumSdk(value: Double): Self = StObject.set(x, "minimumSdk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSdkUndefined: Self = StObject.set(x, "minimumSdk", js.undefined)
    
    @scala.inline
    def setNativeCodes(value: js.Array[String]): Self = StObject.set(x, "nativeCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeCodesUndefined: Self = StObject.set(x, "nativeCodes", js.undefined)
    
    @scala.inline
    def setNativeCodesVarargs(value: String*): Self = StObject.set(x, "nativeCodes", js.Array(value :_*))
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setUsesFeatures(value: js.Array[String]): Self = StObject.set(x, "usesFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesFeaturesUndefined: Self = StObject.set(x, "usesFeatures", js.undefined)
    
    @scala.inline
    def setUsesFeaturesVarargs(value: String*): Self = StObject.set(x, "usesFeatures", js.Array(value :_*))
    
    @scala.inline
    def setUsesPermissions(value: js.Array[UsesPermission]): Self = StObject.set(x, "usesPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesPermissionsUndefined: Self = StObject.set(x, "usesPermissions", js.undefined)
    
    @scala.inline
    def setUsesPermissionsVarargs(value: UsesPermission*): Self = StObject.set(x, "usesPermissions", js.Array(value :_*))
    
    @scala.inline
    def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    @scala.inline
    def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
