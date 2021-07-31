package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#liasettingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The token for the retrieval of the next page of LIA settings.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaLiaSettings]] = js.undefined
}
object SchemaLiasettingsListResponse {
  
  @scala.inline
  def apply(): SchemaLiasettingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsListResponse]
  }
  
  @scala.inline
  implicit class SchemaLiasettingsListResponseMutableBuilder[Self <: SchemaLiasettingsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[SchemaLiaSettings]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchemaLiaSettings*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
