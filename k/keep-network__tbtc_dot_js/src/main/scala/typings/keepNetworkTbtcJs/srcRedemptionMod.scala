package typings.keepNetworkTbtcJs

import typings.keepNetworkTbtcJs.anon.RequiredConfirmationsTransactionID
import typings.keepNetworkTbtcJs.srcCommonTypesMod.DepositBaseClass
import typings.keepNetworkTbtcJs.srcCommonTypesMod.RedemptionDetails
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRedemptionMod {
  
  @JSImport("@keep-network/tbtc.js/src/Redemption", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Redemption {
    def this(deposit: DepositBaseClass) = this()
    def this(deposit: DepositBaseClass, redemptionDetails: RedemptionDetails) = this()
  }
  
  trait AutoSubmitState extends StObject {
    
    var broadcastTransactionID: js.Promise[String]
    
    var confirmations: js.Promise[RequiredConfirmationsTransactionID]
    
    var proofTransaction: js.Promise[Unit]
  }
  object AutoSubmitState {
    
    inline def apply(
      broadcastTransactionID: js.Promise[String],
      confirmations: js.Promise[RequiredConfirmationsTransactionID],
      proofTransaction: js.Promise[Unit]
    ): AutoSubmitState = {
      val __obj = js.Dynamic.literal(broadcastTransactionID = broadcastTransactionID.asInstanceOf[js.Any], confirmations = confirmations.asInstanceOf[js.Any], proofTransaction = proofTransaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoSubmitState]
    }
    
    extension [Self <: AutoSubmitState](x: Self) {
      
      inline def setBroadcastTransactionID(value: js.Promise[String]): Self = StObject.set(x, "broadcastTransactionID", value.asInstanceOf[js.Any])
      
      inline def setConfirmations(value: js.Promise[RequiredConfirmationsTransactionID]): Self = StObject.set(x, "confirmations", value.asInstanceOf[js.Any])
      
      inline def setProofTransaction(value: js.Promise[Unit]): Self = StObject.set(x, "proofTransaction", value.asInstanceOf[js.Any])
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
  
  trait UnsignedTransactionDetails extends StObject {
    
    var digest: String
    
    var hex: String
  }
  object UnsignedTransactionDetails {
    
    inline def apply(digest: String, hex: String): UnsignedTransactionDetails = {
      val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsignedTransactionDetails]
    }
    
    extension [Self <: UnsignedTransactionDetails](x: Self) {
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    }
  }
}
