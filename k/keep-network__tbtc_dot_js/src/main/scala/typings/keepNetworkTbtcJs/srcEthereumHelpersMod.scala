package typings.keepNetworkTbtcJs

import org.scalablytyped.runtime.StringDictionary
import typings.keepNetworkTbtcJs.anon.Address
import typings.keepNetworkTbtcJs.srcCommonTypesMod.Contract
import typings.keepNetworkTbtcJs.srcCommonTypesMod.Web3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEthereumHelpersMod {
  
  object EthereumHelpers {
    
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers")
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
    
    trait Artifact extends StObject {
      
      var abi: Any
      
      var contractName: String
      
      var networks: StringDictionary[Address]
    }
    object Artifact {
      
      inline def apply(abi: Any, contractName: String, networks: StringDictionary[Address]): Artifact = {
        val __obj = js.Dynamic.literal(abi = abi.asInstanceOf[js.Any], contractName = contractName.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any])
        __obj.asInstanceOf[Artifact]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
        
        inline def setAbi(value: Any): Self = StObject.set(x, "abi", value.asInstanceOf[js.Any])
        
        inline def setContractName(value: String): Self = StObject.set(x, "contractName", value.asInstanceOf[js.Any])
        
        inline def setNetworks(value: StringDictionary[Address]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ContractCall extends StObject {
      
      def call(params: Any): Any = js.native
      
      def estimateGas(options: ContractCallOptions): js.Promise[Double] = js.native
      def estimateGas(options: ContractCallOptions, callback: js.Function2[/* err */ js.Error, /* gas */ Double, Unit]): js.Promise[Double] = js.native
      
      def send(options: ContractCallOptions): js.Promise[Any] = js.native
      def send(
        options: ContractCallOptions,
        callback: js.Function2[/* err */ js.Error, /* transactionHash */ String, Unit]
      ): js.Promise[Any] = js.native
    }
    
    trait ContractCallOptions extends StObject {
      
      var from: js.UndefOr[String] = js.undefined
      
      var gas: js.UndefOr[Double] = js.undefined
      
      var gasPrice: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[
            Double | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any)
          ] = js.undefined
    }
    object ContractCallOptions {
      
      inline def apply(): ContractCallOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContractCallOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ContractCallOptions] (val x: Self) extends AnyVal {
        
        inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
        
        inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
        
        inline def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
        
        inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
        
        inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
        
        inline def setValue(
          value: Double | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any)
        ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
