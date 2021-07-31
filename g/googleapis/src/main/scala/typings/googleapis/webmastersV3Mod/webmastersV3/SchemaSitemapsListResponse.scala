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
  
  @scala.inline
  def apply(): SchemaSitemapsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSitemapsListResponse]
  }
  
  @scala.inline
  implicit class SchemaSitemapsListResponseMutableBuilder[Self <: SchemaSitemapsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSitemap(value: js.Array[SchemaWmxSitemap]): Self = StObject.set(x, "sitemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSitemapUndefined: Self = StObject.set(x, "sitemap", js.undefined)
    
    @scala.inline
    def setSitemapVarargs(value: SchemaWmxSitemap*): Self = StObject.set(x, "sitemap", js.Array(value :_*))
  }
}
