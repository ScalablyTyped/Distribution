package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAdminClusterMembershipsResponse extends StObject {
  
  /**
    * The list of matching Memberships of admin clusters.
    */
  var adminClusterMemberships: js.UndefOr[js.Array[SchemaMembership]] = js.undefined
  
  /**
    * A token to request the next page of resources from the `ListAdminClusterMemberships` method. The value of an empty string means that there are no more resources to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of locations that could not be reached while fetching this list.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListAdminClusterMembershipsResponse {
  
  inline def apply(): SchemaListAdminClusterMembershipsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAdminClusterMembershipsResponse]
  }
  
  extension [Self <: SchemaListAdminClusterMembershipsResponse](x: Self) {
    
    inline def setAdminClusterMemberships(value: js.Array[SchemaMembership]): Self = StObject.set(x, "adminClusterMemberships", value.asInstanceOf[js.Any])
    
    inline def setAdminClusterMembershipsUndefined: Self = StObject.set(x, "adminClusterMemberships", js.undefined)
    
    inline def setAdminClusterMembershipsVarargs(value: SchemaMembership*): Self = StObject.set(x, "adminClusterMemberships", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
