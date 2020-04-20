package typings.hdrHistogramJs.histogramIterationValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramIterationValue extends js.Object {
  var countAddedInThisIterationStep: Double
  var countAtValueIteratedTo: Double
  var percentile: Double
  var percentileLevelIteratedTo: Double
  var totalCountToThisValue: Double
  var totalValueToThisValue: Double
  var valueIteratedFrom: Double
  var valueIteratedTo: Double
  def reset(): Unit
}

object HistogramIterationValue {
  @scala.inline
  def apply(
    countAddedInThisIterationStep: Double,
    countAtValueIteratedTo: Double,
    percentile: Double,
    percentileLevelIteratedTo: Double,
    reset: () => Unit,
    totalCountToThisValue: Double,
    totalValueToThisValue: Double,
    valueIteratedFrom: Double,
    valueIteratedTo: Double
  ): HistogramIterationValue = {
    val __obj = js.Dynamic.literal(countAddedInThisIterationStep = countAddedInThisIterationStep.asInstanceOf[js.Any], countAtValueIteratedTo = countAtValueIteratedTo.asInstanceOf[js.Any], percentile = percentile.asInstanceOf[js.Any], percentileLevelIteratedTo = percentileLevelIteratedTo.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), totalCountToThisValue = totalCountToThisValue.asInstanceOf[js.Any], totalValueToThisValue = totalValueToThisValue.asInstanceOf[js.Any], valueIteratedFrom = valueIteratedFrom.asInstanceOf[js.Any], valueIteratedTo = valueIteratedTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramIterationValue]
  }
}

