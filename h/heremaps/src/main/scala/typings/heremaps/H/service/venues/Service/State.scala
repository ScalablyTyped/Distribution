package typings.heremaps.H.service.venues.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

/**
  * The state types of the H.service.venues.Service. Possible states are:
  */
@JSGlobal("H.service.venues.Service.State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait ERROR extends State
  
  @js.native
  sealed trait INIT extends State
  
  @js.native
  sealed trait READY extends State
  
  /* 0 */ val ERROR: typings.heremaps.H.service.venues.Service.State.ERROR with Double = js.native
  /* 1 */ val INIT: typings.heremaps.H.service.venues.Service.State.INIT with Double = js.native
  /* 2 */ val READY: typings.heremaps.H.service.venues.Service.State.READY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
}

