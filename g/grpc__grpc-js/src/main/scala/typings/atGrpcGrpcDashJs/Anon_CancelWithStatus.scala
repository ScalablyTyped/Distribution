package typings.atGrpcGrpcDashJs

import typings.atGrpcGrpcDashJs.buildSrcCallDashCredentialsMod.CallCredentials
import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.Deadline
import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelWithStatus extends js.Object {
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

object Anon_CancelWithStatus {
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
  ): Anon_CancelWithStatus = {
    val __obj = js.Dynamic.literal(cancelWithStatus = js.Any.fromFunction2(cancelWithStatus), getCredentials = js.Any.fromFunction0(getCredentials), getDeadline = js.Any.fromFunction0(getDeadline), getHost = js.Any.fromFunction0(getHost), getMethod = js.Any.fromFunction0(getMethod), getPeer = js.Any.fromFunction0(getPeer), getStatus = js.Any.fromFunction0(getStatus), sendMetadata = js.Any.fromFunction1(sendMetadata), setCredentials = js.Any.fromFunction1(setCredentials))
  
    __obj.asInstanceOf[Anon_CancelWithStatus]
  }
}

