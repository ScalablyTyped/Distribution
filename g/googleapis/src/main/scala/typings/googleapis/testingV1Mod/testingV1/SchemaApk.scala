package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android package file to install.
  */
@js.native
trait SchemaApk extends js.Object {
  /**
    * The path to an APK to be installed on the device before the test begins.
    */
  var location: js.UndefOr[SchemaFileReference] = js.native
  /**
    * The java package for the APK to be installed. Value is determined by
    * examining the application&#39;s manifest.
    */
  var packageName: js.UndefOr[String] = js.native
}

object SchemaApk {
  @scala.inline
  def apply(location: SchemaFileReference = null, packageName: String = null): SchemaApk = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApk]
  }
}

