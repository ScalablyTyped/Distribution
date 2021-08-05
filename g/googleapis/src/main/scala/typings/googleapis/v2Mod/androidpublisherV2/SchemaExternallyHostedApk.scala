package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an APK available for this application that is hosted externally and
  * not uploaded to Google Play. This function is only available to enterprises
  * who are using Google Play for Work, and whos application is restricted to
  * the enterprise private channel
  */
trait SchemaExternallyHostedApk extends StObject {
  
  /**
    * The application label.
    */
  var applicationLabel: js.UndefOr[String] = js.undefined
  
  /**
    * A certificate (or array of certificates if a certificate-chain is used)
    * used to signed this APK, represented as a base64 encoded byte array.
    */
  var certificateBase64s: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The URL at which the APK is hosted. This must be an https URL.
    */
  var externallyHostedUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA1 checksum of this APK, represented as a base64 encoded byte
    * array.
    */
  var fileSha1Base64: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA256 checksum of this APK, represented as a base64 encoded byte
    * array.
    */
  var fileSha256Base64: js.UndefOr[String] = js.undefined
  
  /**
    * The file size in bytes of this APK.
    */
  var fileSize: js.UndefOr[String] = js.undefined
  
  /**
    * The icon image from the APK, as a base64 encoded byte array.
    */
  var iconBase64: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum SDK supported by this APK (optional).
    */
  var maximumSdk: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum SDK targeted by this APK.
    */
  var minimumSdk: js.UndefOr[Double] = js.undefined
  
  /**
    * The native code environments supported by this APK (optional).
    */
  var nativeCodes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The package name.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The features required by this APK (optional).
    */
  var usesFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The permissions requested by this APK.
    */
  var usesPermissions: js.UndefOr[js.Array[SchemaExternallyHostedApkUsesPermission]] = js.undefined
  
  /**
    * The version code of this APK.
    */
  var versionCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The version name of this APK.
    */
  var versionName: js.UndefOr[String] = js.undefined
}
object SchemaExternallyHostedApk {
  
  inline def apply(): SchemaExternallyHostedApk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternallyHostedApk]
  }
  
  extension [Self <: SchemaExternallyHostedApk](x: Self) {
    
    inline def setApplicationLabel(value: String): Self = StObject.set(x, "applicationLabel", value.asInstanceOf[js.Any])
    
    inline def setApplicationLabelUndefined: Self = StObject.set(x, "applicationLabel", js.undefined)
    
    inline def setCertificateBase64s(value: js.Array[String]): Self = StObject.set(x, "certificateBase64s", value.asInstanceOf[js.Any])
    
    inline def setCertificateBase64sUndefined: Self = StObject.set(x, "certificateBase64s", js.undefined)
    
    inline def setCertificateBase64sVarargs(value: String*): Self = StObject.set(x, "certificateBase64s", js.Array(value :_*))
    
    inline def setExternallyHostedUrl(value: String): Self = StObject.set(x, "externallyHostedUrl", value.asInstanceOf[js.Any])
    
    inline def setExternallyHostedUrlUndefined: Self = StObject.set(x, "externallyHostedUrl", js.undefined)
    
    inline def setFileSha1Base64(value: String): Self = StObject.set(x, "fileSha1Base64", value.asInstanceOf[js.Any])
    
    inline def setFileSha1Base64Undefined: Self = StObject.set(x, "fileSha1Base64", js.undefined)
    
    inline def setFileSha256Base64(value: String): Self = StObject.set(x, "fileSha256Base64", value.asInstanceOf[js.Any])
    
    inline def setFileSha256Base64Undefined: Self = StObject.set(x, "fileSha256Base64", js.undefined)
    
    inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    
    inline def setIconBase64(value: String): Self = StObject.set(x, "iconBase64", value.asInstanceOf[js.Any])
    
    inline def setIconBase64Undefined: Self = StObject.set(x, "iconBase64", js.undefined)
    
    inline def setMaximumSdk(value: Double): Self = StObject.set(x, "maximumSdk", value.asInstanceOf[js.Any])
    
    inline def setMaximumSdkUndefined: Self = StObject.set(x, "maximumSdk", js.undefined)
    
    inline def setMinimumSdk(value: Double): Self = StObject.set(x, "minimumSdk", value.asInstanceOf[js.Any])
    
    inline def setMinimumSdkUndefined: Self = StObject.set(x, "minimumSdk", js.undefined)
    
    inline def setNativeCodes(value: js.Array[String]): Self = StObject.set(x, "nativeCodes", value.asInstanceOf[js.Any])
    
    inline def setNativeCodesUndefined: Self = StObject.set(x, "nativeCodes", js.undefined)
    
    inline def setNativeCodesVarargs(value: String*): Self = StObject.set(x, "nativeCodes", js.Array(value :_*))
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setUsesFeatures(value: js.Array[String]): Self = StObject.set(x, "usesFeatures", value.asInstanceOf[js.Any])
    
    inline def setUsesFeaturesUndefined: Self = StObject.set(x, "usesFeatures", js.undefined)
    
    inline def setUsesFeaturesVarargs(value: String*): Self = StObject.set(x, "usesFeatures", js.Array(value :_*))
    
    inline def setUsesPermissions(value: js.Array[SchemaExternallyHostedApkUsesPermission]): Self = StObject.set(x, "usesPermissions", value.asInstanceOf[js.Any])
    
    inline def setUsesPermissionsUndefined: Self = StObject.set(x, "usesPermissions", js.undefined)
    
    inline def setUsesPermissionsVarargs(value: SchemaExternallyHostedApkUsesPermission*): Self = StObject.set(x, "usesPermissions", js.Array(value :_*))
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
