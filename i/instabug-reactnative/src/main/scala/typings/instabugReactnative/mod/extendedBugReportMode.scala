package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait extendedBugReportMode extends js.Object
@JSImport("instabug-reactnative", "extendedBugReportMode")
@js.native
object extendedBugReportMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[extendedBugReportMode with Double] = js.native
  
  @js.native
  sealed trait disabled extends extendedBugReportMode
  /* 2 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  @js.native
  sealed trait enabledWithOptionalFields extends extendedBugReportMode
  /* 1 */ @js.native
  object enabledWithOptionalFields extends TopLevel[enabledWithOptionalFields with Double]
  
  @js.native
  sealed trait enabledWithRequiredFields extends extendedBugReportMode
  /* 0 */ @js.native
  object enabledWithRequiredFields extends TopLevel[enabledWithRequiredFields with Double]
}
