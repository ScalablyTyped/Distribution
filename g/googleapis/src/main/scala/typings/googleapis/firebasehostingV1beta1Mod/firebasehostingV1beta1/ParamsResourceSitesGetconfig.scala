package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitesGetconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The site for which to get the SiteConfig, in the format: sites/ site-name/config
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitesGetconfig {
  
  inline def apply(): ParamsResourceSitesGetconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesGetconfig]
  }
  
  extension [Self <: ParamsResourceSitesGetconfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
