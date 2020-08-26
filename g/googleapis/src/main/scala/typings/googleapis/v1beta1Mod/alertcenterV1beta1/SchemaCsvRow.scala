package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a single data row in a CSV file.
  */
@js.native
trait SchemaCsvRow extends js.Object {
  /**
    * The data entries in a CSV file row, as a string array rather than a
    * single comma-separated string.
    */
  var entries: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCsvRow {
  @scala.inline
  def apply(): SchemaCsvRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCsvRow]
  }
  @scala.inline
  implicit class SchemaCsvRowOps[Self <: SchemaCsvRow] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: String*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[String]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
  
}

