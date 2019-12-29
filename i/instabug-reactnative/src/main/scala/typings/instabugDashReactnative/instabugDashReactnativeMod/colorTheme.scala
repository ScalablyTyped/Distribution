package typings.instabugDashReactnative.instabugDashReactnativeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait colorTheme extends js.Object

@JSImport("instabug-reactnative", "colorTheme")
@js.native
object colorTheme extends js.Object {
  @js.native
  sealed trait dark extends colorTheme
  
  @js.native
  sealed trait light extends colorTheme
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[colorTheme with Double] = js.native
  /* 1 */ @js.native
  object dark extends TopLevel[dark with Double]
  
  /* 0 */ @js.native
  object light extends TopLevel[light with Double]
  
}

