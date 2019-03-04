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
    addResult: js.Function1[Result, scala.Unit],
    description: java.lang.String,
    failedCount: scala.Double,
    getItems: js.Function0[js.Array[Result]],
    log: js.Function1[js.Any, scala.Unit],
    passed: js.Function0[scala.Boolean],
    passedCount: scala.Double,
    rollupCounts: js.Function1[NestedResults, scala.Unit],
    skipped: scala.Boolean,
    totalCount: scala.Double,
    `type`: java.lang.String
  ): NestedResults = {
    val __obj = js.Dynamic.literal(addResult = addResult, description = description, failedCount = failedCount, getItems = getItems, log = log, passed = passed, passedCount = passedCount, rollupCounts = rollupCounts, skipped = skipped, totalCount = totalCount)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NestedResults]
  }
}

