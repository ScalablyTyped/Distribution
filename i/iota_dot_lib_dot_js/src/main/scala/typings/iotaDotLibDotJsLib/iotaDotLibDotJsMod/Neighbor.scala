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
    val __obj = js.Dynamic.literal(address = address, connectionType = connectionType.asInstanceOf[js.Any], numberOfAllTransactions = numberOfAllTransactions, numberOfInvalidTransactions = numberOfInvalidTransactions, numberOfNewTransactions = numberOfNewTransactions, numberOfRandomTransactionRequests = numberOfRandomTransactionRequests, numberOfSentTransactions = numberOfSentTransactions)
  
    __obj.asInstanceOf[Neighbor]
  }
}

