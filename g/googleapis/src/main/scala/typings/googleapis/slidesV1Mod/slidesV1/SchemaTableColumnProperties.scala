package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of each column in a table.
  */
@js.native
trait SchemaTableColumnProperties extends js.Object {
  /**
    * Width of a column.
    */
  var columnWidth: js.UndefOr[SchemaDimension] = js.native
}

object SchemaTableColumnProperties {
  @scala.inline
  def apply(columnWidth: SchemaDimension = null): SchemaTableColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableColumnProperties]
  }
}

