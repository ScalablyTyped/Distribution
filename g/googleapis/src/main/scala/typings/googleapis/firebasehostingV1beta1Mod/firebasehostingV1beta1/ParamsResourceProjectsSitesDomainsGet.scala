package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSitesDomainsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the domain configuration to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSitesDomainsGet {
  
  inline def apply(): ParamsResourceProjectsSitesDomainsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSitesDomainsGet]
  }
  
  extension [Self <: ParamsResourceProjectsSitesDomainsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
