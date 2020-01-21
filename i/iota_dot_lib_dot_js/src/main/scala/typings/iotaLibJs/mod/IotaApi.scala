package typings.iotaLibJs.mod

import typings.iotaLibJs.AnonAddress
import typings.iotaLibJs.AnonAddressInputs
import typings.iotaLibJs.AnonAddresses
import typings.iotaLibJs.AnonAddressesBalance
import typings.iotaLibJs.AnonChecksum
import typings.iotaLibJs.AnonEnd
import typings.iotaLibJs.AnonEndInclusionStates
import typings.iotaLibJs.AnonEndSecurity
import typings.iotaLibJs.AnonInputs
import typings.iotaLibJs.AnonInputsArray
import typings.iotaLibJs.AnonTrytes
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// iota.api
//
@js.native
trait IotaApi extends IriApi {
  def broadcastAndStore(trytes: js.Array[String]): Unit = js.native
  def broadcastAndStore(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ Error, /* response */ js.Object, Unit]
  ): Unit = js.native
  def broadcastBundle(transactionHash: String): Unit = js.native
  def broadcastBundle(transactionHash: String, callback: js.Function2[/* error */ Error, /* response */ js.Object, Unit]): Unit = js.native
  def findTransactionObjects(searchValues: AnonAddresses): Unit = js.native
  def findTransactionObjects(
    searchValues: AnonAddresses,
    callback: js.Function2[/* error */ Error, /* transactions */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  def getAccountData(seed: String): Unit = js.native
  def getAccountData(seed: String, options: AnonEndSecurity): Unit = js.native
  def getAccountData(
    seed: String,
    options: AnonEndSecurity,
    callback: js.Function2[/* error */ Error, /* response */ AnonAddressesBalance, Unit]
  ): Unit = js.native
  def getBundle(transactionHash: String): Unit = js.native
  def getBundle(
    transactionHash: String,
    callback: js.Function2[/* error */ Error, /* bundle */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  def getInputs(seed: String): Unit = js.native
  def getInputs(seed: String, options: AnonEnd): Unit = js.native
  def getInputs(
    seed: String,
    options: AnonEnd,
    callback: js.Function2[/* error */ Error, /* response */ AnonInputs, Unit]
  ): Unit = js.native
  def getLatestInclusion(hashes: js.Array[String]): Unit = js.native
  def getLatestInclusion(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ Error, /* states */ js.Array[Boolean], Unit]
  ): Unit = js.native
  def getNewAddress(seed: String): Unit = js.native
  def getNewAddress(seed: String, options: AnonChecksum): Unit = js.native
  def getNewAddress(
    seed: String,
    options: AnonChecksum,
    callback: js.Function2[/* error */ Error, /* response */ String | js.Array[String], Unit]
  ): Unit = js.native
  def getTransactionsObjects(hashes: js.Array[String]): Unit = js.native
  def getTransactionsObjects(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ Error, /* transactions */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  def getTransfers(seed: String): Unit = js.native
  def getTransfers(seed: String, options: AnonEndInclusionStates): Unit = js.native
  def getTransfers(
    seed: String,
    options: AnonEndInclusionStates,
    callback: js.Function2[/* error */ Error, /* transfers */ js.Array[js.Array[TransactionObject]], Unit]
  ): Unit = js.native
  def isReattachable(address: String): Unit = js.native
  def isReattachable(
    address: String,
    callback: js.Function2[/* error */ Error, /* response */ Boolean | js.Array[Boolean], Unit]
  ): Unit = js.native
  def isReattachable(address: js.Array[String]): Unit = js.native
  def isReattachable(
    address: js.Array[String],
    callback: js.Function2[/* error */ Error, /* response */ Boolean | js.Array[Boolean], Unit]
  ): Unit = js.native
  def prepareTransfers(seed: String, transfers: js.Array[TransferObject]): Unit = js.native
  def prepareTransfers(seed: String, transfers: js.Array[TransferObject], options: AnonAddress): Unit = js.native
  def prepareTransfers(
    seed: String,
    transfers: js.Array[TransferObject],
    options: AnonAddress,
    callback: js.Function2[/* error */ Error, /* response */ AnonTrytes, Unit]
  ): Unit = js.native
  def replayBundle(transactionHash: String, depth: Double, minWeightMagnitude: Double): Unit = js.native
  def replayBundle(
    transactionHash: String,
    depth: Double,
    minWeightMagnitude: Double,
    callback: js.Function2[/* error */ Error, /* response */ js.Object, Unit]
  ): Unit = js.native
  def sendTransfer(seed: String, depth: Double, minWeightMagnitude: Double, transfers: js.Array[TransferObject]): Unit = js.native
  def sendTransfer(
    seed: String,
    depth: Double,
    minWeightMagnitude: Double,
    transfers: js.Array[TransferObject],
    options: AnonAddressInputs
  ): Unit = js.native
  def sendTransfer(
    seed: String,
    depth: Double,
    minWeightMagnitude: Double,
    transfers: js.Array[TransferObject],
    options: AnonAddressInputs,
    callback: js.Function2[/* error */ Error, /* response */ AnonInputsArray, Unit]
  ): Unit = js.native
  def sendTrytes(trytes: js.Array[String], depth: Double, minWeightMagnitude: Double): Unit = js.native
  def sendTrytes(
    trytes: js.Array[String],
    depth: Double,
    minWeightMagnitude: Double,
    callback: js.Function2[/* error */ Error, /* response */ AnonInputsArray, Unit]
  ): Unit = js.native
}

