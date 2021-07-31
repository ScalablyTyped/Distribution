package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.bitcoinHelpersMod.BitcoinNetworkType
import typings.keepNetworkTbtcJs.commonTypesMod.AbiType
import typings.keepNetworkTbtcJs.commonTypesMod.StateMutabilityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keepNetworkTbtcJsStrings {
  
  @js.native
  sealed trait constructor
    extends StObject
       with AbiType
  @scala.inline
  def constructor: constructor = "constructor".asInstanceOf[constructor]
  
  @js.native
  sealed trait event
    extends StObject
       with AbiType
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait fallback
    extends StObject
       with AbiType
  @scala.inline
  def fallback: fallback = "fallback".asInstanceOf[fallback]
  
  @js.native
  sealed trait function
    extends StObject
       with AbiType
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  
  @js.native
  sealed trait main
    extends StObject
       with BitcoinNetworkType
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  
  @js.native
  sealed trait nonpayable
    extends StObject
       with StateMutabilityType
  @scala.inline
  def nonpayable: nonpayable = "nonpayable".asInstanceOf[nonpayable]
  
  @js.native
  sealed trait payable
    extends StObject
       with StateMutabilityType
  @scala.inline
  def payable: payable = "payable".asInstanceOf[payable]
  
  @js.native
  sealed trait pure
    extends StObject
       with StateMutabilityType
  @scala.inline
  def pure: pure = "pure".asInstanceOf[pure]
  
  @js.native
  sealed trait simnet
    extends StObject
       with BitcoinNetworkType
  @scala.inline
  def simnet: simnet = "simnet".asInstanceOf[simnet]
  
  @js.native
  sealed trait ssl extends StObject
  @scala.inline
  def ssl: ssl = "ssl".asInstanceOf[ssl]
  
  @js.native
  sealed trait testnet
    extends StObject
       with BitcoinNetworkType
  @scala.inline
  def testnet: testnet = "testnet".asInstanceOf[testnet]
  
  @js.native
  sealed trait tls extends StObject
  @scala.inline
  def tls: tls = "tls".asInstanceOf[tls]
  
  @js.native
  sealed trait view
    extends StObject
       with StateMutabilityType
  @scala.inline
  def view: view = "view".asInstanceOf[view]
  
  @js.native
  sealed trait ws extends StObject
  @scala.inline
  def ws: ws = "ws".asInstanceOf[ws]
  
  @js.native
  sealed trait wss extends StObject
  @scala.inline
  def wss: wss = "wss".asInstanceOf[wss]
}
