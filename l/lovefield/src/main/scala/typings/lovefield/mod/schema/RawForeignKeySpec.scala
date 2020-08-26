package typings.lovefield.mod.schema

import typings.lovefield.mod.ConstraintAction
import typings.lovefield.mod.ConstraintTiming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawForeignKeySpec extends js.Object {
  var action: js.UndefOr[ConstraintAction] = js.native
  var local: String = js.native
  var ref: String = js.native
  var timing: js.UndefOr[ConstraintTiming] = js.native
}

object RawForeignKeySpec {
  @scala.inline
  def apply(local: String, ref: String): RawForeignKeySpec = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawForeignKeySpec]
  }
  @scala.inline
  implicit class RawForeignKeySpecOps[Self <: RawForeignKeySpec] (val x: Self) extends AnyVal {
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
    def setLocal(value: String): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: ConstraintAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setTiming(value: ConstraintTiming): Self = this.set("timing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
  }
  
}

