package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsSitesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the site. Format: accounts/{account\}/sites/{site\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsSitesGet {
  
  inline def apply(): ParamsResourceAccountsSitesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsSitesGet]
  }
  
  extension [Self <: ParamsResourceAccountsSitesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
