package typings.keepNetworkTbtcJs.bitcoinSPVMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proof extends js.Object {
  
  var chainHeaders: String = js.native
  
  var merkleProof: String = js.native
  
  var tx: String = js.native
  
  var txInBlockIndex: String = js.native
}
object Proof {
  
  @scala.inline
  def apply(chainHeaders: String, merkleProof: String, tx: String, txInBlockIndex: String): Proof = {
    val __obj = js.Dynamic.literal(chainHeaders = chainHeaders.asInstanceOf[js.Any], merkleProof = merkleProof.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], txInBlockIndex = txInBlockIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proof]
  }
  
  @scala.inline
  implicit class ProofOps[Self <: Proof] (val x: Self) extends AnyVal {
    
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
    def setChainHeaders(value: String): Self = this.set("chainHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerkleProof(value: String): Self = this.set("merkleProof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx(value: String): Self = this.set("tx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxInBlockIndex(value: String): Self = this.set("txInBlockIndex", value.asInstanceOf[js.Any])
  }
}
