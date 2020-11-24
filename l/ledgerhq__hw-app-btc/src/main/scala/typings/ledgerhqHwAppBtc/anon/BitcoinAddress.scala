package typings.ledgerhqHwAppBtc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitcoinAddress extends js.Object {
  
  var bitcoinAddress: String = js.native
  
  var chainCode: String = js.native
  
  var publicKey: String = js.native
}
object BitcoinAddress {
  
  @scala.inline
  def apply(bitcoinAddress: String, chainCode: String, publicKey: String): BitcoinAddress = {
    val __obj = js.Dynamic.literal(bitcoinAddress = bitcoinAddress.asInstanceOf[js.Any], chainCode = chainCode.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitcoinAddress]
  }
  
  @scala.inline
  implicit class BitcoinAddressOps[Self <: BitcoinAddress] (val x: Self) extends AnyVal {
    
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
    def setBitcoinAddress(value: String): Self = this.set("bitcoinAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainCode(value: String): Self = this.set("chainCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
}
