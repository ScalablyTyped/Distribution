package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes full or partial data disk assignment information of the
  * computation ranges.
  */
trait SchemaStreamingComputationRanges extends StObject {
  
  /**
    * The ID of the computation.
    */
  var computationId: js.UndefOr[String] = js.undefined
  
  /**
    * Data disk assignments for ranges from this computation.
    */
  var rangeAssignments: js.UndefOr[js.Array[SchemaKeyRangeDataDiskAssignment]] = js.undefined
}
object SchemaStreamingComputationRanges {
  
  @scala.inline
  def apply(): SchemaStreamingComputationRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingComputationRanges]
  }
  
  @scala.inline
  implicit class SchemaStreamingComputationRangesMutableBuilder[Self <: SchemaStreamingComputationRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputationId(value: String): Self = StObject.set(x, "computationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputationIdUndefined: Self = StObject.set(x, "computationId", js.undefined)
    
    @scala.inline
    def setRangeAssignments(value: js.Array[SchemaKeyRangeDataDiskAssignment]): Self = StObject.set(x, "rangeAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeAssignmentsUndefined: Self = StObject.set(x, "rangeAssignments", js.undefined)
    
    @scala.inline
    def setRangeAssignmentsVarargs(value: SchemaKeyRangeDataDiskAssignment*): Self = StObject.set(x, "rangeAssignments", js.Array(value :_*))
  }
}
