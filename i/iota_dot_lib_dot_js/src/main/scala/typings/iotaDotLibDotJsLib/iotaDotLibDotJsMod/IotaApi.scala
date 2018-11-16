package typings
package iotaDotLibDotJsLib.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// iota.api
//
@js.native
trait IotaApi extends IriApi {
  def broadcastAndStore(trytes: js.Array[java.lang.String]): scala.Unit = js.native
  def broadcastAndStore(
    trytes: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* response */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def broadcastBundle(transactionHash: java.lang.String): scala.Unit = js.native
  def broadcastBundle(
    transactionHash: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* response */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def findTransactionObjects(searchValues: iotaDotLibDotJsLib.Anon_Addresses): scala.Unit = js.native
  def findTransactionObjects(
    searchValues: iotaDotLibDotJsLib.Anon_Addresses,
    callback: js.Function2[/* error */ stdLib.Error, /* transactions */ js.Array[TransactionObject], scala.Unit]
  ): scala.Unit = js.native
  def getAccountData(seed: java.lang.String): scala.Unit = js.native
  def getAccountData(seed: java.lang.String, options: iotaDotLibDotJsLib.Anon_Security): scala.Unit = js.native
  def getAccountData(
    seed: java.lang.String,
    options: iotaDotLibDotJsLib.Anon_Security,
    callback: js.Function2[/* error */ stdLib.Error, /* response */ iotaDotLibDotJsLib.Anon_Balance, scala.Unit]
  ): scala.Unit = js.native
  def getBundle(transactionHash: java.lang.String): scala.Unit = js.native
  def getBundle(
    transactionHash: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* bundle */ js.Array[TransactionObject], scala.Unit]
  ): scala.Unit = js.native
  def getInputs(seed: java.lang.String): scala.Unit = js.native
  def getInputs(seed: java.lang.String, options: iotaDotLibDotJsLib.Anon_Threshold): scala.Unit = js.native
  def getInputs(
    seed: java.lang.String,
    options: iotaDotLibDotJsLib.Anon_Threshold,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* response */ iotaDotLibDotJsLib.Anon_InputsArray, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getLatestInclusion(hashes: js.Array[java.lang.String]): scala.Unit = js.native
  def getLatestInclusion(
    hashes: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* states */ js.Array[scala.Boolean], scala.Unit]
  ): scala.Unit = js.native
  def getNewAddress(seed: java.lang.String): scala.Unit = js.native
  def getNewAddress(seed: java.lang.String, options: iotaDotLibDotJsLib.Anon_SecurityTotal): scala.Unit = js.native
  def getNewAddress(
    seed: java.lang.String,
    options: iotaDotLibDotJsLib.Anon_SecurityTotal,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* response */ java.lang.String | js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getTransactionsObjects(hashes: js.Array[java.lang.String]): scala.Unit = js.native
  def getTransactionsObjects(
    hashes: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* transactions */ js.Array[TransactionObject], scala.Unit]
  ): scala.Unit = js.native
  def getTransfers(seed: java.lang.String): scala.Unit = js.native
  def getTransfers(seed: java.lang.String, options: iotaDotLibDotJsLib.Anon_InclusionStates): scala.Unit = js.native
  def getTransfers(
    seed: java.lang.String,
    options: iotaDotLibDotJsLib.Anon_InclusionStates,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* transfers */ js.Array[js.Array[TransactionObject]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def isReattachable(address: java.lang.String): scala.Unit = js.native
  def isReattachable(
    address: java.lang.String,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* response */ scala.Boolean | js.Array[scala.Boolean], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def isReattachable(address: js.Array[java.lang.String]): scala.Unit = js.native
  def isReattachable(
    address: js.Array[java.lang.String],
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* response */ scala.Boolean | js.Array[scala.Boolean], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def prepareTransfers(seed: java.lang.String, transfers: js.Array[TransferObject]): scala.Unit = js.native
  def prepareTransfers(
    seed: java.lang.String,
    transfers: js.Array[TransferObject],
    options: iotaDotLibDotJsLib.Anon_AddressSecurity
  ): scala.Unit = js.native
  def prepareTransfers(
    seed: java.lang.String,
    transfers: js.Array[TransferObject],
    options: iotaDotLibDotJsLib.Anon_AddressSecurity,
    callback: js.Function2[/* error */ stdLib.Error, /* response */ iotaDotLibDotJsLib.Anon_Trytes, scala.Unit]
  ): scala.Unit = js.native
  def replayBundle(transactionHash: java.lang.String, depth: scala.Double, minWeightMagnitude: scala.Double): scala.Unit = js.native
  def replayBundle(
    transactionHash: java.lang.String,
    depth: scala.Double,
    minWeightMagnitude: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error, /* response */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def sendTransfer(
    seed: java.lang.String,
    depth: scala.Double,
    minWeightMagnitude: scala.Double,
    transfers: js.Array[TransferObject]
  ): scala.Unit = js.native
  def sendTransfer(
    seed: java.lang.String,
    depth: scala.Double,
    minWeightMagnitude: scala.Double,
    transfers: js.Array[TransferObject],
    options: iotaDotLibDotJsLib.Anon_Address
  ): scala.Unit = js.native
  def sendTransfer(
    seed: java.lang.String,
    depth: scala.Double,
    minWeightMagnitude: scala.Double,
    transfers: js.Array[TransferObject],
    options: iotaDotLibDotJsLib.Anon_Address,
    callback: js.Function2[/* error */ stdLib.Error, /* response */ iotaDotLibDotJsLib.Anon_Inputs, scala.Unit]
  ): scala.Unit = js.native
  def sendTrytes(trytes: js.Array[java.lang.String], depth: scala.Double, minWeightMagnitude: scala.Double): scala.Unit = js.native
  def sendTrytes(
    trytes: js.Array[java.lang.String],
    depth: scala.Double,
    minWeightMagnitude: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error, /* response */ iotaDotLibDotJsLib.Anon_Inputs, scala.Unit]
  ): scala.Unit = js.native
}

