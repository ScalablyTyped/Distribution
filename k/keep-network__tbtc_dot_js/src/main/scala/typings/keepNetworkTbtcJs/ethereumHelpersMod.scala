package typings.keepNetworkTbtcJs

import org.scalablytyped.runtime.StringDictionary
import typings.keepNetworkTbtcJs.anon.Address
import typings.keepNetworkTbtcJs.commonTypesMod.Contract
import typings.keepNetworkTbtcJs.commonTypesMod.Web3
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ethereumHelpersMod {
  
  object EthereumHelpers {
    
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.bytesToRaw")
    @js.native
    def bytesToRaw(bytesString: String): String = js.native
    
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.getDeployedContract")
    @js.native
    def getDeployedContract(artifact: Artifact, web3: Web3, networkId: String): Contract = js.native
    
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.getEvent")
    @js.native
    def getEvent(sourceContract: Contract, eventName: String): js.Promise[_] = js.native
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.getEvent")
    @js.native
    def getEvent(sourceContract: Contract, eventName: String, filter: js.Any): js.Promise[_] = js.native
    
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.getExistingEvent")
    @js.native
    def getExistingEvent(source: Contract, eventName: String): js.Promise[_] = js.native
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.getExistingEvent")
    @js.native
    def getExistingEvent(source: Contract, eventName: String, filter: js.Any): js.Promise[_] = js.native
    
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.isMainnet")
    @js.native
    def isMainnet(web3: Web3): js.Promise[Boolean] = js.native
    
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.readEventFromTransaction")
    @js.native
    def readEventFromTransaction(web3: Web3, transaction: js.Any, sourceContract: Contract, eventName: String): StringDictionary[String] = js.native
    
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.sendSafely")
    @js.native
    def sendSafely(boundContractMethod: ContractCall): js.Promise[_] = js.native
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.sendSafely")
    @js.native
    def sendSafely(boundContractMethod: ContractCall, sendParams: js.UndefOr[scala.Nothing], forceSend: Boolean): js.Promise[_] = js.native
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.sendSafely")
    @js.native
    def sendSafely(boundContractMethod: ContractCall, sendParams: ContractCallOptions): js.Promise[_] = js.native
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.sendSafely")
    @js.native
    def sendSafely(boundContractMethod: ContractCall, sendParams: ContractCallOptions, forceSend: Boolean): js.Promise[_] = js.native
    
    @JSImport("@keep-network/tbtc.js/src/EthereumHelpers", "EthereumHelpers.sendSafelyRetryable")
    @js.native
    def sendSafelyRetryable(
      boundContractMethod: ContractCall,
      sendParams: ContractCallOptions,
      forceSend: Boolean,
      totalAttempts: Double
    ): js.Promise[_] = js.native
    
    @js.native
    trait Artifact extends StObject {
      
      var abi: js.Any = js.native
      
      var contractName: String = js.native
      
      var networks: StringDictionary[Address] = js.native
    }
    object Artifact {
      
      @scala.inline
      def apply(abi: js.Any, contractName: String, networks: StringDictionary[Address]): Artifact = {
        val __obj = js.Dynamic.literal(abi = abi.asInstanceOf[js.Any], contractName = contractName.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any])
        __obj.asInstanceOf[Artifact]
      }
      
      @scala.inline
      implicit class ArtifactMutableBuilder[Self <: Artifact] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAbi(value: js.Any): Self = StObject.set(x, "abi", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContractName(value: String): Self = StObject.set(x, "contractName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNetworks(value: StringDictionary[Address]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ContractCall extends StObject {
      
      def call(params: js.Any): js.Any = js.native
      
      def estimateGas(options: ContractCallOptions): js.Promise[Double] = js.native
      def estimateGas(options: ContractCallOptions, callback: js.Function2[/* err */ Error, /* gas */ Double, Unit]): js.Promise[Double] = js.native
      
      def send(options: ContractCallOptions): js.Promise[_] = js.native
      def send(
        options: ContractCallOptions,
        callback: js.Function2[/* err */ Error, /* transactionHash */ String, Unit]
      ): js.Promise[_] = js.native
    }
    
    @js.native
    trait ContractCallOptions extends StObject {
      
      var from: js.UndefOr[String] = js.native
      
      var gas: js.UndefOr[Double] = js.native
      
      var gasPrice: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[
            Double | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
          ] = js.native
    }
    object ContractCallOptions {
      
      @scala.inline
      def apply(): ContractCallOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContractCallOptions]
      }
      
      @scala.inline
      implicit class ContractCallOptionsMutableBuilder[Self <: ContractCallOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
        
        @scala.inline
        def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
        
        @scala.inline
        def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
        
        @scala.inline
        def setValue(
          value: Double | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
        ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
  }
}
