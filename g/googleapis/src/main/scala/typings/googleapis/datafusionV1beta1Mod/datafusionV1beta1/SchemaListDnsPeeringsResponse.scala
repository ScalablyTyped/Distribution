package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDnsPeeringsResponse extends StObject {
  
  /**
    * List of dns peering.
    */
  var dnsPeerings: js.UndefOr[js.Array[SchemaDnsPeering]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDnsPeeringsResponse {
  
  inline def apply(): SchemaListDnsPeeringsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDnsPeeringsResponse]
  }
  
  extension [Self <: SchemaListDnsPeeringsResponse](x: Self) {
    
    inline def setDnsPeerings(value: js.Array[SchemaDnsPeering]): Self = StObject.set(x, "dnsPeerings", value.asInstanceOf[js.Any])
    
    inline def setDnsPeeringsUndefined: Self = StObject.set(x, "dnsPeerings", js.undefined)
    
    inline def setDnsPeeringsVarargs(value: SchemaDnsPeering*): Self = StObject.set(x, "dnsPeerings", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
