package typings.libraCore.ledgerInfoPbMod.LedgerInfo

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var consensusBlockId: Uint8Array | String = js.native
  
  var consensusDataHash: Uint8Array | String = js.native
  
  var epochNum: String = js.native
  
  var timestampUsecs: String = js.native
  
  var transactionAccumulatorHash: Uint8Array | String = js.native
  
  var version: String = js.native
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
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
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
    def setConsensusBlockId(value: Uint8Array | String): Self = this.set("consensusBlockId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsensusDataHash(value: Uint8Array | String): Self = this.set("consensusDataHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpochNum(value: String): Self = this.set("epochNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUsecs(value: String): Self = this.set("timestampUsecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionAccumulatorHash(value: Uint8Array | String): Self = this.set("transactionAccumulatorHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
