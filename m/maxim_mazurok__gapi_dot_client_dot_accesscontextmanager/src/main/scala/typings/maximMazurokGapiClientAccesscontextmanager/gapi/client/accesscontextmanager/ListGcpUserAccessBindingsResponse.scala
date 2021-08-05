package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGcpUserAccessBindingsResponse extends StObject {
  
  /** GcpUserAccessBinding */
  var gcpUserAccessBindings: js.UndefOr[js.Array[GcpUserAccessBinding]] = js.undefined
  
  /** Token to get the next page of items. If blank, there are no more items. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListGcpUserAccessBindingsResponse {
  
  inline def apply(): ListGcpUserAccessBindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGcpUserAccessBindingsResponse]
  }
  
  extension [Self <: ListGcpUserAccessBindingsResponse](x: Self) {
    
    inline def setGcpUserAccessBindings(value: js.Array[GcpUserAccessBinding]): Self = StObject.set(x, "gcpUserAccessBindings", value.asInstanceOf[js.Any])
    
    inline def setGcpUserAccessBindingsUndefined: Self = StObject.set(x, "gcpUserAccessBindings", js.undefined)
    
    inline def setGcpUserAccessBindingsVarargs(value: GcpUserAccessBinding*): Self = StObject.set(x, "gcpUserAccessBindings", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
