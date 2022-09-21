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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@keep-network/tbtc.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@keep-network/tbtc.js", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.keepNetworkTbtcJs.tbtcMod.default {
    def this(depositFactory: DepositFactory, constants: Constants, config: TBTCConfig) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@keep-network/tbtc.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def withConfig(config: TBTCConfig): js.Promise[TBTC] = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TBTC]]
    inline def withConfig(config: TBTCConfig, networkMatchCheck: Boolean): js.Promise[TBTC] = (^.asInstanceOf[js.Dynamic].applyDynamic("withConfig")(config.asInstanceOf[js.Any], networkMatchCheck.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TBTC]]
  }
  
  object EthereumHelpers {
    
    object EthereumHelpers {
      
      @JSImport("@keep-network/tbtc.js", "EthereumHelpers.EthereumHelpers")
      @js.native
      val ^ : js.Any = js.native
      
      inline def bytesToRaw(bytesString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToRaw")(bytesString.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def getDeployedContract(artifact: Artifact, web3: Web3, networkId: String): Contract = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeployedContract")(artifact.asInstanceOf[js.Any], web3.asInstanceOf[js.Any], networkId.asInstanceOf[js.Any])).asInstanceOf[Contract]
      
      inline def getEvent(sourceContract: Contract, eventName: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEvent")(sourceContract.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      inline def getEvent(sourceContract: Contract, eventName: String, filter: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEvent")(sourceContract.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      
      inline def getExistingEvent(source: Contract, eventName: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExistingEvent")(source.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      inline def getExistingEvent(source: Contract, eventName: String, filter: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExistingEvent")(source.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      
      inline def isMainnet(web3: Web3): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isMainnet")(web3.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
      
      inline def readEventFromTransaction(web3: Web3, transaction: Any, sourceContract: Contract, eventName: String): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readEventFromTransaction")(web3.asInstanceOf[js.Any], transaction.asInstanceOf[js.Any], sourceContract.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
      
      inline def sendSafely(boundContractMethod: ContractCall): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendSafely")(boundContractMethod.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      inline def sendSafely(boundContractMethod: ContractCall, sendParams: Unit, forceSend: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSafely")(boundContractMethod.asInstanceOf[js.Any], sendParams.asInstanceOf[js.Any], forceSend.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      inline def sendSafely(boundContractMethod: ContractCall, sendParams: ContractCallOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSafely")(boundContractMethod.asInstanceOf[js.Any], sendParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      inline def sendSafely(boundContractMethod: ContractCall, sendParams: ContractCallOptions, forceSend: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSafely")(boundContractMethod.asInstanceOf[js.Any], sendParams.asInstanceOf[js.Any], forceSend.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      
      inline def sendSafelyRetryable(
        boundContractMethod: ContractCall,
        sendParams: ContractCallOptions,
        forceSend: Boolean,
        totalAttempts: Double
      ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSafelyRetryable")(boundContractMethod.asInstanceOf[js.Any], sendParams.asInstanceOf[js.Any], forceSend.asInstanceOf[js.Any], totalAttempts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    }
  }
  
  inline def getNetworkIdFromArtifact(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkIdFromArtifact")().asInstanceOf[String]
}
