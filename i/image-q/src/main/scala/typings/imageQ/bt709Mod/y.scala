package typings.imageQ.bt709Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait y extends js.Object
@JSImport("image-q/dist/constants/bt709", "y")
@js.native
object y extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[y with Double] = js.native
  
  @js.native
  sealed trait BLUE extends y
  /* 0.06 */ @js.native
  object BLUE extends TopLevel[BLUE with Double]
  
  @js.native
  sealed trait GREEN extends y
  /* 0.6 */ @js.native
  object GREEN extends TopLevel[GREEN with Double]
  
  @js.native
  sealed trait RED extends y
  /* 0.33 */ @js.native
  object RED extends TopLevel[RED with Double]
  
  @js.native
  sealed trait WHITE extends y
  /* 0.329 */ @js.native
  object WHITE extends TopLevel[WHITE with Double]
}
