package typings.handsontable.handsontableMod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionId extends js.Object {
  var args: js.Array[_]
  var command: js.UndefOr[Anon_Key] = js.undefined
  var name: js.UndefOr[ConditionName] = js.undefined
}

object ConditionId {
  @scala.inline
  def apply(args: js.Array[_], command: Anon_Key = null, name: ConditionName = null): ConditionId = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionId]
  }
}

