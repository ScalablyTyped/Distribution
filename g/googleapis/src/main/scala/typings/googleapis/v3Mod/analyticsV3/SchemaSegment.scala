package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSegment extends StObject {
  
  /**
    * Time the segment was created.
    */
  var created: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Segment definition.
    */
  var definition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Segment ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for Analytics segment.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Segment name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Segment ID. Can be used with the 'segment' parameter in Core Reporting API.
    */
  var segmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Link for this segment.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type for a segment. Possible values are "BUILT_IN" or "CUSTOM".
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time the segment was last modified.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
}
object SchemaSegment {
  
  inline def apply(): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegment]
  }
  
  extension [Self <: SchemaSegment](x: Self) {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedNull: Self = StObject.set(x, "created", null)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionNull: Self = StObject.set(x, "definition", null)
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdNull: Self = StObject.set(x, "segmentId", null)
    
    inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
