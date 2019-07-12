package typings
package libraDashCoreLib.libraDashCoreMod

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
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default): js.Promise[LibraSignedTransactionWithProof | scala.Null] = js.native
  def getAccountTransaction(
    address: AccountAddressLike,
    sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default,
    fetchEvents: scala.Boolean
  ): js.Promise[LibraSignedTransactionWithProof | scala.Null] = js.native
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: java.lang.String): js.Promise[LibraSignedTransactionWithProof | scala.Null] = js.native
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: java.lang.String, fetchEvents: scala.Boolean): js.Promise[LibraSignedTransactionWithProof | scala.Null] = js.native
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: scala.Double): js.Promise[LibraSignedTransactionWithProof | scala.Null] = js.native
  def getAccountTransaction(address: AccountAddressLike, sequenceNumber: scala.Double, fetchEvents: scala.Boolean): js.Promise[LibraSignedTransactionWithProof | scala.Null] = js.native
  def mintWithFaucetService(receiver: java.lang.String, numCoins: bignumberDotJsLib.bignumberDotJsMod.default): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(
    receiver: java.lang.String,
    numCoins: bignumberDotJsLib.bignumberDotJsMod.default,
    waitForConfirmation: scala.Boolean
  ): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(receiver: java.lang.String, numCoins: java.lang.String): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(receiver: java.lang.String, numCoins: java.lang.String, waitForConfirmation: scala.Boolean): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(receiver: java.lang.String, numCoins: scala.Double): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(receiver: java.lang.String, numCoins: scala.Double, waitForConfirmation: scala.Boolean): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: bignumberDotJsLib.bignumberDotJsMod.default): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(
    receiver: AccountAddress,
    numCoins: bignumberDotJsLib.bignumberDotJsMod.default,
    waitForConfirmation: scala.Boolean
  ): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: java.lang.String): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: java.lang.String, waitForConfirmation: scala.Boolean): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: scala.Double): js.Promise[java.lang.String] = js.native
  def mintWithFaucetService(receiver: AccountAddress, numCoins: scala.Double, waitForConfirmation: scala.Boolean): js.Promise[java.lang.String] = js.native
  def signTransaction(transaction: LibraTransaction, keyPair: KeyPair): js.Promise[LibraSignedTransaction] = js.native
  def transferCoins(
    sender: Account,
    recipientAddress: java.lang.String,
    numCoins: bignumberDotJsLib.bignumberDotJsMod.default
  ): js.Promise[LibraTransactionResponse] = js.native
  def transferCoins(sender: Account, recipientAddress: java.lang.String, numCoins: java.lang.String): js.Promise[LibraTransactionResponse] = js.native
  def transferCoins(sender: Account, recipientAddress: java.lang.String, numCoins: scala.Double): js.Promise[LibraTransactionResponse] = js.native
  def waitForConfirmation(
    accountAddress: java.lang.String,
    transactionSequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default
  ): js.Promise[scala.Unit] = js.native
  def waitForConfirmation(accountAddress: java.lang.String, transactionSequenceNumber: java.lang.String): js.Promise[scala.Unit] = js.native
  def waitForConfirmation(accountAddress: java.lang.String, transactionSequenceNumber: scala.Double): js.Promise[scala.Unit] = js.native
  def waitForConfirmation(
    accountAddress: AccountAddress,
    transactionSequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default
  ): js.Promise[scala.Unit] = js.native
  def waitForConfirmation(accountAddress: AccountAddress, transactionSequenceNumber: java.lang.String): js.Promise[scala.Unit] = js.native
  def waitForConfirmation(accountAddress: AccountAddress, transactionSequenceNumber: scala.Double): js.Promise[scala.Unit] = js.native
}

