package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudienceSegmentGroup extends StObject {
  
  /** Audience segments assigned to this group. The number of segments must be between 2 and 100. */
  var audienceSegments: js.UndefOr[js.Array[AudienceSegment]] = js.undefined
  
  /** ID of this audience segment group. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Name of this audience segment group. This is a required field and must be less than 65 characters long. */
  var name: js.UndefOr[String] = js.undefined
}
object AudienceSegmentGroup {
  
  inline def apply(): AudienceSegmentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudienceSegmentGroup]
  }
  
  extension [Self <: AudienceSegmentGroup](x: Self) {
    
    inline def setAudienceSegments(value: js.Array[AudienceSegment]): Self = StObject.set(x, "audienceSegments", value.asInstanceOf[js.Any])
    
    inline def setAudienceSegmentsUndefined: Self = StObject.set(x, "audienceSegments", js.undefined)
    
    inline def setAudienceSegmentsVarargs(value: AudienceSegment*): Self = StObject.set(x, "audienceSegments", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
