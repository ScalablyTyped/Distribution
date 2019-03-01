package typings
package iotaDotLibDotJsLib.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Neighbor extends js.Object {
  var address: java.lang.String
  var connectionType: iotaDotLibDotJsLib.iotaDotLibDotJsLibStrings.udp | iotaDotLibDotJsLib.iotaDotLibDotJsLibStrings.tcp
  var numberOfAllTransactions: scala.Double
  var numberOfInvalidTransactions: scala.Double
  var numberOfNewTransactions: scala.Double
  var numberOfRandomTransactionRequests: scala.Double
  var numberOfSentTransactions: scala.Double
}

object Neighbor {
  @scala.inline
  def apply(
    address: java.lang.String,
    connectionType: iotaDotLibDotJsLib.iotaDotLibDotJsLibStrings.udp | iotaDotLibDotJsLib.iotaDotLibDotJsLibStrings.tcp,
    numberOfAllTransactions: scala.Double,
    numberOfInvalidTransactions: scala.Double,
    numberOfNewTransactions: scala.Double,
    numberOfRandomTransactionRequests: scala.Double,
    numberOfSentTransactions: scala.Double
  ): Neighbor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("connectionType")(connectionType.asInstanceOf[js.Any])
    __obj.updateDynamic("numberOfAllTransactions")(numberOfAllTransactions)
    __obj.updateDynamic("numberOfInvalidTransactions")(numberOfInvalidTransactions)
    __obj.updateDynamic("numberOfNewTransactions")(numberOfNewTransactions)
    __obj.updateDynamic("numberOfRandomTransactionRequests")(numberOfRandomTransactionRequests)
    __obj.updateDynamic("numberOfSentTransactions")(numberOfSentTransactions)
    __obj.asInstanceOf[Neighbor]
  }
}

