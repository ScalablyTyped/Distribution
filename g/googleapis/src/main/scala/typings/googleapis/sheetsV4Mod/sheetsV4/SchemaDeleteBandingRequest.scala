package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Removes the banded range with the given ID from the spreadsheet.
  */
@js.native
trait SchemaDeleteBandingRequest extends js.Object {
  /**
    * The ID of the banded range to delete.
    */
  var bandedRangeId: js.UndefOr[Double] = js.native
}

object SchemaDeleteBandingRequest {
  @scala.inline
  def apply(): SchemaDeleteBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteBandingRequest]
  }
  @scala.inline
  implicit class SchemaDeleteBandingRequestOps[Self <: SchemaDeleteBandingRequest] (val x: Self) extends AnyVal {
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
    def setBandedRangeId(value: Double): Self = this.set("bandedRangeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandedRangeId: Self = this.set("bandedRangeId", js.undefined)
  }
  
}

