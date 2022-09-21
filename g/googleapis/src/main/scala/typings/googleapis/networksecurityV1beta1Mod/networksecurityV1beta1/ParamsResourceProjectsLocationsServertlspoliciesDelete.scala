package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServertlspoliciesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the ServerTlsPolicy to delete. Must be in the format `projects/x/locations/{location\}/serverTlsPolicies/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServertlspoliciesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsServertlspoliciesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServertlspoliciesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServertlspoliciesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
