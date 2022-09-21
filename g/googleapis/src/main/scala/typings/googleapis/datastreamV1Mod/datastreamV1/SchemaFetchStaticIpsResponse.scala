package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFetchStaticIpsResponse extends StObject {
  
  /**
    * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * list of static ips by account
    */
  var staticIps: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaFetchStaticIpsResponse {
  
  inline def apply(): SchemaFetchStaticIpsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFetchStaticIpsResponse]
  }
  
  extension [Self <: SchemaFetchStaticIpsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setStaticIps(value: js.Array[String]): Self = StObject.set(x, "staticIps", value.asInstanceOf[js.Any])
    
    inline def setStaticIpsNull: Self = StObject.set(x, "staticIps", null)
    
    inline def setStaticIpsUndefined: Self = StObject.set(x, "staticIps", js.undefined)
    
    inline def setStaticIpsVarargs(value: String*): Self = StObject.set(x, "staticIps", js.Array(value*))
  }
}
