package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Android app information.
  */
@js.native
trait SchemaAndroidAppInfo extends js.Object {
  /**
    * The name of the app. Optional
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The package name of the app. Required.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * The internal version code of the app. Optional.
    */
  var versionCode: js.UndefOr[String] = js.native
  /**
    * The version name of the app. Optional.
    */
  var versionName: js.UndefOr[String] = js.native
}

object SchemaAndroidAppInfo {
  @scala.inline
  def apply(
    name: String = null,
    packageName: String = null,
    versionCode: String = null,
    versionName: String = null
  ): SchemaAndroidAppInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    if (versionName != null) __obj.updateDynamic("versionName")(versionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidAppInfo]
  }
}

