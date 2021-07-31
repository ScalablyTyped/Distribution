package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait extendedBugReportMode extends StObject
@JSImport("instabug-reactnative", "extendedBugReportMode")
@js.native
object extendedBugReportMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[extendedBugReportMode & Double] = js.native
  
  @js.native
  sealed trait disabled
    extends StObject
       with extendedBugReportMode
  /* 2 */ val disabled: typings.instabugReactnative.mod.extendedBugReportMode.disabled & Double = js.native
  
  @js.native
  sealed trait enabledWithOptionalFields
    extends StObject
       with extendedBugReportMode
  /* 1 */ val enabledWithOptionalFields: typings.instabugReactnative.mod.extendedBugReportMode.enabledWithOptionalFields & Double = js.native
  
  @js.native
  sealed trait enabledWithRequiredFields
    extends StObject
       with extendedBugReportMode
  /* 0 */ val enabledWithRequiredFields: typings.instabugReactnative.mod.extendedBugReportMode.enabledWithRequiredFields & Double = js.native
}
