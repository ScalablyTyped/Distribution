package typings.heremaps.HNs.netNs.RequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

@JSGlobal("H.net.Request.State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait DONE extends State
  
  @js.native
  sealed trait OPENED extends State
  
  @js.native
  sealed trait UNSENT extends State
  
  /* 2 */ val DONE: typings.heremaps.HNs.netNs.RequestNs.State.DONE with Double = js.native
  /* 1 */ val OPENED: typings.heremaps.HNs.netNs.RequestNs.State.OPENED with Double = js.native
  /* 0 */ val UNSENT: typings.heremaps.HNs.netNs.RequestNs.State.UNSENT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
}

