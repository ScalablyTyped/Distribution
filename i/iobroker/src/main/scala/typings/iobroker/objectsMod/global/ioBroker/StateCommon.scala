package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.Write
import typings.iobroker.anon.langinLanguagesstringsmar
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateCommon
  extends StObject
     with ObjectCommon {
  
  /** Configures this state as an alias for another state */
  var alias: js.UndefOr[Write] = js.undefined
  
  /** Custom settings for this state */
  var custom: js.UndefOr[Record[String, Any]] = js.undefined
  
  /** the default value */
  var `def`: js.UndefOr[Any] = js.undefined
  
  /** the default status of the ack flag */
  var defAck: js.UndefOr[Boolean] = js.undefined
  
  /** description of this state */
  var desc: js.UndefOr[StringOrTranslated] = js.undefined
  
  /** attached history information */
  var history: js.UndefOr[Any] = js.undefined
  
  /** maximum value */
  var max: js.UndefOr[Double] = js.undefined
  
  /** minimum value */
  var min: js.UndefOr[Double] = js.undefined
  
  /** if this state is readable */
  var read: Boolean
  
  /** role of the state (used in user interfaces to indicate which widget to choose) */
  @JSName("role")
  var role_StateCommon: String
  
  /**
    * Settings for IOT adapters and how the state should be named in e.g. Alexa.
    * The string "ignore" is a special case, causing the state to be ignored.
    */
  var smartName: js.UndefOr[String | langinLanguagesstringsmar] = js.undefined
  
  /**
    * Dictionary of possible values for this state in the form
    * ```jsonc
    * {
    *     "internal value 1": "displayed value 1",
    *     "internal value 2": "displayed value 2",
    *     // ...
    * }
    * ```
    *
    * or as an array:
    * ```jsonc
    * [ "value 1", "value 2", // ... ]
    * ```
    *
    * In old ioBroker versions, this could also be a string of the form
    * `"val1:text1;val2:text2"` (now deprecated)
    */
  var states: js.UndefOr[(Record[String, String]) | js.Array[String] | String] = js.undefined
  
  /** allowed interval for numeric values */
  var step: js.UndefOr[Double] = js.undefined
  
  /** Type of this state. See https://github.com/ioBroker/ioBroker/blob/master/doc/SCHEMA.md#state-commonrole for a detailed description */
  var `type`: js.UndefOr[CommonType] = js.undefined
  
  /** unit of the value */
  var unit: js.UndefOr[String] = js.undefined
  
  /** ID of a helper state indicating if the handler of this state is working */
  var workingID: js.UndefOr[String] = js.undefined
  
  /** if this state is writable */
  var write: Boolean
}
object StateCommon {
  
  inline def apply(name: StringOrTranslated, read: Boolean, role: String, write: Boolean): StateCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateCommon]
  }
  
  extension [Self <: StateCommon](x: Self) {
    
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
    
    inline def setHistory(value: Any): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
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
  }
}
