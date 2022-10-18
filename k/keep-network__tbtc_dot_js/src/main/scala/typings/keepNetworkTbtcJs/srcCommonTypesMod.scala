package typings.keepNetworkTbtcJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.keepNetworkTbtcJs.anon.OmitFoundTransactionvalue
import typings.keepNetworkTbtcJs.srcBitcoinHelpersMod.BitcoinNetworkType
import typings.keepNetworkTbtcJs.srcLibElectrumClientMod.Config
import typings.node.bufferMod.global.Buffer
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommonTypesMod {
  
  @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Contract")
  @js.native
  open class Contract protected () extends StObject {
    def this(provider: Any, abi: js.Array[AbiItem]) = this()
    def this(provider: Any, abi: js.Array[AbiItem], address: String) = this()
    def this(provider: Any, abi: js.Array[AbiItem], address: String, options: Any) = this()
    def this(provider: Any, abi: js.Array[AbiItem], address: Unit, options: Any) = this()
    
    /* private */ var _address: String = js.native
    
    /* private */ var _jsonInterface: js.Array[AbiItem] = js.native
    
    var defaultAccount: String | Null = js.native
    
    var defaultBlock: String | Double = js.native
    
    var defaultChain: Any = js.native
    
    var defaultCommon: Any = js.native
    
    var defaultHardfork: Any = js.native
    
    var events: Any = js.native
    
    def getPastEvents(event: String): js.Promise[js.Array[Any]] = js.native
    
    var methods: Any = js.native
    
    def once(event: String, callback: js.Function2[/* error */ js.Error, /* event */ Any, Unit]): Unit = js.native
    def once(event: String, options: Any, callback: js.Function2[/* error */ js.Error, /* event */ Any, Unit]): Unit = js.native
    
    var options: Any = js.native
    
    var transactionBlockTimeout: Double = js.native
    
    var transactionConfirmationBlocks: Double = js.native
    
    var transactionPollingTimeout: Double = js.native
  }
  
  @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3")
  @js.native
  open class Web3 protected () extends StObject {
    def this(provider: Any) = this()
    def this(provider: Any, net: Socket) = this()
    
    var BatchRequest: Instantiable0[Any] = js.native
    
    var bzz: Any = js.native
    
    val currentProvider: Any = js.native
    
    var defaultAccount: String | Null = js.native
    
    var defaultBlock: String | Double = js.native
    
    var eth: Any = js.native
    
    def extend(`extension`: Any): Any = js.native
    
    val givenProvider: Any = js.native
    
    def setProvider(provider: Any): Boolean = js.native
    
    var shh: Any = js.native
    
    var utils: Any = js.native
    
    var version: String = js.native
  }
  /* static members */
  object Web3 {
    
    @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3.modules")
    @js.native
    def modules: Any = js.native
    inline def modules_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3.providers")
    @js.native
    val providers: Any = js.native
    
    @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3.utils")
    @js.native
    val utils: Any = js.native
    
    @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3.version")
    @js.native
    val version: String = js.native
  }
  
  trait AbiInput extends StObject {
    
    var components: js.UndefOr[js.Array[AbiInput]] = js.undefined
    
    var indexed: js.UndefOr[Boolean] = js.undefined
    
    var internalType: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var `type`: String
  }
  object AbiInput {
    
    inline def apply(name: String, `type`: String): AbiInput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiInput]
    }
    
    extension [Self <: AbiInput](x: Self) {
      
      inline def setComponents(value: js.Array[AbiInput]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setComponentsVarargs(value: AbiInput*): Self = StObject.set(x, "components", js.Array(value*))
      
      inline def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
      
      inline def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
      
      inline def setInternalType(value: String): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      inline def setInternalTypeUndefined: Self = StObject.set(x, "internalType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AbiItem extends StObject {
    
    var anonymous: js.UndefOr[Boolean] = js.undefined
    
    var constant: js.UndefOr[Boolean] = js.undefined
    
    var gas: js.UndefOr[Double] = js.undefined
    
    var inputs: js.UndefOr[js.Array[AbiInput]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var outputs: js.UndefOr[js.Array[AbiOutput]] = js.undefined
    
    var payable: js.UndefOr[Boolean] = js.undefined
    
    var stateMutability: js.UndefOr[StateMutabilityType] = js.undefined
    
    var `type`: AbiType
  }
  object AbiItem {
    
    inline def apply(`type`: AbiType): AbiItem = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiItem]
    }
    
    extension [Self <: AbiItem](x: Self) {
      
      inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      inline def setConstant(value: Boolean): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      inline def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      inline def setInputs(value: js.Array[AbiInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      inline def setInputsVarargs(value: AbiInput*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutputs(value: js.Array[AbiOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      inline def setOutputsVarargs(value: AbiOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
      
      inline def setPayableUndefined: Self = StObject.set(x, "payable", js.undefined)
      
      inline def setStateMutability(value: StateMutabilityType): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
      
      inline def setStateMutabilityUndefined: Self = StObject.set(x, "stateMutability", js.undefined)
      
      inline def setType(value: AbiType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AbiOutput extends StObject {
    
    var components: js.UndefOr[js.Array[AbiOutput]] = js.undefined
    
    var internalType: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var `type`: String
  }
  object AbiOutput {
    
    inline def apply(name: String, `type`: String): AbiOutput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiOutput]
    }
    
    extension [Self <: AbiOutput](x: Self) {
      
      inline def setComponents(value: js.Array[AbiOutput]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setComponentsVarargs(value: AbiOutput*): Self = StObject.set(x, "components", js.Array(value*))
      
      inline def setInternalType(value: String): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      inline def setInternalTypeUndefined: Self = StObject.set(x, "internalType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.function
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.constructor
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.event
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.fallback
  */
  trait AbiType extends StObject
  object AbiType {
    
    inline def constructor: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.constructor = "constructor".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.constructor]
    
    inline def event: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.event = "event".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.event]
    
    inline def fallback: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.fallback = "fallback".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.fallback]
    
    inline def function: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.function = "function".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.function]
  }
  
  trait DepositBaseClass extends StObject {
    
    var address: String
    
    def constructFundingProof(bitcoinTransaction: OmitFoundTransactionvalue, confirmations: Double): js.Promise[js.Tuple8[Buffer, Buffer, Buffer, Buffer, Double, Buffer, String, Buffer]]
    
    var contract: Contract
    
    var factory: Any
    
    def getCurrentState(): js.Promise[Double]
    
    def getLatestRedemptionDetails(): js.Promise[Null | RedemptionDetails]
    
    var keepContract: Contract
    
    var publicKeyPoint: js.Promise[KeyPoint]
  }
  object DepositBaseClass {
    
    inline def apply(
      address: String,
      constructFundingProof: (OmitFoundTransactionvalue, Double) => js.Promise[js.Tuple8[Buffer, Buffer, Buffer, Buffer, Double, Buffer, String, Buffer]],
      contract: Contract,
      factory: Any,
      getCurrentState: () => js.Promise[Double],
      getLatestRedemptionDetails: () => js.Promise[Null | RedemptionDetails],
      keepContract: Contract,
      publicKeyPoint: js.Promise[KeyPoint]
    ): DepositBaseClass = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], constructFundingProof = js.Any.fromFunction2(constructFundingProof), contract = contract.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], getCurrentState = js.Any.fromFunction0(getCurrentState), getLatestRedemptionDetails = js.Any.fromFunction0(getLatestRedemptionDetails), keepContract = keepContract.asInstanceOf[js.Any], publicKeyPoint = publicKeyPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[DepositBaseClass]
    }
    
    extension [Self <: DepositBaseClass](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setConstructFundingProof(
        value: (OmitFoundTransactionvalue, Double) => js.Promise[js.Tuple8[Buffer, Buffer, Buffer, Buffer, Double, Buffer, String, Buffer]]
      ): Self = StObject.set(x, "constructFundingProof", js.Any.fromFunction2(value))
      
      inline def setContract(value: Contract): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
      
      inline def setFactory(value: Any): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      inline def setGetCurrentState(value: () => js.Promise[Double]): Self = StObject.set(x, "getCurrentState", js.Any.fromFunction0(value))
      
      inline def setGetLatestRedemptionDetails(value: () => js.Promise[Null | RedemptionDetails]): Self = StObject.set(x, "getLatestRedemptionDetails", js.Any.fromFunction0(value))
      
      inline def setKeepContract(value: Contract): Self = StObject.set(x, "keepContract", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyPoint(value: js.Promise[KeyPoint]): Self = StObject.set(x, "publicKeyPoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyPoint extends StObject {
    
    var x: String
    
    var y: String
  }
  object KeyPoint {
    
    inline def apply(x: String, y: String): KeyPoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPoint]
    }
    
    extension [Self <: KeyPoint](x: Self) {
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait RedemptionDetails extends StObject {
    
    var digest: String
    
    var outpoint: String
    
    var redeemerOutputScript: String
    
    var requestedFee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
    
    var utxoValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
  }
  object RedemptionDetails {
    
    inline def apply(
      digest: String,
      outpoint: String,
      redeemerOutputScript: String,
      requestedFee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any,
      utxoValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
    ): RedemptionDetails = {
      val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], outpoint = outpoint.asInstanceOf[js.Any], redeemerOutputScript = redeemerOutputScript.asInstanceOf[js.Any], requestedFee = requestedFee.asInstanceOf[js.Any], utxoValue = utxoValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedemptionDetails]
    }
    
    extension [Self <: RedemptionDetails](x: Self) {
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setOutpoint(value: String): Self = StObject.set(x, "outpoint", value.asInstanceOf[js.Any])
      
      inline def setRedeemerOutputScript(value: String): Self = StObject.set(x, "redeemerOutputScript", value.asInstanceOf[js.Any])
      
      inline def setRequestedFee(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): Self = StObject.set(x, "requestedFee", value.asInstanceOf[js.Any])
      
      inline def setUtxoValue(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ): Self = StObject.set(x, "utxoValue", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.pure
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.view
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.nonpayable
    - typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.payable
  */
  trait StateMutabilityType extends StObject
  object StateMutabilityType {
    
    inline def nonpayable: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.nonpayable = "nonpayable".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.nonpayable]
    
    inline def payable: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.payable = "payable".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.payable]
    
    inline def pure: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.pure = "pure".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.pure]
    
    inline def view: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.view = "view".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.view]
  }
  
  trait TBTCConfig extends StObject {
    
    var bitcoinNetwork: BitcoinNetworkType
    
    var electrum: StringDictionary[Config]
    
    var web3: Web3
  }
  object TBTCConfig {
    
    inline def apply(bitcoinNetwork: BitcoinNetworkType, electrum: StringDictionary[Config], web3: Web3): TBTCConfig = {
      val __obj = js.Dynamic.literal(bitcoinNetwork = bitcoinNetwork.asInstanceOf[js.Any], electrum = electrum.asInstanceOf[js.Any], web3 = web3.asInstanceOf[js.Any])
      __obj.asInstanceOf[TBTCConfig]
    }
    
    extension [Self <: TBTCConfig](x: Self) {
      
      inline def setBitcoinNetwork(value: BitcoinNetworkType): Self = StObject.set(x, "bitcoinNetwork", value.asInstanceOf[js.Any])
      
      inline def setElectrum(value: StringDictionary[Config]): Self = StObject.set(x, "electrum", value.asInstanceOf[js.Any])
      
      inline def setWeb3(value: Web3): Self = StObject.set(x, "web3", value.asInstanceOf[js.Any])
    }
  }
}
