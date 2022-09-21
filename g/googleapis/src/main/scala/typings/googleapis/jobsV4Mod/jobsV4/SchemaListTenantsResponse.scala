package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTenantsResponse extends StObject {
  
  /**
    * Additional information for the API invocation, such as the request tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.undefined
  
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tenants for the current client.
    */
  var tenants: js.UndefOr[js.Array[SchemaTenant]] = js.undefined
}
object SchemaListTenantsResponse {
  
  inline def apply(): SchemaListTenantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTenantsResponse]
  }
  
  extension [Self <: SchemaListTenantsResponse](x: Self) {
    
    inline def setMetadata(value: SchemaResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTenants(value: js.Array[SchemaTenant]): Self = StObject.set(x, "tenants", value.asInstanceOf[js.Any])
    
    inline def setTenantsUndefined: Self = StObject.set(x, "tenants", js.undefined)
    
    inline def setTenantsVarargs(value: SchemaTenant*): Self = StObject.set(x, "tenants", js.Array(value*))
  }
}
