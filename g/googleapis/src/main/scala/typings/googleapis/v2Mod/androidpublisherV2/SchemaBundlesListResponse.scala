package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBundlesListResponse extends StObject {
  
  var bundles: js.UndefOr[js.Array[SchemaBundle]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#bundlesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaBundlesListResponse {
  
  inline def apply(): SchemaBundlesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBundlesListResponse]
  }
  
  extension [Self <: SchemaBundlesListResponse](x: Self) {
    
    inline def setBundles(value: js.Array[SchemaBundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: SchemaBundle*): Self = StObject.set(x, "bundles", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
