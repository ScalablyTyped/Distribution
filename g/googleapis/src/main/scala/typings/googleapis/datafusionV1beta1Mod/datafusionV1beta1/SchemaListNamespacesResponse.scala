package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListNamespacesResponse extends StObject {
  
  /**
    * List of namespaces
    */
  var namespaces: js.UndefOr[js.Array[SchemaNamespace]] = js.undefined
  
  /**
    * Token to retrieve the next page of results or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListNamespacesResponse {
  
  inline def apply(): SchemaListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNamespacesResponse]
  }
  
  extension [Self <: SchemaListNamespacesResponse](x: Self) {
    
    inline def setNamespaces(value: js.Array[SchemaNamespace]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    inline def setNamespacesVarargs(value: SchemaNamespace*): Self = StObject.set(x, "namespaces", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
