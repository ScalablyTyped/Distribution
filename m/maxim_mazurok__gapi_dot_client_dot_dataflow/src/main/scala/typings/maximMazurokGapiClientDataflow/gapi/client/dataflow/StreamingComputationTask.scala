package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamingComputationTask extends StObject {
  
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
  implicit class StreamingComputationTaskMutableBuilder[Self <: StreamingComputationTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputationRanges(value: js.Array[StreamingComputationRanges]): Self = StObject.set(x, "computationRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputationRangesUndefined: Self = StObject.set(x, "computationRanges", js.undefined)
    
    @scala.inline
    def setComputationRangesVarargs(value: StreamingComputationRanges*): Self = StObject.set(x, "computationRanges", js.Array(value :_*))
    
    @scala.inline
    def setDataDisks(value: js.Array[MountedDataDisk]): Self = StObject.set(x, "dataDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDisksUndefined: Self = StObject.set(x, "dataDisks", js.undefined)
    
    @scala.inline
    def setDataDisksVarargs(value: MountedDataDisk*): Self = StObject.set(x, "dataDisks", js.Array(value :_*))
    
    @scala.inline
    def setTaskType(value: String): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTypeUndefined: Self = StObject.set(x, "taskType", js.undefined)
  }
}
