package typings.keepNetworkTbtcJs.electrumClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  def broadcastTransaction(rawTX: String): String = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def connect(): js.Promise[Unit] = js.native
  
  var electrumClient: js.Any = js.native
  
  def findOutputForAddress(txHash: String, address: String): Double = js.native
  
  def getBalanceOfScript(script: String): js.Any = js.native
  
  def getHeadersChain(blockHeight: Double, confirmations: Double): String = js.native
  
  def getMerkleProof(txHash: String, blockHeight: Double): String = js.native
  
  def getMerkleRoot(blockHeight: Double): String = js.native
  
  def getTransaction(txHash: String): js.Any = js.native
  
  def getTransactionsForScript(script: String): js.Any = js.native
  
  def getUnspentToScript(script: String): js.Any = js.native
  
  def latestBlockHeight(): Double = js.native
  
  def onNewBlock(callback: js.Function1[/* block */ js.Any, Unit]): js.Any = js.native
  
  def onTransactionToScript(script: String, callback: js.Function1[/* state */ js.Any, Unit]): js.Any = js.native
}
object Client {
  
  @scala.inline
  def apply(
    broadcastTransaction: String => String,
    close: () => js.Promise[Unit],
    connect: () => js.Promise[Unit],
    electrumClient: js.Any,
    findOutputForAddress: (String, String) => Double,
    getBalanceOfScript: String => js.Any,
    getHeadersChain: (Double, Double) => String,
    getMerkleProof: (String, Double) => String,
    getMerkleRoot: Double => String,
    getTransaction: String => js.Any,
    getTransactionsForScript: String => js.Any,
    getUnspentToScript: String => js.Any,
    latestBlockHeight: () => Double,
    onNewBlock: js.Function1[/* block */ js.Any, Unit] => js.Any,
    onTransactionToScript: (String, js.Function1[/* state */ js.Any, Unit]) => js.Any
  ): Client = {
    val __obj = js.Dynamic.literal(broadcastTransaction = js.Any.fromFunction1(broadcastTransaction), close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect), electrumClient = electrumClient.asInstanceOf[js.Any], findOutputForAddress = js.Any.fromFunction2(findOutputForAddress), getBalanceOfScript = js.Any.fromFunction1(getBalanceOfScript), getHeadersChain = js.Any.fromFunction2(getHeadersChain), getMerkleProof = js.Any.fromFunction2(getMerkleProof), getMerkleRoot = js.Any.fromFunction1(getMerkleRoot), getTransaction = js.Any.fromFunction1(getTransaction), getTransactionsForScript = js.Any.fromFunction1(getTransactionsForScript), getUnspentToScript = js.Any.fromFunction1(getUnspentToScript), latestBlockHeight = js.Any.fromFunction0(latestBlockHeight), onNewBlock = js.Any.fromFunction1(onNewBlock), onTransactionToScript = js.Any.fromFunction2(onTransactionToScript))
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    
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
    def setBroadcastTransaction(value: String => String): Self = this.set("broadcastTransaction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnect(value: () => js.Promise[Unit]): Self = this.set("connect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElectrumClient(value: js.Any): Self = this.set("electrumClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindOutputForAddress(value: (String, String) => Double): Self = this.set("findOutputForAddress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBalanceOfScript(value: String => js.Any): Self = this.set("getBalanceOfScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHeadersChain(value: (Double, Double) => String): Self = this.set("getHeadersChain", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMerkleProof(value: (String, Double) => String): Self = this.set("getMerkleProof", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMerkleRoot(value: Double => String): Self = this.set("getMerkleRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTransaction(value: String => js.Any): Self = this.set("getTransaction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTransactionsForScript(value: String => js.Any): Self = this.set("getTransactionsForScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUnspentToScript(value: String => js.Any): Self = this.set("getUnspentToScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLatestBlockHeight(value: () => Double): Self = this.set("latestBlockHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNewBlock(value: js.Function1[/* block */ js.Any, Unit] => js.Any): Self = this.set("onNewBlock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTransactionToScript(value: (String, js.Function1[/* state */ js.Any, Unit]) => js.Any): Self = this.set("onTransactionToScript", js.Any.fromFunction2(value))
  }
}
