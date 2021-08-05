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
  
  inline def apply(): SchemaListRoutesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRoutesResponse]
  }
  
  extension [Self <: SchemaListRoutesResponse](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setItems(value: js.Array[SchemaRoute]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaRoute*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: SchemaListMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
