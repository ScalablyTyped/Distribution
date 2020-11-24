package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait YPosition extends js.Object
@JSImport("@material/tooltip/constants", "YPosition")
@js.native
object YPosition extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[YPosition with Double] = js.native
  
  @js.native
  sealed trait ABOVE extends YPosition
  /* 1 */ @js.native
  object ABOVE extends TopLevel[ABOVE with Double]
  
  @js.native
  sealed trait BELOW extends YPosition
  /* 2 */ @js.native
  object BELOW extends TopLevel[BELOW with Double]
  
  @js.native
  sealed trait DETECTED extends YPosition
  /* 0 */ @js.native
  object DETECTED extends TopLevel[DETECTED with Double]
}
