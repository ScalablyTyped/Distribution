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
  def apply(): SchemaFindingTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindingTypeStats]
  }
  @scala.inline
  implicit class SchemaFindingTypeStatsOps[Self <: SchemaFindingTypeStats] (val x: Self) extends AnyVal {
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
    def setFindingCount(value: Double): Self = this.set("findingCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingCount: Self = this.set("findingCount", js.undefined)
    @scala.inline
    def setFindingType(value: String): Self = this.set("findingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingType: Self = this.set("findingType", js.undefined)
  }
  
}

