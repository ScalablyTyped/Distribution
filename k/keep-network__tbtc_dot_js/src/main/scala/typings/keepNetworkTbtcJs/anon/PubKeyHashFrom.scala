package typings.keepNetworkTbtcJs.anon

import typings.keepNetworkTbtcJs.bitcoinHelpersMod.BitcoinNetworkType
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PubKeyHashFrom extends js.Object {
  
  def pubKeyHashFrom(address: String): Buffer | Null = js.native
  
  def pubKeyHashToBech32(pubKeyHash: String, network: BitcoinNetworkType): String = js.native
  
  def publicKeyPointToP2WPKHAddress(publicKeyX: String, publicKeyY: String, bitcoinNetwork: BitcoinNetworkType): String = js.native
  
  def publicKeyToP2WPKHAddress(publicKeyString: String, network: BitcoinNetworkType): String = js.native
  
  def toRawScript(address: String): Buffer = js.native
  
  def toScript(address: String): String = js.native
}
object PubKeyHashFrom {
  
  @scala.inline
  def apply(
    pubKeyHashFrom: String => Buffer | Null,
    pubKeyHashToBech32: (String, BitcoinNetworkType) => String,
    publicKeyPointToP2WPKHAddress: (String, String, BitcoinNetworkType) => String,
    publicKeyToP2WPKHAddress: (String, BitcoinNetworkType) => String,
    toRawScript: String => Buffer,
    toScript: String => String
  ): PubKeyHashFrom = {
    val __obj = js.Dynamic.literal(pubKeyHashFrom = js.Any.fromFunction1(pubKeyHashFrom), pubKeyHashToBech32 = js.Any.fromFunction2(pubKeyHashToBech32), publicKeyPointToP2WPKHAddress = js.Any.fromFunction3(publicKeyPointToP2WPKHAddress), publicKeyToP2WPKHAddress = js.Any.fromFunction2(publicKeyToP2WPKHAddress), toRawScript = js.Any.fromFunction1(toRawScript), toScript = js.Any.fromFunction1(toScript))
    __obj.asInstanceOf[PubKeyHashFrom]
  }
  
  @scala.inline
  implicit class PubKeyHashFromOps[Self <: PubKeyHashFrom] (val x: Self) extends AnyVal {
    
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
    def setPubKeyHashFrom(value: String => Buffer | Null): Self = this.set("pubKeyHashFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPubKeyHashToBech32(value: (String, BitcoinNetworkType) => String): Self = this.set("pubKeyHashToBech32", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPublicKeyPointToP2WPKHAddress(value: (String, String, BitcoinNetworkType) => String): Self = this.set("publicKeyPointToP2WPKHAddress", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPublicKeyToP2WPKHAddress(value: (String, BitcoinNetworkType) => String): Self = this.set("publicKeyToP2WPKHAddress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToRawScript(value: String => Buffer): Self = this.set("toRawScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToScript(value: String => String): Self = this.set("toScript", js.Any.fromFunction1(value))
  }
}
