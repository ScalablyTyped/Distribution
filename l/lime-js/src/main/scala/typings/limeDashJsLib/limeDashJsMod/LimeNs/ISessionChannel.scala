package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionChannel extends js.Object {
  def onSession(session: Session): js.Any
  def sendSession(session: Session): scala.Unit
}

object ISessionChannel {
  @scala.inline
  def apply(onSession: Session => js.Any, sendSession: Session => scala.Unit): ISessionChannel = {
    val __obj = js.Dynamic.literal(onSession = js.Any.fromFunction1(onSession), sendSession = js.Any.fromFunction1(sendSession))
  
    __obj.asInstanceOf[ISessionChannel]
  }
}

