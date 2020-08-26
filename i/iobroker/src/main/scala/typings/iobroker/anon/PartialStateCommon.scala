package typings.iobroker.anon

import typings.iobroker.mod.global.ioBroker.CommonType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<iobroker.iobroker.<global>.ioBroker.StateCommon> */
@js.native
trait PartialStateCommon extends js.Object {
  var alias: js.UndefOr[Id] = js.native
  var custom: js.UndefOr[Record[String, _]] = js.native
  var `def`: js.UndefOr[js.Any] = js.native
  var defAck: js.UndefOr[Boolean] = js.native
  var desc: js.UndefOr[String] = js.native
  var history: js.UndefOr[js.Any] = js.native
  var icon: js.UndefOr[String] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var read: js.UndefOr[Boolean] = js.native
  var role: js.UndefOr[String] = js.native
  var states: js.UndefOr[(Record[String, String]) | String] = js.native
  var `type`: js.UndefOr[CommonType] = js.native
  var unit: js.UndefOr[String] = js.native
  var workingID: js.UndefOr[String] = js.native
  var write: js.UndefOr[Boolean] = js.native
}

object PartialStateCommon {
  @scala.inline
  def apply(): PartialStateCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateCommon]
  }
  @scala.inline
  implicit class PartialStateCommonOps[Self <: PartialStateCommon] (val x: Self) extends AnyVal {
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
    def setAlias(value: Id): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setCustom(value: Record[String, _]): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setDef(value: js.Any): Self = this.set("def", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDef: Self = this.set("def", js.undefined)
    @scala.inline
    def setDefAck(value: Boolean): Self = this.set("defAck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefAck: Self = this.set("defAck", js.undefined)
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    @scala.inline
    def setHistory(value: js.Any): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setStates(value: (Record[String, String]) | String): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    @scala.inline
    def setType(value: CommonType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setWorkingID(value: String): Self = this.set("workingID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkingID: Self = this.set("workingID", js.undefined)
    @scala.inline
    def setWrite(value: Boolean): Self = this.set("write", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
  
}

