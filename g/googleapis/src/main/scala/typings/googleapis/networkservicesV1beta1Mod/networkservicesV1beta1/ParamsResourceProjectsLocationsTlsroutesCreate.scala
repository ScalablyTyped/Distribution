package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTlsroutesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource of the TlsRoute. Must be in the format `projects/x/locations/global`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTlsRoute] = js.undefined
  
  /**
    * Required. Short name of the TlsRoute resource to be created. E.g. TODO(Add an example).
    */
  var tlsRouteId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTlsroutesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsTlsroutesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTlsroutesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTlsroutesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaTlsRoute): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTlsRouteId(value: String): Self = StObject.set(x, "tlsRouteId", value.asInstanceOf[js.Any])
    
    inline def setTlsRouteIdUndefined: Self = StObject.set(x, "tlsRouteId", js.undefined)
  }
}
