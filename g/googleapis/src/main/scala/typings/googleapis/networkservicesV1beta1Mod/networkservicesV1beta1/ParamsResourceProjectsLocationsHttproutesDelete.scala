package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsHttproutesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the HttpRoute to delete. Must be in the format `projects/x/locations/global/httpRoutes/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsHttproutesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsHttproutesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsHttproutesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsHttproutesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
