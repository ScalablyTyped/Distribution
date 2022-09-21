package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTcproutesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource of the TcpRoute. Must be in the format `projects/x/locations/global`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTcpRoute] = js.undefined
  
  /**
    * Required. Short name of the TcpRoute resource to be created. E.g. TODO(Add an example).
    */
  var tcpRouteId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTcproutesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsTcproutesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTcproutesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTcproutesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaTcpRoute): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTcpRouteId(value: String): Self = StObject.set(x, "tcpRouteId", value.asInstanceOf[js.Any])
    
    inline def setTcpRouteIdUndefined: Self = StObject.set(x, "tcpRouteId", js.undefined)
  }
}
