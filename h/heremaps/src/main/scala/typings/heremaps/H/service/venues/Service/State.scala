package typings.heremaps.H.service.venues.Service

import org.scalablytyped.runtime.TopLevel
import typings.heremaps.H.service.venues.Service.State.ERROR
import typings.heremaps.H.service.venues.Service.State.INIT
import typings.heremaps.H.service.venues.Service.State.READY
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
  /* 0 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 1 */ @js.native
  object INIT extends TopLevel[INIT with Double]
  
  /* 2 */ @js.native
  object READY extends TopLevel[READY with Double]
  
}

