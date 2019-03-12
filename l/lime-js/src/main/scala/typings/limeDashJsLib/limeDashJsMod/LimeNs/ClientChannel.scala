package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientChannel extends Channel {
  def authenticateSession(identity: java.lang.String, authentication: Authentication, instance: java.lang.String): scala.Unit
  def negotiateSession(sessionCompression: java.lang.String, sessionEncryption: java.lang.String): scala.Unit
  def onSessionAuthenticating(session: Session): scala.Unit
  def onSessionEstablished(session: Session): scala.Unit
  def onSessionFailed(session: Session): scala.Unit
  def onSessionFinished(session: Session): scala.Unit
  def onSessionNegotiating(session: Session): scala.Unit
  def sendFinishingSession(): scala.Unit
  def startNewSession(): scala.Unit
}

object ClientChannel {
  @scala.inline
  def apply(
    authenticateSession: (java.lang.String, Authentication, java.lang.String) => scala.Unit,
    localNode: java.lang.String,
    negotiateSession: (java.lang.String, java.lang.String) => scala.Unit,
    onCommand: Command => scala.Unit,
    onMessage: Message => scala.Unit,
    onNotification: Notification => scala.Unit,
    onSession: Session => scala.Unit,
    onSessionAuthenticating: Session => scala.Unit,
    onSessionEstablished: Session => scala.Unit,
    onSessionFailed: Session => scala.Unit,
    onSessionFinished: Session => scala.Unit,
    onSessionNegotiating: Session => scala.Unit,
    remoteNode: java.lang.String,
    sendCommand: Command => scala.Unit,
    sendFinishingSession: () => scala.Unit,
    sendMessage: Message => scala.Unit,
    sendNotification: Notification => scala.Unit,
    sendSession: Session => scala.Unit,
    sessionId: java.lang.String,
    startNewSession: () => scala.Unit,
    state: java.lang.String,
    transport: Transport
  ): ClientChannel = {
    val __obj = js.Dynamic.literal(authenticateSession = js.Any.fromFunction3(authenticateSession), localNode = localNode, negotiateSession = js.Any.fromFunction2(negotiateSession), onCommand = js.Any.fromFunction1(onCommand), onMessage = js.Any.fromFunction1(onMessage), onNotification = js.Any.fromFunction1(onNotification), onSession = js.Any.fromFunction1(onSession), onSessionAuthenticating = js.Any.fromFunction1(onSessionAuthenticating), onSessionEstablished = js.Any.fromFunction1(onSessionEstablished), onSessionFailed = js.Any.fromFunction1(onSessionFailed), onSessionFinished = js.Any.fromFunction1(onSessionFinished), onSessionNegotiating = js.Any.fromFunction1(onSessionNegotiating), remoteNode = remoteNode, sendCommand = js.Any.fromFunction1(sendCommand), sendFinishingSession = js.Any.fromFunction0(sendFinishingSession), sendMessage = js.Any.fromFunction1(sendMessage), sendNotification = js.Any.fromFunction1(sendNotification), sendSession = js.Any.fromFunction1(sendSession), sessionId = sessionId, startNewSession = js.Any.fromFunction0(startNewSession), state = state, transport = transport)
  
    __obj.asInstanceOf[ClientChannel]
  }
}

