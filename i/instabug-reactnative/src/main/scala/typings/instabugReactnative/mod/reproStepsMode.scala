package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait reproStepsMode extends StObject
@JSImport("instabug-reactnative", "reproStepsMode")
@js.native
object reproStepsMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reproStepsMode & Double] = js.native
  
  @js.native
  sealed trait disabled
    extends StObject
       with reproStepsMode
  /* 1 */ val disabled: typings.instabugReactnative.mod.reproStepsMode.disabled & Double = js.native
  
  @js.native
  sealed trait enabled
    extends StObject
       with reproStepsMode
  /* 0 */ val enabled: typings.instabugReactnative.mod.reproStepsMode.enabled & Double = js.native
  
  @js.native
  sealed trait enabledWithNoScreenshots
    extends StObject
       with reproStepsMode
  /* 2 */ val enabledWithNoScreenshots: typings.instabugReactnative.mod.reproStepsMode.enabledWithNoScreenshots & Double = js.native
}
