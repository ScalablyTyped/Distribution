package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAbuseReport extends StObject {
  
  var abuseTypes: js.UndefOr[js.Array[SchemaAbuseType]] = js.undefined
  
  var description: js.UndefOr[String | Null] = js.undefined
  
  var relatedEntities: js.UndefOr[js.Array[SchemaRelatedEntity]] = js.undefined
  
  var subject: js.UndefOr[SchemaEntity] = js.undefined
}
object SchemaAbuseReport {
  
  inline def apply(): SchemaAbuseReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAbuseReport]
  }
  
  extension [Self <: SchemaAbuseReport](x: Self) {
    
    inline def setAbuseTypes(value: js.Array[SchemaAbuseType]): Self = StObject.set(x, "abuseTypes", value.asInstanceOf[js.Any])
    
    inline def setAbuseTypesUndefined: Self = StObject.set(x, "abuseTypes", js.undefined)
    
    inline def setAbuseTypesVarargs(value: SchemaAbuseType*): Self = StObject.set(x, "abuseTypes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setRelatedEntities(value: js.Array[SchemaRelatedEntity]): Self = StObject.set(x, "relatedEntities", value.asInstanceOf[js.Any])
    
    inline def setRelatedEntitiesUndefined: Self = StObject.set(x, "relatedEntities", js.undefined)
    
    inline def setRelatedEntitiesVarargs(value: SchemaRelatedEntity*): Self = StObject.set(x, "relatedEntities", js.Array(value*))
    
    inline def setSubject(value: SchemaEntity): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
