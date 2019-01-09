package typings
package iotaDotLibDotJsLib.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// iota.api
//
trait IriApi extends js.Object {
  def addNeighbors(
    uris: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* addedNeighbors */ scala.Double, scala.Unit]
  ): scala.Unit
  def attachToTangle(
    trunkTransaction: java.lang.String,
    branchTransaction: java.lang.String,
    minWeightMagnitude: scala.Double,
    trytes: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* trytes */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit
  def broadcastTransactions(
    trytes: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* response */ js.Object, scala.Unit]
  ): scala.Unit
  def findTransactions(
    searchValues: iotaDotLibDotJsLib.Anon_Addresses,
    callback: js.Function2[/* error */ stdLib.Error, /* hashes */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit
  def getBalances(
    addresses: js.Array[java.lang.String],
    treshold: scala.Double,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* response */ iotaDotLibDotJsLib.Anon_Balances, 
      scala.Unit
    ]
  ): scala.Unit
  def getInclusionStates(
    transactions: js.Array[java.lang.String],
    tips: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* states */ js.Array[scala.Boolean], scala.Unit]
  ): scala.Unit
  def getNeighbors(callback: js.Function2[/* error */ stdLib.Error, /* neighbors */ js.Array[Neighbor], scala.Unit]): scala.Unit
  def getNodeInfo(callback: js.Function2[/* error */ stdLib.Error, /* info */ NodeInfo, scala.Unit]): scala.Unit
  def getTips(
    callback: js.Function2[/* error */ stdLib.Error, /* hashes */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit
  def getTransactionsToApprove(
    depth: scala.Double,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* response */ iotaDotLibDotJsLib.Anon_BranchTransaction, 
      scala.Unit
    ]
  ): scala.Unit
  def getTrytes(
    hashes: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* trytes */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit
  def interruptAttachingToTangle(callback: js.Function2[/* error */ stdLib.Error, /* response */ js.Object, scala.Unit]): scala.Unit
  def removeNeighbors(
    uris: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* removedNeighbors */ js.Array[scala.Double], scala.Unit]
  ): scala.Unit
  def storeTransactions(
    trytes: js.Array[java.lang.String],
    callback: js.Function2[/* error */ stdLib.Error, /* response */ js.Object, scala.Unit]
  ): scala.Unit
}

