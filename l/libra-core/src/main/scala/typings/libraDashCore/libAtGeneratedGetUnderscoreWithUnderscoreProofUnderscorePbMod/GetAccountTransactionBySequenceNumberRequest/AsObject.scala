package typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountTransactionBySequenceNumberRequest

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var account: Uint8Array | String
  var fetchEvents: Boolean
  var sequenceNumber: String
}

object AsObject {
  @scala.inline
  def apply(account: Uint8Array | String, fetchEvents: Boolean, sequenceNumber: String): AsObject = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], fetchEvents = fetchEvents.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

