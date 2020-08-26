package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task which describes what action should be performed for the specified
  * streaming computation ranges.
  */
@js.native
trait SchemaStreamingComputationTask extends js.Object {
  /**
    * Contains ranges of a streaming computation this task should apply to.
    */
  var computationRanges: js.UndefOr[js.Array[SchemaStreamingComputationRanges]] = js.native
  /**
    * Describes the set of data disks this task should apply to.
    */
  var dataDisks: js.UndefOr[js.Array[SchemaMountedDataDisk]] = js.native
  /**
    * A type of streaming computation task.
    */
  var taskType: js.UndefOr[String] = js.native
}

object SchemaStreamingComputationTask {
  @scala.inline
  def apply(): SchemaStreamingComputationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingComputationTask]
  }
  @scala.inline
  implicit class SchemaStreamingComputationTaskOps[Self <: SchemaStreamingComputationTask] (val x: Self) extends AnyVal {
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
    def setComputationRangesVarargs(value: SchemaStreamingComputationRanges*): Self = this.set("computationRanges", js.Array(value :_*))
    @scala.inline
    def setComputationRanges(value: js.Array[SchemaStreamingComputationRanges]): Self = this.set("computationRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputationRanges: Self = this.set("computationRanges", js.undefined)
    @scala.inline
    def setDataDisksVarargs(value: SchemaMountedDataDisk*): Self = this.set("dataDisks", js.Array(value :_*))
    @scala.inline
    def setDataDisks(value: js.Array[SchemaMountedDataDisk]): Self = this.set("dataDisks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataDisks: Self = this.set("dataDisks", js.undefined)
    @scala.inline
    def setTaskType(value: String): Self = this.set("taskType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskType: Self = this.set("taskType", js.undefined)
  }
  
}

