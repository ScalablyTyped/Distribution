package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SegmentDefinition defines the segment to be a set of SegmentFilters which
  * are combined together with a logical `AND` operation.
  */
@js.native
trait SchemaSegmentDefinition extends js.Object {
  
  /**
    * A segment is defined by a set of segment filters which are combined
    * together with a logical `AND` operation.
    */
  var segmentFilters: js.UndefOr[js.Array[SchemaSegmentFilter]] = js.native
}
object SchemaSegmentDefinition {
  
  @scala.inline
  def apply(): SchemaSegmentDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentDefinition]
  }
  
  @scala.inline
  implicit class SchemaSegmentDefinitionOps[Self <: SchemaSegmentDefinition] (val x: Self) extends AnyVal {
    
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
    def setSegmentFiltersVarargs(value: SchemaSegmentFilter*): Self = this.set("segmentFilters", js.Array(value :_*))
    
    @scala.inline
    def setSegmentFilters(value: js.Array[SchemaSegmentFilter]): Self = this.set("segmentFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentFilters: Self = this.set("segmentFilters", js.undefined)
  }
}
