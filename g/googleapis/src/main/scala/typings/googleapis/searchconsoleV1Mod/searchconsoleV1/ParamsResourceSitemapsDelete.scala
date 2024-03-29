package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitemapsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The URL of the actual sitemap. For example: `http://www.example.com/sitemap.xml`.
    */
  var feedpath: js.UndefOr[String] = js.undefined
  
  /**
    * The site's URL, including protocol. For example: `http://www.example.com/`.
    */
  var siteUrl: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitemapsDelete {
  
  inline def apply(): ParamsResourceSitemapsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitemapsDelete]
  }
  
  extension [Self <: ParamsResourceSitemapsDelete](x: Self) {
    
    inline def setFeedpath(value: String): Self = StObject.set(x, "feedpath", value.asInstanceOf[js.Any])
    
    inline def setFeedpathUndefined: Self = StObject.set(x, "feedpath", js.undefined)
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
