package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMembershipsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Membership resource name in the format `projects/x/locations/x/memberships/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsMembershipsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsMembershipsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMembershipsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMembershipsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
