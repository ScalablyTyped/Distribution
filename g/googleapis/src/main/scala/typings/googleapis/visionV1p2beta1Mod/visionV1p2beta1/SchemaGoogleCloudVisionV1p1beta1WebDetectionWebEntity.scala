package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity extends StObject {
  
  /**
    * Canonical description of the entity, in English.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Opaque entity ID.
    */
  var entityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Overall relevancy score for the entity. Not normalized and not comparable across different image queries.
    */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1WebDetectionWebEntity](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdNull: Self = StObject.set(x, "entityId", null)
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
