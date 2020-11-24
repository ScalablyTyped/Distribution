package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait reproStepsMode extends js.Object
@JSImport("instabug-reactnative", "reproStepsMode")
@js.native
object reproStepsMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[reproStepsMode with Double] = js.native
  
  @js.native
  sealed trait disabled extends reproStepsMode
  /* 1 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  @js.native
  sealed trait enabled extends reproStepsMode
  /* 0 */ @js.native
  object enabled extends TopLevel[enabled with Double]
  
  @js.native
  sealed trait enabledWithNoScreenshots extends reproStepsMode
  /* 2 */ @js.native
  object enabledWithNoScreenshots extends TopLevel[enabledWithNoScreenshots with Double]
}
