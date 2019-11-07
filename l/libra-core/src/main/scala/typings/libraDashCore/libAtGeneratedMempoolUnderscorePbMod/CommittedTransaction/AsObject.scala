package typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.CommittedTransaction

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
    val __obj = js.Dynamic.literal(isRejected = isRejected, sender = sender.asInstanceOf[js.Any], sequenceNumber = sequenceNumber)
  
    __obj.asInstanceOf[AsObject]
  }
}

