package typings.iobroker.anon

import typings.iobroker.iobrokerBooleans.`true`
import typings.iobroker.objectsMod.global.ioBroker.CommonType
import typings.iobroker.objectsMod.global.ioBroker.StringOrTranslated
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.StateCommon> */
trait PartialStateCommon extends StObject {
  
  var alias: js.UndefOr[Write] = js.undefined
  
  var custom: js.UndefOr[Record[String, Any]] = js.undefined
  
  var `def`: js.UndefOr[Any] = js.undefined
  
  var defAck: js.UndefOr[Boolean] = js.undefined
  
  var desc: js.UndefOr[StringOrTranslated] = js.undefined
  
  var dontDelete: js.UndefOr[`true`] = js.undefined
  
  var expert: js.UndefOr[`true`] = js.undefined
  
  var history: js.UndefOr[Any] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[StringOrTranslated] = js.undefined
  
  var read: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var smartName: js.UndefOr[String | langinLanguagesstringsmar] = js.undefined
  
  var states: js.UndefOr[(Record[String, String]) | js.Array[String] | String] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[CommonType] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var workingID: js.UndefOr[String] = js.undefined
  
  var write: js.UndefOr[Boolean] = js.undefined
}
object PartialStateCommon {
  
  inline def apply(): PartialStateCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStateCommon] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: Write): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setCustom(value: Record[String, Any]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDef(value: Any): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    inline def setDefAck(value: Boolean): Self = StObject.set(x, "defAck", value.asInstanceOf[js.Any])
    
    inline def setDefAckUndefined: Self = StObject.set(x, "defAck", js.undefined)
    
    inline def setDefUndefined: Self = StObject.set(x, "def", js.undefined)
    
    inline def setDesc(value: StringOrTranslated): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    inline def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    inline def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    inline def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    inline def setHistory(value: Any): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: StringOrTranslated): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSmartName(value: String | langinLanguagesstringsmar): Self = StObject.set(x, "smartName", value.asInstanceOf[js.Any])
    
    inline def setSmartNameUndefined: Self = StObject.set(x, "smartName", js.undefined)
    
    inline def setStates(value: (Record[String, String]) | js.Array[String] | String): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: String*): Self = StObject.set(x, "states", js.Array(value*))
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setType(value: CommonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setWorkingID(value: String): Self = StObject.set(x, "workingID", value.asInstanceOf[js.Any])
    
    inline def setWorkingIDUndefined: Self = StObject.set(x, "workingID", js.undefined)
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
