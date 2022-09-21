package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMembershipsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Membership resource name in the format `projects/x/locations/x/memberships/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsMembershipsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsMembershipsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMembershipsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMembershipsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
