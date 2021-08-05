package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingComputationRanges extends StObject {
  
  /** The ID of the computation. */
  var computationId: js.UndefOr[String] = js.undefined
  
  /** Data disk assignments for ranges from this computation. */
  var rangeAssignments: js.UndefOr[js.Array[KeyRangeDataDiskAssignment]] = js.undefined
}
object StreamingComputationRanges {
  
  inline def apply(): StreamingComputationRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingComputationRanges]
  }
  
  extension [Self <: StreamingComputationRanges](x: Self) {
    
    inline def setComputationId(value: String): Self = StObject.set(x, "computationId", value.asInstanceOf[js.Any])
    
    inline def setComputationIdUndefined: Self = StObject.set(x, "computationId", js.undefined)
    
    inline def setRangeAssignments(value: js.Array[KeyRangeDataDiskAssignment]): Self = StObject.set(x, "rangeAssignments", value.asInstanceOf[js.Any])
    
    inline def setRangeAssignmentsUndefined: Self = StObject.set(x, "rangeAssignments", js.undefined)
    
    inline def setRangeAssignmentsVarargs(value: KeyRangeDataDiskAssignment*): Self = StObject.set(x, "rangeAssignments", js.Array(value :_*))
  }
}
