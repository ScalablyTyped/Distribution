package typings.instabugDashReactnative.instabugDashReactnativeMod

import org.scalablytyped.runtime.TopLevel
import typings.instabugDashReactnative.instabugDashReactnativeMod.extendedBugReportMode.disabled
import typings.instabugDashReactnative.instabugDashReactnativeMod.extendedBugReportMode.enabledWithOptionalFields
import typings.instabugDashReactnative.instabugDashReactnativeMod.extendedBugReportMode.enabledWithRequiredFields
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[extendedBugReportMode with Double] = js.native
  /* 2 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 1 */ @js.native
  object enabledWithOptionalFields extends TopLevel[enabledWithOptionalFields with Double]
  
  /* 0 */ @js.native
  object enabledWithRequiredFields extends TopLevel[enabledWithRequiredFields with Double]
  
}

