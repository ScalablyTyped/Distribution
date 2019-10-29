package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait reproStepsMode extends js.Object

@JSImport("instabug-reactnative", "reproStepsMode")
@js.native
object reproStepsMode extends js.Object {
  @js.native
  sealed trait disabled extends reproStepsMode
  
  @js.native
  sealed trait enabled extends reproStepsMode
  
  @js.native
  sealed trait enabledWithNoScreenshots extends reproStepsMode
  
  /* 1 */ val disabled: typings.instabugDashReactnative.instabugDashReactnativeMod.reproStepsMode.disabled with Double = js.native
  /* 0 */ val enabled: typings.instabugDashReactnative.instabugDashReactnativeMod.reproStepsMode.enabled with Double = js.native
  /* 2 */ val enabledWithNoScreenshots: typings.instabugDashReactnative.instabugDashReactnativeMod.reproStepsMode.enabledWithNoScreenshots with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reproStepsMode with Double] = js.native
}

