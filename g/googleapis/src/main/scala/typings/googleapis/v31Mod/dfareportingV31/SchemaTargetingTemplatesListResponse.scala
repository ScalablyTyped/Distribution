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
  
  @scala.inline
  def apply(): SchemaTargetingTemplatesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetingTemplatesListResponse]
  }
  
  @scala.inline
  implicit class SchemaTargetingTemplatesListResponseMutableBuilder[Self <: SchemaTargetingTemplatesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTargetingTemplates(value: js.Array[SchemaTargetingTemplate]): Self = StObject.set(x, "targetingTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingTemplatesUndefined: Self = StObject.set(x, "targetingTemplates", js.undefined)
    
    @scala.inline
    def setTargetingTemplatesVarargs(value: SchemaTargetingTemplate*): Self = StObject.set(x, "targetingTemplates", js.Array(value :_*))
  }
}
