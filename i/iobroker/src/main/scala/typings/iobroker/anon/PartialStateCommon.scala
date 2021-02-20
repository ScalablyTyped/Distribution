package typings.iobroker.anon

import typings.iobroker.iobrokerBooleans.`true`
import typings.iobroker.objectsMod.global.ioBroker.CommonType
import typings.iobroker.objectsMod.global.ioBroker.StringOrTranslated
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.StateCommon> */
@js.native
trait PartialStateCommon extends StObject {
  
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
  implicit class PartialStateCommonMutableBuilder[Self <: PartialStateCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: Read): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setCustom(value: Record[String, _]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDef(value: js.Any): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefAck(value: Boolean): Self = StObject.set(x, "defAck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefAckUndefined: Self = StObject.set(x, "defAck", js.undefined)
    
    @scala.inline
    def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
    
    @scala.inline
    def setDesc(value: StringOrTranslated): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    @scala.inline
    def setHistory(value: js.Any): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setName(value: StringOrTranslated): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSmartName(value: String | langinLanguagesstringsmar): Self = StObject.set(x, "smartName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartNameUndefined: Self = StObject.set(x, "smartName", js.undefined)
    
    @scala.inline
    def setStates(value: (Record[String, String]) | String): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setType(value: CommonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setWorkingID(value: String): Self = StObject.set(x, "workingID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingIDUndefined: Self = StObject.set(x, "workingID", js.undefined)
    
    @scala.inline
    def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
