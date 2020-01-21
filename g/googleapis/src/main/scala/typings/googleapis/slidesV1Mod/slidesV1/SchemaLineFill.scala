package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The fill of the line.
  */
@js.native
trait SchemaLineFill extends js.Object {
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.native
}

object SchemaLineFill {
  @scala.inline
  def apply(solidFill: SchemaSolidFill = null): SchemaLineFill = {
    val __obj = js.Dynamic.literal()
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLineFill]
  }
}

