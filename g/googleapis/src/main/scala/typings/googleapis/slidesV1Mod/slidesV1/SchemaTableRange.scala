package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A table range represents a reference to a subset of a table.  It&#39;s
  * important to note that the cells specified by a table range do not
  * necessarily form a rectangle. For example, let&#39;s say we have a 3 x 3
  * table where all the cells of the last row are merged together. The table
  * looks like this:                      [             ]  A table range with
  * location = (0, 0), row span = 3 and column span = 2 specifies the following
  * cells:        x     x       [ x    x    x ]
  */
@js.native
trait SchemaTableRange extends js.Object {
  /**
    * The column span of the table range.
    */
  var columnSpan: js.UndefOr[Double] = js.native
  /**
    * The starting location of the table range.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.native
  /**
    * The row span of the table range.
    */
  var rowSpan: js.UndefOr[Double] = js.native
}

object SchemaTableRange {
  @scala.inline
  def apply(
    columnSpan: Int | Double = null,
    location: SchemaTableCellLocation = null,
    rowSpan: Int | Double = null
  ): SchemaTableRange = {
    val __obj = js.Dynamic.literal()
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableRange]
  }
}

