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
  def apply(onSession: js.Function1[Session, js.Any], sendSession: js.Function1[Session, scala.Unit]): ISessionChannel = {
    val __obj = js.Dynamic.literal(onSession = onSession, sendSession = sendSession)
  
    __obj.asInstanceOf[ISessionChannel]
  }
}

