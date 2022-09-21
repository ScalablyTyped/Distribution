package typings.googleapis.managedidentitiesV1Mod.managedidentitiesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPeeringsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of Managed Identities Service Peerings in the project.
    */
  var peerings: js.UndefOr[js.Array[SchemaPeering]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListPeeringsResponse {
  
  inline def apply(): SchemaListPeeringsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPeeringsResponse]
  }
  
  extension [Self <: SchemaListPeeringsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPeerings(value: js.Array[SchemaPeering]): Self = StObject.set(x, "peerings", value.asInstanceOf[js.Any])
    
    inline def setPeeringsUndefined: Self = StObject.set(x, "peerings", js.undefined)
    
    inline def setPeeringsVarargs(value: SchemaPeering*): Self = StObject.set(x, "peerings", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
