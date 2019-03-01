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

object IriApi {
  @scala.inline
  def apply(
    addNeighbors: js.Function2[
      js.Array[java.lang.String], 
      js.Function2[/* error */ stdLib.Error, /* addedNeighbors */ scala.Double, scala.Unit], 
      scala.Unit
    ],
    attachToTangle: js.Function5[
      java.lang.String, 
      java.lang.String, 
      scala.Double, 
      js.Array[java.lang.String], 
      js.Function2[/* error */ stdLib.Error, /* trytes */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ],
    broadcastTransactions: js.Function2[
      js.Array[java.lang.String], 
      js.Function2[/* error */ stdLib.Error, /* response */ js.Object, scala.Unit], 
      scala.Unit
    ],
    findTransactions: js.Function2[
      iotaDotLibDotJsLib.Anon_Addresses, 
      js.Function2[/* error */ stdLib.Error, /* hashes */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ],
    getBalances: js.Function3[
      js.Array[java.lang.String], 
      scala.Double, 
      js.Function2[
        /* error */ stdLib.Error, 
        /* response */ iotaDotLibDotJsLib.Anon_Balances, 
        scala.Unit
      ], 
      scala.Unit
    ],
    getInclusionStates: js.Function3[
      js.Array[java.lang.String], 
      js.Array[java.lang.String], 
      js.Function2[/* error */ stdLib.Error, /* states */ js.Array[scala.Boolean], scala.Unit], 
      scala.Unit
    ],
    getNeighbors: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* neighbors */ js.Array[Neighbor], scala.Unit], 
      scala.Unit
    ],
    getNodeInfo: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* info */ NodeInfo, scala.Unit], 
      scala.Unit
    ],
    getTips: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* hashes */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ],
    getTransactionsToApprove: js.Function2[
      scala.Double, 
      js.Function2[
        /* error */ stdLib.Error, 
        /* response */ iotaDotLibDotJsLib.Anon_BranchTransaction, 
        scala.Unit
      ], 
      scala.Unit
    ],
    getTrytes: js.Function2[
      js.Array[java.lang.String], 
      js.Function2[/* error */ stdLib.Error, /* trytes */ js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ],
    interruptAttachingToTangle: js.Function1[
      js.Function2[/* error */ stdLib.Error, /* response */ js.Object, scala.Unit], 
      scala.Unit
    ],
    removeNeighbors: js.Function2[
      js.Array[java.lang.String], 
      js.Function2[/* error */ stdLib.Error, /* removedNeighbors */ js.Array[scala.Double], scala.Unit], 
      scala.Unit
    ],
    storeTransactions: js.Function2[
      js.Array[java.lang.String], 
      js.Function2[/* error */ stdLib.Error, /* response */ js.Object, scala.Unit], 
      scala.Unit
    ]
  ): IriApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNeighbors")(addNeighbors)
    __obj.updateDynamic("attachToTangle")(attachToTangle)
    __obj.updateDynamic("broadcastTransactions")(broadcastTransactions)
    __obj.updateDynamic("findTransactions")(findTransactions)
    __obj.updateDynamic("getBalances")(getBalances)
    __obj.updateDynamic("getInclusionStates")(getInclusionStates)
    __obj.updateDynamic("getNeighbors")(getNeighbors)
    __obj.updateDynamic("getNodeInfo")(getNodeInfo)
    __obj.updateDynamic("getTips")(getTips)
    __obj.updateDynamic("getTransactionsToApprove")(getTransactionsToApprove)
    __obj.updateDynamic("getTrytes")(getTrytes)
    __obj.updateDynamic("interruptAttachingToTangle")(interruptAttachingToTangle)
    __obj.updateDynamic("removeNeighbors")(removeNeighbors)
    __obj.updateDynamic("storeTransactions")(storeTransactions)
    __obj.asInstanceOf[IriApi]
  }
}

