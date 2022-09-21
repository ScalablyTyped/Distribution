package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitesAdd
  extends StObject
     with StandardParameters {
  
  /**
    * The URL of the site to add.
    */
  var siteUrl: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitesAdd {
  
  inline def apply(): ParamsResourceSitesAdd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesAdd]
  }
  
  extension [Self <: ParamsResourceSitesAdd](x: Self) {
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
  }
}
