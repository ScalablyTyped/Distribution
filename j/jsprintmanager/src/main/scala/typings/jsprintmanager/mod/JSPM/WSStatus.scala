package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WSStatus extends js.Object
@JSImport("jsprintmanager", "JSPM.WSStatus")
@js.native
object WSStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WSStatus with Double] = js.native
  
  @js.native
  sealed trait BlackListed extends WSStatus
  /* 2 */ @js.native
  object BlackListed extends TopLevel[BlackListed with Double]
  
  @js.native
  sealed trait Closed extends WSStatus
  /* 1 */ @js.native
  object Closed extends TopLevel[Closed with Double]
  
  @js.native
  sealed trait Open extends WSStatus
  /* 0 */ @js.native
  object Open extends TopLevel[Open with Double]
  
  @js.native
  sealed trait WaitingForUserResponse extends WSStatus
  /* 3 */ @js.native
  object WaitingForUserResponse extends TopLevel[WaitingForUserResponse with Double]
}
