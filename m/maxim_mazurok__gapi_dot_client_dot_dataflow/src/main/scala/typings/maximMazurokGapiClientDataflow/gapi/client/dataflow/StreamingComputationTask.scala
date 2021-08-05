package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingComputationTask extends StObject {
  
  /** Contains ranges of a streaming computation this task should apply to. */
  var computationRanges: js.UndefOr[js.Array[StreamingComputationRanges]] = js.undefined
  
  /** Describes the set of data disks this task should apply to. */
  var dataDisks: js.UndefOr[js.Array[MountedDataDisk]] = js.undefined
  
  /** A type of streaming computation task. */
  var taskType: js.UndefOr[String] = js.undefined
}
object StreamingComputationTask {
  
  inline def apply(): StreamingComputationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingComputationTask]
  }
  
  extension [Self <: StreamingComputationTask](x: Self) {
    
    inline def setComputationRanges(value: js.Array[StreamingComputationRanges]): Self = StObject.set(x, "computationRanges", value.asInstanceOf[js.Any])
    
    inline def setComputationRangesUndefined: Self = StObject.set(x, "computationRanges", js.undefined)
    
    inline def setComputationRangesVarargs(value: StreamingComputationRanges*): Self = StObject.set(x, "computationRanges", js.Array(value :_*))
    
    inline def setDataDisks(value: js.Array[MountedDataDisk]): Self = StObject.set(x, "dataDisks", value.asInstanceOf[js.Any])
    
    inline def setDataDisksUndefined: Self = StObject.set(x, "dataDisks", js.undefined)
    
    inline def setDataDisksVarargs(value: MountedDataDisk*): Self = StObject.set(x, "dataDisks", js.Array(value :_*))
    
    inline def setTaskType(value: String): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
    
    inline def setTaskTypeUndefined: Self = StObject.set(x, "taskType", js.undefined)
  }
}
