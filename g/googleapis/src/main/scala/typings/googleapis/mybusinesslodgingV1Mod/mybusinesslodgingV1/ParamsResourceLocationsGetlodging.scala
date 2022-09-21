package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsGetlodging
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Google identifier for this location in the form: `locations/{location_id\}/lodging`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The specific fields to return. Use "*" to include all fields. Repeated field items cannot be individually specified.
    */
  var readMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsGetlodging {
  
  inline def apply(): ParamsResourceLocationsGetlodging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsGetlodging]
  }
  
  extension [Self <: ParamsResourceLocationsGetlodging](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
  }
}
