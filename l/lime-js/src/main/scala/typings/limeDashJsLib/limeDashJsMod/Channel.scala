package typings
package limeDashJsLib.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lime-js", "Channel")
@js.native
class Channel protected () extends js.Object {
  def this(transport: Transport, autoReplyPings: scala.Boolean, autoNotifyReceipt: scala.Boolean) = this()
  var localNode: java.lang.String = js.native
  var remoteNode: java.lang.String = js.native
  var sessionId: java.lang.String = js.native
  var state: java.lang.String = js.native
  var transport: Transport = js.native
  def onCommand(command: Command): scala.Unit = js.native
  def onMessage(message: Message): scala.Unit = js.native
  def onNotification(notification: Notification): scala.Unit = js.native
  def onSession(session: Session): scala.Unit = js.native
  def sendCommand(command: Command): scala.Unit = js.native
  def sendMessage(message: Message): scala.Unit = js.native
  def sendNotification(notification: Notification): scala.Unit = js.native
  def sendSession(session: Session): scala.Unit = js.native
}

