package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All the findings for a single scanned item.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectResult extends js.Object {
  /**
    * List of findings for an item.
    */
  var findings: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Finding]] = js.native
  /**
    * If true, then this item might have more findings than were returned, and
    * the findings returned are an arbitrary subset of all findings. The
    * findings list might be truncated because the input items were too large,
    * or because the server reached the maximum amount of resources allowed for
    * a single API call. For best results, divide the input into smaller
    * batches.
    */
  var findingsTruncated: js.UndefOr[Boolean] = js.native
}

object SchemaGooglePrivacyDlpV2InspectResult {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectResult]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectResultOps[Self <: SchemaGooglePrivacyDlpV2InspectResult] (val x: Self) extends AnyVal {
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
    def setFindingsVarargs(value: SchemaGooglePrivacyDlpV2Finding*): Self = this.set("findings", js.Array(value :_*))
    @scala.inline
    def setFindings(value: js.Array[SchemaGooglePrivacyDlpV2Finding]): Self = this.set("findings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindings: Self = this.set("findings", js.undefined)
    @scala.inline
    def setFindingsTruncated(value: Boolean): Self = this.set("findingsTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingsTruncated: Self = this.set("findingsTruncated", js.undefined)
  }
  
}

