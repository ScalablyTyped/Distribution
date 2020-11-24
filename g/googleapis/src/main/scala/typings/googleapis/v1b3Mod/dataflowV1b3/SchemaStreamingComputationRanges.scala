package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes full or partial data disk assignment information of the
  * computation ranges.
  */
@js.native
trait SchemaStreamingComputationRanges extends js.Object {
  
  /**
    * The ID of the computation.
    */
  var computationId: js.UndefOr[String] = js.native
  
  /**
    * Data disk assignments for ranges from this computation.
    */
  var rangeAssignments: js.UndefOr[js.Array[SchemaKeyRangeDataDiskAssignment]] = js.native
}
object SchemaStreamingComputationRanges {
  
  @scala.inline
  def apply(): SchemaStreamingComputationRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingComputationRanges]
  }
  
  @scala.inline
  implicit class SchemaStreamingComputationRangesOps[Self <: SchemaStreamingComputationRanges] (val x: Self) extends AnyVal {
    
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
    def setComputationId(value: String): Self = this.set("computationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputationId: Self = this.set("computationId", js.undefined)
    
    @scala.inline
    def setRangeAssignmentsVarargs(value: SchemaKeyRangeDataDiskAssignment*): Self = this.set("rangeAssignments", js.Array(value :_*))
    
    @scala.inline
    def setRangeAssignments(value: js.Array[SchemaKeyRangeDataDiskAssignment]): Self = this.set("rangeAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeAssignments: Self = this.set("rangeAssignments", js.undefined)
  }
}
