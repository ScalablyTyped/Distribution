package typings.keepNetworkTbtcJs.depositMod

import typings.keepNetworkTbtcJs.anon.ACTIVE
import typings.keepNetworkTbtcJs.anon.DepositAddress
import typings.keepNetworkTbtcJs.commonTypesMod.Contract
import typings.keepNetworkTbtcJs.commonTypesMod.TBTCConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keep-network/tbtc.js/src/Deposit", "DepositFactory")
@js.native
class DepositFactory protected () extends js.Object {
  def this(config: TBTCConfig) = this()
  
  var State: ACTIVE = js.native
  
  def availableSatoshiLotSizes(): js.Promise[_] = js.native
  
  var config: TBTCConfig = js.native
  
  var constantsContract: Contract = js.native
  
  def createNewDepositContract(
    lotSize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): js.Promise[DepositAddress] = js.native
  
  var depositContract: Contract = js.native
  
  var depositFactoryContract: Contract = js.native
  
  var depositLogContract: Contract = js.native
  
  var depositTokenContract: Contract = js.native
  
  var feeRebateTokenContract: Contract = js.native
  
  var fundingScriptContract: Contract = js.native
  
  def resolveContracts(): js.Promise[Unit] = js.native
  
  var systemContract: Contract = js.native
  
  var tokenContract: Contract = js.native
  
  var vendingMachineContract: Contract = js.native
  
  def withAddress(depositAddress: String): js.Promise[Deposit] = js.native
  
  def withSatoshiLotSize(
    satoshiLotSize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): js.Promise[Deposit] = js.native
}
/* static members */
@JSImport("@keep-network/tbtc.js/src/Deposit", "DepositFactory")
@js.native
object DepositFactory extends js.Object {
  
  def withConfig(config: TBTCConfig): js.Promise[DepositFactory] = js.native
}
