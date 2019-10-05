package typings.lovefield.lovefieldMod.schema

import typings.lovefield.lovefieldMod.ConstraintAction
import typings.lovefield.lovefieldMod.ConstraintTiming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawForeignKeySpec extends js.Object {
  var action: js.UndefOr[ConstraintAction] = js.undefined
  var local: String
  var ref: String
  var timing: js.UndefOr[ConstraintTiming] = js.undefined
}

object RawForeignKeySpec {
  @scala.inline
  def apply(local: String, ref: String, action: ConstraintAction = null, timing: ConstraintTiming = null): RawForeignKeySpec = {
    val __obj = js.Dynamic.literal(local = local, ref = ref)
    if (action != null) __obj.updateDynamic("action")(action)
    if (timing != null) __obj.updateDynamic("timing")(timing)
    __obj.asInstanceOf[RawForeignKeySpec]
  }
}

