package typings.jsprintmanager.jsprintmanagerMod.JSPM

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
  
  /* 2 */ val BlackListed: typings.jsprintmanager.jsprintmanagerMod.JSPM.WSStatus.BlackListed with Double = js.native
  /* 1 */ val Closed: typings.jsprintmanager.jsprintmanagerMod.JSPM.WSStatus.Closed with Double = js.native
  /* 0 */ val Open: typings.jsprintmanager.jsprintmanagerMod.JSPM.WSStatus.Open with Double = js.native
  /* 3 */ val WaitingForUserResponse: typings.jsprintmanager.jsprintmanagerMod.JSPM.WSStatus.WaitingForUserResponse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WSStatus with Double] = js.native
}

