package typings.limeDashJs.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lime-js", "Channel")
@js.native
class Channel protected () extends js.Object {
  def this(transport: Transport, autoReplyPings: Boolean, autoNotifyReceipt: Boolean) = this()
  var localNode: String = js.native
  var remoteNode: String = js.native
  var sessionId: String = js.native
  var state: String = js.native
  var transport: Transport = js.native
  def onCommand(command: Command): Unit = js.native
  def onMessage(message: Message): Unit = js.native
  def onNotification(notification: Notification): Unit = js.native
  def onSession(session: Session): Unit = js.native
  def sendCommand(command: Command): Unit = js.native
  def sendMessage(message: Message): Unit = js.native
  def sendNotification(notification: Notification): Unit = js.native
  def sendSession(session: Session): Unit = js.native
}

