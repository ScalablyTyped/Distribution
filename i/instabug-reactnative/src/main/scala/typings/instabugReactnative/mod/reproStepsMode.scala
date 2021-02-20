package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait reproStepsMode extends StObject
@JSImport("instabug-reactnative", "reproStepsMode")
@js.native
object reproStepsMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reproStepsMode with Double] = js.native
  
  @js.native
  sealed trait disabled extends reproStepsMode
  /* 1 */ val disabled: typings.instabugReactnative.mod.reproStepsMode.disabled with Double = js.native
  
  @js.native
  sealed trait enabled extends reproStepsMode
  /* 0 */ val enabled: typings.instabugReactnative.mod.reproStepsMode.enabled with Double = js.native
  
  @js.native
  sealed trait enabledWithNoScreenshots extends reproStepsMode
  /* 2 */ val enabledWithNoScreenshots: typings.instabugReactnative.mod.reproStepsMode.enabledWithNoScreenshots with Double = js.native
}
