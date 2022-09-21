package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the `Registration` to get, in the format `projects/x/locations/x/registrations/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
