package typings
package limeDashJsLib.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lime-js", "ClientChannel")
@js.native
class ClientChannel protected () extends Channel {
  def this(transport: Transport) = this()
  def this(transport: Transport, autoReplyPings: scala.Boolean) = this()
  def this(transport: Transport, autoReplyPings: scala.Boolean, autoNotifyReceipt: scala.Boolean) = this()
  def authenticateSession(identity: java.lang.String, authentication: Authentication, instance: java.lang.String): scala.Unit = js.native
  def negotiateSession(sessionCompression: java.lang.String, sessionEncryption: java.lang.String): scala.Unit = js.native
  def onSessionAuthenticating(session: Session): scala.Unit = js.native
  def onSessionEstablished(session: Session): scala.Unit = js.native
  def onSessionFailed(session: Session): scala.Unit = js.native
  def onSessionFinished(session: Session): scala.Unit = js.native
  def onSessionNegotiating(session: Session): scala.Unit = js.native
  def sendFinishingSession(): scala.Unit = js.native
  def startNewSession(): scala.Unit = js.native
}

