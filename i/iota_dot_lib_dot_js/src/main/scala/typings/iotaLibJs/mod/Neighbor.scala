package typings.iotaLibJs.mod

import typings.iotaLibJs.iotaLibJsStrings.tcp
import typings.iotaLibJs.iotaLibJsStrings.udp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Neighbor extends js.Object {
  var address: String = js.native
  var connectionType: udp | tcp = js.native
  var numberOfAllTransactions: Double = js.native
  var numberOfInvalidTransactions: Double = js.native
  var numberOfNewTransactions: Double = js.native
  var numberOfRandomTransactionRequests: Double = js.native
  var numberOfSentTransactions: Double = js.native
}

object Neighbor {
  @scala.inline
  def apply(
    address: String,
    connectionType: udp | tcp,
    numberOfAllTransactions: Double,
    numberOfInvalidTransactions: Double,
    numberOfNewTransactions: Double,
    numberOfRandomTransactionRequests: Double,
    numberOfSentTransactions: Double
  ): Neighbor = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], numberOfAllTransactions = numberOfAllTransactions.asInstanceOf[js.Any], numberOfInvalidTransactions = numberOfInvalidTransactions.asInstanceOf[js.Any], numberOfNewTransactions = numberOfNewTransactions.asInstanceOf[js.Any], numberOfRandomTransactionRequests = numberOfRandomTransactionRequests.asInstanceOf[js.Any], numberOfSentTransactions = numberOfSentTransactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Neighbor]
  }
  @scala.inline
  implicit class NeighborOps[Self <: Neighbor] (val x: Self) extends AnyVal {
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
    def setConnectionType(value: udp | tcp): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfAllTransactions(value: Double): Self = this.set("numberOfAllTransactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfInvalidTransactions(value: Double): Self = this.set("numberOfInvalidTransactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfNewTransactions(value: Double): Self = this.set("numberOfNewTransactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfRandomTransactionRequests(value: Double): Self = this.set("numberOfRandomTransactionRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfSentTransactions(value: Double): Self = this.set("numberOfSentTransactions", value.asInstanceOf[js.Any])
  }
  
}

