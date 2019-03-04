package typings
package lovefieldLib.lovefieldMod.lfNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawForeignKeySpec extends js.Object {
  var action: js.UndefOr[lovefieldLib.lovefieldMod.lfNs.ConstraintAction] = js.undefined
  var local: java.lang.String
  var ref: java.lang.String
  var timing: js.UndefOr[lovefieldLib.lovefieldMod.lfNs.ConstraintTiming] = js.undefined
}

object RawForeignKeySpec {
  @scala.inline
  def apply(
    local: java.lang.String,
    ref: java.lang.String,
    action: lovefieldLib.lovefieldMod.lfNs.ConstraintAction = null,
    timing: lovefieldLib.lovefieldMod.lfNs.ConstraintTiming = null
  ): RawForeignKeySpec = {
    val __obj = js.Dynamic.literal(local = local, ref = ref)
    if (action != null) __obj.updateDynamic("action")(action)
    if (timing != null) __obj.updateDynamic("timing")(timing)
    __obj.asInstanceOf[RawForeignKeySpec]
  }
}

