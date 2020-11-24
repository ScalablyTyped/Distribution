package typings.heremaps.H.ui.InfoBubble

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
