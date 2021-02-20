package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.Read
import typings.iobroker.anon.langinLanguagesstringsmar
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateCommon extends ObjectCommon {
  
  /** Configures this state as an alias for another state */
  var alias: js.UndefOr[Read] = js.native
  
  /** Custom settings for this state */
  var custom: js.UndefOr[Record[String, _]] = js.native
  
  /** the default value */
  var `def`: js.UndefOr[js.Any] = js.native
  
  /** the default status of the ack flag */
  var defAck: js.UndefOr[Boolean] = js.native
  
  /** description of this state */
  var desc: js.UndefOr[StringOrTranslated] = js.native
  
  /** attached history information */
  var history: js.UndefOr[js.Any] = js.native
  
  /** maximum value */
  var max: js.UndefOr[Double] = js.native
  
  /** minimum value */
  var min: js.UndefOr[Double] = js.native
  
  /** if this state is readable */
  var read: Boolean = js.native
  
  /** role of the state (used in user interfaces to indicate which widget to choose) */
  @JSName("role")
  var role_StateCommon: String = js.native
  
  /**
    * Settings for IOT adapters and how the state should be named in e.g. Alexa.
    * The string "ignore" is a special case, causing the state to be ignored.
    */
  var smartName: js.UndefOr[String | langinLanguagesstringsmar] = js.native
  
  /**
    * Dictionary of possible values for this state in the form
    * <pre>
    * {
    *     "internal value 1": "displayed value 1",
    *     "internal value 2": "displayed value 2",
    *     ...
    * }
    * </pre>
    * In old ioBroker versions, this could also be a string of the form
    * "val1:text1;val2:text2" (now deprecated)
    */
  var states: js.UndefOr[(Record[String, String]) | String] = js.native
  
  /** allowed interval for numeric values */
  var step: js.UndefOr[Double] = js.native
  
  /** Type of this state. See https://github.com/ioBroker/ioBroker/blob/master/doc/SCHEMA.md#state-commonrole for a detailed description */
  var `type`: js.UndefOr[CommonType] = js.native
  
  /** unit of the value */
  var unit: js.UndefOr[String] = js.native
  
  /** ID of a helper state indicating if the handler of this state is working */
  var workingID: js.UndefOr[String] = js.native
  
  /** if this state is writable */
  var write: Boolean = js.native
}
object StateCommon {
  
  @scala.inline
  def apply(name: StringOrTranslated, read: Boolean, role: String, write: Boolean): StateCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateCommon]
  }
  
  @scala.inline
  implicit class StateCommonMutableBuilder[Self <: StateCommon] (val x: Self) extends AnyVal {
    
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
    def setHistory(value: js.Any): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
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
  }
}
