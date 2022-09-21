package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelation extends StObject {
  
  /**
    * Zero-based index to look up the related feature from the list of features in the tile.
    */
  var relatedFeatureIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Relation type between the origin feature to the related feature.
    */
  var relationType: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelation {
  
  inline def apply(): SchemaRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelation]
  }
  
  extension [Self <: SchemaRelation](x: Self) {
    
    inline def setRelatedFeatureIndex(value: Double): Self = StObject.set(x, "relatedFeatureIndex", value.asInstanceOf[js.Any])
    
    inline def setRelatedFeatureIndexNull: Self = StObject.set(x, "relatedFeatureIndex", null)
    
    inline def setRelatedFeatureIndexUndefined: Self = StObject.set(x, "relatedFeatureIndex", js.undefined)
    
    inline def setRelationType(value: String): Self = StObject.set(x, "relationType", value.asInstanceOf[js.Any])
    
    inline def setRelationTypeNull: Self = StObject.set(x, "relationType", null)
    
    inline def setRelationTypeUndefined: Self = StObject.set(x, "relationType", js.undefined)
  }
}
