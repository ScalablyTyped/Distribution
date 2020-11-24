package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of segment filters in the `OR` group are combined with the logical
  * OR operator.
  */
@js.native
trait SchemaOrFiltersForSegment extends js.Object {
  
  /**
    * List of segment filters to be combined with a `OR` operator.
    */
  var segmentFilterClauses: js.UndefOr[js.Array[SchemaSegmentFilterClause]] = js.native
}
object SchemaOrFiltersForSegment {
  
  @scala.inline
  def apply(): SchemaOrFiltersForSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrFiltersForSegment]
  }
  
  @scala.inline
  implicit class SchemaOrFiltersForSegmentOps[Self <: SchemaOrFiltersForSegment] (val x: Self) extends AnyVal {
    
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
    def setSegmentFilterClausesVarargs(value: SchemaSegmentFilterClause*): Self = this.set("segmentFilterClauses", js.Array(value :_*))
    
    @scala.inline
    def setSegmentFilterClauses(value: js.Array[SchemaSegmentFilterClause]): Self = this.set("segmentFilterClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentFilterClauses: Self = this.set("segmentFilterClauses", js.undefined)
  }
}
