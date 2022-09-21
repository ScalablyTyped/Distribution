package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitemapsList
  extends StObject
     with StandardParameters {
  
  /**
    * The site's URL, including protocol. For example: `http://www.example.com/`.
    */
  var siteUrl: js.UndefOr[String] = js.undefined
  
  /**
    *  A URL of a site's sitemap index. For example: `http://www.example.com/sitemapindex.xml`.
    */
  var sitemapIndex: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitemapsList {
  
  inline def apply(): ParamsResourceSitemapsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitemapsList]
  }
  
  extension [Self <: ParamsResourceSitemapsList](x: Self) {
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
    
    inline def setSitemapIndex(value: String): Self = StObject.set(x, "sitemapIndex", value.asInstanceOf[js.Any])
    
    inline def setSitemapIndexUndefined: Self = StObject.set(x, "sitemapIndex", js.undefined)
  }
}
