package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamingComputationRanges extends StObject {
  
  /**
    * The ID of the computation.
    */
  var computationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data disk assignments for ranges from this computation.
    */
  var rangeAssignments: js.UndefOr[js.Array[SchemaKeyRangeDataDiskAssignment]] = js.undefined
}
object SchemaStreamingComputationRanges {
  
  inline def apply(): SchemaStreamingComputationRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingComputationRanges]
  }
  
  extension [Self <: SchemaStreamingComputationRanges](x: Self) {
    
    inline def setComputationId(value: String): Self = StObject.set(x, "computationId", value.asInstanceOf[js.Any])
    
    inline def setComputationIdNull: Self = StObject.set(x, "computationId", null)
    
    inline def setComputationIdUndefined: Self = StObject.set(x, "computationId", js.undefined)
    
    inline def setRangeAssignments(value: js.Array[SchemaKeyRangeDataDiskAssignment]): Self = StObject.set(x, "rangeAssignments", value.asInstanceOf[js.Any])
    
    inline def setRangeAssignmentsUndefined: Self = StObject.set(x, "rangeAssignments", js.undefined)
    
    inline def setRangeAssignmentsVarargs(value: SchemaKeyRangeDataDiskAssignment*): Self = StObject.set(x, "rangeAssignments", js.Array(value*))
  }
}
