package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WSStatus extends js.Object

@JSImport("jsprintmanager", "JSPM.WSStatus")
@js.native
object WSStatus extends js.Object {
  @js.native
  sealed trait BlackListed extends WSStatus
  
  @js.native
  sealed trait Closed extends WSStatus
  
  @js.native
  sealed trait Open extends WSStatus
  
  @js.native
  sealed trait WaitingForUserResponse extends WSStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WSStatus with Double] = js.native
  /* 2 */ @js.native
  object BlackListed extends TopLevel[BlackListed with Double]
  
  /* 1 */ @js.native
  object Closed extends TopLevel[Closed with Double]
  
  /* 0 */ @js.native
  object Open extends TopLevel[Open with Double]
  
  /* 3 */ @js.native
  object WaitingForUserResponse extends TopLevel[WaitingForUserResponse with Double]
  
}

