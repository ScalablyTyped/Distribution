package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A FindingTypeStats resource represents stats regarding a specific
  * FindingType of Findings under a given ScanRun.
  */
@js.native
trait SchemaFindingTypeStats extends js.Object {
  /**
    * Output only. The count of findings belonging to this finding type.
    */
  var findingCount: js.UndefOr[Double] = js.native
  /**
    * Output only. The finding type associated with the stats.
    */
  var findingType: js.UndefOr[String] = js.native
}

object SchemaFindingTypeStats {
  @scala.inline
  def apply(findingCount: Int | Double = null, findingType: String = null): SchemaFindingTypeStats = {
    val __obj = js.Dynamic.literal()
    if (findingCount != null) __obj.updateDynamic("findingCount")(findingCount.asInstanceOf[js.Any])
    if (findingType != null) __obj.updateDynamic("findingType")(findingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFindingTypeStats]
  }
}

