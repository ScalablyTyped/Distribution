package typings.iotaDotLibDotJs

import typings.iotaDotLibDotJs.iotaDotLibDotJsMod.TransactionObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Received extends js.Object {
  var received: js.Array[TransactionObject]
  var sent: js.Array[TransactionObject]
}

object Anon_Received {
  @scala.inline
  def apply(received: js.Array[TransactionObject], sent: js.Array[TransactionObject]): Anon_Received = {
    val __obj = js.Dynamic.literal(received = received, sent = sent)
  
    __obj.asInstanceOf[Anon_Received]
  }
}

