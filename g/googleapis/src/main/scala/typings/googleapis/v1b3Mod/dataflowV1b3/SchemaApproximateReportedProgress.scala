package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A progress measurement of a WorkItem by a worker.
  */
@js.native
trait SchemaApproximateReportedProgress extends js.Object {
  /**
    * Total amount of parallelism in the portion of input of this task that has
    * already been consumed and is no longer active. In the first two examples
    * above (see remaining_parallelism), the value should be 29 or 2
    * respectively.  The sum of remaining_parallelism and consumed_parallelism
    * should equal the total amount of parallelism in this work item.  If
    * specified, must be finite.
    */
  var consumedParallelism: js.UndefOr[SchemaReportedParallelism] = js.native
  /**
    * Completion as fraction of the input consumed, from 0.0 (beginning,
    * nothing consumed), to 1.0 (end of the input, entire input consumed).
    */
  var fractionConsumed: js.UndefOr[Double] = js.native
  /**
    * A Position within the work to represent a progress.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
  /**
    * Total amount of parallelism in the input of this task that remains, (i.e.
    * can be delegated to this task and any new tasks via dynamic splitting).
    * Always at least 1 for non-finished work items and 0 for finished.
    * &quot;Amount of parallelism&quot; refers to how many non-empty parts of
    * the input can be read in parallel. This does not necessarily equal number
    * of records. An input that can be read in parallel down to the individual
    * records is called &quot;perfectly splittable&quot;. An example of
    * non-perfectly parallelizable input is a block-compressed file format
    * where a block of records has to be read as a whole, but different blocks
    * can be read in parallel.  Examples: * If we are processing record #30
    * (starting at 1) out of 50 in a perfectly   splittable 50-record input,
    * this value should be 21 (20 remaining + 1   current). * If we are reading
    * through block 3 in a block-compressed file consisting   of 5 blocks, this
    * value should be 3 (since blocks 4 and 5 can be   processed in parallel by
    * new tasks via dynamic splitting and the current   task remains processing
    * block 3). * If we are reading through the last block in a
    * block-compressed file,   or reading or processing the last record in a
    * perfectly splittable   input, this value should be 1, because apart from
    * the current task, no   additional remainder can be split off.
    */
  var remainingParallelism: js.UndefOr[SchemaReportedParallelism] = js.native
}

object SchemaApproximateReportedProgress {
  @scala.inline
  def apply(): SchemaApproximateReportedProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproximateReportedProgress]
  }
  @scala.inline
  implicit class SchemaApproximateReportedProgressOps[Self <: SchemaApproximateReportedProgress] (val x: Self) extends AnyVal {
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
    def setConsumedParallelism(value: SchemaReportedParallelism): Self = this.set("consumedParallelism", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumedParallelism: Self = this.set("consumedParallelism", js.undefined)
    @scala.inline
    def setFractionConsumed(value: Double): Self = this.set("fractionConsumed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractionConsumed: Self = this.set("fractionConsumed", js.undefined)
    @scala.inline
    def setPosition(value: SchemaPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRemainingParallelism(value: SchemaReportedParallelism): Self = this.set("remainingParallelism", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemainingParallelism: Self = this.set("remainingParallelism", js.undefined)
  }
  
}

