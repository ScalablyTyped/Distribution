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
  def apply(
    findings: js.Array[SchemaGooglePrivacyDlpV2Finding] = null,
    findingsTruncated: js.UndefOr[Boolean] = js.undefined
  ): SchemaGooglePrivacyDlpV2InspectResult = {
    val __obj = js.Dynamic.literal()
    if (findings != null) __obj.updateDynamic("findings")(findings.asInstanceOf[js.Any])
    if (!js.isUndefined(findingsTruncated)) __obj.updateDynamic("findingsTruncated")(findingsTruncated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectResult]
  }
}

