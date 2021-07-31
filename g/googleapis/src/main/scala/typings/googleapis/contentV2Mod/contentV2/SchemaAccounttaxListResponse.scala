package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccounttaxListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accounttaxListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The token for the retrieval of the next page of account tax settings.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaAccountTax]] = js.undefined
}
object SchemaAccounttaxListResponse {
  
  @scala.inline
  def apply(): SchemaAccounttaxListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccounttaxListResponse]
  }
  
  @scala.inline
  implicit class SchemaAccounttaxListResponseMutableBuilder[Self <: SchemaAccounttaxListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[SchemaAccountTax]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchemaAccountTax*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
