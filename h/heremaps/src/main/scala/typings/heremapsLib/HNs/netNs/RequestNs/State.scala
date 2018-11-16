package typings
package heremapsLib.HNs.netNs.RequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

@JSGlobal("H.net.Request.State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait DONE
    extends heremapsLib.HNs.netNs.RequestNs.State
  
  @js.native
  sealed trait OPENED
    extends heremapsLib.HNs.netNs.RequestNs.State
  
  @js.native
  sealed trait UNSENT
    extends heremapsLib.HNs.netNs.RequestNs.State
  
  /* 2 */ val DONE: DONE with scala.Double = js.native
  /* 1 */ val OPENED: OPENED with scala.Double = js.native
  /* 0 */ val UNSENT: UNSENT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.netNs.RequestNs.State with scala.Double] = js.native
}

