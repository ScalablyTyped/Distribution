package typings
package heremapsLib.HNs.uiNs.InfoBubbleNs

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
  sealed trait CLOSED
    extends heremapsLib.HNs.uiNs.InfoBubbleNs.State
  
  /** This value represents the state where an info bubble is open and visible (value: 'open'). */
  @js.native
  sealed trait OPEN
    extends heremapsLib.HNs.uiNs.InfoBubbleNs.State
  
  /* 1 */ val CLOSED: CLOSED with scala.Double = js.native
  /* 0 */ val OPEN: OPEN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.uiNs.InfoBubbleNs.State with scala.Double] = js.native
}

