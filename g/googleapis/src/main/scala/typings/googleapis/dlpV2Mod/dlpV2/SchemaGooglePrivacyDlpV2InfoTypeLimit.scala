package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Max findings configuration per infoType, per content item or long running
  * DlpJob.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeLimit extends js.Object {
  /**
    * Type of information the findings limit applies to. Only one limit per
    * info_type should be provided. If InfoTypeLimit does not have an
    * info_type, the DLP API applies the limit against all info_types that are
    * found but not specified in another InfoTypeLimit.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  /**
    * Max findings limit for the given infoType.
    */
  var maxFindings: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2InfoTypeLimit {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeLimit]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeLimitOps[Self <: SchemaGooglePrivacyDlpV2InfoTypeLimit] (val x: Self) extends AnyVal {
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
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
    @scala.inline
    def setMaxFindings(value: Double): Self = this.set("maxFindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFindings: Self = this.set("maxFindings", js.undefined)
  }
  
}

