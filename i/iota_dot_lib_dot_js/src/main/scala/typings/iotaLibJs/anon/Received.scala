package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.TransactionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Received extends js.Object {
  var received: js.Array[TransactionObject]
  var sent: js.Array[TransactionObject]
}

object Received {
  @scala.inline
  def apply(received: js.Array[TransactionObject], sent: js.Array[TransactionObject]): Received = {
    val __obj = js.Dynamic.literal(received = received.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Received]
  }
}

