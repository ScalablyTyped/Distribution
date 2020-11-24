package typings.keepNetworkTbtcJs.bitcoinSPVMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keep-network/tbtc.js/src/lib/BitcoinSPV", "BitcoinSPV")
@js.native
class BitcoinSPV protected () extends js.Object {
  def this(electrumClient: js.Any) = this()
  
  var client: js.Any = js.native
  
  def getTransactionProof(txHash: String, confirmations: Double): Proof = js.native
  
  def verifyMerkleProof(proofHex: String, txHash: String, index: Double, blockHeight: Double): Boolean = js.native
}
