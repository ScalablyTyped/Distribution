package typings.javascriptDashStateDashMachine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object javascriptDashStateDashMachineMod {
  import typings.std.Error

  type StateMachineCan = js.Function1[/* evt */ String, Boolean]
  type StateMachineErrorCallback = js.Function7[
    /* eventName */ js.UndefOr[String], 
    /* from */ js.UndefOr[String], 
    /* to */ js.UndefOr[String], 
    /* args */ js.UndefOr[js.Array[js.Any]], 
    /* errorCode */ js.UndefOr[Double], 
    /* errorMessage */ js.UndefOr[String], 
    /* ex */ js.UndefOr[Error], 
    Unit
  ]
  type StateMachineEvent = js.Function1[/* repeated */ js.Any, Unit]
  type StateMachineIs = js.Function1[/* state */ String, Boolean]
  type StateMachineIsFinished = js.Function1[/* state */ String, Boolean]
  type StateMachineTransitions = js.Function0[js.Array[String]]
}
