package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTlsroutesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the TlsRoute to delete. Must be in the format `projects/x/locations/global/tlsRoutes/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTlsroutesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsTlsroutesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTlsroutesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTlsroutesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
