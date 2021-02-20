package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WSStatus extends StObject
@JSImport("jsprintmanager", "JSPM.WSStatus")
@js.native
object WSStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WSStatus with Double] = js.native
  
  @js.native
  sealed trait BlackListed extends WSStatus
  /* 2 */ val BlackListed: typings.jsprintmanager.mod.JSPM.WSStatus.BlackListed with Double = js.native
  
  @js.native
  sealed trait Closed extends WSStatus
  /* 1 */ val Closed: typings.jsprintmanager.mod.JSPM.WSStatus.Closed with Double = js.native
  
  @js.native
  sealed trait Open extends WSStatus
  /* 0 */ val Open: typings.jsprintmanager.mod.JSPM.WSStatus.Open with Double = js.native
  
  @js.native
  sealed trait WaitingForUserResponse extends WSStatus
  /* 3 */ val WaitingForUserResponse: typings.jsprintmanager.mod.JSPM.WSStatus.WaitingForUserResponse with Double = js.native
}
