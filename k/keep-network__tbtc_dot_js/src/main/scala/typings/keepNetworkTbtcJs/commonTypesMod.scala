package typings.keepNetworkTbtcJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.keepNetworkTbtcJs.anon.OmitFoundTransactionvalue
import typings.keepNetworkTbtcJs.bitcoinHelpersMod.BitcoinNetworkType
import typings.keepNetworkTbtcJs.electrumClientMod.Config
import typings.node.Buffer
import typings.node.netMod.Socket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTypesMod {
  
  @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Contract")
  @js.native
  class Contract protected () extends StObject {
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
  
  @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3")
  @js.native
  class Web3 protected () extends StObject {
    def this(provider: js.Any) = this()
    def this(provider: js.Any, net: Socket) = this()
    
    var BatchRequest: Instantiable0[js.Any] = js.native
    
    var bzz: js.Any = js.native
    
    val currentProvider: js.Any = js.native
    
    var defaultAccount: String | Null = js.native
    
    var defaultBlock: String | Double = js.native
    
    var eth: js.Any = js.native
    
    def extend(extension: js.Any): js.Any = js.native
    
    val givenProvider: js.Any = js.native
    
    def setProvider(provider: js.Any): Boolean = js.native
    
    var shh: js.Any = js.native
    
    var utils: js.Any = js.native
    
    var version: String = js.native
  }
  /* static members */
  object Web3 {
    
    @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3.modules")
    @js.native
    def modules: js.Any = js.native
    @scala.inline
    def modules_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3.providers")
    @js.native
    val providers: js.Any = js.native
    
    @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3.utils")
    @js.native
    val utils: js.Any = js.native
    
    @JSImport("@keep-network/tbtc.js/src/CommonTypes", "Web3.version")
    @js.native
    val version: String = js.native
  }
  
  @js.native
  trait AbiInput extends StObject {
    
    var components: js.UndefOr[js.Array[AbiInput]] = js.native
    
    var indexed: js.UndefOr[Boolean] = js.native
    
    var internalType: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object AbiInput {
    
    @scala.inline
    def apply(name: String, `type`: String): AbiInput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiInput]
    }
    
    @scala.inline
    implicit class AbiInputMutableBuilder[Self <: AbiInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: js.Array[AbiInput]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setComponentsVarargs(value: AbiInput*): Self = StObject.set(x, "components", js.Array(value :_*))
      
      @scala.inline
      def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
      
      @scala.inline
      def setInternalType(value: String): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalTypeUndefined: Self = StObject.set(x, "internalType", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AbiItem extends StObject {
    
    var anonymous: js.UndefOr[Boolean] = js.native
    
    var constant: js.UndefOr[Boolean] = js.native
    
    var gas: js.UndefOr[Double] = js.native
    
    var inputs: js.UndefOr[js.Array[AbiInput]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var outputs: js.UndefOr[js.Array[AbiOutput]] = js.native
    
    var payable: js.UndefOr[Boolean] = js.native
    
    var stateMutability: js.UndefOr[StateMutabilityType] = js.native
    
    var `type`: AbiType = js.native
  }
  object AbiItem {
    
    @scala.inline
    def apply(`type`: AbiType): AbiItem = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiItem]
    }
    
    @scala.inline
    implicit class AbiItemMutableBuilder[Self <: AbiItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      @scala.inline
      def setConstant(value: Boolean): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      @scala.inline
      def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      @scala.inline
      def setInputs(value: js.Array[AbiInput]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      @scala.inline
      def setInputsVarargs(value: AbiInput*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOutputs(value: js.Array[AbiOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      @scala.inline
      def setOutputsVarargs(value: AbiOutput*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      @scala.inline
      def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayableUndefined: Self = StObject.set(x, "payable", js.undefined)
      
      @scala.inline
      def setStateMutability(value: StateMutabilityType): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateMutabilityUndefined: Self = StObject.set(x, "stateMutability", js.undefined)
      
      @scala.inline
      def setType(value: AbiType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AbiOutput extends StObject {
    
    var components: js.UndefOr[js.Array[AbiOutput]] = js.native
    
    var internalType: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object AbiOutput {
    
    @scala.inline
    def apply(name: String, `type`: String): AbiOutput = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbiOutput]
    }
    
    @scala.inline
    implicit class AbiOutputMutableBuilder[Self <: AbiOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: js.Array[AbiOutput]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setComponentsVarargs(value: AbiOutput*): Self = StObject.set(x, "components", js.Array(value :_*))
      
      @scala.inline
      def setInternalType(value: String): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalTypeUndefined: Self = StObject.set(x, "internalType", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def constructor: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.constructor = "constructor".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.constructor]
    
    @scala.inline
    def event: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.event = "event".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.event]
    
    @scala.inline
    def fallback: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.fallback = "fallback".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.fallback]
    
    @scala.inline
    def function: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.function = "function".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.function]
  }
  
  @js.native
  trait DepositBaseClass extends StObject {
    
    var address: String = js.native
    
    def constructFundingProof(bitcoinTransaction: OmitFoundTransactionvalue, confirmations: Double): js.Promise[js.Tuple8[Buffer, Buffer, Buffer, Buffer, Double, Buffer, String, Buffer]] = js.native
    
    var contract: Contract = js.native
    
    var factory: js.Any = js.native
    
    def getCurrentState(): js.Promise[Double] = js.native
    
    def getLatestRedemptionDetails(): js.Promise[Null | RedemptionDetails] = js.native
    
    var keepContract: Contract = js.native
    
    var publicKeyPoint: js.Promise[KeyPoint] = js.native
  }
  object DepositBaseClass {
    
    @scala.inline
    def apply(
      address: String,
      constructFundingProof: (OmitFoundTransactionvalue, Double) => js.Promise[js.Tuple8[Buffer, Buffer, Buffer, Buffer, Double, Buffer, String, Buffer]],
      contract: Contract,
      factory: js.Any,
      getCurrentState: () => js.Promise[Double],
      getLatestRedemptionDetails: () => js.Promise[Null | RedemptionDetails],
      keepContract: Contract,
      publicKeyPoint: js.Promise[KeyPoint]
    ): DepositBaseClass = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], constructFundingProof = js.Any.fromFunction2(constructFundingProof), contract = contract.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], getCurrentState = js.Any.fromFunction0(getCurrentState), getLatestRedemptionDetails = js.Any.fromFunction0(getLatestRedemptionDetails), keepContract = keepContract.asInstanceOf[js.Any], publicKeyPoint = publicKeyPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[DepositBaseClass]
    }
    
    @scala.inline
    implicit class DepositBaseClassMutableBuilder[Self <: DepositBaseClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructFundingProof(
        value: (OmitFoundTransactionvalue, Double) => js.Promise[js.Tuple8[Buffer, Buffer, Buffer, Buffer, Double, Buffer, String, Buffer]]
      ): Self = StObject.set(x, "constructFundingProof", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContract(value: Contract): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactory(value: js.Any): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCurrentState(value: () => js.Promise[Double]): Self = StObject.set(x, "getCurrentState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLatestRedemptionDetails(value: () => js.Promise[Null | RedemptionDetails]): Self = StObject.set(x, "getLatestRedemptionDetails", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeepContract(value: Contract): Self = StObject.set(x, "keepContract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicKeyPoint(value: js.Promise[KeyPoint]): Self = StObject.set(x, "publicKeyPoint", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeyPoint extends StObject {
    
    var x: String = js.native
    
    var y: String = js.native
  }
  object KeyPoint {
    
    @scala.inline
    def apply(x: String, y: String): KeyPoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPoint]
    }
    
    @scala.inline
    implicit class KeyPointMutableBuilder[Self <: KeyPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RedemptionDetails extends StObject {
    
    var digest: String = js.native
    
    var outpoint: String = js.native
    
    var redeemerOutputScript: String = js.native
    
    var requestedFee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var utxoValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  }
  object RedemptionDetails {
    
    @scala.inline
    def apply(
      digest: String,
      outpoint: String,
      redeemerOutputScript: String,
      requestedFee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      utxoValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): RedemptionDetails = {
      val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], outpoint = outpoint.asInstanceOf[js.Any], redeemerOutputScript = redeemerOutputScript.asInstanceOf[js.Any], requestedFee = requestedFee.asInstanceOf[js.Any], utxoValue = utxoValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedemptionDetails]
    }
    
    @scala.inline
    implicit class RedemptionDetailsMutableBuilder[Self <: RedemptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpoint(value: String): Self = StObject.set(x, "outpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedeemerOutputScript(value: String): Self = StObject.set(x, "redeemerOutputScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestedFee(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): Self = StObject.set(x, "requestedFee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtxoValue(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
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
    
    @scala.inline
    def nonpayable: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.nonpayable = "nonpayable".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.nonpayable]
    
    @scala.inline
    def payable: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.payable = "payable".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.payable]
    
    @scala.inline
    def pure: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.pure = "pure".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.pure]
    
    @scala.inline
    def view: typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.view = "view".asInstanceOf[typings.keepNetworkTbtcJs.keepNetworkTbtcJsStrings.view]
  }
  
  @js.native
  trait TBTCConfig extends StObject {
    
    var bitcoinNetwork: BitcoinNetworkType = js.native
    
    var electrum: StringDictionary[Config] = js.native
    
    var web3: Web3 = js.native
  }
  object TBTCConfig {
    
    @scala.inline
    def apply(bitcoinNetwork: BitcoinNetworkType, electrum: StringDictionary[Config], web3: Web3): TBTCConfig = {
      val __obj = js.Dynamic.literal(bitcoinNetwork = bitcoinNetwork.asInstanceOf[js.Any], electrum = electrum.asInstanceOf[js.Any], web3 = web3.asInstanceOf[js.Any])
      __obj.asInstanceOf[TBTCConfig]
    }
    
    @scala.inline
    implicit class TBTCConfigMutableBuilder[Self <: TBTCConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitcoinNetwork(value: BitcoinNetworkType): Self = StObject.set(x, "bitcoinNetwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectrum(value: StringDictionary[Config]): Self = StObject.set(x, "electrum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeb3(value: Web3): Self = StObject.set(x, "web3", value.asInstanceOf[js.Any])
    }
  }
}
