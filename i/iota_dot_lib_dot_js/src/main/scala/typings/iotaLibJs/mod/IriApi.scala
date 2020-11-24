package typings.iotaLibJs.mod

import typings.iotaLibJs.anon.Addresses
import typings.iotaLibJs.anon.Balances
import typings.iotaLibJs.anon.BranchTransaction
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// iota.api
//
@js.native
trait IriApi extends js.Object {
  
  def addNeighbors(
    uris: js.Array[String],
    callback: js.Function2[/* error */ Error, /* addedNeighbors */ Double, Unit]
  ): Unit = js.native
  
  def attachToTangle(
    trunkTransaction: String,
    branchTransaction: String,
    minWeightMagnitude: Double,
    trytes: js.Array[String],
    callback: js.Function2[/* error */ Error, /* trytes */ js.Array[String], Unit]
  ): Unit = js.native
  
  def broadcastTransactions(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ Error, /* response */ js.Object, Unit]
  ): Unit = js.native
  
  def findTransactions(
    searchValues: Addresses,
    callback: js.Function2[/* error */ Error, /* hashes */ js.Array[String], Unit]
  ): Unit = js.native
  
  def getBalances(
    addresses: js.Array[String],
    treshold: Double,
    callback: js.Function2[/* error */ Error, /* response */ Balances, Unit]
  ): Unit = js.native
  
  def getInclusionStates(
    transactions: js.Array[String],
    tips: js.Array[String],
    callback: js.Function2[/* error */ Error, /* states */ js.Array[Boolean], Unit]
  ): Unit = js.native
  
  def getNeighbors(callback: js.Function2[/* error */ Error, /* neighbors */ js.Array[Neighbor], Unit]): Unit = js.native
  
  def getNodeInfo(callback: js.Function2[/* error */ Error, /* info */ NodeInfo, Unit]): Unit = js.native
  
  def getTips(callback: js.Function2[/* error */ Error, /* hashes */ js.Array[String], Unit]): Unit = js.native
  
  def getTransactionsToApprove(depth: Double, callback: js.Function2[/* error */ Error, /* response */ BranchTransaction, Unit]): Unit = js.native
  
  def getTrytes(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ Error, /* trytes */ js.Array[String], Unit]
  ): Unit = js.native
  
  def interruptAttachingToTangle(callback: js.Function2[/* error */ Error, /* response */ js.Object, Unit]): Unit = js.native
  
  def removeNeighbors(
    uris: js.Array[String],
    callback: js.Function2[/* error */ Error, /* removedNeighbors */ js.Array[Double], Unit]
  ): Unit = js.native
  
  def storeTransactions(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ Error, /* response */ js.Object, Unit]
  ): Unit = js.native
}
object IriApi {
  
