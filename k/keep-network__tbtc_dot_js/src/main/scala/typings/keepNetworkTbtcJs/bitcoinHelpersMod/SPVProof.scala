package typings.keepNetworkTbtcJs.bitcoinHelpersMod

import typings.keepNetworkTbtcJs.bitcoinSPVMod.Proof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SPVProof extends Proof {
  
  var parsedTransaction: ParsedTransaction = js.native
}
object SPVProof {
  
  @scala.inline
  def apply(
    chainHeaders: String,
    merkleProof: String,
    parsedTransaction: ParsedTransaction,
    tx: String,
    txInBlockIndex: String
  ): SPVProof = {
    val __obj = js.Dynamic.literal(chainHeaders = chainHeaders.asInstanceOf[js.Any], merkleProof = merkleProof.asInstanceOf[js.Any], parsedTransaction = parsedTransaction.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], txInBlockIndex = txInBlockIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SPVProof]
  }
  
  @scala.inline
  implicit class SPVProofOps[Self <: SPVProof] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParsedTransaction(value: ParsedTransaction): Self = this.set("parsedTransaction", value.asInstanceOf[js.Any])
  }
}
