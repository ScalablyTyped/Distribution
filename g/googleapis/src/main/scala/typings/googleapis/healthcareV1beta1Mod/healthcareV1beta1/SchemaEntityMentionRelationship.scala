package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEntityMentionRelationship extends StObject {
  
  /**
    * The model's confidence in this annotation. A number between 0 and 1.
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * object_id is the id of the object entity mention.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * subject_id is the id of the subject entity mention.
    */
  var subjectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaEntityMentionRelationship {
  
  inline def apply(): SchemaEntityMentionRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntityMentionRelationship]
  }
  
  extension [Self <: SchemaEntityMentionRelationship](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setSubjectId(value: String): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setSubjectIdNull: Self = StObject.set(x, "subjectId", null)
    
    inline def setSubjectIdUndefined: Self = StObject.set(x, "subjectId", js.undefined)
  }
}
