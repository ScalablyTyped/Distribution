package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesListResponse extends StObject {
  
  /** Creative collection. */
  var creatives: js.UndefOr[js.Array[Creative]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativesListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object CreativesListResponse {
  
  @scala.inline
  def apply(): CreativesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativesListResponse]
  }
  
  @scala.inline
  implicit class CreativesListResponseMutableBuilder[Self <: CreativesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatives(value: js.Array[Creative]): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativesUndefined: Self = StObject.set(x, "creatives", js.undefined)
    
    @scala.inline
    def setCreativesVarargs(value: Creative*): Self = StObject.set(x, "creatives", js.Array(value :_*))
    
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
