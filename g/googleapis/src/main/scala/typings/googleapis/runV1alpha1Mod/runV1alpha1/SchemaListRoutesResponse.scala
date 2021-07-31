package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListRoutesResponse is a list of Route resources.
  */
trait SchemaListRoutesResponse extends StObject {
  
  /**
    * The API version for this call such as &quot;v1alpha1&quot;.
    */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * List of Routes.
    */
  var items: js.UndefOr[js.Array[SchemaRoute]] = js.undefined
  
  /**
    * The kind of this resource, in this case always &quot;RouteList&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata associated with this Route list.
    */
  var metadata: js.UndefOr[SchemaListMeta] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaListRoutesResponse {
  
  @scala.inline
  def apply(): SchemaListRoutesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRoutesResponse]
  }
  
  @scala.inline
  implicit class SchemaListRoutesResponseMutableBuilder[Self <: SchemaListRoutesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaRoute]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaRoute*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaListMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
