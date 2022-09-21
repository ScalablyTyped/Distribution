package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeature extends StObject {
  
  /**
    * The localized name of this feature. Currently only returned for roads.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The geometry of this feature, representing the space that it occupies in the world.
    */
  var geometry: js.UndefOr[SchemaGeometry] = js.undefined
  
  /**
    * Place ID of this feature, suitable for use in Places API details requests.
    */
  var placeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Relations to other features.
    */
  var relations: js.UndefOr[js.Array[SchemaRelation]] = js.undefined
  
  /**
    * Metadata for features with the SEGMENT FeatureType.
    */
  var segmentInfo: js.UndefOr[SchemaSegmentInfo] = js.undefined
  
  /**
    * The type of this feature.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaFeature {
  
  inline def apply(): SchemaFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeature]
  }
  
  extension [Self <: SchemaFeature](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGeometry(value: SchemaGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setRelations(value: js.Array[SchemaRelation]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    inline def setRelationsVarargs(value: SchemaRelation*): Self = StObject.set(x, "relations", js.Array(value*))
    
    inline def setSegmentInfo(value: SchemaSegmentInfo): Self = StObject.set(x, "segmentInfo", value.asInstanceOf[js.Any])
    
    inline def setSegmentInfoUndefined: Self = StObject.set(x, "segmentInfo", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
