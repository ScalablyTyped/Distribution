package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.anon.ACTIVE
import typings.keepNetworkTbtcJs.anon.Confirmations
import typings.keepNetworkTbtcJs.anon.DepositAddress
import typings.keepNetworkTbtcJs.anon.Digest
import typings.keepNetworkTbtcJs.anon.OmitFoundTransactionvalue
import typings.keepNetworkTbtcJs.anon.RequiredConfirmations
import typings.keepNetworkTbtcJs.srcBitcoinHelpersMod.FoundTransaction
import typings.keepNetworkTbtcJs.srcCommonTypesMod.Contract
import typings.keepNetworkTbtcJs.srcCommonTypesMod.DepositBaseClass
import typings.keepNetworkTbtcJs.srcCommonTypesMod.KeyPoint
import typings.keepNetworkTbtcJs.srcCommonTypesMod.RedemptionDetails
import typings.keepNetworkTbtcJs.srcCommonTypesMod.TBTCConfig
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDepositMod {
  
  @JSImport("@keep-network/tbtc.js/src/Deposit", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Deposit {
    def this(factory: DepositFactory, depositContract: Contract, keepContract: Contract) = this()
    
    /* CompleteClass */
    var address: String = js.native
    
    /* CompleteClass */
    override def constructFundingProof(bitcoinTransaction: OmitFoundTransactionvalue, confirmations: Double): js.Promise[js.Tuple8[Buffer, Buffer, Buffer, Buffer, Double, Buffer, String, Buffer]] = js.native
    
    /* CompleteClass */
    var contract: Contract = js.native
    
    /* CompleteClass */
    var factory: Any = js.native
    
    /* CompleteClass */
    override def getCurrentState(): js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def getLatestRedemptionDetails(): js.Promise[Null | RedemptionDetails] = js.native
    
    /* CompleteClass */
    var keepContract: Contract = js.native
    
    /* CompleteClass */
    var publicKeyPoint: js.Promise[KeyPoint] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def forAddress(factory: DepositFactory, address: String): js.Promise[Deposit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forAddress")(factory.asInstanceOf[js.Any], address.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Deposit]]
    
    inline def forLotSize(
      factory: DepositFactory,
      satoshiLotSize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
    ): js.Promise[Deposit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forLotSize")(factory.asInstanceOf[js.Any], satoshiLotSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Deposit]]
  }
  
  @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositFactory")
  @js.native
  open class DepositFactory protected () extends StObject {
    def this(config: TBTCConfig) = this()
    
    var State: ACTIVE = js.native
    
    def availableSatoshiLotSizes(): js.Promise[Any] = js.native
    
    var config: TBTCConfig = js.native
    
    var constantsContract: Contract = js.native
    
    def createNewDepositContract(
      lotSize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
    ): js.Promise[DepositAddress] = js.native
    
    var depositContract: Contract = js.native
    
    var depositFactoryContract: Contract = js.native
    
    var depositLogContract: Contract = js.native
    
    var depositTokenContract: Contract = js.native
    
    var feeRebateTokenContract: Contract = js.native
    
    var fundingScriptContract: Contract = js.native
    
    def resolveContracts(): js.Promise[Unit] = js.native
    
    var systemContract: Contract = js.native
    
    var tokenContract: Contract = js.native
    
    var vendingMachineContract: Contract = js.native
    
    def withAddress(depositAddress: String): js.Promise[Deposit] = js.native
    
    def withSatoshiLotSize(
      satoshiLotSize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
    ): js.Promise[Deposit] = js.native
  }
  /* static members */
  object DepositFactory {
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def withConfig(config: TBTCConfig): js.Promise[DepositFactory] = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DepositFactory]]
  }
  
  object DepositStates {
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.ACTIVE")
    @js.native
    def ACTIVE: Double = js.native
    inline def ACTIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.AWAITING_BTC_FUNDING_PROOF")
    @js.native
    def AWAITING_BTC_FUNDING_PROOF: Double = js.native
    inline def AWAITING_BTC_FUNDING_PROOF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AWAITING_BTC_FUNDING_PROOF")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.AWAITING_SIGNER_SETUP")
    @js.native
    def AWAITING_SIGNER_SETUP: Double = js.native
    inline def AWAITING_SIGNER_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AWAITING_SIGNER_SETUP")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.AWAITING_WITHDRAWAL_PROOF")
    @js.native
    def AWAITING_WITHDRAWAL_PROOF: Double = js.native
    inline def AWAITING_WITHDRAWAL_PROOF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AWAITING_WITHDRAWAL_PROOF")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.AWAITING_WITHDRAWAL_SIGNATURE")
    @js.native
    def AWAITING_WITHDRAWAL_SIGNATURE: Double = js.native
    inline def AWAITING_WITHDRAWAL_SIGNATURE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AWAITING_WITHDRAWAL_SIGNATURE")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.COURTESY_CALL")
    @js.native
    def COURTESY_CALL: Double = js.native
    inline def COURTESY_CALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COURTESY_CALL")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.FAILED_SETUP")
    @js.native
    def FAILED_SETUP: Double = js.native
    inline def FAILED_SETUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILED_SETUP")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.FRAUD_LIQUIDATION_IN_PROGRESS")
    @js.native
    def FRAUD_LIQUIDATION_IN_PROGRESS: Double = js.native
    inline def FRAUD_LIQUIDATION_IN_PROGRESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAUD_LIQUIDATION_IN_PROGRESS")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.LIQUIDATED")
    @js.native
    def LIQUIDATED: Double = js.native
    inline def LIQUIDATED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIQUIDATED")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.LIQUIDATION_IN_PROGRESS")
    @js.native
    def LIQUIDATION_IN_PROGRESS: Double = js.native
    inline def LIQUIDATION_IN_PROGRESS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIQUIDATION_IN_PROGRESS")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.REDEEMED")
    @js.native
    def REDEEMED: Double = js.native
    inline def REDEEMED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REDEEMED")(x.asInstanceOf[js.Any])
    
    @JSImport("@keep-network/tbtc.js/src/Deposit", "DepositStates.START")
    @js.native
    def START: Double = js.native
    inline def START_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("START")(x.asInstanceOf[js.Any])
  }
  
  trait AutoSubmitState extends StObject {
    
    var fundingConfirmations: js.Promise[RequiredConfirmations]
    
    var fundingTransaction: js.Promise[FoundTransaction]
    
    var mintedTBTC: js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ]
    
    var proofTransaction: js.Promise[Any]
  }
  object AutoSubmitState {
    
    inline def apply(
      fundingConfirmations: js.Promise[RequiredConfirmations],
      fundingTransaction: js.Promise[FoundTransaction],
      mintedTBTC: js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
        ],
      proofTransaction: js.Promise[Any]
    ): AutoSubmitState = {
      val __obj = js.Dynamic.literal(fundingConfirmations = fundingConfirmations.asInstanceOf[js.Any], fundingTransaction = fundingTransaction.asInstanceOf[js.Any], mintedTBTC = mintedTBTC.asInstanceOf[js.Any], proofTransaction = proofTransaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoSubmitState]
    }
    
    extension [Self <: AutoSubmitState](x: Self) {
      
      inline def setFundingConfirmations(value: js.Promise[RequiredConfirmations]): Self = StObject.set(x, "fundingConfirmations", value.asInstanceOf[js.Any])
      
      inline def setFundingTransaction(value: js.Promise[FoundTransaction]): Self = StObject.set(x, "fundingTransaction", value.asInstanceOf[js.Any])
      
      inline def setMintedTBTC(
        value: js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
            ]
      ): Self = StObject.set(x, "mintedTBTC", value.asInstanceOf[js.Any])
      
      inline def setProofTransaction(value: js.Promise[Any]): Self = StObject.set(x, "proofTransaction", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Deposit
    extends StObject
       with DepositBaseClass {
    
    var _fundingConfirmations: js.UndefOr[js.Promise[FundingConfirmations]] = js.native
    
    var _fundingTransaction: js.UndefOr[js.Promise[FoundTransaction]] = js.native
    
    var activeStatePromise: js.Promise[Boolean] = js.native
    
    def auctionValue(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.native
    
    def autoMint(): AutoSubmitState = js.native
    
    def autoSubmit(): AutoSubmitState = js.native
    
    var autoSubmittingState: js.UndefOr[AutoSubmitState] = js.native
    
    var bitcoinAddress: js.Promise[String] = js.native
    
    def exitCourtesyCall(): js.Promise[Unit] = js.native
    
    @JSName("factory")
    var factory_Deposit: DepositFactory = js.native
    
    def findOrWaitForPublicKeyPoint(): js.Promise[KeyPoint] = js.native
    
    def fundingConfirmations: js.Promise[FundingConfirmations] = js.native
    
    def fundingTransaction: js.Promise[FoundTransaction] = js.native
    
    def getBitcoinAddress(): js.Promise[String] = js.native
    
    def getCollateralizationPercentage(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.native
    
    def getCurrentRedemption(): js.Promise[typings.keepNetworkTbtcJs.srcRedemptionMod.default | Null] = js.native
    
    def getFRT(): js.Promise[js.Object] = js.native
    
    def getInitialCollateralizedPercentage(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.native
    
    def getLotSizeSatoshis(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.native
    
    def getLotSizeTBTC(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.native
    
    def getOwner(): js.Promise[Any] = js.native
    
    def getRedemptionCost(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.native
    
    def getSeverelyUndercollateralizedThresholdPercent(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.native
    
    def getSignerFeeTBTC(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.native
    
    def getTDT(): js.Promise[js.Object] = js.native
    
    def getUndercollateralizedThresholdPercent(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.native
    
    def inVendingMachine(): js.Promise[Boolean] = js.native
    
    def mintTBTC(): js.Promise[String] = js.native
    
    def notifyCourtesyCall(): js.Promise[Unit] = js.native
    
    def notifyCourtesyCallExpired(): js.Promise[Unit] = js.native
    
    def notifyCourtesyTimedOut(): js.Promise[Unit] = js.native
    
    def notifyFundingTimedOut(): js.Promise[Unit] = js.native
    
    def notifyRedemptionProofTimeout(): js.Promise[Unit] = js.native
    
    def notifyRedemptionSignatureTimedOut(): js.Promise[Unit] = js.native
    
    def notifySignerSetupFailed(): js.Promise[Unit] = js.native
    
    def notifyUndercollateralizedLiquidation(): js.Promise[Unit] = js.native
    
    def onActive(activeHandler: js.Function1[/* deposit */ this.type, Unit]): Unit = js.native
    
    def onBitcoinAddressAvailable(bitcoinAddressHandler: js.Function1[/* address */ String, Unit]): Unit = js.native
    
    def onReceivedFundingConfirmation(onReceivedFundingConfirmationHandler: js.Function1[/* fundingConfirmation */ Confirmations, Unit]): Unit = js.native
    
    def provideECDSAFraudProof(v: Double, r: String, s: String, signedDigest: String, preimage: String): js.Promise[Unit] = js.native
    
    def provideFundingECDSAFraudProof(v: Double, r: String, s: String, signedDigest: String, preimage: String): js.Promise[Unit] = js.native
    
    def publicKeyPointToBitcoinAddress(publicKeyPoint: KeyPoint): js.Promise[String] = js.native
    
    def purchaseSignerBondsAtAuction(): js.Promise[Unit] = js.native
    
    def qualifyAndMintTBTC(): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any
      ] = js.native
    
    def readPublishedPubkeyEvent(): js.Promise[Any] = js.native
    
    var receivedFundingConfirmationEmitter: EventEmitter = js.native
    
    def redemptionDetailsFromEvent(redemptionRequestedEventArgs: Digest): RedemptionDetails = js.native
    
    def requestRedemption(redeemerAddress: String): js.Promise[typings.keepNetworkTbtcJs.srcRedemptionMod.default] = js.native
    
    def waitForActiveState(): js.Promise[Boolean] = js.native
    
    def wasSignatureApproved(digest: String): js.Promise[Boolean] = js.native
  }
  
  trait FundingConfirmations extends StObject {
    
    var requiredConfirmations: Double
    
    var transaction: FoundTransaction
  }
  object FundingConfirmations {
    
    inline def apply(requiredConfirmations: Double, transaction: FoundTransaction): FundingConfirmations = {
      val __obj = js.Dynamic.literal(requiredConfirmations = requiredConfirmations.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[FundingConfirmations]
    }
    
    extension [Self <: FundingConfirmations](x: Self) {
      
      inline def setRequiredConfirmations(value: Double): Self = StObject.set(x, "requiredConfirmations", value.asInstanceOf[js.Any])
      
      inline def setTransaction(value: FoundTransaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    }
  }
}
