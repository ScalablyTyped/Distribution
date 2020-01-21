package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the binary payload of an APK.
  */
@js.native
trait SchemaApkBinary extends js.Object {
  /**
    * A sha1 hash of the APK payload, encoded as a hex string and matching the
    * output of the sha1sum command.
    */
  var sha1: js.UndefOr[String] = js.native
  /**
    * A sha256 hash of the APK payload, encoded as a hex string and matching
    * the output of the sha256sum command.
    */
  var sha256: js.UndefOr[String] = js.native
}

object SchemaApkBinary {
  @scala.inline
  def apply(sha1: String = null, sha256: String = null): SchemaApkBinary = {
    val __obj = js.Dynamic.literal()
    if (sha1 != null) __obj.updateDynamic("sha1")(sha1.asInstanceOf[js.Any])
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApkBinary]
  }
}

