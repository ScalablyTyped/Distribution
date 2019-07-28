package typings.libraDashCore.libraDashCoreMod

import typings.bignumberDotJs.bignumberDotJsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "LibraClient")
@js.native
class LibraClient protected () extends js.Object {
  def this(config: LibraLibConfig) = this()
  def execute(transaction: LibraTransaction, sender: Account): js.Promise[LibraTransactionResponse] = js.native
  def getAccountState(address: AccountAddressLike): js.Promise[AccountState] = js.native
  def getAccountStates(addresses: js.Array[AccountAddressLike]): js.Promise[AccountStates] = js.native
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: String): js.Promise[LibraSignedTransactionWithProof | Null] = js.native
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: String, fetchEvents: Boolean): js.Promise[LibraSignedTransactionWithProof | Null] = js.native
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: Double): js.Promise[LibraSignedTransactionWithProof | Null] = js.native
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: Double, fetchEvents: Boolean): js.Promise[LibraSignedTransactionWithProof | Null] = js.native
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: default): js.Promise[LibraSignedTransactionWithProof | Null] = js.native
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: default, fetchEvents: Boolean): js.Promise[LibraSignedTransactionWithProof | Null] = js.native
  def mintWithFaucetService(receiver: String, numCoins: String): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: String, numCoins: String, waitForConfirmation: Boolean): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: String, numCoins: Double): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: String, numCoins: Double, waitForConfirmation: Boolean): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: String, numCoins: default): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: String, numCoins: default, waitForConfirmation: Boolean): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: String): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: String, waitForConfirmation: Boolean): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: Double): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: Double, waitForConfirmation: Boolean): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: default): js.Promise[String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: default, waitForConfirmation: Boolean): js.Promise[String] = js.native
  def signTransaction(transaction: LibraTransaction, keyPair: KeyPair): js.Promise[LibraSignedTransaction] = js.native
  def transferCoins(sender: Account, recipientAddress: String, numCoins: String): js.Promise[LibraTransactionResponse] = js.native
  def transferCoins(sender: Account, recipientAddress: String, numCoins: Double): js.Promise[LibraTransactionResponse] = js.native
  def transferCoins(sender: Account, recipientAddress: String, numCoins: default): js.Promise[LibraTransactionResponse] = js.native
  def waitForConfirmation(accountAddress: String, transactionSequenceNumber: String): js.Promise[Unit] = js.native
  def waitForConfirmation(accountAddress: String, transactionSequenceNumber: Double): js.Promise[Unit] = js.native
  def waitForConfirmation(accountAddress: String, transactionSequenceNumber: default): js.Promise[Unit] = js.native
  def waitForConfirmation(accountAddress: AccountAddress, transactionSequenceNumber: String): js.Promise[Unit] = js.native
  def waitForConfirmation(accountAddress: AccountAddress, transactionSequenceNumber: Double): js.Promise[Unit] = js.native
  def waitForConfirmation(accountAddress: AccountAddress, transactionSequenceNumber: default): js.Promise[Unit] = js.native
}

