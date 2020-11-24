package typings.keepNetworkTbtcJs.anon

import typings.keepNetworkTbtcJs.bitcoinHelpersMod.FoundTransaction
import typings.keepNetworkTbtcJs.bitcoinHelpersMod.SPVProof
import typings.keepNetworkTbtcJs.electrumClientMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddWitnessSignature extends js.Object {
  
  def addWitnessSignature(unsignedTransaction: String, inputIndex: Double, r: String, s: String, publicKey: String): String = js.native
  
  def broadcast(signedTransaction: String): js.Promise[TransactionID] = js.native
  
  def checkForConfirmations(transactionID: String, requiredConfirmations: Double): js.Promise[Double] = js.native
  
  def constructOneInputOneOutputWitnessTransaction(previousOutpoint: String, inputSequence: Double, outputValue: Double, outputScript: String): String = js.native
  
  def estimateFee(tbtcConstantsContract: js.Any): js.Promise[Double] = js.native
  
  def find(bitcoinAddress: String, expectedValue: Double): js.Promise[FoundTransaction] = js.native
  
  def findAllUnspent(bitcoinAddress: String): js.Promise[js.Array[FoundTransaction]] = js.native
  
  def findAllUnspentWithClient(electrumClient: default, receiverScript: String): js.Promise[js.Array[FoundTransaction]] = js.native
  
  def findOrWaitFor(bitcoinAddress: String, expectedValue: Double): js.Promise[FoundTransaction] = js.native
  
  def findScript(outputScript: String, expectedValue: Double): js.Promise[FoundTransaction] = js.native
  
  def findWithClient(electrumClient: default, receiverScript: String, expectedValue: Double): js.Promise[js.UndefOr[FoundTransaction]] = js.native
  
  def getBalance(bitcoinAddress: String): js.Promise[Double] = js.native
  
  def getSPVProof(transactionID: String, confirmations: Double): js.Promise[SPVProof] = js.native
  
  def waitForConfirmations(
    transactionID: String,
    requiredConfirmations: Double,
    onReceivedConfirmation: js.Function1[/* tx */ Confirmations, Unit]
  ): js.Promise[Double] = js.native
}
object AddWitnessSignature {
  
  @scala.inline
  def apply(
    addWitnessSignature: (String, Double, String, String, String) => String,
    broadcast: String => js.Promise[TransactionID],
    checkForConfirmations: (String, Double) => js.Promise[Double],
    constructOneInputOneOutputWitnessTransaction: (String, Double, Double, String) => String,
    estimateFee: js.Any => js.Promise[Double],
    find: (String, Double) => js.Promise[FoundTransaction],
    findAllUnspent: String => js.Promise[js.Array[FoundTransaction]],
    findAllUnspentWithClient: (default, String) => js.Promise[js.Array[FoundTransaction]],
    findOrWaitFor: (String, Double) => js.Promise[FoundTransaction],
    findScript: (String, Double) => js.Promise[FoundTransaction],
    findWithClient: (default, String, Double) => js.Promise[js.UndefOr[FoundTransaction]],
    getBalance: String => js.Promise[Double],
    getSPVProof: (String, Double) => js.Promise[SPVProof],
    waitForConfirmations: (String, Double, js.Function1[/* tx */ Confirmations, Unit]) => js.Promise[Double]
  ): AddWitnessSignature = {
    val __obj = js.Dynamic.literal(addWitnessSignature = js.Any.fromFunction5(addWitnessSignature), broadcast = js.Any.fromFunction1(broadcast), checkForConfirmations = js.Any.fromFunction2(checkForConfirmations), constructOneInputOneOutputWitnessTransaction = js.Any.fromFunction4(constructOneInputOneOutputWitnessTransaction), estimateFee = js.Any.fromFunction1(estimateFee), find = js.Any.fromFunction2(find), findAllUnspent = js.Any.fromFunction1(findAllUnspent), findAllUnspentWithClient = js.Any.fromFunction2(findAllUnspentWithClient), findOrWaitFor = js.Any.fromFunction2(findOrWaitFor), findScript = js.Any.fromFunction2(findScript), findWithClient = js.Any.fromFunction3(findWithClient), getBalance = js.Any.fromFunction1(getBalance), getSPVProof = js.Any.fromFunction2(getSPVProof), waitForConfirmations = js.Any.fromFunction3(waitForConfirmations))
    __obj.asInstanceOf[AddWitnessSignature]
  }
  
  @scala.inline
  implicit class AddWitnessSignatureOps[Self <: AddWitnessSignature] (val x: Self) extends AnyVal {
    
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
    def setAddWitnessSignature(value: (String, Double, String, String, String) => String): Self = this.set("addWitnessSignature", js.Any.fromFunction5(value))
    
    @scala.inline
    def setBroadcast(value: String => js.Promise[TransactionID]): Self = this.set("broadcast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckForConfirmations(value: (String, Double) => js.Promise[Double]): Self = this.set("checkForConfirmations", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConstructOneInputOneOutputWitnessTransaction(value: (String, Double, Double, String) => String): Self = this.set("constructOneInputOneOutputWitnessTransaction", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEstimateFee(value: js.Any => js.Promise[Double]): Self = this.set("estimateFee", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(value: (String, Double) => js.Promise[FoundTransaction]): Self = this.set("find", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindAllUnspent(value: String => js.Promise[js.Array[FoundTransaction]]): Self = this.set("findAllUnspent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindAllUnspentWithClient(value: (default, String) => js.Promise[js.Array[FoundTransaction]]): Self = this.set("findAllUnspentWithClient", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindOrWaitFor(value: (String, Double) => js.Promise[FoundTransaction]): Self = this.set("findOrWaitFor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindScript(value: (String, Double) => js.Promise[FoundTransaction]): Self = this.set("findScript", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindWithClient(value: (default, String, Double) => js.Promise[js.UndefOr[FoundTransaction]]): Self = this.set("findWithClient", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetBalance(value: String => js.Promise[Double]): Self = this.set("getBalance", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSPVProof(value: (String, Double) => js.Promise[SPVProof]): Self = this.set("getSPVProof", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWaitForConfirmations(value: (String, Double, js.Function1[/* tx */ Confirmations, Unit]) => js.Promise[Double]): Self = this.set("waitForConfirmations", js.Any.fromFunction3(value))
  }
}
