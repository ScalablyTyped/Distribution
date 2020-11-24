package typings.keepNetworkTbtcJs.depositMod

import typings.keepNetworkTbtcJs.commonTypesMod.Contract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keep-network/tbtc.js/src/Deposit", JSImport.Default)
@js.native
class default protected () extends Deposit {
  def this(factory: DepositFactory, depositContract: Contract, keepContract: Contract) = this()
}
/* static members */
@JSImport("@keep-network/tbtc.js/src/Deposit", JSImport.Default)
@js.native
object default extends js.Object {
  
  def forAddress(factory: DepositFactory, address: String): js.Promise[Deposit] = js.native
  
  def forLotSize(
    factory: DepositFactory,
    satoshiLotSize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): js.Promise[Deposit] = js.native
}
