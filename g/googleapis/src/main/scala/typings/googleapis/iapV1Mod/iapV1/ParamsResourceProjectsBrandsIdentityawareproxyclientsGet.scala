package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBrandsIdentityawareproxyclientsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the Identity Aware Proxy client to be fetched. In the following format: projects/{project_number/id\}/brands/{brand\}/identityAwareProxyClients/{client_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsBrandsIdentityawareproxyclientsGet {
  
  inline def apply(): ParamsResourceProjectsBrandsIdentityawareproxyclientsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrandsIdentityawareproxyclientsGet]
  }
  
  extension [Self <: ParamsResourceProjectsBrandsIdentityawareproxyclientsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
