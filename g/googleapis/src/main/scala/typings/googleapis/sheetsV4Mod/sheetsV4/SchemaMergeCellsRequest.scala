package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Merges all cells in the range.
  */
@js.native
trait SchemaMergeCellsRequest extends js.Object {
  /**
    * How the cells should be merged.
    */
  var mergeType: js.UndefOr[String] = js.native
  /**
    * The range of cells to merge.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaMergeCellsRequest {
  @scala.inline
  def apply(): SchemaMergeCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMergeCellsRequest]
  }
  @scala.inline
  implicit class SchemaMergeCellsRequestOps[Self <: SchemaMergeCellsRequest] (val x: Self) extends AnyVal {
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
    def setMergeType(value: String): Self = this.set("mergeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeType: Self = this.set("mergeType", js.undefined)
    @scala.inline
    def setRange(value: SchemaGridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

