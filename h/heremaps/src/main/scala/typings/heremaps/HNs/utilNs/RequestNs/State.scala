package typings.heremaps.HNs.utilNs.RequestNs

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
  sealed trait CANCELLED extends State
  
  @js.native
  sealed trait COMPLETE extends State
  
  @js.native
  sealed trait ERROR extends State
  
  @js.native
  sealed trait PENDING extends State
  
  @js.native
  sealed trait PROCESSING extends State
  
  /* 3 */ val CANCELLED: typings.heremaps.HNs.utilNs.RequestNs.State.CANCELLED with Double = js.native
  /* 2 */ val COMPLETE: typings.heremaps.HNs.utilNs.RequestNs.State.COMPLETE with Double = js.native
  /* 4 */ val ERROR: typings.heremaps.HNs.utilNs.RequestNs.State.ERROR with Double = js.native
  /* 0 */ val PENDING: typings.heremaps.HNs.utilNs.RequestNs.State.PENDING with Double = js.native
  /* 1 */ val PROCESSING: typings.heremaps.HNs.utilNs.RequestNs.State.PROCESSING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
}

