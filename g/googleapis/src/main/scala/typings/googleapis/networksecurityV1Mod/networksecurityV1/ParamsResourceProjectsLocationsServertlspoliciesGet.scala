package typings.googleapis.networksecurityV1Mod.networksecurityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServertlspoliciesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the ServerTlsPolicy to get. Must be in the format `projects/x/locations/{location\}/serverTlsPolicies/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServertlspoliciesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsServertlspoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServertlspoliciesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServertlspoliciesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
