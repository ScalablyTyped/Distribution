package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsFeaturesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Feature resource name in the format `projects/x/locations/x/features/x`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsFeaturesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsFeaturesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFeaturesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsFeaturesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
