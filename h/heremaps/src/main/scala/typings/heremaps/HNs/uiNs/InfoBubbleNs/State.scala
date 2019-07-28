package typings.heremaps.HNs.uiNs.InfoBubbleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

/**
  * This enumeration holds the state an info bubble can have.
  */
@JSGlobal("H.ui.InfoBubble.State")
@js.native
object State extends js.Object {
  /** This value represents the state where an info bubble is closed and invisible (value: 'closed') */
  @js.native
  sealed trait CLOSED extends State
  
  /** This value represents the state where an info bubble is open and visible (value: 'open'). */
  @js.native
  sealed trait OPEN extends State
  
  /* 1 */ val CLOSED: typings.heremaps.HNs.uiNs.InfoBubbleNs.State.CLOSED with Double = js.native
  /* 0 */ val OPEN: typings.heremaps.HNs.uiNs.InfoBubbleNs.State.OPEN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
}

