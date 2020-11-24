package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audience Segment Group.
  */
@js.native
trait SchemaAudienceSegmentGroup extends js.Object {
  
  /**
    * Audience segments assigned to this group. The number of segments must be
    * between 2 and 100.
    */
  var audienceSegments: js.UndefOr[js.Array[SchemaAudienceSegment]] = js.native
  
  /**
    * ID of this audience segment group. This is a read-only, auto-generated
    * field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of this audience segment group. This is a required field and must be
    * less than 65 characters long.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaAudienceSegmentGroup {
  
  @scala.inline
  def apply(): SchemaAudienceSegmentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudienceSegmentGroup]
  }
  
  @scala.inline
  implicit class SchemaAudienceSegmentGroupOps[Self <: SchemaAudienceSegmentGroup] (val x: Self) extends AnyVal {
    
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
    def setAudienceSegmentsVarargs(value: SchemaAudienceSegment*): Self = this.set("audienceSegments", js.Array(value :_*))
    
    @scala.inline
    def setAudienceSegments(value: js.Array[SchemaAudienceSegment]): Self = this.set("audienceSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudienceSegments: Self = this.set("audienceSegments", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
