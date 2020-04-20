package typings.iotaLibJs

import typings.iotaLibJs.mod.TransactionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReceived extends js.Object {
  var received: js.Array[TransactionObject]
  var sent: js.Array[TransactionObject]
}

object AnonReceived {
  @scala.inline
  def apply(received: js.Array[TransactionObject], sent: js.Array[TransactionObject]): AnonReceived = {
    val __obj = js.Dynamic.literal(received = received.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReceived]
  }
}

