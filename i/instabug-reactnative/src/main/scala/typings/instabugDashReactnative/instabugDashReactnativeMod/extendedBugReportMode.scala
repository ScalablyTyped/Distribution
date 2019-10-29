package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait extendedBugReportMode extends js.Object

@JSImport("instabug-reactnative", "extendedBugReportMode")
@js.native
object extendedBugReportMode extends js.Object {
  @js.native
  sealed trait disabled extends extendedBugReportMode
  
  @js.native
  sealed trait enabledWithOptionalFields extends extendedBugReportMode
  
  @js.native
  sealed trait enabledWithRequiredFields extends extendedBugReportMode
  
  /* 2 */ val disabled: typings.instabugDashReactnative.instabugDashReactnativeMod.extendedBugReportMode.disabled with Double = js.native
  /* 1 */ val enabledWithOptionalFields: typings.instabugDashReactnative.instabugDashReactnativeMod.extendedBugReportMode.enabledWithOptionalFields with Double = js.native
  /* 0 */ val enabledWithRequiredFields: typings.instabugDashReactnative.instabugDashReactnativeMod.extendedBugReportMode.enabledWithRequiredFields with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[extendedBugReportMode with Double] = js.native
}

