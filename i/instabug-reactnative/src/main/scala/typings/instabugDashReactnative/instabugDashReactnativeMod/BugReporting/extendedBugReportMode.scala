package typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait extendedBugReportMode extends js.Object

@JSImport("instabug-reactnative", "BugReporting.extendedBugReportMode")
@js.native
object extendedBugReportMode extends js.Object {
  @js.native
  sealed trait disabled
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode
  
  @js.native
  sealed trait enabledWithOptionalFields
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode
  
  @js.native
  sealed trait enabledWithRequiredFields
    extends typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode
  
  /* 2 */ val disabled: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode.disabled with Double = js.native
  /* 1 */ val enabledWithOptionalFields: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode.enabledWithOptionalFields with Double = js.native
  /* 0 */ val enabledWithRequiredFields: typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode.enabledWithRequiredFields with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.instabugDashReactnative.instabugDashReactnativeMod.BugReporting.extendedBugReportMode with Double
  ] = js.native
}

