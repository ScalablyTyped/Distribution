package typings.javascriptStateMachine.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
  var error: js.UndefOr[StateMachineErrorCallback] = js.undefined
   // string or { state: 'foo', event: 'setup', defer: true|false }
  var events: js.UndefOr[js.Array[StateMachineEventDef]] = js.undefined
  var initial: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[StateMachine] = js.undefined
}

object StateMachineConfig {
  @scala.inline
  def apply(
    callbacks: StringDictionary[
      js.Function4[
        /* event */ js.UndefOr[String], 
        /* from */ js.UndefOr[String], 
        /* to */ js.UndefOr[String], 
        /* repeated */ js.Any, 
        _
      ]
    ] = null,
    error: (/* eventName */ js.UndefOr[String], /* from */ js.UndefOr[String], /* to */ js.UndefOr[String], /* args */ js.UndefOr[js.Array[js.Any]], /* errorCode */ js.UndefOr[Double], /* errorMessage */ js.UndefOr[String], /* ex */ js.UndefOr[typings.std.Error]) => Unit = null,
    events: js.Array[StateMachineEventDef] = null,
    initial: js.Any = null,
    target: StateMachine = null
  ): StateMachineConfig = {
    val __obj = js.Dynamic.literal()
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction7(error))
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMachineConfig]
  }
}

