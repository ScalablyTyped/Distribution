package typings.grpcGrpcJs.clientInterceptorsMod

import typings.grpcGrpcJs.anon.PartialInterceptingListen
import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.grpcGrpcJs.callStreamMod.MessageContext
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterceptingCallInterface extends js.Object {
  def cancelWithStatus(status: Status, details: String): Unit = js.native
  def getPeer(): String = js.native
  def halfClose(): Unit = js.native
  def sendMessage(message: js.Any): Unit = js.native
  def sendMessageWithContext(context: MessageContext, message: js.Any): Unit = js.native
  def setCredentials(credentials: CallCredentials): Unit = js.native
  def start(metadata: Metadata): Unit = js.native
  def start(metadata: Metadata, listener: PartialInterceptingListen): Unit = js.native
  def startRead(): Unit = js.native
}

