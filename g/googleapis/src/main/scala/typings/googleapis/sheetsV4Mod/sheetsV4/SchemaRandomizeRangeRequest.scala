package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Randomizes the order of the rows in a range.
  */
@js.native
trait SchemaRandomizeRangeRequest extends js.Object {
  /**
    * The range to randomize.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaRandomizeRangeRequest {
  @scala.inline
  def apply(): SchemaRandomizeRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRandomizeRangeRequest]
  }
  @scala.inline
  implicit class SchemaRandomizeRangeRequestOps[Self <: SchemaRandomizeRangeRequest] (val x: Self) extends AnyVal {
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
    def setRange(value: SchemaGridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

