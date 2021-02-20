package typings.keepNetworkTbtcJs

import org.scalablytyped.runtime.StringDictionary
import typings.keepNetworkTbtcJs.commonTypesMod.Contract
import typings.keepNetworkTbtcJs.commonTypesMod.TBTCConfig
import typings.keepNetworkTbtcJs.commonTypesMod.Web3
import typings.keepNetworkTbtcJs.constantsMod.Constants
import typings.keepNetworkTbtcJs.depositMod.DepositFactory
import typings.keepNetworkTbtcJs.ethereumHelpersMod.EthereumHelpers.Artifact
import typings.keepNetworkTbtcJs.ethereumHelpersMod.EthereumHelpers.ContractCall
import typings.keepNetworkTbtcJs.ethereumHelpersMod.EthereumHelpers.ContractCallOptions
import typings.keepNetworkTbtcJs.tbtcMod.TBTC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keep-network/tbtc.js", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.keepNetworkTbtcJs.tbtcMod.default {
    def this(depositFactory: DepositFactory, constants: Constants, config: TBTCConfig) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@keep-network/tbtc.js", "default.withConfig")
    @js.native
    def withConfig(config: TBTCConfig): js.Promise[TBTC] = js.native
    @JSImport("@keep-network/tbtc.js", "default.withConfig")
    @js.native
    def withConfig(config: TBTCConfig, networkMatchCheck: Boolean): js.Promise[TBTC] = js.native
  }
  
  object EthereumHelpers {
    
    object EthereumHelpers {
      
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.bytesToRaw")
      @js.native
      def bytesToRaw(bytesString: String): String = js.native
      
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.getDeployedContract")
      @js.native
      def getDeployedContract(artifact: Artifact, web3: Web3, networkId: String): Contract = js.native
      
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.getEvent")
      @js.native
      def getEvent(sourceContract: Contract, eventName: String): js.Promise[_] = js.native
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.getEvent")
      @js.native
      def getEvent(sourceContract: Contract, eventName: String, filter: js.Any): js.Promise[_] = js.native
      
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.getExistingEvent")
      @js.native
      def getExistingEvent(source: Contract, eventName: String): js.Promise[_] = js.native
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.getExistingEvent")
      @js.native
      def getExistingEvent(source: Contract, eventName: String, filter: js.Any): js.Promise[_] = js.native
      
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.isMainnet")
      @js.native
      def isMainnet(web3: Web3): js.Promise[Boolean] = js.native
      
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.readEventFromTransaction")
      @js.native
      def readEventFromTransaction(web3: Web3, transaction: js.Any, sourceContract: Contract, eventName: String): StringDictionary[String] = js.native
      
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.sendSafely")
      @js.native
      def sendSafely(boundContractMethod: ContractCall): js.Promise[_] = js.native
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.sendSafely")
      @js.native
      def sendSafely(boundContractMethod: ContractCall, sendParams: js.UndefOr[scala.Nothing], forceSend: Boolean): js.Promise[_] = js.native
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.sendSafely")
      @js.native
      def sendSafely(boundContractMethod: ContractCall, sendParams: ContractCallOptions): js.Promise[_] = js.native
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.sendSafely")
      @js.native
      def sendSafely(boundContractMethod: ContractCall, sendParams: ContractCallOptions, forceSend: Boolean): js.Promise[_] = js.native
      
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers.sendSafelyRetryable")
      @js.native
      def sendSafelyRetryable(
        boundContractMethod: ContractCall,
        sendParams: ContractCallOptions,
        forceSend: Boolean,
        totalAttempts: Double
      ): js.Promise[_] = js.native
    }
  }
  
  @JSImport("@keep-network/tbtc.js", "getNetworkIdFromArtifact")
  @js.native
  def getNetworkIdFromArtifact(): String = js.native
}
