package typings.imageQ.bt709Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait x extends js.Object

@JSImport("image-q/dist/constants/bt709", "x")
@js.native
object x extends js.Object {
  @js.native
  sealed trait BLUE extends x
  
  @js.native
  sealed trait GREEN extends x
  
  @js.native
  sealed trait RED extends x
  
  @js.native
  sealed trait WHITE extends x
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[x with Double] = js.native
  /* 0.15 */ @js.native
  object BLUE extends TopLevel[BLUE with Double]
  
  /* 0.3 */ @js.native
  object GREEN extends TopLevel[GREEN with Double]
  
  /* 0.64 */ @js.native
  object RED extends TopLevel[RED with Double]
  
  /* 0.3127 */ @js.native
  object WHITE extends TopLevel[WHITE with Double]
  
}

