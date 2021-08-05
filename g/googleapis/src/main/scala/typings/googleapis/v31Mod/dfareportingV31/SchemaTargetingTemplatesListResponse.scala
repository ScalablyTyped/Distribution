package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Targeting Template List Response
  */
trait SchemaTargetingTemplatesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#targetingTemplatesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Targeting template collection.
    */
  var targetingTemplates: js.UndefOr[js.Array[SchemaTargetingTemplate]] = js.undefined
}
object SchemaTargetingTemplatesListResponse {
  
  inline def apply(): SchemaTargetingTemplatesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingTemplatesListResponse]
  }
  
  extension [Self <: SchemaTargetingTemplatesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTargetingTemplates(value: js.Array[SchemaTargetingTemplate]): Self = StObject.set(x, "targetingTemplates", value.asInstanceOf[js.Any])
    
    inline def setTargetingTemplatesUndefined: Self = StObject.set(x, "targetingTemplates", js.undefined)
    
    inline def setTargetingTemplatesVarargs(value: SchemaTargetingTemplate*): Self = StObject.set(x, "targetingTemplates", js.Array(value :_*))
  }
}