  @scala.inline
  def apply(
    addNeighbors: (js.Array[String], js.Function2[/* error */ Error, /* addedNeighbors */ Double, Unit]) => Unit,
    attachToTangle: (String, String, Double, js.Array[String], js.Function2[/* error */ Error, /* trytes */ js.Array[String], Unit]) => Unit,
    broadcastTransactions: (js.Array[String], js.Function2[/* error */ Error, /* response */ js.Object, Unit]) => Unit,
    findTransactions: (Addresses, js.Function2[/* error */ Error, /* hashes */ js.Array[String], Unit]) => Unit,
    getBalances: (js.Array[String], Double, js.Function2[/* error */ Error, /* response */ Balances, Unit]) => Unit,
    getInclusionStates: (js.Array[String], js.Array[String], js.Function2[/* error */ Error, /* states */ js.Array[Boolean], Unit]) => Unit,
    getNeighbors: js.Function2[/* error */ Error, /* neighbors */ js.Array[Neighbor], Unit] => Unit,
    getNodeInfo: js.Function2[/* error */ Error, /* info */ NodeInfo, Unit] => Unit,
    getTips: js.Function2[/* error */ Error, /* hashes */ js.Array[String], Unit] => Unit,
    getTransactionsToApprove: (Double, js.Function2[/* error */ Error, /* response */ BranchTransaction, Unit]) => Unit,
    getTrytes: (js.Array[String], js.Function2[/* error */ Error, /* trytes */ js.Array[String], Unit]) => Unit,
    interruptAttachingToTangle: js.Function2[/* error */ Error, /* response */ js.Object, Unit] => Unit,
    removeNeighbors: (js.Array[String], js.Function2[/* error */ Error, /* removedNeighbors */ js.Array[Double], Unit]) => Unit,
    storeTransactions: (js.Array[String], js.Function2[/* error */ Error, /* response */ js.Object, Unit]) => Unit
  ): IriApi = {
    val __obj = js.Dynamic.literal(addNeighbors = js.Any.fromFunction2(addNeighbors), attachToTangle = js.Any.fromFunction5(attachToTangle), broadcastTransactions = js.Any.fromFunction2(broadcastTransactions), findTransactions = js.Any.fromFunction2(findTransactions), getBalances = js.Any.fromFunction3(getBalances), getInclusionStates = js.Any.fromFunction3(getInclusionStates), getNeighbors = js.Any.fromFunction1(getNeighbors), getNodeInfo = js.Any.fromFunction1(getNodeInfo), getTips = js.Any.fromFunction1(getTips), getTransactionsToApprove = js.Any.fromFunction2(getTransactionsToApprove), getTrytes = js.Any.fromFunction2(getTrytes), interruptAttachingToTangle = js.Any.fromFunction1(interruptAttachingToTangle), removeNeighbors = js.Any.fromFunction2(removeNeighbors), storeTransactions = js.Any.fromFunction2(storeTransactions))
    __obj.asInstanceOf[IriApi]
  }
  
  @scala.inline
  implicit class IriApiOps[Self <: IriApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddNeighbors(
      value: (js.Array[String], js.Function2[/* error */ Error, /* addedNeighbors */ Double, Unit]) => Unit
    ): Self = this.set("addNeighbors", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAttachToTangle(
      value: (String, String, Double, js.Array[String], js.Function2[/* error */ Error, /* trytes */ js.Array[String], Unit]) => Unit
    ): Self = this.set("attachToTangle", js.Any.fromFunction5(value))
    
    @scala.inline
    def setBroadcastTransactions(value: (js.Array[String], js.Function2[/* error */ Error, /* response */ js.Object, Unit]) => Unit): Self = this.set("broadcastTransactions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindTransactions(value: (Addresses, js.Function2[/* error */ Error, /* hashes */ js.Array[String], Unit]) => Unit): Self = this.set("findTransactions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBalances(
      value: (js.Array[String], Double, js.Function2[/* error */ Error, /* response */ Balances, Unit]) => Unit
    ): Self = this.set("getBalances", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetInclusionStates(
      value: (js.Array[String], js.Array[String], js.Function2[/* error */ Error, /* states */ js.Array[Boolean], Unit]) => Unit
    ): Self = this.set("getInclusionStates", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetNeighbors(value: js.Function2[/* error */ Error, /* neighbors */ js.Array[Neighbor], Unit] => Unit): Self = this.set("getNeighbors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeInfo(value: js.Function2[/* error */ Error, /* info */ NodeInfo, Unit] => Unit): Self = this.set("getNodeInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTips(value: js.Function2[/* error */ Error, /* hashes */ js.Array[String], Unit] => Unit): Self = this.set("getTips", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTransactionsToApprove(value: (Double, js.Function2[/* error */ Error, /* response */ BranchTransaction, Unit]) => Unit): Self = this.set("getTransactionsToApprove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTrytes(
      value: (js.Array[String], js.Function2[/* error */ Error, /* trytes */ js.Array[String], Unit]) => Unit
    ): Self = this.set("getTrytes", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterruptAttachingToTangle(value: js.Function2[/* error */ Error, /* response */ js.Object, Unit] => Unit): Self = this.set("interruptAttachingToTangle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveNeighbors(
      value: (js.Array[String], js.Function2[/* error */ Error, /* removedNeighbors */ js.Array[Double], Unit]) => Unit
    ): Self = this.set("removeNeighbors", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStoreTransactions(value: (js.Array[String], js.Function2[/* error */ Error, /* response */ js.Object, Unit]) => Unit): Self = this.set("storeTransactions", js.Any.fromFunction2(value))
  }
}
