package typings.lovefield.mod.schema

import typings.lovefield.mod.ConstraintAction
import typings.lovefield.mod.ConstraintTiming
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
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawForeignKeySpec]
  }
}

