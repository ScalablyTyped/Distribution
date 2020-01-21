package typings.libraCore.mempoolPbMod.CommittedTransaction

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var isRejected: Boolean
  var sender: Uint8Array | String
  var sequenceNumber: String
}

object AsObject {
  @scala.inline
  def apply(isRejected: Boolean, sender: Uint8Array | String, sequenceNumber: String): AsObject = {
    val __obj = js.Dynamic.literal(isRejected = isRejected.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

