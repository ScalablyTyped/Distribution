package typings.atGrpcGrpcDashJs

import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancelled extends js.Object {
  var cancelled: Boolean
  def getPeer(): String
  def sendMetadata(responseMetadata: Metadata): Unit
}

object Anon_Cancelled {
  @scala.inline
  def apply(cancelled: Boolean, getPeer: () => String, sendMetadata: Metadata => Unit): Anon_Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], getPeer = js.Any.fromFunction0(getPeer), sendMetadata = js.Any.fromFunction1(sendMetadata))
  
    __obj.asInstanceOf[Anon_Cancelled]
  }
}

