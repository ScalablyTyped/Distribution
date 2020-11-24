package typings.keepNetworkTbtcJs.commonTypesMod

import typings.keepNetworkTbtcJs.anon.OmitFoundTransactionvalue
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepositBaseClass extends js.Object {
  
  var address: String = js.native
  
  def constructFundingProof(bitcoinTransaction: OmitFoundTransactionvalue, confirmations: Double): js.Promise[js.Tuple8[Buffer, Buffer, Buffer, Buffer, Double, Buffer, String, Buffer]] = js.native
  
  var contract: Contract = js.native
  
  var factory: js.Any = js.native
  
  def getCurrentState(): js.Promise[Double] = js.native
  
  def getLatestRedemptionDetails(): js.Promise[Null | RedemptionDetails] = js.native
  
  var keepContract: Contract = js.native
  
  var publicKeyPoint: js.Promise[KeyPoint] = js.native
}
object DepositBaseClass {
  
  @scala.inline
  def apply(
    address: String,
    constructFundingProof: (OmitFoundTransactionvalue, Double) => js.Promise[js.Tuple8[Buffer, Buffer, Buffer, Buffer, Double, Buffer, String, Buffer]],
    contract: Contract,
    factory: js.Any,
    getCurrentState: () => js.Promise[Double],
    getLatestRedemptionDetails: () => js.Promise[Null | RedemptionDetails],
    keepContract: Contract,
    publicKeyPoint: js.Promise[KeyPoint]
  ): DepositBaseClass = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], constructFundingProof = js.Any.fromFunction2(constructFundingProof), contract = contract.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], getCurrentState = js.Any.fromFunction0(getCurrentState), getLatestRedemptionDetails = js.Any.fromFunction0(getLatestRedemptionDetails), keepContract = keepContract.asInstanceOf[js.Any], publicKeyPoint = publicKeyPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepositBaseClass]
  }
  
  @scala.inline
  implicit class DepositBaseClassOps[Self <: DepositBaseClass] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructFundingProof(
      value: (OmitFoundTransactionvalue, Double) => js.Promise[js.Tuple8[Buffer, Buffer, Buffer, Buffer, Double, Buffer, String, Buffer]]
    ): Self = this.set("constructFundingProof", js.Any.fromFunction2(value))
    
    @scala.inline
    def setContract(value: Contract): Self = this.set("contract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactory(value: js.Any): Self = this.set("factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentState(value: () => js.Promise[Double]): Self = this.set("getCurrentState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLatestRedemptionDetails(value: () => js.Promise[Null | RedemptionDetails]): Self = this.set("getLatestRedemptionDetails", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeepContract(value: Contract): Self = this.set("keepContract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyPoint(value: js.Promise[KeyPoint]): Self = this.set("publicKeyPoint", value.asInstanceOf[js.Any])
  }
}
