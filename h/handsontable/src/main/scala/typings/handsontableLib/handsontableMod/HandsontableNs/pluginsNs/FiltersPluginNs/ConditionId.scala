package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs.FiltersPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionId extends js.Object {
  var args: js.Array[_]
  var command: js.UndefOr[handsontableLib.Anon_Key] = js.undefined
  var name: js.UndefOr[ConditionName] = js.undefined
}

object ConditionId {
  @scala.inline
  def apply(args: js.Array[_], command: handsontableLib.Anon_Key = null, name: ConditionName = null): ConditionId = {
    val __obj = js.Dynamic.literal(args = args)
    if (command != null) __obj.updateDynamic("command")(command)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ConditionId]
  }
}

