package typings.keepNetworkTbtcJs.bitcoinHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedTransaction extends js.Object {
  
  var locktime: String = js.native
  
  var txInVector: String = js.native
  
  var txOutVector: String = js.native
  
  var version: String = js.native
}
object ParsedTransaction {
  
  @scala.inline
  def apply(locktime: String, txInVector: String, txOutVector: String, version: String): ParsedTransaction = {
    val __obj = js.Dynamic.literal(locktime = locktime.asInstanceOf[js.Any], txInVector = txInVector.asInstanceOf[js.Any], txOutVector = txOutVector.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTransaction]
  }
  
  @scala.inline
  implicit class ParsedTransactionOps[Self <: ParsedTransaction] (val x: Self) extends AnyVal {
    
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
    def setLocktime(value: String): Self = this.set("locktime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxInVector(value: String): Self = this.set("txInVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxOutVector(value: String): Self = this.set("txOutVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
