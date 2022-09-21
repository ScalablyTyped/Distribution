package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDatastoreAdminV1EntityFilter extends StObject {
  
  /**
    * If empty, then this represents all kinds.
    */
  var kinds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * An empty list represents all namespaces. This is the preferred usage for projects that don't use namespaces. An empty string element represents the default namespace. This should be used if the project has data in non-default namespaces, but doesn't want to include them. Each namespace in this list must be unique.
    */
  var namespaceIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleDatastoreAdminV1EntityFilter {
  
  inline def apply(): SchemaGoogleDatastoreAdminV1EntityFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1EntityFilter]
  }
  
  extension [Self <: SchemaGoogleDatastoreAdminV1EntityFilter](x: Self) {
    
    inline def setKinds(value: js.Array[String]): Self = StObject.set(x, "kinds", value.asInstanceOf[js.Any])
    
    inline def setKindsNull: Self = StObject.set(x, "kinds", null)
    
    inline def setKindsUndefined: Self = StObject.set(x, "kinds", js.undefined)
    
    inline def setKindsVarargs(value: String*): Self = StObject.set(x, "kinds", js.Array(value*))
    
    inline def setNamespaceIds(value: js.Array[String]): Self = StObject.set(x, "namespaceIds", value.asInstanceOf[js.Any])
    
    inline def setNamespaceIdsNull: Self = StObject.set(x, "namespaceIds", null)
    
    inline def setNamespaceIdsUndefined: Self = StObject.set(x, "namespaceIds", js.undefined)
    
    inline def setNamespaceIdsVarargs(value: String*): Self = StObject.set(x, "namespaceIds", js.Array(value*))
  }
}
