package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of a column in a table.
  */
@js.native
trait SchemaTableColumnProperties extends js.Object {
  /**
    * The width of the column. Set when the column&#39;s `width_type` is
    * FIXED_WIDTH.
    */
  var width: js.UndefOr[SchemaDimension] = js.native
  /**
    * The width type of the column.
    */
  var widthType: js.UndefOr[String] = js.native
}

object SchemaTableColumnProperties {
  @scala.inline
  def apply(width: SchemaDimension = null, widthType: String = null): SchemaTableColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthType != null) __obj.updateDynamic("widthType")(widthType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableColumnProperties]
  }
}

