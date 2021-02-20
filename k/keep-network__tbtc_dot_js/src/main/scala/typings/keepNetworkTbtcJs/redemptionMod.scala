package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.anon.RequiredConfirmationsTransactionID
import typings.keepNetworkTbtcJs.commonTypesMod.DepositBaseClass
import typings.keepNetworkTbtcJs.commonTypesMod.RedemptionDetails
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redemptionMod {
  
  @JSImport("@keep-network/tbtc.js/src/Redemption", JSImport.Default)
  @js.native
  class default protected () extends Redemption {
    def this(deposit: DepositBaseClass) = this()
    def this(deposit: DepositBaseClass, redemptionDetails: RedemptionDetails) = this()
  }
  
  @js.native
  trait AutoSubmitState extends StObject {
    
    var broadcastTransactionID: js.Promise[String] = js.native
    
    var confirmations: js.Promise[RequiredConfirmationsTransactionID] = js.native
    
    var proofTransaction: js.Promise[Unit] = js.native
  }
  object AutoSubmitState {
    
    @scala.inline
    def apply(
      broadcastTransactionID: js.Promise[String],
      confirmations: js.Promise[RequiredConfirmationsTransactionID],
      proofTransaction: js.Promise[Unit]
    ): AutoSubmitState = {
      val __obj = js.Dynamic.literal(broadcastTransactionID = broadcastTransactionID.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], proofTransaction = proofTransaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoSubmitState]
    }
    
    @scala.inline
    implicit class AutoSubmitStateMutableBuilder[Self <: AutoSubmitState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroadcastTransactionID(value: js.Promise[String]): Self = StObject.set(x, "broadcastTransactionID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmations(value: js.Promise[RequiredConfirmationsTransactionID]): Self = StObject.set(x, "confirmations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProofTransaction(value: js.Promise[Unit]): Self = StObject.set(x, "proofTransaction", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Redemption extends StObject {
    
    def autoSubmit(): AutoSubmitState = js.native
    
    var autoSubmittingState: js.UndefOr[AutoSubmitState] = js.native
    
    var deposit: DepositBaseClass = js.native
    
    def getLatestRedemptionDetails(): js.Promise[RedemptionDetails] = js.native
    def getLatestRedemptionDetails(existingRedemptionDetails: RedemptionDetails): js.Promise[RedemptionDetails] = js.native
    
    def onBitcoinTransactionSigned(transactionHandler: js.Function1[/* transaction */ String, Unit]): Unit = js.native
    
    def onReceivedConfirmation(
      onReceivedConfirmationHandler: js.Function2[/* transactionID */ String, /* confirmations */ Double, Unit]
    ): Unit = js.native
    
    def onWithdrawn(withdrawalHandler: js.Function1[/* txHash */ String, Unit]): Unit = js.native
    
    def proveWithdrawal(transactionID: String, confirmations: Double): js.Promise[Unit] = js.native
    
    var receivedConfirmationEmitter: EventEmitter = js.native
    
    var redemptionDetails: js.Promise[RedemptionDetails] = js.native
    
    var signedTransaction: js.Promise[String] = js.native
    
    var unsignedTransactionDetails: js.Promise[UnsignedTransactionDetails] = js.native
    
    var withdrawnEmitter: EventEmitter = js.native
  }
  
  @js.native
  trait UnsignedTransactionDetails extends StObject {
    
    var digest: String = js.native
    
    var hex: String = js.native
  }
  object UnsignedTransactionDetails {
    
    @scala.inline
    def apply(digest: String, hex: String): UnsignedTransactionDetails = {
      val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsignedTransactionDetails]
    }
    
    @scala.inline
    implicit class UnsignedTransactionDetailsMutableBuilder[Self <: UnsignedTransactionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    }
  }
}
