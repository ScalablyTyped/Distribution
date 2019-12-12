package typings.heremaps.H.map.Icon

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.map.Icon.State.ERROR
import typings.heremaps.H.map.Icon.State.LOADING
import typings.heremaps.H.map.Icon.State.READY
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
  /* 0 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 1 */ @js.native
  object LOADING extends TopLevel[LOADING with Double]
  
  /* 2 */ @js.native
  object READY extends TopLevel[READY with Double]
  
}

