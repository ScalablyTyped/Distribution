package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The fill of the border.
  */
@js.native
trait SchemaTableBorderFill extends js.Object {
  /**
    * Solid fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.native
}

object SchemaTableBorderFill {
  @scala.inline
  def apply(solidFill: SchemaSolidFill = null): SchemaTableBorderFill = {
    val __obj = js.Dynamic.literal()
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableBorderFill]
  }
}

