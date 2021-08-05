package typings.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of sitemaps.
  */
trait SchemaSitemapsListResponse extends StObject {
  
  /**
    * Contains detailed information about a specific URL submitted as a
    * sitemap.
    */
  var sitemap: js.UndefOr[js.Array[SchemaWmxSitemap]] = js.undefined
}
object SchemaSitemapsListResponse {
  
  inline def apply(): SchemaSitemapsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSitemapsListResponse]
  }
  
  extension [Self <: SchemaSitemapsListResponse](x: Self) {
    
    inline def setSitemap(value: js.Array[SchemaWmxSitemap]): Self = StObject.set(x, "sitemap", value.asInstanceOf[js.Any])
    
    inline def setSitemapUndefined: Self = StObject.set(x, "sitemap", js.undefined)
    
    inline def setSitemapVarargs(value: SchemaWmxSitemap*): Self = StObject.set(x, "sitemap", js.Array(value :_*))
  }
}
