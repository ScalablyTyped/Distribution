package typings.libraCore.transactionInfoPbMod.TransactionInfo

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventRootHash: Uint8Array | String
  var gasUsed: String
  var signedTransactionHash: Uint8Array | String
  var stateRootHash: Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    eventRootHash: Uint8Array | String,
    gasUsed: String,
    signedTransactionHash: Uint8Array | String,
    stateRootHash: Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventRootHash = eventRootHash.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], signedTransactionHash = signedTransactionHash.asInstanceOf[js.Any], stateRootHash = stateRootHash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

