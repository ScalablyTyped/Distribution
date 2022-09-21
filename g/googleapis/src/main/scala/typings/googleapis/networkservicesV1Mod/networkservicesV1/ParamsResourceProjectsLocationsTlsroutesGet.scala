package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTlsroutesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the TlsRoute to get. Must be in the format `projects/x/locations/global/tlsRoutes/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTlsroutesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsTlsroutesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTlsroutesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTlsroutesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
