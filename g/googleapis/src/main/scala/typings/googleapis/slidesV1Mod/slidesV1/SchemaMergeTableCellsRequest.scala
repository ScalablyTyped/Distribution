package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Merges cells in a Table.
  */
@js.native
trait SchemaMergeTableCellsRequest extends js.Object {
  /**
    * The object ID of the table.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The table range specifying which cells of the table to merge.  Any text
    * in the cells being merged will be concatenated and stored in the
    * upper-left (&quot;head&quot;) cell of the range. If the range is
    * non-rectangular (which can occur in some cases where the range covers
    * cells that are already merged), a 400 bad request error is returned.
    */
  var tableRange: js.UndefOr[SchemaTableRange] = js.native
}

object SchemaMergeTableCellsRequest {
  @scala.inline
  def apply(): SchemaMergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeTableCellsRequest]
  }
  @scala.inline
  implicit class SchemaMergeTableCellsRequestOps[Self <: SchemaMergeTableCellsRequest] (val x: Self) extends AnyVal {
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
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setTableRange(value: SchemaTableRange): Self = this.set("tableRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRange: Self = this.set("tableRange", js.undefined)
  }
  
}

