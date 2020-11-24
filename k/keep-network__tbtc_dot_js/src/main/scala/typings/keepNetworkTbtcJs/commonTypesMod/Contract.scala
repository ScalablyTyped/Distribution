package typings.keepNetworkTbtcJs.commonTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@keep-network/tbtc.js/src/CommonTypes", "Contract")
@js.native
class Contract protected () extends js.Object {
  def this(provider: js.Any, abi: js.Array[AbiItem]) = this()
  def this(provider: js.Any, abi: js.Array[AbiItem], address: String) = this()
  def this(provider: js.Any, abi: js.Array[AbiItem], address: js.UndefOr[scala.Nothing], options: js.Any) = this()
  def this(provider: js.Any, abi: js.Array[AbiItem], address: String, options: js.Any) = this()
  
  var _address: String = js.native
  
  var _jsonInterface: js.Array[AbiItem] = js.native
  
  var defaultAccount: String | Null = js.native
  
  var defaultBlock: String | Double = js.native
  
  var defaultChain: js.Any = js.native
  
  var defaultCommon: js.Any = js.native
  
  var defaultHardfork: js.Any = js.native
  
  var events: js.Any = js.native
  
  def getPastEvents(event: String): js.Promise[js.Array[_]] = js.native
  
  var methods: js.Any = js.native
  
  def once(event: String, callback: js.Function2[/* error */ Error, /* event */ js.Any, Unit]): Unit = js.native
  def once(
    event: String,
    options: js.Any,
    callback: js.Function2[/* error */ Error, /* event */ js.Any, Unit]
  ): Unit = js.native
  
  var options: js.Any = js.native
  
  var transactionBlockTimeout: Double = js.native
  
  var transactionConfirmationBlocks: Double = js.native
  
  var transactionPollingTimeout: Double = js.native
}
