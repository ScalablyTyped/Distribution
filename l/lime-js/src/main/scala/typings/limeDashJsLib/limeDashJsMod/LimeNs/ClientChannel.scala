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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticateSession")(authenticateSession)
    __obj.updateDynamic("localNode")(localNode)
    __obj.updateDynamic("negotiateSession")(negotiateSession)
    __obj.updateDynamic("onCommand")(onCommand)
    __obj.updateDynamic("onMessage")(onMessage)
    __obj.updateDynamic("onNotification")(onNotification)
    __obj.updateDynamic("onSession")(onSession)
    __obj.updateDynamic("onSessionAuthenticating")(onSessionAuthenticating)
    __obj.updateDynamic("onSessionEstablished")(onSessionEstablished)
    __obj.updateDynamic("onSessionFailed")(onSessionFailed)
    __obj.updateDynamic("onSessionFinished")(onSessionFinished)
    __obj.updateDynamic("onSessionNegotiating")(onSessionNegotiating)
    __obj.updateDynamic("remoteNode")(remoteNode)
    __obj.updateDynamic("sendCommand")(sendCommand)
    __obj.updateDynamic("sendFinishingSession")(sendFinishingSession)
    __obj.updateDynamic("sendMessage")(sendMessage)
    __obj.updateDynamic("sendNotification")(sendNotification)
    __obj.updateDynamic("sendSession")(sendSession)
    __obj.updateDynamic("sessionId")(sessionId)
    __obj.updateDynamic("startNewSession")(startNewSession)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("transport")(transport)
    __obj.asInstanceOf[ClientChannel]
  }
}

