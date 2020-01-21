package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Trusted App Ids Resource object in Directory API.
  */
@js.native
trait SchemaTrustedAppId extends js.Object {
  /**
    * Android package name.
    */
  var androidPackageName: js.UndefOr[String] = js.native
  /**
    * SHA1 signature of the app certificate.
    */
  var certificateHashSHA1: js.UndefOr[String] = js.native
  /**
    * SHA256 signature of the app certificate.
    */
  var certificateHashSHA256: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as a trusted AppId.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaTrustedAppId {
  @scala.inline
  def apply(
    androidPackageName: String = null,
    certificateHashSHA1: String = null,
    certificateHashSHA256: String = null,
    etag: String = null,
    kind: String = null
  ): SchemaTrustedAppId = {
    val __obj = js.Dynamic.literal()
    if (androidPackageName != null) __obj.updateDynamic("androidPackageName")(androidPackageName.asInstanceOf[js.Any])
    if (certificateHashSHA1 != null) __obj.updateDynamic("certificateHashSHA1")(certificateHashSHA1.asInstanceOf[js.Any])
    if (certificateHashSHA256 != null) __obj.updateDynamic("certificateHashSHA256")(certificateHashSHA256.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTrustedAppId]
  }
}

