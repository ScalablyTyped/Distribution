package typings.imageQ.bt709Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Y_ extends js.Object

@JSImport("image-q/dist/constants/bt709", "Y")
@js.native
object Y_ extends js.Object {
  @js.native
  sealed trait BLUE extends Y_
  
  @js.native
  sealed trait GREEN extends Y_
  
  @js.native
  sealed trait RED extends Y_
  
  @js.native
  sealed trait WHITE extends Y_
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Y_ with Double] = js.native
  /* 0.0722 */ @js.native
  object BLUE extends TopLevel[BLUE with Double]
  
  /* 0.7152 */ @js.native
  object GREEN extends TopLevel[GREEN with Double]
  
  /* 0.2126 */ @js.native
  object RED extends TopLevel[RED with Double]
  
  /* 1 */ @js.native
  object WHITE extends TopLevel[WHITE with Double]
  
}

