package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android App Bundle file format, containing a BundleConfig.pb file, a
  * base module directory, zero or more dynamic feature module directories.
  * &lt;p&gt;See https://developer.android.com/guide/app-bundle/build for
  * guidance on building App Bundles.
  */
@js.native
trait SchemaAppBundle extends js.Object {
  /**
    * .aab file representing the app bundle under test.
    */
  var bundleLocation: js.UndefOr[SchemaFileReference] = js.native
}

object SchemaAppBundle {
  @scala.inline
  def apply(bundleLocation: SchemaFileReference = null): SchemaAppBundle = {
    val __obj = js.Dynamic.literal()
    if (bundleLocation != null) __obj.updateDynamic("bundleLocation")(bundleLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppBundle]
  }
}

