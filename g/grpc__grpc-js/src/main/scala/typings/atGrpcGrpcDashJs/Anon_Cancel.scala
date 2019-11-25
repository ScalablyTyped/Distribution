package typings.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  def cancel(): Unit
  def getPeer(): String
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: () => Unit, getPeer: () => String): Anon_Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), getPeer = js.Any.fromFunction0(getPeer))
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

