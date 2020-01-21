package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of each row in a table.
  */
@js.native
trait SchemaTableRowProperties extends js.Object {
  /**
    * Minimum height of the row. The row will be rendered in the Slides editor
    * at a height equal to or greater than this value in order to show all the
    * text in the row&#39;s cell(s).
    */
  var minRowHeight: js.UndefOr[SchemaDimension] = js.native
}

object SchemaTableRowProperties {
  @scala.inline
  def apply(minRowHeight: SchemaDimension = null): SchemaTableRowProperties = {
    val __obj = js.Dynamic.literal()
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableRowProperties]
  }
}

