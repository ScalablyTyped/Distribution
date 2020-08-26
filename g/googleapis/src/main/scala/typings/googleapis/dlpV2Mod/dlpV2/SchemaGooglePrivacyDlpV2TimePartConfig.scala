package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For use with `Date`, `Timestamp`, and `TimeOfDay`, extract or preserve a
  * portion of the value.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TimePartConfig extends js.Object {
  var partToExtract: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2TimePartConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TimePartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimePartConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TimePartConfigOps[Self <: SchemaGooglePrivacyDlpV2TimePartConfig] (val x: Self) extends AnyVal {
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
    def setPartToExtract(value: String): Self = this.set("partToExtract", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartToExtract: Self = this.set("partToExtract", js.undefined)
  }
  
}

