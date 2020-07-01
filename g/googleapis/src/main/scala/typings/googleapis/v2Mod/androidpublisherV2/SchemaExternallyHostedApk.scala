package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an APK available for this application that is hosted externally and
  * not uploaded to Google Play. This function is only available to enterprises
  * who are using Google Play for Work, and whos application is restricted to
  * the enterprise private channel
  */
@js.native
trait SchemaExternallyHostedApk extends js.Object {
  /**
    * The application label.
    */
  var applicationLabel: js.UndefOr[String] = js.native
  /**
    * A certificate (or array of certificates if a certificate-chain is used)
    * used to signed this APK, represented as a base64 encoded byte array.
    */
  var certificateBase64s: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URL at which the APK is hosted. This must be an https URL.
    */
  var externallyHostedUrl: js.UndefOr[String] = js.native
  /**
    * The SHA1 checksum of this APK, represented as a base64 encoded byte
    * array.
    */
  var fileSha1Base64: js.UndefOr[String] = js.native
  /**
    * The SHA256 checksum of this APK, represented as a base64 encoded byte
    * array.
    */
  var fileSha256Base64: js.UndefOr[String] = js.native
  /**
    * The file size in bytes of this APK.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * The icon image from the APK, as a base64 encoded byte array.
    */
  var iconBase64: js.UndefOr[String] = js.native
  /**
    * The maximum SDK supported by this APK (optional).
    */
  var maximumSdk: js.UndefOr[Double] = js.native
  /**
    * The minimum SDK targeted by this APK.
    */
  var minimumSdk: js.UndefOr[Double] = js.native
  /**
    * The native code environments supported by this APK (optional).
    */
  var nativeCodes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The package name.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * The features required by this APK (optional).
    */
  var usesFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * The permissions requested by this APK.
    */
  var usesPermissions: js.UndefOr[js.Array[SchemaExternallyHostedApkUsesPermission]] = js.native
  /**
    * The version code of this APK.
    */
  var versionCode: js.UndefOr[Double] = js.native
  /**
    * The version name of this APK.
    */
  var versionName: js.UndefOr[String] = js.native
}

object SchemaExternallyHostedApk {
  @scala.inline
  def apply(
    applicationLabel: String = null,
    certificateBase64s: js.Array[String] = null,
    externallyHostedUrl: String = null,
    fileSha1Base64: String = null,
    fileSha256Base64: String = null,
    fileSize: String = null,
    iconBase64: String = null,
    maximumSdk: js.UndefOr[Double] = js.undefined,
    minimumSdk: js.UndefOr[Double] = js.undefined,
    nativeCodes: js.Array[String] = null,
    packageName: String = null,
    usesFeatures: js.Array[String] = null,
    usesPermissions: js.Array[SchemaExternallyHostedApkUsesPermission] = null,
    versionCode: js.UndefOr[Double] = js.undefined,
    versionName: String = null
  ): SchemaExternallyHostedApk = {
    val __obj = js.Dynamic.literal()
    if (applicationLabel != null) __obj.updateDynamic("applicationLabel")(applicationLabel.asInstanceOf[js.Any])
    if (certificateBase64s != null) __obj.updateDynamic("certificateBase64s")(certificateBase64s.asInstanceOf[js.Any])
    if (externallyHostedUrl != null) __obj.updateDynamic("externallyHostedUrl")(externallyHostedUrl.asInstanceOf[js.Any])
    if (fileSha1Base64 != null) __obj.updateDynamic("fileSha1Base64")(fileSha1Base64.asInstanceOf[js.Any])
    if (fileSha256Base64 != null) __obj.updateDynamic("fileSha256Base64")(fileSha256Base64.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (iconBase64 != null) __obj.updateDynamic("iconBase64")(iconBase64.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumSdk)) __obj.updateDynamic("maximumSdk")(maximumSdk.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSdk)) __obj.updateDynamic("minimumSdk")(minimumSdk.get.asInstanceOf[js.Any])
    if (nativeCodes != null) __obj.updateDynamic("nativeCodes")(nativeCodes.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (usesFeatures != null) __obj.updateDynamic("usesFeatures")(usesFeatures.asInstanceOf[js.Any])
    if (usesPermissions != null) __obj.updateDynamic("usesPermissions")(usesPermissions.asInstanceOf[js.Any])
    if (!js.isUndefined(versionCode)) __obj.updateDynamic("versionCode")(versionCode.get.asInstanceOf[js.Any])
    if (versionName != null) __obj.updateDynamic("versionName")(versionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExternallyHostedApk]
  }
}

