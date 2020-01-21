package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result containing the Finding and its StateChange.
  */
@js.native
trait SchemaListFindingsResult extends js.Object {
  /**
    * Finding matching the search request.
    */
  var finding: js.UndefOr[SchemaFinding] = js.native
  /**
    * State change of the finding between the points in time.
    */
  var stateChange: js.UndefOr[String] = js.native
}

object SchemaListFindingsResult {
  @scala.inline
  def apply(finding: SchemaFinding = null, stateChange: String = null): SchemaListFindingsResult = {
    val __obj = js.Dynamic.literal()
    if (finding != null) __obj.updateDynamic("finding")(finding.asInstanceOf[js.Any])
    if (stateChange != null) __obj.updateDynamic("stateChange")(stateChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFindingsResult]
  }
}

