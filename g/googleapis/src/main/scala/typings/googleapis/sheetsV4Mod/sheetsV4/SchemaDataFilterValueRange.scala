package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A range of values whose location is specified by a DataFilter.
  */
@js.native
trait SchemaDataFilterValueRange extends js.Object {
  /**
    * The data filter describing the location of the values in the spreadsheet.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.native
  /**
    * The major dimension of the values.
    */
  var majorDimension: js.UndefOr[String] = js.native
  /**
    * The data to be written.  If the provided values exceed any of the ranges
    * matched by the data filter then the request will fail.  If the provided
    * values are less than the matched ranges only the specified values will be
    * written, existing values in the matched ranges will remain unaffected.
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.native
}

object SchemaDataFilterValueRange {
  @scala.inline
  def apply(
    dataFilter: SchemaDataFilter = null,
    majorDimension: String = null,
    values: js.Array[js.Array[_]] = null
  ): SchemaDataFilterValueRange = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter.asInstanceOf[js.Any])
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDataFilterValueRange]
  }
}

