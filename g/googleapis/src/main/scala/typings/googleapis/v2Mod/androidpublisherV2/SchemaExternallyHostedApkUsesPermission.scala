package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A permission used by this APK.
  */
@js.native
trait SchemaExternallyHostedApkUsesPermission extends js.Object {
  /**
    * Optionally, the maximum SDK version for which the permission is required.
    */
  var maxSdkVersion: js.UndefOr[Double] = js.native
  /**
    * The name of the permission requested.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaExternallyHostedApkUsesPermission {
  @scala.inline
  def apply(maxSdkVersion: js.UndefOr[Double] = js.undefined, name: String = null): SchemaExternallyHostedApkUsesPermission = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSdkVersion)) __obj.updateDynamic("maxSdkVersion")(maxSdkVersion.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExternallyHostedApkUsesPermission]
  }
}

