package typings.instabugDashReactnative.instabugDashReactnativeMod

import org.scalablytyped.runtime.TopLevel
import typings.instabugDashReactnative.instabugDashReactnativeMod.reproStepsMode.disabled
import typings.instabugDashReactnative.instabugDashReactnativeMod.reproStepsMode.enabled
import typings.instabugDashReactnative.instabugDashReactnativeMod.reproStepsMode.enabledWithNoScreenshots
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reproStepsMode with Double] = js.native
  /* 1 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 0 */ @js.native
  object enabled extends TopLevel[enabled with Double]
  
  /* 2 */ @js.native
  object enabledWithNoScreenshots extends TopLevel[enabledWithNoScreenshots with Double]
  
}

