package typings.hdrHistogramJs.histogramIterationValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramIterationValue extends js.Object {
  var countAddedInThisIterationStep: Double = js.native
  var countAtValueIteratedTo: Double = js.native
  var percentile: Double = js.native
  var percentileLevelIteratedTo: Double = js.native
  var totalCountToThisValue: Double = js.native
  var totalValueToThisValue: Double = js.native
  var valueIteratedFrom: Double = js.native
  var valueIteratedTo: Double = js.native
  def reset(): Unit = js.native
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
  @scala.inline
  implicit class HistogramIterationValueOps[Self <: HistogramIterationValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountAddedInThisIterationStep(value: Double): Self = this.set("countAddedInThisIterationStep", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountAtValueIteratedTo(value: Double): Self = this.set("countAtValueIteratedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentile(value: Double): Self = this.set("percentile", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentileLevelIteratedTo(value: Double): Self = this.set("percentileLevelIteratedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    @scala.inline
    def setTotalCountToThisValue(value: Double): Self = this.set("totalCountToThisValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalValueToThisValue(value: Double): Self = this.set("totalValueToThisValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueIteratedFrom(value: Double): Self = this.set("valueIteratedFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueIteratedTo(value: Double): Self = this.set("valueIteratedTo", value.asInstanceOf[js.Any])
  }
  
}

