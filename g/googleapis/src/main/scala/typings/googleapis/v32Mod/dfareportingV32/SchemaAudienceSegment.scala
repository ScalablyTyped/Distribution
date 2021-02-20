package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Audience Segment.
  */
@js.native
trait SchemaAudienceSegment extends StObject {
  
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
  implicit class SchemaAudienceSegmentMutableBuilder[Self <: SchemaAudienceSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocation(value: Double): Self = StObject.set(x, "allocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationUndefined: Self = StObject.set(x, "allocation", js.undefined)
    
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
