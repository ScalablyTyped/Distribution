package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTunnelDestGroupsResponse extends StObject {
  
  /**
    * A token that you can send as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * TunnelDestGroup existing in the project.
    */
  var tunnelDestGroups: js.UndefOr[js.Array[SchemaTunnelDestGroup]] = js.undefined
}
object SchemaListTunnelDestGroupsResponse {
  
  inline def apply(): SchemaListTunnelDestGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTunnelDestGroupsResponse]
  }
  
  extension [Self <: SchemaListTunnelDestGroupsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTunnelDestGroups(value: js.Array[SchemaTunnelDestGroup]): Self = StObject.set(x, "tunnelDestGroups", value.asInstanceOf[js.Any])
    
    inline def setTunnelDestGroupsUndefined: Self = StObject.set(x, "tunnelDestGroups", js.undefined)
    
    inline def setTunnelDestGroupsVarargs(value: SchemaTunnelDestGroup*): Self = StObject.set(x, "tunnelDestGroups", js.Array(value*))
  }
}
