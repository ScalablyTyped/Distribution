package typings.materialTooltip.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XPosition extends js.Object
/** Enum for possible tooltip positioning relative to its anchor element. */
@JSImport("@material/tooltip/constants", "XPosition")
@js.native
object XPosition extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XPosition with Double] = js.native
  
  @js.native
  sealed trait CENTER extends XPosition
  /* 2 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  @js.native
  sealed trait DETECTED extends XPosition
  /* 0 */ @js.native
  object DETECTED extends TopLevel[DETECTED with Double]
  
  @js.native
  sealed trait END extends XPosition
  /* 3 */ @js.native
  object END extends TopLevel[END with Double]
  
  @js.native
  sealed trait START extends XPosition
  /* 1 */ @js.native
  object START extends TopLevel[START with Double]
}
