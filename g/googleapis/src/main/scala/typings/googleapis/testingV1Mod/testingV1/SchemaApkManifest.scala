package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Android app manifest. See
  * http://developer.android.com/guide/topics/manifest/manifest-intro.html
  */
@js.native
trait SchemaApkManifest extends js.Object {
  /**
    * User-readable name for the application.
    */
  var applicationLabel: js.UndefOr[String] = js.native
  var intentFilters: js.UndefOr[js.Array[SchemaIntentFilter]] = js.native
  /**
    * Maximum API level on which the application is designed to run.
    */
  var maxSdkVersion: js.UndefOr[Double] = js.native
  /**
    * Minimum API level required for the application to run.
    */
  var minSdkVersion: js.UndefOr[Double] = js.native
  /**
    * Full Java-style package name for this application, e.g.
    * &quot;com.example.foo&quot;.
    */
  var packageName: js.UndefOr[String] = js.native
}

object SchemaApkManifest {
  @scala.inline
  def apply(): SchemaApkManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkManifest]
  }
  @scala.inline
  implicit class SchemaApkManifestOps[Self <: SchemaApkManifest] (val x: Self) extends AnyVal {
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
    def setApplicationLabel(value: String): Self = this.set("applicationLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationLabel: Self = this.set("applicationLabel", js.undefined)
    @scala.inline
    def setIntentFiltersVarargs(value: SchemaIntentFilter*): Self = this.set("intentFilters", js.Array(value :_*))
    @scala.inline
    def setIntentFilters(value: js.Array[SchemaIntentFilter]): Self = this.set("intentFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntentFilters: Self = this.set("intentFilters", js.undefined)
    @scala.inline
    def setMaxSdkVersion(value: Double): Self = this.set("maxSdkVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSdkVersion: Self = this.set("maxSdkVersion", js.undefined)
    @scala.inline
    def setMinSdkVersion(value: Double): Self = this.set("minSdkVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSdkVersion: Self = this.set("minSdkVersion", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
  
}

