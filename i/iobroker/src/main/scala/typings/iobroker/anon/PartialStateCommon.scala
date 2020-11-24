package typings.iobroker.anon

import typings.iobroker.iobrokerBooleans.`true`
import typings.iobroker.objectsMod.global.ioBroker.CommonType
import typings.iobroker.objectsMod.global.ioBroker.StringOrTranslated
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.StateCommon> */
@js.native
trait PartialStateCommon extends js.Object {
  
  var alias: js.UndefOr[Read] = js.native
  
  var custom: js.UndefOr[Record[String, _]] = js.native
  
  var `def`: js.UndefOr[js.Any] = js.native
  
  var defAck: js.UndefOr[Boolean] = js.native
  
  var desc: js.UndefOr[StringOrTranslated] = js.native
  
  var dontDelete: js.UndefOr[`true`] = js.native
  
  var expert: js.UndefOr[`true`] = js.native
  
  var history: js.UndefOr[js.Any] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[StringOrTranslated] = js.native
  
  var read: js.UndefOr[Boolean] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var smartName: js.UndefOr[String | langinLanguagesstringsmar] = js.native
  
  var states: js.UndefOr[(Record[String, String]) | String] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
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
    def setAlias(value: Read): Self = this.set("alias", value.asInstanceOf[js.Any])
    
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
    def setDesc(value: StringOrTranslated): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    
    @scala.inline
    def setDontDelete(value: `true`): Self = this.set("dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontDelete: Self = this.set("dontDelete", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = this.set("expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpert: Self = this.set("expert", js.undefined)
    
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
    def setName(value: StringOrTranslated): Self = this.set("name", value.asInstanceOf[js.Any])
    
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
    def setSmartName(value: String | langinLanguagesstringsmar): Self = this.set("smartName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartName: Self = this.set("smartName", js.undefined)
    
    @scala.inline
    def setStates(value: (Record[String, String]) | String): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
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
