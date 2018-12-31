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

