package typings.loopback.anon

import typings.loopback.mod.Conflict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conflicts extends js.Object {
  var conflicts: js.Array[Conflict] = js.native
  var params: js.Any = js.native
}

object Conflicts {
  @scala.inline
  def apply(conflicts: js.Array[Conflict], params: js.Any): Conflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  @scala.inline
  implicit class ConflictsOps[Self <: Conflicts] (val x: Self) extends AnyVal {
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
    def setConflictsVarargs(value: Conflict*): Self = this.set("conflicts", js.Array(value :_*))
    @scala.inline
    def setConflicts(value: js.Array[Conflict]): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

