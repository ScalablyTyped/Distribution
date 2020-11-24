package typings.javascriptStateMachine.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateMachineConfig extends js.Object {
  
  var callbacks: js.UndefOr[
    StringDictionary[
      js.Function4[
        /* event */ js.UndefOr[String], 
        /* from */ js.UndefOr[String], 
        /* to */ js.UndefOr[String], 
        /* repeated */ js.Any, 
        _
      ]
    ]
  ] = js.native
  
  var error: js.UndefOr[StateMachineErrorCallback] = js.native
  
   // string or { state: 'foo', event: 'setup', defer: true|false }
  var events: js.UndefOr[js.Array[StateMachineEventDef]] = js.native
  
  var initial: js.UndefOr[js.Any] = js.native
  
  var target: js.UndefOr[StateMachine] = js.native
}
object StateMachineConfig {
  
  @scala.inline
  def apply(): StateMachineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateMachineConfig]
  }
  
  @scala.inline
  implicit class StateMachineConfigOps[Self <: StateMachineConfig] (val x: Self) extends AnyVal {
    
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
    def setCallbacks(
      value: StringDictionary[
          js.Function4[
            /* event */ js.UndefOr[String], 
            /* from */ js.UndefOr[String], 
            /* to */ js.UndefOr[String], 
            /* repeated */ js.Any, 
            _
          ]
        ]
    ): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    
    @scala.inline
    def setError(
      value: (/* eventName */ js.UndefOr[String], /* from */ js.UndefOr[String], /* to */ js.UndefOr[String], /* args */ js.UndefOr[js.Array[js.Any]], /* errorCode */ js.UndefOr[Double], /* errorMessage */ js.UndefOr[String], /* ex */ js.UndefOr[typings.std.Error]) => Unit
    ): Self = this.set("error", js.Any.fromFunction7(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: StateMachineEventDef*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[StateMachineEventDef]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setInitial(value: js.Any): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    
    @scala.inline
    def setTarget(value: StateMachine): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
