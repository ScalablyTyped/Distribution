package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativeFieldsListResponse extends StObject {
  
  /** Creative field collection. */
  var creativeFields: js.UndefOr[js.Array[CreativeField]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeFieldsListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object CreativeFieldsListResponse {
  
  @scala.inline
  def apply(): CreativeFieldsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeFieldsListResponse]
  }
  
  @scala.inline
  implicit class CreativeFieldsListResponseMutableBuilder[Self <: CreativeFieldsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeFields(value: js.Array[CreativeField]): Self = StObject.set(x, "creativeFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFieldsUndefined: Self = StObject.set(x, "creativeFields", js.undefined)
    
    @scala.inline
    def setCreativeFieldsVarargs(value: CreativeField*): Self = StObject.set(x, "creativeFields", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
