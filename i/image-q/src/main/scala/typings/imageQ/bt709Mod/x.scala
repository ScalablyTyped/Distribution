package typings.imageQ.bt709Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait x extends js.Object
@JSImport("image-q/dist/constants/bt709", "x")
@js.native
object x extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[x with Double] = js.native
  
  @js.native
  sealed trait BLUE extends x
  /* 0.15 */ @js.native
  object BLUE extends TopLevel[BLUE with Double]
  
  @js.native
  sealed trait GREEN extends x
  /* 0.3 */ @js.native
  object GREEN extends TopLevel[GREEN with Double]
  
  @js.native
  sealed trait RED extends x
  /* 0.64 */ @js.native
  object RED extends TopLevel[RED with Double]
  
  @js.native
  sealed trait WHITE extends x
  /* 0.3127 */ @js.native
  object WHITE extends TopLevel[WHITE with Double]
}
