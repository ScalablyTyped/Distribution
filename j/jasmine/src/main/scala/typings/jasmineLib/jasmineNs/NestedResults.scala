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

object NestedResults {
  @scala.inline
  def apply(
    addResult: Result => scala.Unit,
    description: java.lang.String,
    failedCount: scala.Double,
    getItems: () => js.Array[Result],
    log: js.Any => scala.Unit,
    passed: () => scala.Boolean,
    passedCount: scala.Double,
    rollupCounts: NestedResults => scala.Unit,
    skipped: scala.Boolean,
    totalCount: scala.Double,
    `type`: java.lang.String
  ): NestedResults = {
    val __obj = js.Dynamic.literal(addResult = js.Any.fromFunction1(addResult), description = description, failedCount = failedCount, getItems = js.Any.fromFunction0(getItems), log = js.Any.fromFunction1(log), passed = js.Any.fromFunction0(passed), passedCount = passedCount, rollupCounts = js.Any.fromFunction1(rollupCounts), skipped = skipped, totalCount = totalCount)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NestedResults]
  }
}

