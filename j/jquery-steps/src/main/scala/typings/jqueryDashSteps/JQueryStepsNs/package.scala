package typings.jqueryDashSteps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryStepsNs {
  type FunctionOnCancelled = js.Function1[/* event */ String, Unit]
  type FunctionOnContentLoaded = js.Function2[/* event */ String, /* currentIndex */ Double, Unit]
  type FunctionOnFinished = js.Function2[/* event */ String, /* currentIndex */ Double, Unit]
  type FunctionOnFinishing = js.Function2[/* event */ String, /* currentIndex */ Double, Boolean]
  type FunctionOnInit = js.Function2[/* event */ String, /* currentIndex */ Double, Unit]
  type FunctionOnStepChanged = js.Function3[/* event */ String, /* currentIndex */ Double, /* priorIndex */ Double, Unit]
  //#endregion "Label Settings"
  //#region "Callback Functions"
  type FunctionOnStepChanging = js.Function3[/* event */ String, /* currentIndex */ Double, /* newIndex */ Double, Boolean]
}
