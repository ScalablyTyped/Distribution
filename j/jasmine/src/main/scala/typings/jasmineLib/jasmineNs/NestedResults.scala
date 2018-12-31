package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedResults extends Result {
  var description: java.lang.String
  var failedCount: scala.Double
  var passedCount: scala.Double
  var skipped: scala.Boolean
  var totalCount: scala.Double
  def addResult(result: Result): scala.Unit
  def getItems(): js.Array[Result]
  def log(values: js.Any): scala.Unit
  def passed(): scala.Boolean
  def rollupCounts(result: NestedResults): scala.Unit
}

