package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  def cancel(): Unit
  def getPeer(): String
}

object AnonCancel {
  @scala.inline
  def apply(cancel: () => Unit, getPeer: () => String): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), getPeer = js.Any.fromFunction0(getPeer))
  
    __obj.asInstanceOf[AnonCancel]
  }
}

