package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirtyFlagResult extends js.Object {
  var isDirty: knockoutLib.KnockoutComputed[scala.Boolean]
  def forceDirty(): scala.Unit
  def reset(): scala.Unit
}

object DirtyFlagResult {
  @scala.inline
  def apply(
    forceDirty: js.Function0[scala.Unit],
    isDirty: knockoutLib.KnockoutComputed[scala.Boolean],
    reset: js.Function0[scala.Unit]
  ): DirtyFlagResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forceDirty")(forceDirty)
    __obj.updateDynamic("isDirty")(isDirty)
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[DirtyFlagResult]
  }
}

