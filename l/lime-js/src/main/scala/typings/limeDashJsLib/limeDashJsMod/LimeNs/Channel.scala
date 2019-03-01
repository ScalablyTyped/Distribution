package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var localNode: java.lang.String
  var remoteNode: java.lang.String
  var sessionId: java.lang.String
  var state: java.lang.String
  var transport: Transport
  def onCommand(command: Command): scala.Unit
  def onMessage(message: Message): scala.Unit
  def onNotification(notification: Notification): scala.Unit
  def onSession(session: Session): scala.Unit
  def sendCommand(command: Command): scala.Unit
  def sendMessage(message: Message): scala.Unit
  def sendNotification(notification: Notification): scala.Unit
  def sendSession(session: Session): scala.Unit
}

object Channel {
  @scala.inline
  def apply(
    localNode: java.lang.String,
    onCommand: js.Function1[Command, scala.Unit],
    onMessage: js.Function1[Message, scala.Unit],
    onNotification: js.Function1[Notification, scala.Unit],
    onSession: js.Function1[Session, scala.Unit],
    remoteNode: java.lang.String,
    sendCommand: js.Function1[Command, scala.Unit],
    sendMessage: js.Function1[Message, scala.Unit],
    sendNotification: js.Function1[Notification, scala.Unit],
    sendSession: js.Function1[Session, scala.Unit],
    sessionId: java.lang.String,
    state: java.lang.String,
    transport: Transport
  ): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localNode")(localNode)
    __obj.updateDynamic("onCommand")(onCommand)
    __obj.updateDynamic("onMessage")(onMessage)
    __obj.updateDynamic("onNotification")(onNotification)
    __obj.updateDynamic("onSession")(onSession)
    __obj.updateDynamic("remoteNode")(remoteNode)
    __obj.updateDynamic("sendCommand")(sendCommand)
    __obj.updateDynamic("sendMessage")(sendMessage)
    __obj.updateDynamic("sendNotification")(sendNotification)
    __obj.updateDynamic("sendSession")(sendSession)
    __obj.updateDynamic("sessionId")(sessionId)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[Channel]
  }
}

