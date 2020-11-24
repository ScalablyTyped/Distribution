package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Simple segment conditions consist of one or more dimension/metric
  * conditions that can be combined.
  */
@js.native
trait SchemaSimpleSegment extends js.Object {
  
  /**
    * A list of segment filters groups which are combined with logical `AND`
    * operator.
    */
  var orFiltersForSegment: js.UndefOr[js.Array[SchemaOrFiltersForSegment]] = js.native
}
object SchemaSimpleSegment {
  
  @scala.inline
  def apply(): SchemaSimpleSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSimpleSegment]
  }
  
  @scala.inline
  implicit class SchemaSimpleSegmentOps[Self <: SchemaSimpleSegment] (val x: Self) extends AnyVal {
    
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
    def setOrFiltersForSegmentVarargs(value: SchemaOrFiltersForSegment*): Self = this.set("orFiltersForSegment", js.Array(value :_*))
    
    @scala.inline
    def setOrFiltersForSegment(value: js.Array[SchemaOrFiltersForSegment]): Self = this.set("orFiltersForSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrFiltersForSegment: Self = this.set("orFiltersForSegment", js.undefined)
  }
}
