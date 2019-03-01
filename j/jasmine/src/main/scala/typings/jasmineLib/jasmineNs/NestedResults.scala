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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("addResult")(addResult)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("failedCount")(failedCount)
    __obj.updateDynamic("getItems")(getItems)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("passed")(passed)
    __obj.updateDynamic("passedCount")(passedCount)
    __obj.updateDynamic("rollupCounts")(rollupCounts)
    __obj.updateDynamic("skipped")(skipped)
    __obj.updateDynamic("totalCount")(totalCount)
    __obj.asInstanceOf[NestedResults]
  }
}

