package typings.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typings.handsontable.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionId extends js.Object {
  var args: js.Array[_] = js.native
  var command: js.UndefOr[Key] = js.native
  var name: js.UndefOr[ConditionName] = js.native
}

object ConditionId {
  @scala.inline
  def apply(args: js.Array[_]): ConditionId = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionId]
  }
  @scala.inline
  implicit class ConditionIdOps[Self <: ConditionId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: Key): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setName(value: ConditionName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

