package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection that informs the user the number of times a particular
  * `TransformationResultCode` and error details occurred.
  */
@js.native
trait SchemaGooglePrivacyDlpV2SummaryResult extends js.Object {
  var code: js.UndefOr[String] = js.native
  var count: js.UndefOr[String] = js.native
  /**
    * A place for warnings or errors to show up if a transformation didn&#39;t
    * work as expected.
    */
  var details: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2SummaryResult {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2SummaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2SummaryResult]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2SummaryResultOps[Self <: SchemaGooglePrivacyDlpV2SummaryResult] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
  }
  
}

