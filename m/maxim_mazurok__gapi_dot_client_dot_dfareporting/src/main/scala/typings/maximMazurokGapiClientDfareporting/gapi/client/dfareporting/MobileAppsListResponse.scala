package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileAppsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#mobileAppsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Mobile apps collection. */
  var mobileApps: js.UndefOr[js.Array[MobileApp]] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object MobileAppsListResponse {
  
  inline def apply(): MobileAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppsListResponse]
  }
  
  extension [Self <: MobileAppsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMobileApps(value: js.Array[MobileApp]): Self = StObject.set(x, "mobileApps", value.asInstanceOf[js.Any])
    
    inline def setMobileAppsUndefined: Self = StObject.set(x, "mobileApps", js.undefined)
    
    inline def setMobileAppsVarargs(value: MobileApp*): Self = StObject.set(x, "mobileApps", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
