package typings.keepNetworkTbtcJs.redemptionMod

import typings.keepNetworkTbtcJs.commonTypesMod.DepositBaseClass
import typings.keepNetworkTbtcJs.commonTypesMod.RedemptionDetails
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redemption extends js.Object {
  
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
