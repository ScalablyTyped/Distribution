package typings
package heremapsLib.HNs.utilNs.RequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

/**
  * The supported states of an request
  */
@JSGlobal("H.util.Request.State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait CANCELLED
    extends heremapsLib.HNs.utilNs.RequestNs.State
  
  @js.native
  sealed trait COMPLETE
    extends heremapsLib.HNs.utilNs.RequestNs.State
  
  @js.native
  sealed trait ERROR
    extends heremapsLib.HNs.utilNs.RequestNs.State
  
  @js.native
  sealed trait PENDING
    extends heremapsLib.HNs.utilNs.RequestNs.State
  
  @js.native
  sealed trait PROCESSING
    extends heremapsLib.HNs.utilNs.RequestNs.State
  
  /* 3 */ val CANCELLED: CANCELLED with scala.Double = js.native
  /* 2 */ val COMPLETE: COMPLETE with scala.Double = js.native
  /* 4 */ val ERROR: ERROR with scala.Double = js.native
  /* 0 */ val PENDING: PENDING with scala.Double = js.native
  /* 1 */ val PROCESSING: PROCESSING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.utilNs.RequestNs.State with scala.Double] = js.native
}

