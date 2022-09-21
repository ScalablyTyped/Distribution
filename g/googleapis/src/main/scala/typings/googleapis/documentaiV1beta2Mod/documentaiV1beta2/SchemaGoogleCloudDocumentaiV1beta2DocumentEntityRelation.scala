package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2DocumentEntityRelation extends StObject {
  
  /**
    * Object entity id.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Relationship description.
    */
  var relation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subject entity id.
    */
  var subjectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2DocumentEntityRelation {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2DocumentEntityRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2DocumentEntityRelation]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2DocumentEntityRelation](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setRelation(value: String): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setRelationNull: Self = StObject.set(x, "relation", null)
    
    inline def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
    
    inline def setSubjectId(value: String): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setSubjectIdNull: Self = StObject.set(x, "subjectId", null)
    
    inline def setSubjectIdUndefined: Self = StObject.set(x, "subjectId", js.undefined)
  }
}
