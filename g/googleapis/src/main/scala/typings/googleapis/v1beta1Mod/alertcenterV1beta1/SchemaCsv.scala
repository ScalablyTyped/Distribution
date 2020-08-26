package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a CSV file attachment, as a list of column headers and
  * a list of data rows.
  */
@js.native
trait SchemaCsv extends js.Object {
  /**
    * The list of data rows in a CSV file, as string arrays rather than as a
    * single comma-separated string.
    */
  var dataRows: js.UndefOr[js.Array[SchemaCsvRow]] = js.native
  /**
    * The list of headers for data columns in a CSV file.
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCsv {
  @scala.inline
  def apply(): SchemaCsv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCsv]
  }
  @scala.inline
  implicit class SchemaCsvOps[Self <: SchemaCsv] (val x: Self) extends AnyVal {
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
    def setDataRowsVarargs(value: SchemaCsvRow*): Self = this.set("dataRows", js.Array(value :_*))
    @scala.inline
    def setDataRows(value: js.Array[SchemaCsvRow]): Self = this.set("dataRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRows: Self = this.set("dataRows", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

