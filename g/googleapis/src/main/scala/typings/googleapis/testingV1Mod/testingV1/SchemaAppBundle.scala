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
  def apply(): SchemaAppBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppBundle]
  }
  @scala.inline
  implicit class SchemaAppBundleOps[Self <: SchemaAppBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBundleLocation(value: SchemaFileReference): Self = this.set("bundleLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleLocation: Self = this.set("bundleLocation", js.undefined)
  }
  
}

