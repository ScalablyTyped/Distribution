package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.bitcoinHelpersMod.BitcoinNetworkType
import typings.keepNetworkTbtcJs.commonTypesMod.AbiType
import typings.keepNetworkTbtcJs.commonTypesMod.StateMutabilityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keepNetworkTbtcJsStrings {
  
  @scala.inline
  def constructor: constructor = "constructor".asInstanceOf[constructor]
  
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  
  @scala.inline
  def fallback: fallback = "fallback".asInstanceOf[fallback]
  
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  
  @scala.inline
  def nonpayable: nonpayable = "nonpayable".asInstanceOf[nonpayable]
  
  @scala.inline
  def payable: payable = "payable".asInstanceOf[payable]
  
  @scala.inline
  def pure: pure = "pure".asInstanceOf[pure]
  
  @scala.inline
  def simnet: simnet = "simnet".asInstanceOf[simnet]
  
  @scala.inline
  def ssl: ssl = "ssl".asInstanceOf[ssl]
  
  @scala.inline
  def testnet: testnet = "testnet".asInstanceOf[testnet]
  
  @scala.inline
  def tls: tls = "tls".asInstanceOf[tls]
  
  @scala.inline
  def view: view = "view".asInstanceOf[view]
  
  @scala.inline
  def ws: ws = "ws".asInstanceOf[ws]
  
  @scala.inline
  def wss: wss = "wss".asInstanceOf[wss]
  
  @js.native
  sealed trait constructor extends AbiType
  
  @js.native
  sealed trait event extends AbiType
  
  @js.native
  sealed trait fallback extends AbiType
  
  @js.native
  sealed trait function extends AbiType
  
  @js.native
  sealed trait main extends BitcoinNetworkType
  
  @js.native
  sealed trait nonpayable extends StateMutabilityType
  
  @js.native
  sealed trait payable extends StateMutabilityType
  
  @js.native
  sealed trait pure extends StateMutabilityType
  
  @js.native
  sealed trait simnet extends BitcoinNetworkType
  
  @js.native
  sealed trait ssl extends js.Object
  
  @js.native
  sealed trait testnet extends BitcoinNetworkType
  
  @js.native
  sealed trait tls extends js.Object
  
  @js.native
  sealed trait view extends StateMutabilityType
  
  @js.native
  sealed trait ws extends js.Object
  
  @js.native
  sealed trait wss extends js.Object
}
