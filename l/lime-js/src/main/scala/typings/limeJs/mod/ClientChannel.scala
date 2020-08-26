package typings.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lime-js", "ClientChannel")
@js.native
class ClientChannel protected () extends Channel {
  def this(transport: Transport) = this()
  def this(transport: Transport, autoReplyPings: Boolean) = this()
  def this(transport: Transport, autoReplyPings: js.UndefOr[scala.Nothing], autoNotifyReceipt: Boolean) = this()
  def this(transport: Transport, autoReplyPings: Boolean, autoNotifyReceipt: Boolean) = this()
  def authenticateSession(identity: String, authentication: Authentication, instance: String): Unit = js.native
  def negotiateSession(sessionCompression: String, sessionEncryption: String): Unit = js.native
  def onSessionAuthenticating(session: Session): Unit = js.native
  def onSessionEstablished(session: Session): Unit = js.native
  def onSessionFailed(session: Session): Unit = js.native
  def onSessionFinished(session: Session): Unit = js.native
  def onSessionNegotiating(session: Session): Unit = js.native
  def sendFinishingSession(): Unit = js.native
  def startNewSession(): Unit = js.native
}

