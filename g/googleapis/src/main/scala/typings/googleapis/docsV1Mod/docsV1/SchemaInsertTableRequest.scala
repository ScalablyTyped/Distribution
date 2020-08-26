package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts a table at the specified location.  A newline character will be
  * inserted before the inserted table.
  */
@js.native
trait SchemaInsertTableRequest extends js.Object {
  /**
    * The number of columns in the table.
    */
  var columns: js.UndefOr[Double] = js.native
  /**
    * Inserts the table at the end of the given header, footer or document
    * body. A newline character will be inserted before the inserted table.
    * Tables cannot be inserted inside a footnote.
    */
  var endOfSegmentLocation: js.UndefOr[SchemaEndOfSegmentLocation] = js.native
  /**
    * Inserts the table at a specific model index.  A newline character will be
    * inserted before the inserted table, therefore the table start index will
    * be at the specified location index + 1.  The table must be inserted
    * inside the bounds of an existing Paragraph. For instance, it cannot be
    * inserted at a table&#39;s start index (i.e. between an existing table and
    * its preceding paragraph).  Tables cannot be inserted inside a footnote or
    * equation.
    */
  var location: js.UndefOr[SchemaLocation] = js.native
  /**
    * The number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.native
}

object SchemaInsertTableRequest {
  @scala.inline
  def apply(): SchemaInsertTableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertTableRequest]
  }
  @scala.inline
  implicit class SchemaInsertTableRequestOps[Self <: SchemaInsertTableRequest] (val x: Self) extends AnyVal {
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setEndOfSegmentLocation(value: SchemaEndOfSegmentLocation): Self = this.set("endOfSegmentLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOfSegmentLocation: Self = this.set("endOfSegmentLocation", js.undefined)
    @scala.inline
    def setLocation(value: SchemaLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
  
}

