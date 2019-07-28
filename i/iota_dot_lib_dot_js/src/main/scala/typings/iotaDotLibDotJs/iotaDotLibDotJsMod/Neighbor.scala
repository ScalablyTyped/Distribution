package typings.iotaDotLibDotJs.iotaDotLibDotJsMod

import typings.iotaDotLibDotJs.iotaDotLibDotJsStrings.tcp
import typings.iotaDotLibDotJs.iotaDotLibDotJsStrings.udp
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
    val __obj = js.Dynamic.literal(address = address, connectionType = connectionType.asInstanceOf[js.Any], numberOfAllTransactions = numberOfAllTransactions, numberOfInvalidTransactions = numberOfInvalidTransactions, numberOfNewTransactions = numberOfNewTransactions, numberOfRandomTransactionRequests = numberOfRandomTransactionRequests, numberOfSentTransactions = numberOfSentTransactions)
  
    __obj.asInstanceOf[Neighbor]
  }
}

