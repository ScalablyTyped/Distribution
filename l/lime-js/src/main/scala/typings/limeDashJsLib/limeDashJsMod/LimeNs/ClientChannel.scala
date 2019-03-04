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
    authenticateSession: js.Function3[java.lang.String, Authentication, java.lang.String, scala.Unit],
    localNode: java.lang.String,
    negotiateSession: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    onCommand: js.Function1[Command, scala.Unit],
    onMessage: js.Function1[Message, scala.Unit],
    onNotification: js.Function1[Notification, scala.Unit],
    onSession: js.Function1[Session, scala.Unit],
    onSessionAuthenticating: js.Function1[Session, scala.Unit],
    onSessionEstablished: js.Function1[Session, scala.Unit],
    onSessionFailed: js.Function1[Session, scala.Unit],
    onSessionFinished: js.Function1[Session, scala.Unit],
    onSessionNegotiating: js.Function1[Session, scala.Unit],
    remoteNode: java.lang.String,
    sendCommand: js.Function1[Command, scala.Unit],
    sendFinishingSession: js.Function0[scala.Unit],
    sendMessage: js.Function1[Message, scala.Unit],
    sendNotification: js.Function1[Notification, scala.Unit],
    sendSession: js.Function1[Session, scala.Unit],
    sessionId: java.lang.String,
    startNewSession: js.Function0[scala.Unit],
    state: java.lang.String,
    transport: Transport
  ): ClientChannel = {
    val __obj = js.Dynamic.literal(authenticateSession = authenticateSession, localNode = localNode, negotiateSession = negotiateSession, onCommand = onCommand, onMessage = onMessage, onNotification = onNotification, onSession = onSession, onSessionAuthenticating = onSessionAuthenticating, onSessionEstablished = onSessionEstablished, onSessionFailed = onSessionFailed, onSessionFinished = onSessionFinished, onSessionNegotiating = onSessionNegotiating, remoteNode = remoteNode, sendCommand = sendCommand, sendFinishingSession = sendFinishingSession, sendMessage = sendMessage, sendNotification = sendNotification, sendSession = sendSession, sessionId = sessionId, startNewSession = startNewSession, state = state, transport = transport)
  
    __obj.asInstanceOf[ClientChannel]
  }
}

