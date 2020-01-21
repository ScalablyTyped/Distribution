package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing the details of the specified Android application APK.
  */
@js.native
trait SchemaGetApkDetailsResponse extends js.Object {
  /**
    * Details of the Android APK.
    */
  var apkDetail: js.UndefOr[SchemaApkDetail] = js.native
}

object SchemaGetApkDetailsResponse {
  @scala.inline
  def apply(apkDetail: SchemaApkDetail = null): SchemaGetApkDetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (apkDetail != null) __obj.updateDynamic("apkDetail")(apkDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetApkDetailsResponse]
  }
}

