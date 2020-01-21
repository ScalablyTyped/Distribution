package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Styles that apply to a table row.
  */
@js.native
trait SchemaTableRowStyle extends js.Object {
  /**
    * The minimum height of the row. The row will be rendered in the Docs
    * editor at a height equal to or greater than this value in order to show
    * all the content in the row&#39;s cells.
    */
  var minRowHeight: js.UndefOr[SchemaDimension] = js.native
}

object SchemaTableRowStyle {
  @scala.inline
  def apply(minRowHeight: SchemaDimension = null): SchemaTableRowStyle = {
    val __obj = js.Dynamic.literal()
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableRowStyle]
  }
}

