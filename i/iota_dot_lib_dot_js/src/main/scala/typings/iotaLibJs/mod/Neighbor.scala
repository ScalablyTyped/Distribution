package typings.iotaLibJs.mod

import typings.iotaLibJs.iotaLibJsStrings.tcp
import typings.iotaLibJs.iotaLibJsStrings.udp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Neighbor extends js.Object {
  var address: String
  var connectionType: udp | tcp
  var numberOfAllTransactions: Double
  var numberOfInvalidTransactions: Double
  var numberOfNewTransactions: Double
  var numberOfRandomTransactionRequests: Double
  var numberOfSentTransactions: Double
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
}

