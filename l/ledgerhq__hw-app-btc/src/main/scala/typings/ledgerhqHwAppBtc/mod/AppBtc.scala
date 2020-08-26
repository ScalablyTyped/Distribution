package typings.ledgerhqHwAppBtc.mod

import typings.ledgerhqHwAppBtc.anon.BitcoinAddress
import typings.ledgerhqHwAppBtc.anon.Format
import typings.ledgerhqHwAppBtc.anon.R
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppBtc extends js.Object {
  def createPaymentTransactionNew(arg: CreateTransactionArg): js.Promise[String] = js.native
  def getTrustedInput(indexLookup: Double, transaction: Transaction): js.Promise[String] = js.native
  def getTrustedInput(indexLookup: Double, transaction: Transaction, additionals: js.Array[String]): js.Promise[String] = js.native
  def getTrustedInputBIP143(indexLookup: Double, transaction: Transaction): String = js.native
  def getTrustedInputBIP143(indexLookup: Double, transaction: Transaction, additionals: js.Array[String]): String = js.native
  def getWalletPublicKey(path: String): js.Promise[BitcoinAddress] = js.native
  def getWalletPublicKey(path: String, opts: Boolean): js.Promise[BitcoinAddress] = js.native
  def getWalletPublicKey(path: String, opts: Format): js.Promise[BitcoinAddress] = js.native
  def serializeTransactionOutputs(t: Transaction): Buffer = js.native
  def signMessageNew(path: String, messageHex: String): js.Promise[R] = js.native
  def signP2SHTransaction(arg: SignP2SHTransactionArg): js.Promise[js.Array[String]] = js.native
  def splitTransaction(transactionHex: String): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: js.UndefOr[scala.Nothing],
    hasTimestamp: js.UndefOr[scala.Nothing],
    hasExtraData: js.UndefOr[scala.Nothing],
    additionals: js.Array[String]
  ): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: js.UndefOr[scala.Nothing],
    hasTimestamp: js.UndefOr[scala.Nothing],
    hasExtraData: Boolean
  ): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: js.UndefOr[scala.Nothing],
    hasTimestamp: js.UndefOr[scala.Nothing],
    hasExtraData: Boolean,
    additionals: js.Array[String]
  ): Transaction = js.native
  def splitTransaction(transactionHex: String, isSegwitSupported: js.UndefOr[scala.Nothing], hasTimestamp: Boolean): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: js.UndefOr[scala.Nothing],
    hasTimestamp: Boolean,
    hasExtraData: js.UndefOr[scala.Nothing],
    additionals: js.Array[String]
  ): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: js.UndefOr[scala.Nothing],
    hasTimestamp: Boolean,
    hasExtraData: Boolean
  ): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: js.UndefOr[scala.Nothing],
    hasTimestamp: Boolean,
    hasExtraData: Boolean,
    additionals: js.Array[String]
  ): Transaction = js.native
  def splitTransaction(transactionHex: String, isSegwitSupported: Boolean): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: Boolean,
    hasTimestamp: js.UndefOr[scala.Nothing],
    hasExtraData: js.UndefOr[scala.Nothing],
    additionals: js.Array[String]
  ): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: Boolean,
    hasTimestamp: js.UndefOr[scala.Nothing],
    hasExtraData: Boolean
  ): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: Boolean,
    hasTimestamp: js.UndefOr[scala.Nothing],
    hasExtraData: Boolean,
    additionals: js.Array[String]
  ): Transaction = js.native
  def splitTransaction(transactionHex: String, isSegwitSupported: Boolean, hasTimestamp: Boolean): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: Boolean,
    hasTimestamp: Boolean,
    hasExtraData: js.UndefOr[scala.Nothing],
    additionals: js.Array[String]
  ): Transaction = js.native
  def splitTransaction(transactionHex: String, isSegwitSupported: Boolean, hasTimestamp: Boolean, hasExtraData: Boolean): Transaction = js.native
  def splitTransaction(
    transactionHex: String,
    isSegwitSupported: Boolean,
    hasTimestamp: Boolean,
    hasExtraData: Boolean,
    additionals: js.Array[String]
  ): Transaction = js.native
}

