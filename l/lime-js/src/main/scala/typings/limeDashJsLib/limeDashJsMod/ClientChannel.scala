package typings
package limeDashJsLib.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lime-js", "ClientChannel")
@js.native
class ClientChannel protected ()
  extends limeDashJsLib.limeDashJsMod.LimeNs.ClientChannel {
  def this(transport: limeDashJsLib.limeDashJsMod.LimeNs.Transport) = this()
  def this(transport: limeDashJsLib.limeDashJsMod.LimeNs.Transport, autoReplyPings: scala.Boolean) = this()
  def this(transport: limeDashJsLib.limeDashJsMod.LimeNs.Transport, autoReplyPings: scala.Boolean, autoNotifyReceipt: scala.Boolean) = this()
  /* CompleteClass */
  override var localNode: java.lang.String = js.native
  /* CompleteClass */
  override var remoteNode: java.lang.String = js.native
  /* CompleteClass */
  override var sessionId: java.lang.String = js.native
  /* CompleteClass */
  override var state: java.lang.String = js.native
  /* CompleteClass */
  override var transport: limeDashJsLib.limeDashJsMod.LimeNs.Transport = js.native
  /* CompleteClass */
  override def authenticateSession(
    identity: java.lang.String,
    authentication: limeDashJsLib.limeDashJsMod.LimeNs.Authentication,
    instance: java.lang.String
  ): scala.Unit = js.native
  /* CompleteClass */
  override def negotiateSession(sessionCompression: java.lang.String, sessionEncryption: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def onCommand(command: limeDashJsLib.limeDashJsMod.LimeNs.Command): scala.Unit = js.native
  /* CompleteClass */
  override def onMessage(message: limeDashJsLib.limeDashJsMod.LimeNs.Message): scala.Unit = js.native
  /* CompleteClass */
  override def onNotification(notification: limeDashJsLib.limeDashJsMod.LimeNs.Notification): scala.Unit = js.native
  /* CompleteClass */
  override def onSession(session: limeDashJsLib.limeDashJsMod.LimeNs.Session): scala.Unit = js.native
  /* CompleteClass */
  override def onSessionAuthenticating(session: limeDashJsLib.limeDashJsMod.LimeNs.Session): scala.Unit = js.native
  /* CompleteClass */
  override def onSessionEstablished(session: limeDashJsLib.limeDashJsMod.LimeNs.Session): scala.Unit = js.native
  /* CompleteClass */
  override def onSessionFailed(session: limeDashJsLib.limeDashJsMod.LimeNs.Session): scala.Unit = js.native
  /* CompleteClass */
  override def onSessionFinished(session: limeDashJsLib.limeDashJsMod.LimeNs.Session): scala.Unit = js.native
  /* CompleteClass */
  override def onSessionNegotiating(session: limeDashJsLib.limeDashJsMod.LimeNs.Session): scala.Unit = js.native
  /* CompleteClass */
  override def sendCommand(command: limeDashJsLib.limeDashJsMod.LimeNs.Command): scala.Unit = js.native
  /* CompleteClass */
  override def sendFinishingSession(): scala.Unit = js.native
  /* CompleteClass */
  override def sendMessage(message: limeDashJsLib.limeDashJsMod.LimeNs.Message): scala.Unit = js.native
  /* CompleteClass */
  override def sendNotification(notification: limeDashJsLib.limeDashJsMod.LimeNs.Notification): scala.Unit = js.native
  /* CompleteClass */
  override def sendSession(session: limeDashJsLib.limeDashJsMod.LimeNs.Session): scala.Unit = js.native
  /* CompleteClass */
  override def startNewSession(): scala.Unit = js.native
}

