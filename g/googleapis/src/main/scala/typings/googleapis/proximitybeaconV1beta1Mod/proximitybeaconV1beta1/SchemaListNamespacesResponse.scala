package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to ListNamespacesRequest that contains all the project&#39;s
  * namespaces.
  */
trait SchemaListNamespacesResponse extends StObject {
  
  /**
    * The attachments that corresponded to the request params.
    */
  var namespaces: js.UndefOr[js.Array[SchemaNamespace]] = js.undefined
}
object SchemaListNamespacesResponse {
  
  inline def apply(): SchemaListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNamespacesResponse]
  }
  
  extension [Self <: SchemaListNamespacesResponse](x: Self) {
    
    inline def setNamespaces(value: js.Array[SchemaNamespace]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
    
    inline def setNamespacesVarargs(value: SchemaNamespace*): Self = StObject.set(x, "namespaces", js.Array(value :_*))
  }
}
