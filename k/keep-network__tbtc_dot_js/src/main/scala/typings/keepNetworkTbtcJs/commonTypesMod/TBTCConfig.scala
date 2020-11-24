package typings.keepNetworkTbtcJs.commonTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.keepNetworkTbtcJs.bitcoinHelpersMod.BitcoinNetworkType
import typings.keepNetworkTbtcJs.electrumClientMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TBTCConfig extends js.Object {
  
  var bitcoinNetwork: BitcoinNetworkType = js.native
  
  var electrum: StringDictionary[Config] = js.native
  
  var web3: Web3 = js.native
}
object TBTCConfig {
  
  @scala.inline
  def apply(bitcoinNetwork: BitcoinNetworkType, electrum: StringDictionary[Config], web3: Web3): TBTCConfig = {
    val __obj = js.Dynamic.literal(bitcoinNetwork = bitcoinNetwork.asInstanceOf[js.Any], electrum = electrum.asInstanceOf[js.Any], web3 = web3.asInstanceOf[js.Any])
    __obj.asInstanceOf[TBTCConfig]
  }
  
  @scala.inline
  implicit class TBTCConfigOps[Self <: TBTCConfig] (val x: Self) extends AnyVal {
    
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
    def setBitcoinNetwork(value: BitcoinNetworkType): Self = this.set("bitcoinNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectrum(value: StringDictionary[Config]): Self = this.set("electrum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb3(value: Web3): Self = this.set("web3", value.asInstanceOf[js.Any])
  }
}
