package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApk extends js.Object {
  /**
    * Information about the binary payload of this APK.
    */
  var binary: js.UndefOr[SchemaApkBinary] = js.native
  /**
    * The version code of the APK, as specified in the APK&#39;s manifest file.
    */
  var versionCode: js.UndefOr[Double] = js.native
}

object SchemaApk {
  @scala.inline
  def apply(binary: SchemaApkBinary = null, versionCode: js.UndefOr[Double] = js.undefined): SchemaApk = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (!js.isUndefined(versionCode)) __obj.updateDynamic("versionCode")(versionCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApk]
  }
}

