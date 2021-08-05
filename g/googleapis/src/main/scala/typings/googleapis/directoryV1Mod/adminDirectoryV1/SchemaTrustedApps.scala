package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Trusted Apps response object of a user in Directory API.
  */
trait SchemaTrustedApps extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the resource as trusted apps response.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Trusted Apps list.
    */
  var trustedApps: js.UndefOr[js.Array[SchemaTrustedAppId]] = js.undefined
}
object SchemaTrustedApps {
  
  inline def apply(): SchemaTrustedApps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrustedApps]
  }
  
  extension [Self <: SchemaTrustedApps](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTrustedApps(value: js.Array[SchemaTrustedAppId]): Self = StObject.set(x, "trustedApps", value.asInstanceOf[js.Any])
    
    inline def setTrustedAppsUndefined: Self = StObject.set(x, "trustedApps", js.undefined)
    
    inline def setTrustedAppsVarargs(value: SchemaTrustedAppId*): Self = StObject.set(x, "trustedApps", js.Array(value :_*))
  }
}
