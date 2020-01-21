package typings.grpcGrpcJs

import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.grpcGrpcJs.callStreamMod.Deadline
import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelWithStatus extends js.Object {
  def cancelWithStatus(status: Status, details: String): Unit
  def getCredentials(): CallCredentials
  def getDeadline(): Deadline
  def getHost(): String
  def getMethod(): String
  def getPeer(): String
  def getStatus(): StatusObject | Null
  def sendMetadata(metadata: Metadata): Unit
  def setCredentials(credentials: CallCredentials): Unit
}

object AnonCancelWithStatus {
  @scala.inline
  def apply(
    cancelWithStatus: (Status, String) => Unit,
    getCredentials: () => CallCredentials,
    getDeadline: () => Deadline,
    getHost: () => String,
    getMethod: () => String,
    getPeer: () => String,
    getStatus: () => StatusObject | Null,
    sendMetadata: Metadata => Unit,
    setCredentials: CallCredentials => Unit
  ): AnonCancelWithStatus = {
    val __obj = js.Dynamic.literal(cancelWithStatus = js.Any.fromFunction2(cancelWithStatus), getCredentials = js.Any.fromFunction0(getCredentials), getDeadline = js.Any.fromFunction0(getDeadline), getHost = js.Any.fromFunction0(getHost), getMethod = js.Any.fromFunction0(getMethod), getPeer = js.Any.fromFunction0(getPeer), getStatus = js.Any.fromFunction0(getStatus), sendMetadata = js.Any.fromFunction1(sendMetadata), setCredentials = js.Any.fromFunction1(setCredentials))
  
    __obj.asInstanceOf[AnonCancelWithStatus]
  }
}

