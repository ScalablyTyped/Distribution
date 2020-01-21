package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The table cell background fill.
  */
@js.native
trait SchemaTableCellBackgroundFill extends js.Object {
  /**
    * The background fill property state.  Updating the fill on a table cell
    * will implicitly update this field to `RENDERED`, unless another value is
    * specified in the same request. To have no fill on a table cell, set this
    * field to `NOT_RENDERED`. In this case, any other fill fields set in the
    * same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.native
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.native
}

object SchemaTableCellBackgroundFill {
  @scala.inline
  def apply(propertyState: String = null, solidFill: SchemaSolidFill = null): SchemaTableCellBackgroundFill = {
    val __obj = js.Dynamic.literal()
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableCellBackgroundFill]
  }
}

