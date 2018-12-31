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

