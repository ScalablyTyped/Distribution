package typings.libraDashCore.libAtGeneratedLedgerUnderscoreInfoUnderscorePbMod.LedgerInfo

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var consensusBlockId: Uint8Array | String
  var consensusDataHash: Uint8Array | String
  var epochNum: String
  var timestampUsecs: String
  var transactionAccumulatorHash: Uint8Array | String
  var version: String
}

object AsObject {
  @scala.inline
  def apply(
    consensusBlockId: Uint8Array | String,
    consensusDataHash: Uint8Array | String,
    epochNum: String,
    timestampUsecs: String,
    transactionAccumulatorHash: Uint8Array | String,
    version: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(consensusBlockId = consensusBlockId.asInstanceOf[js.Any], consensusDataHash = consensusDataHash.asInstanceOf[js.Any], epochNum = epochNum.asInstanceOf[js.Any], timestampUsecs = timestampUsecs.asInstanceOf[js.Any], transactionAccumulatorHash = transactionAccumulatorHash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

