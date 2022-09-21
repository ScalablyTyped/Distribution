package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsGetattributes
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Google identifier for this location in the form of `locations/{location_id\}/attributes`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsGetattributes {
  
  inline def apply(): ParamsResourceLocationsGetattributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsGetattributes]
  }
  
  extension [Self <: ParamsResourceLocationsGetattributes](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
