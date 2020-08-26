package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Android related attributes to the Dynamic Link.
  */
@js.native
trait SchemaAndroidInfo extends js.Object {
  /**
    * Link to open on Android if the app is not installed.
    */
  var androidFallbackLink: js.UndefOr[String] = js.native
  /**
    * If specified, this overrides the ‘link’ parameter on Android.
    */
  var androidLink: js.UndefOr[String] = js.native
  /**
    * Minimum version code for the Android app. If the installed app’s version
    * code is lower, then the user is taken to the Play Store.
    */
  var androidMinPackageVersionCode: js.UndefOr[String] = js.native
  /**
    * Android package name of the app.
    */
  var androidPackageName: js.UndefOr[String] = js.native
}

object SchemaAndroidInfo {
  @scala.inline
  def apply(): SchemaAndroidInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidInfo]
  }
  @scala.inline
  implicit class SchemaAndroidInfoOps[Self <: SchemaAndroidInfo] (val x: Self) extends AnyVal {
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
    def setAndroidFallbackLink(value: String): Self = this.set("androidFallbackLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidFallbackLink: Self = this.set("androidFallbackLink", js.undefined)
    @scala.inline
    def setAndroidLink(value: String): Self = this.set("androidLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidLink: Self = this.set("androidLink", js.undefined)
    @scala.inline
    def setAndroidMinPackageVersionCode(value: String): Self = this.set("androidMinPackageVersionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidMinPackageVersionCode: Self = this.set("androidMinPackageVersionCode", js.undefined)
    @scala.inline
    def setAndroidPackageName(value: String): Self = this.set("androidPackageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidPackageName: Self = this.set("androidPackageName", js.undefined)
  }
  
}

