package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.Read
import typings.iobroker.anon.langinLanguagesstringsmar
import typings.std.Record
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
  implicit class StateCommonOps[Self <: StateCommon] (val x: Self) extends AnyVal {
    
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
    def setRead(value: Boolean): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: Boolean): Self = this.set("write", value.asInstanceOf[js.Any])
    
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
    def setHistory(value: js.Any): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
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
  }
}
