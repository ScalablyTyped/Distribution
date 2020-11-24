package typings.keepNetworkTbtcJs.bitcoinHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoundTransaction extends js.Object {
  
  var outputPosition: Double = js.native
  
  var transactionID: String = js.native
  
  var value: Double = js.native
}
object FoundTransaction {
  
  @scala.inline
  def apply(outputPosition: Double, transactionID: String, value: Double): FoundTransaction = {
    val __obj = js.Dynamic.literal(outputPosition = outputPosition.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoundTransaction]
  }
  
  @scala.inline
  implicit class FoundTransactionOps[Self <: FoundTransaction] (val x: Self) extends AnyVal {
    
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
    def setOutputPosition(value: Double): Self = this.set("outputPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionID(value: String): Self = this.set("transactionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
