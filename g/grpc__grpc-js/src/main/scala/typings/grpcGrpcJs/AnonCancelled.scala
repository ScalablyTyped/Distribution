package typings.grpcGrpcJs

import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelled extends js.Object {
  var cancelled: Boolean
  def getPeer(): String
  def sendMetadata(responseMetadata: Metadata): Unit
}

object AnonCancelled {
  @scala.inline
  def apply(cancelled: Boolean, getPeer: () => String, sendMetadata: Metadata => Unit): AnonCancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], getPeer = js.Any.fromFunction0(getPeer), sendMetadata = js.Any.fromFunction1(sendMetadata))
  
    __obj.asInstanceOf[AnonCancelled]
  }
}

