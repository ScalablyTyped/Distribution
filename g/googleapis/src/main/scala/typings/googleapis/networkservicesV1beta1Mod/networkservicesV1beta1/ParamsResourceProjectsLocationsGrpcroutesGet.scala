package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGrpcroutesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the GrpcRoute to get. Must be in the format `projects/x/locations/global/grpcRoutes/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGrpcroutesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsGrpcroutesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGrpcroutesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGrpcroutesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
