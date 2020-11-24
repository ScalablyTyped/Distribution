package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dynamic segment definition for defining the segment within the request. A
  * segment can select users, sessions or both.
  */
@js.native
trait SchemaDynamicSegment extends js.Object {
  
  /**
    * The name of the dynamic segment.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Session Segment to select sessions to include in the segment.
    */
  var sessionSegment: js.UndefOr[SchemaSegmentDefinition] = js.native
  
  /**
    * User Segment to select users to include in the segment.
    */
  var userSegment: js.UndefOr[SchemaSegmentDefinition] = js.native
}
object SchemaDynamicSegment {
  
  @scala.inline
  def apply(): SchemaDynamicSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicSegment]
  }
  
  @scala.inline
  implicit class SchemaDynamicSegmentOps[Self <: SchemaDynamicSegment] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSessionSegment(value: SchemaSegmentDefinition): Self = this.set("sessionSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionSegment: Self = this.set("sessionSegment", js.undefined)
    
    @scala.inline
    def setUserSegment(value: SchemaSegmentDefinition): Self = this.set("userSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserSegment: Self = this.set("userSegment", js.undefined)
  }
}
