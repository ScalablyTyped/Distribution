package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Path to create the client in. In the following format: projects/{project_number/id\}/brands/{brand\}. The project must belong to a G Suite account.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentityAwareProxyClient] = js.undefined
}
object ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate {
  
  inline def apply(): ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsBrandsIdentityawareproxyclientsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaIdentityAwareProxyClient): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
