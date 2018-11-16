package typings
package javascriptDashStateDashMachineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object javascriptDashStateDashMachineMod {
  type StateMachineCan = js.Function1[/* evt */ java.lang.String, scala.Boolean]
  type StateMachineErrorCallback = js.Function7[
    /* eventName */ js.UndefOr[java.lang.String], 
    /* from */ js.UndefOr[java.lang.String], 
    /* to */ js.UndefOr[java.lang.String], 
    /* args */ js.UndefOr[js.Array[js.Any]], 
    /* errorCode */ js.UndefOr[scala.Double], 
    /* errorMessage */ js.UndefOr[java.lang.String], 
    /* ex */ js.UndefOr[stdLib.Error], 
    scala.Unit
  ]
  type StateMachineEvent = js.Function1[/* repeated */js.Any, scala.Unit]
  type StateMachineIs = js.Function1[/* state */ java.lang.String, scala.Boolean]
  type StateMachineIsFinished = js.Function1[/* state */ java.lang.String, scala.Boolean]
  type StateMachineTransitions = js.Function0[js.Array[java.lang.String]]
}
