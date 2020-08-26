package typings.imageQ.bt709Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait y extends js.Object

@JSImport("image-q/dist/constants/bt709", "y")
@js.native
object y extends js.Object {
  @js.native
  sealed trait BLUE extends y
  
  @js.native
  sealed trait GREEN extends y
  
  @js.native
  sealed trait RED extends y
  
  @js.native
  sealed trait WHITE extends y
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[y with Double] = js.native
  /* 0.06 */ @js.native
  object BLUE extends TopLevel[BLUE with Double]
  
  /* 0.6 */ @js.native
  object GREEN extends TopLevel[GREEN with Double]
  
  /* 0.33 */ @js.native
  object RED extends TopLevel[RED with Double]
  
  /* 0.329 */ @js.native
  object WHITE extends TopLevel[WHITE with Double]
  
}

