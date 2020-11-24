package typings.keepNetworkTbtcJs.ethereumHelpersMod.EthereumHelpers

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContractCall extends js.Object {
  
  def call(params: js.Any): js.Any = js.native
  
  def estimateGas(options: ContractCallOptions): js.Promise[Double] = js.native
  def estimateGas(options: ContractCallOptions, callback: js.Function2[/* err */ Error, /* gas */ Double, Unit]): js.Promise[Double] = js.native
  
  def send(options: ContractCallOptions): js.Promise[_] = js.native
  def send(
    options: ContractCallOptions,
    callback: js.Function2[/* err */ Error, /* transactionHash */ String, Unit]
  ): js.Promise[_] = js.native
}
