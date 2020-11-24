package typings.keepNetworkTbtcJs.ethereumHelpersMod.EthereumHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.sendSafelyRetryable")
@js.native
object sendSafelyRetryable extends js.Object {
  
  def apply(
    boundContractMethod: ContractCall,
    sendParams: ContractCallOptions,
    forceSend: Boolean,
    totalAttempts: Double
  ): js.Promise[_] = js.native
}
