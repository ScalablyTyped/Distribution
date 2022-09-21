package typings.googleapis.networksecurityV1Mod.networksecurityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClienttlspoliciesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the ClientTlsPolicy to delete. Must be in the format `projects/x/locations/{location\}/clientTlsPolicies/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsClienttlspoliciesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsClienttlspoliciesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClienttlspoliciesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClienttlspoliciesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
