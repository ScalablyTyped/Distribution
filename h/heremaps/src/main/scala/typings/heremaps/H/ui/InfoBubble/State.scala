package typings.heremaps.H.ui.InfoBubble

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.ui.InfoBubble.State.CLOSED
import typings.heremaps.H.ui.InfoBubble.State.OPEN
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
  /* 1 */ @js.native
  object CLOSED extends TopLevel[CLOSED with Double]
  
  /* 0 */ @js.native
  object OPEN extends TopLevel[OPEN with Double]
  
}

