package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAudienceSegmentGroup extends StObject {
  
  /**
    * Audience segments assigned to this group. The number of segments must be between 2 and 100.
    */
  var audienceSegments: js.UndefOr[js.Array[SchemaAudienceSegment]] = js.undefined
  
  /**
    * ID of this audience segment group. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this audience segment group. This is a required field and must be less than 65 characters long.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAudienceSegmentGroup {
  
  inline def apply(): SchemaAudienceSegmentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAudienceSegmentGroup]
  }
  
  extension [Self <: SchemaAudienceSegmentGroup](x: Self) {
    
    inline def setAudienceSegments(value: js.Array[SchemaAudienceSegment]): Self = StObject.set(x, "audienceSegments", value.asInstanceOf[js.Any])
    
    inline def setAudienceSegmentsUndefined: Self = StObject.set(x, "audienceSegments", js.undefined)
    
    inline def setAudienceSegmentsVarargs(value: SchemaAudienceSegment*): Self = StObject.set(x, "audienceSegments", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
