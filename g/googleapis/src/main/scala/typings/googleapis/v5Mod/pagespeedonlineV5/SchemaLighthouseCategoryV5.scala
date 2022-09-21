package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLighthouseCategoryV5 extends StObject {
  
  /**
    * An array of references to all the audit members of this category.
    */
  var auditRefs: js.UndefOr[js.Array[SchemaAuditRefs]] = js.undefined
  
  /**
    * A more detailed description of the category and its importance.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The string identifier of the category.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description for the manual audits in the category.
    */
  var manualDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The overall score of the category, the weighted average of all its audits. (The category's score, can be null.)
    */
  var score: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * The human-friendly name of the category.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaLighthouseCategoryV5 {
  
  inline def apply(): SchemaLighthouseCategoryV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLighthouseCategoryV5]
  }
  
  extension [Self <: SchemaLighthouseCategoryV5](x: Self) {
    
    inline def setAuditRefs(value: js.Array[SchemaAuditRefs]): Self = StObject.set(x, "auditRefs", value.asInstanceOf[js.Any])
    
    inline def setAuditRefsUndefined: Self = StObject.set(x, "auditRefs", js.undefined)
    
    inline def setAuditRefsVarargs(value: SchemaAuditRefs*): Self = StObject.set(x, "auditRefs", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setManualDescription(value: String): Self = StObject.set(x, "manualDescription", value.asInstanceOf[js.Any])
    
    inline def setManualDescriptionNull: Self = StObject.set(x, "manualDescription", null)
    
    inline def setManualDescriptionUndefined: Self = StObject.set(x, "manualDescription", js.undefined)
    
    inline def setScore(value: Any): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
