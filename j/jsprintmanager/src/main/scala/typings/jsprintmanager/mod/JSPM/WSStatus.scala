package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WSStatus extends StObject
@JSImport("jsprintmanager", "JSPM.WSStatus")
@js.native
object WSStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WSStatus & Double] = js.native
  
  @js.native
  sealed trait BlackListed
    extends StObject
       with WSStatus
  /* 2 */ val BlackListed: typings.jsprintmanager.mod.JSPM.WSStatus.BlackListed & Double = js.native
  
  @js.native
  sealed trait Closed
    extends StObject
       with WSStatus
  /* 1 */ val Closed: typings.jsprintmanager.mod.JSPM.WSStatus.Closed & Double = js.native
  
  @js.native
  sealed trait Open
    extends StObject
       with WSStatus
  /* 0 */ val Open: typings.jsprintmanager.mod.JSPM.WSStatus.Open & Double = js.native
  
  @js.native
  sealed trait WaitingForUserResponse
    extends StObject
       with WSStatus
  /* 3 */ val WaitingForUserResponse: typings.jsprintmanager.mod.JSPM.WSStatus.WaitingForUserResponse & Double = js.native
}
