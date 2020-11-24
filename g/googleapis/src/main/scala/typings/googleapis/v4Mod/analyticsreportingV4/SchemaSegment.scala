package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The segment definition, if the report needs to be segmented. A Segment is a
  * subset of the Analytics data. For example, of the entire set of users, one
  * Segment might be users from a particular country or city.
  */
@js.native
trait SchemaSegment extends js.Object {
  
  /**
    * A dynamic segment definition in the request.
    */
  var dynamicSegment: js.UndefOr[SchemaDynamicSegment] = js.native
  
  /**
    * The segment ID of a built-in or custom segment, for example `gaid::-3`.
    */
  var segmentId: js.UndefOr[String] = js.native
}
object SchemaSegment {
  
  @scala.inline
  def apply(): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegment]
  }
  
  @scala.inline
  implicit class SchemaSegmentOps[Self <: SchemaSegment] (val x: Self) extends AnyVal {
    
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
    def setDynamicSegment(value: SchemaDynamicSegment): Self = this.set("dynamicSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicSegment: Self = this.set("dynamicSegment", js.undefined)
    
    @scala.inline
    def setSegmentId(value: String): Self = this.set("segmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentId: Self = this.set("segmentId", js.undefined)
  }
}
