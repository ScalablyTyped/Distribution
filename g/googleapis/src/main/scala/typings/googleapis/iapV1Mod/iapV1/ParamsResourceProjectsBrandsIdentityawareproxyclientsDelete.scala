package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the Identity Aware Proxy client to be deleted. In the following format: projects/{project_number/id\}/brands/{brand\}/identityAwareProxyClients/{client_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete {
  
  inline def apply(): ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsBrandsIdentityawareproxyclientsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
