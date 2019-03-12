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
    onCommand: Command => scala.Unit,
    onMessage: Message => scala.Unit,
    onNotification: Notification => scala.Unit,
    onSession: Session => scala.Unit,
    remoteNode: java.lang.String,
    sendCommand: Command => scala.Unit,
    sendMessage: Message => scala.Unit,
    sendNotification: Notification => scala.Unit,
    sendSession: Session => scala.Unit,
    sessionId: java.lang.String,
    state: java.lang.String,
    transport: Transport
  ): Channel = {
    val __obj = js.Dynamic.literal(localNode = localNode, onCommand = js.Any.fromFunction1(onCommand), onMessage = js.Any.fromFunction1(onMessage), onNotification = js.Any.fromFunction1(onNotification), onSession = js.Any.fromFunction1(onSession), remoteNode = remoteNode, sendCommand = js.Any.fromFunction1(sendCommand), sendMessage = js.Any.fromFunction1(sendMessage), sendNotification = js.Any.fromFunction1(sendNotification), sendSession = js.Any.fromFunction1(sendSession), sessionId = sessionId, state = state, transport = transport)
  
    __obj.asInstanceOf[Channel]
  }
}

