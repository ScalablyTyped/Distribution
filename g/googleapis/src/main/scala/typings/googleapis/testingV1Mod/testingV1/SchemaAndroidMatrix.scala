package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Android device configuration permutations is defined by the the
  * cross-product of the given axes. Internally, the given AndroidMatrix will
  * be expanded into a set of AndroidDevices.  Only supported permutations will
  * be instantiated.  Invalid permutations (e.g., incompatible models/versions)
  * are ignored.
  */
@js.native
trait SchemaAndroidMatrix extends js.Object {
  /**
    * Required. The ids of the set of Android device to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidModelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The ids of the set of Android OS version to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The set of locales the test device will enable for testing. Use
    * the TestEnvironmentDiscoveryService to get supported options.
    */
  var locales: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The set of orientations to test with. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var orientations: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAndroidMatrix {
  @scala.inline
  def apply(): SchemaAndroidMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidMatrix]
  }
  @scala.inline
  implicit class SchemaAndroidMatrixOps[Self <: SchemaAndroidMatrix] (val x: Self) extends AnyVal {
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
    def setAndroidModelIdsVarargs(value: String*): Self = this.set("androidModelIds", js.Array(value :_*))
    @scala.inline
    def setAndroidModelIds(value: js.Array[String]): Self = this.set("androidModelIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidModelIds: Self = this.set("androidModelIds", js.undefined)
    @scala.inline
    def setAndroidVersionIdsVarargs(value: String*): Self = this.set("androidVersionIds", js.Array(value :_*))
    @scala.inline
    def setAndroidVersionIds(value: js.Array[String]): Self = this.set("androidVersionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidVersionIds: Self = this.set("androidVersionIds", js.undefined)
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    @scala.inline
    def setOrientationsVarargs(value: String*): Self = this.set("orientations", js.Array(value :_*))
    @scala.inline
    def setOrientations(value: js.Array[String]): Self = this.set("orientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientations: Self = this.set("orientations", js.undefined)
  }
  
}

