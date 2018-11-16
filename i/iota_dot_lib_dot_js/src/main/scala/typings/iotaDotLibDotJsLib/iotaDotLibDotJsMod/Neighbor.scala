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

