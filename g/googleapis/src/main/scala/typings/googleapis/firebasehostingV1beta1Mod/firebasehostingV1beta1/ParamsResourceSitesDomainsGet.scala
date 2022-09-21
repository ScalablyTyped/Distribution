package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitesDomainsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the domain configuration to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitesDomainsGet {
  
  inline def apply(): ParamsResourceSitesDomainsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesDomainsGet]
  }
  
  extension [Self <: ParamsResourceSitesDomainsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
