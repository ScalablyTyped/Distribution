package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait welcomeMessageMode extends js.Object

@JSImport("instabug-reactnative", "welcomeMessageMode")
@js.native
object welcomeMessageMode extends js.Object {
  @js.native
  sealed trait beta extends welcomeMessageMode
  
  @js.native
  sealed trait disabled extends welcomeMessageMode
  
  @js.native
  sealed trait live extends welcomeMessageMode
  
  /* 1 */ val beta: typings.instabugDashReactnative.instabugDashReactnativeMod.welcomeMessageMode.beta with Double = js.native
  /* 2 */ val disabled: typings.instabugDashReactnative.instabugDashReactnativeMod.welcomeMessageMode.disabled with Double = js.native
  /* 0 */ val live: typings.instabugDashReactnative.instabugDashReactnativeMod.welcomeMessageMode.live with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[welcomeMessageMode with Double] = js.native
}

