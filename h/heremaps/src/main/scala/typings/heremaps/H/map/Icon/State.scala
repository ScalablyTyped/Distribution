package typings.heremaps.H.map.Icon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

/**
  * The state types of an Icon
  */
@JSGlobal("H.map.Icon.State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait ERROR extends State
  
  @js.native
  sealed trait LOADING extends State
  
  @js.native
  sealed trait READY extends State
  
  /* 0 */ val ERROR: typings.heremaps.H.map.Icon.State.ERROR with Double = js.native
  /* 1 */ val LOADING: typings.heremaps.H.map.Icon.State.LOADING with Double = js.native
  /* 2 */ val READY: typings.heremaps.H.map.Icon.State.READY with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
}

