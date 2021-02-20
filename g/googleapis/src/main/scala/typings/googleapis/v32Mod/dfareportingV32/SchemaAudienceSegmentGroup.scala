package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audience Segment Group.
  */
@js.native
trait SchemaAudienceSegmentGroup extends StObject {
  
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
  implicit class SchemaAudienceSegmentGroupMutableBuilder[Self <: SchemaAudienceSegmentGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudienceSegments(value: js.Array[SchemaAudienceSegment]): Self = StObject.set(x, "audienceSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceSegmentsUndefined: Self = StObject.set(x, "audienceSegments", js.undefined)
    
    @scala.inline
    def setAudienceSegmentsVarargs(value: SchemaAudienceSegment*): Self = StObject.set(x, "audienceSegments", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
