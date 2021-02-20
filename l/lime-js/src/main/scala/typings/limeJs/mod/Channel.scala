package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lime-js", "Channel")
@js.native
class Channel protected () extends StObject {
  def this(transport: Transport, autoReplyPings: Boolean, autoNotifyReceipt: Boolean) = this()
  
  var localNode: String = js.native
  
  def onCommand(command: Command): Unit = js.native
  
  def onMessage(message: Message): Unit = js.native
  
  def onNotification(notification: Notification): Unit = js.native
  
  def onSession(session: Session): Unit = js.native
  
  var remoteNode: String = js.native
  
  def sendCommand(command: Command): Unit = js.native
  
  def sendMessage(message: Message): Unit = js.native
  
  def sendNotification(notification: Notification): Unit = js.native
  
  def sendSession(session: Session): Unit = js.native
  
  var sessionId: String = js.native
  
  var state: String = js.native
  
  var transport: Transport = js.native
}
