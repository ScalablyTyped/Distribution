package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingComputationTask extends js.Object {
  
  /** Contains ranges of a streaming computation this task should apply to. */
  var computationRanges: js.UndefOr[js.Array[StreamingComputationRanges]] = js.native
  
  /** Describes the set of data disks this task should apply to. */
  var dataDisks: js.UndefOr[js.Array[MountedDataDisk]] = js.native
  
  /** A type of streaming computation task. */
  var taskType: js.UndefOr[String] = js.native
}
object StreamingComputationTask {
  
  @scala.inline
  def apply(): StreamingComputationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingComputationTask]
  }
  
  @scala.inline
  implicit class StreamingComputationTaskOps[Self <: StreamingComputationTask] (val x: Self) extends AnyVal {
    
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
    def setComputationRangesVarargs(value: StreamingComputationRanges*): Self = this.set("computationRanges", js.Array(value :_*))
    
    @scala.inline
    def setComputationRanges(value: js.Array[StreamingComputationRanges]): Self = this.set("computationRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputationRanges: Self = this.set("computationRanges", js.undefined)
    
    @scala.inline
    def setDataDisksVarargs(value: MountedDataDisk*): Self = this.set("dataDisks", js.Array(value :_*))
    
    @scala.inline
    def setDataDisks(value: js.Array[MountedDataDisk]): Self = this.set("dataDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDisks: Self = this.set("dataDisks", js.undefined)
    
    @scala.inline
    def setTaskType(value: String): Self = this.set("taskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskType: Self = this.set("taskType", js.undefined)
  }
}
