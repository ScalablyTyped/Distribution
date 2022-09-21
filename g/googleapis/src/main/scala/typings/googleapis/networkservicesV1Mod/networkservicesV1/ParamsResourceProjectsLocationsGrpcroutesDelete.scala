package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGrpcroutesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the GrpcRoute to delete. Must be in the format `projects/x/locations/global/grpcRoutes/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGrpcroutesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsGrpcroutesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGrpcroutesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGrpcroutesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
