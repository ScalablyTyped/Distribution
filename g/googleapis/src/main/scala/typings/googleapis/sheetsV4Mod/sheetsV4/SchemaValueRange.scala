package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data within a range of the spreadsheet.
  */
@js.native
trait SchemaValueRange extends js.Object {
  /**
    * The major dimension of the values.  For output, if the spreadsheet data
    * is: `A1=1,B1=2,A2=3,B2=4`, then requesting
    * `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas
    * requesting `range=A1:B2,majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.  For input, with `range=A1:B2,majorDimension=ROWS` then
    * `[[1,2],[3,4]]` will set `A1=1,B1=2,A2=3,B2=4`. With
    * `range=A1:B2,majorDimension=COLUMNS` then `[[1,2],[3,4]]` will set
    * `A1=1,B1=3,A2=2,B2=4`.  When writing, if this field is not set, it
    * defaults to ROWS.
    */
  var majorDimension: js.UndefOr[String] = js.native
  /**
    * The range the values cover, in A1 notation. For output, this range
    * indicates the entire requested range, even though the values will exclude
    * trailing rows and columns. When appending values, this field represents
    * the range to search for a table, after which values will be appended.
    */
  var range: js.UndefOr[String] = js.native
  /**
    * The data that was read or to be written.  This is an array of arrays, the
    * outer array representing all the data and each inner array representing a
    * major dimension. Each item in the inner array corresponds with one cell.
    * For output, empty trailing rows and columns will not be included.  For
    * input, supported value types are: bool, string, and double. Null values
    * will be skipped. To set a cell to an empty value, set the string value to
    * an empty string.
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object SchemaValueRange {
  @scala.inline
  def apply(majorDimension: String = null, range: String = null, values: js.Array[js.Array[_]] = null): SchemaValueRange = {
    val __obj = js.Dynamic.literal()
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaValueRange]
  }
}

