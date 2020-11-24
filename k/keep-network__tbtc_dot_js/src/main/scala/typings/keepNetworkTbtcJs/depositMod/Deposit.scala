package typings.keepNetworkTbtcJs.depositMod

import typings.keepNetworkTbtcJs.anon.Confirmations
import typings.keepNetworkTbtcJs.anon.Digest
import typings.keepNetworkTbtcJs.bitcoinHelpersMod.FoundTransaction
import typings.keepNetworkTbtcJs.commonTypesMod.DepositBaseClass
import typings.keepNetworkTbtcJs.commonTypesMod.KeyPoint
import typings.keepNetworkTbtcJs.commonTypesMod.RedemptionDetails
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deposit extends DepositBaseClass {
  
  var _fundingConfirmations: js.UndefOr[js.Promise[FundingConfirmations]] = js.native
  
  var _fundingTransaction: js.UndefOr[js.Promise[FoundTransaction]] = js.native
  
  var activeStatePromise: js.Promise[Boolean] = js.native
  
  def auctionValue(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
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
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
  ] = js.native
  
  def getCurrentRedemption(): js.Promise[typings.keepNetworkTbtcJs.redemptionMod.default | Null] = js.native
  
  def getFRT(): js.Promise[js.Object] = js.native
  
  def getInitialCollateralizedPercentage(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
  ] = js.native
  
  def getLotSizeSatoshis(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
  ] = js.native
  
  def getLotSizeTBTC(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
  ] = js.native
  
  def getOwner(): js.Promise[_] = js.native
  
  def getRedemptionCost(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
  ] = js.native
  
  def getSeverelyUndercollateralizedThresholdPercent(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
  ] = js.native
  
  def getSignerFeeTBTC(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
  ] = js.native
  
  def getTDT(): js.Promise[js.Object] = js.native
  
  def getUndercollateralizedThresholdPercent(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
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
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
  ] = js.native
  
  def readPublishedPubkeyEvent(): js.Promise[_] = js.native
  
  var receivedFundingConfirmationEmitter: EventEmitter = js.native
  
  def redemptionDetailsFromEvent(redemptionRequestedEventArgs: Digest): RedemptionDetails = js.native
  
  def requestRedemption(redeemerAddress: String): js.Promise[typings.keepNetworkTbtcJs.redemptionMod.default] = js.native
  
  def waitForActiveState(): js.Promise[Boolean] = js.native
  
  def wasSignatureApproved(digest: String): js.Promise[Boolean] = js.native
}
