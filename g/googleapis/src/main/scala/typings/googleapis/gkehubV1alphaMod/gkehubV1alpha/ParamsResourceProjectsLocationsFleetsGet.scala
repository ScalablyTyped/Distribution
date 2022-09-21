package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsFleetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Fleet resource name in the format `projects/x/locations/x/fleets/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsFleetsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsFleetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsFleetsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsFleetsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
