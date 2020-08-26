package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for specifying a window around a finding to apply a detection rule.
  */
@js.native
trait SchemaGooglePrivacyDlpV2Proximity extends js.Object {
  /**
    * Number of characters after the finding to consider.
    */
  var windowAfter: js.UndefOr[Double] = js.native
  /**
    * Number of characters before the finding to consider.
    */
  var windowBefore: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2Proximity {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2Proximity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Proximity]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ProximityOps[Self <: SchemaGooglePrivacyDlpV2Proximity] (val x: Self) extends AnyVal {
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
    def setWindowAfter(value: Double): Self = this.set("windowAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowAfter: Self = this.set("windowAfter", js.undefined)
    @scala.inline
    def setWindowBefore(value: Double): Self = this.set("windowBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowBefore: Self = this.set("windowBefore", js.undefined)
  }
  
}

