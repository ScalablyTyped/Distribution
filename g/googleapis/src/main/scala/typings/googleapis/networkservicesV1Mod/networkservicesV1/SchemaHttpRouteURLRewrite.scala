package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteURLRewrite extends StObject {
  
  /**
    * Prior to forwarding the request to the selected destination, the requests host header is replaced by this value.
    */
  var hostRewrite: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Prior to forwarding the request to the selected destination, the matching portion of the requests path is replaced by this value.
    */
  var pathPrefixRewrite: js.UndefOr[String | Null] = js.undefined
}
object SchemaHttpRouteURLRewrite {
  
  inline def apply(): SchemaHttpRouteURLRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteURLRewrite]
  }
  
  extension [Self <: SchemaHttpRouteURLRewrite](x: Self) {
    
    inline def setHostRewrite(value: String): Self = StObject.set(x, "hostRewrite", value.asInstanceOf[js.Any])
    
    inline def setHostRewriteNull: Self = StObject.set(x, "hostRewrite", null)
    
    inline def setHostRewriteUndefined: Self = StObject.set(x, "hostRewrite", js.undefined)
    
    inline def setPathPrefixRewrite(value: String): Self = StObject.set(x, "pathPrefixRewrite", value.asInstanceOf[js.Any])
    
    inline def setPathPrefixRewriteNull: Self = StObject.set(x, "pathPrefixRewrite", null)
    
    inline def setPathPrefixRewriteUndefined: Self = StObject.set(x, "pathPrefixRewrite", js.undefined)
  }
}
