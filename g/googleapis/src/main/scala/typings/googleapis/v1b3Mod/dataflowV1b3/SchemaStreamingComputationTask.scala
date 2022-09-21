package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamingComputationTask extends StObject {
  
  /**
    * Contains ranges of a streaming computation this task should apply to.
    */
  var computationRanges: js.UndefOr[js.Array[SchemaStreamingComputationRanges]] = js.undefined
  
  /**
    * Describes the set of data disks this task should apply to.
    */
  var dataDisks: js.UndefOr[js.Array[SchemaMountedDataDisk]] = js.undefined
  
  /**
    * A type of streaming computation task.
    */
  var taskType: js.UndefOr[String | Null] = js.undefined
}
object SchemaStreamingComputationTask {
  
  inline def apply(): SchemaStreamingComputationTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingComputationTask]
  }
  
  extension [Self <: SchemaStreamingComputationTask](x: Self) {
    
    inline def setComputationRanges(value: js.Array[SchemaStreamingComputationRanges]): Self = StObject.set(x, "computationRanges", value.asInstanceOf[js.Any])
    
    inline def setComputationRangesUndefined: Self = StObject.set(x, "computationRanges", js.undefined)
    
    inline def setComputationRangesVarargs(value: SchemaStreamingComputationRanges*): Self = StObject.set(x, "computationRanges", js.Array(value*))
    
    inline def setDataDisks(value: js.Array[SchemaMountedDataDisk]): Self = StObject.set(x, "dataDisks", value.asInstanceOf[js.Any])
    
    inline def setDataDisksUndefined: Self = StObject.set(x, "dataDisks", js.undefined)
    
    inline def setDataDisksVarargs(value: SchemaMountedDataDisk*): Self = StObject.set(x, "dataDisks", js.Array(value*))
    
    inline def setTaskType(value: String): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
    
    inline def setTaskTypeNull: Self = StObject.set(x, "taskType", null)
    
    inline def setTaskTypeUndefined: Self = StObject.set(x, "taskType", js.undefined)
  }
}
