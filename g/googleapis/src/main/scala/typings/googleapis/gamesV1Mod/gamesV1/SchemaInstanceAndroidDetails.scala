package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the Android instance details resource.
  */
@js.native
trait SchemaInstanceAndroidDetails extends js.Object {
  /**
    * Flag indicating whether the anti-piracy check is enabled.
    */
  var enablePiracyCheck: js.UndefOr[Boolean] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#instanceAndroidDetails.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Android package name which maps to Google Play URL.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * Indicates that this instance is the default for new installations.
    */
  var preferred: js.UndefOr[Boolean] = js.native
}

object SchemaInstanceAndroidDetails {
  @scala.inline
  def apply(): SchemaInstanceAndroidDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceAndroidDetails]
  }
  @scala.inline
  implicit class SchemaInstanceAndroidDetailsOps[Self <: SchemaInstanceAndroidDetails] (val x: Self) extends AnyVal {
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
    def setEnablePiracyCheck(value: Boolean): Self = this.set("enablePiracyCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePiracyCheck: Self = this.set("enablePiracyCheck", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setPreferred(value: Boolean): Self = this.set("preferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferred: Self = this.set("preferred", js.undefined)
  }
  
}

