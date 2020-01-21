package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Android application details based on application manifest and apk archive
  * contents.
  */
@js.native
trait SchemaApkDetail extends js.Object {
  var apkManifest: js.UndefOr[SchemaApkManifest] = js.native
}

object SchemaApkDetail {
  @scala.inline
  def apply(apkManifest: SchemaApkManifest = null): SchemaApkDetail = {
    val __obj = js.Dynamic.literal()
    if (apkManifest != null) __obj.updateDynamic("apkManifest")(apkManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApkDetail]
  }
}

