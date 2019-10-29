package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait floatingButtonEdge extends js.Object

@JSImport("instabug-reactnative", "floatingButtonEdge")
@js.native
object floatingButtonEdge extends js.Object {
  @js.native
  sealed trait left extends floatingButtonEdge
  
  @js.native
  sealed trait right extends floatingButtonEdge
  
  /* 0 */ val left: typings.instabugDashReactnative.instabugDashReactnativeMod.floatingButtonEdge.left with Double = js.native
  /* 1 */ val right: typings.instabugDashReactnative.instabugDashReactnativeMod.floatingButtonEdge.right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[floatingButtonEdge with Double] = js.native
}

