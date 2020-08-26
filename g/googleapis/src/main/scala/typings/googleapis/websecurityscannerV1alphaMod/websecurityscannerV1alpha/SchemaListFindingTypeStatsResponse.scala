package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListFindingTypeStats` method.
  */
@js.native
trait SchemaListFindingTypeStatsResponse extends js.Object {
  /**
    * The list of FindingTypeStats returned.
    */
  var findingTypeStats: js.UndefOr[js.Array[SchemaFindingTypeStats]] = js.native
}

object SchemaListFindingTypeStatsResponse {
  @scala.inline
  def apply(): SchemaListFindingTypeStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingTypeStatsResponse]
  }
  @scala.inline
  implicit class SchemaListFindingTypeStatsResponseOps[Self <: SchemaListFindingTypeStatsResponse] (val x: Self) extends AnyVal {
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
    def setFindingTypeStatsVarargs(value: SchemaFindingTypeStats*): Self = this.set("findingTypeStats", js.Array(value :_*))
    @scala.inline
    def setFindingTypeStats(value: js.Array[SchemaFindingTypeStats]): Self = this.set("findingTypeStats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingTypeStats: Self = this.set("findingTypeStats", js.undefined)
  }
  
}

