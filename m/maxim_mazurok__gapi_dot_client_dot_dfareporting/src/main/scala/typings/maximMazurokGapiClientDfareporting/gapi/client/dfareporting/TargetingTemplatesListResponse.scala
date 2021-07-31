package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetingTemplatesListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetingTemplatesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Targeting template collection. */
  var targetingTemplates: js.UndefOr[js.Array[TargetingTemplate]] = js.undefined
}
object TargetingTemplatesListResponse {
  
  @scala.inline
  def apply(): TargetingTemplatesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingTemplatesListResponse]
  }
  
  @scala.inline
  implicit class TargetingTemplatesListResponseMutableBuilder[Self <: TargetingTemplatesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTargetingTemplates(value: js.Array[TargetingTemplate]): Self = StObject.set(x, "targetingTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingTemplatesUndefined: Self = StObject.set(x, "targetingTemplates", js.undefined)
    
    @scala.inline
    def setTargetingTemplatesVarargs(value: TargetingTemplate*): Self = StObject.set(x, "targetingTemplates", js.Array(value :_*))
  }
}
