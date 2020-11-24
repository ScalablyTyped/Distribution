package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audience Segment.
  */
@js.native
trait SchemaAudienceSegment extends js.Object {
  
  /**
    * Weight allocated to this segment. The weight assigned will be understood
    * in proportion to the weights assigned to other segments in the same
    * segment group. Acceptable values are 1 to 1000, inclusive.
    */
  var allocation: js.UndefOr[Double] = js.native
  
  /**
    * ID of this audience segment. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Name of this audience segment. This is a required field and must be less
    * than 65 characters long.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaAudienceSegment {
  
  @scala.inline
  def apply(): SchemaAudienceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudienceSegment]
  }
  
  @scala.inline
  implicit class SchemaAudienceSegmentOps[Self <: SchemaAudienceSegment] (val x: Self) extends AnyVal {
    
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
    def setAllocation(value: Double): Self = this.set("allocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocation: Self = this.set("allocation", js.undefined)
    
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
