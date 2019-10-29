package typings.instabugDashReactnative.instabugDashReactnativeMod

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
  
  /* 1 */ val dark: typings.instabugDashReactnative.instabugDashReactnativeMod.colorTheme.dark with Double = js.native
  /* 0 */ val light: typings.instabugDashReactnative.instabugDashReactnativeMod.colorTheme.light with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[colorTheme with Double] = js.native
}

