package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDnsPeeringsResponse extends StObject {
  
  /** List of dns peering. */
  var dnsPeerings: js.UndefOr[js.Array[DnsPeering]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDnsPeeringsResponse {
  
  inline def apply(): ListDnsPeeringsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDnsPeeringsResponse]
  }
  
  extension [Self <: ListDnsPeeringsResponse](x: Self) {
    
    inline def setDnsPeerings(value: js.Array[DnsPeering]): Self = StObject.set(x, "dnsPeerings", value.asInstanceOf[js.Any])
    
    inline def setDnsPeeringsUndefined: Self = StObject.set(x, "dnsPeerings", js.undefined)
    
    inline def setDnsPeeringsVarargs(value: DnsPeering*): Self = StObject.set(x, "dnsPeerings", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
