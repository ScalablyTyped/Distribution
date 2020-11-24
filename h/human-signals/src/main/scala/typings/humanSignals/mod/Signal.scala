package typings.humanSignals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signal extends js.Object {
  
  /**
    * What is the default action for this signal when it is not handled.
    */
  var action: SignalAction = js.native
  
  /**
    * Human-friendly description for the signal, for example 'User interruption with CTRL-C'.
    */
  var description: String = js.native
  
  /**
    * Whether the signal's default action cannot be prevented. This is true for SIGTERM, SIGKILL and SIGSTOP.
    */
  var forced: Boolean = js.native
  
  /**
    * Standard name of the signal, for example 'SIGINT'.
    */
  var name: String = js.native
  
  /**
    * Code number of the signal, for example 2. While most number are cross-platform, some are different between different OS.
    */
  var number: Double = js.native
  
  /**
    * Which standard defined that signal.
    */
  var standard: SignalStandard = js.native
  
  /**
    * Whether the current OS can handle this signal in Node.js using process.on(name, handler). The list of supported signals is OS-specific.
    */
  var supported: Boolean = js.native
}
object Signal {
  
  @scala.inline
  def apply(
    action: SignalAction,
    description: String,
    forced: Boolean,
    name: String,
    number: Double,
    standard: SignalStandard,
    supported: Boolean
  ): Signal = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], forced = forced.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
  
  @scala.inline
  implicit class SignalOps[Self <: Signal] (val x: Self) extends AnyVal {
    
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
    def setAction(value: SignalAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForced(value: Boolean): Self = this.set("forced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: SignalStandard): Self = this.set("standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
  }
}
