package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mobile app List Response
  */
trait SchemaMobileAppsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileAppsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Mobile apps collection.
    */
  var mobileApps: js.UndefOr[js.Array[SchemaMobileApp]] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaMobileAppsListResponse {
  
  inline def apply(): SchemaMobileAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileAppsListResponse]
  }
  
  extension [Self <: SchemaMobileAppsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMobileApps(value: js.Array[SchemaMobileApp]): Self = StObject.set(x, "mobileApps", value.asInstanceOf[js.Any])
    
    inline def setMobileAppsUndefined: Self = StObject.set(x, "mobileApps", js.undefined)
    
    inline def setMobileAppsVarargs(value: SchemaMobileApp*): Self = StObject.set(x, "mobileApps", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
