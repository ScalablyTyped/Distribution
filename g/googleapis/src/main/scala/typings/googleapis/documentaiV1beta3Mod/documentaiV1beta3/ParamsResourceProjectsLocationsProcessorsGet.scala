package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsProcessorsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The processor resource name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsProcessorsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsProcessorsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsProcessorsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsProcessorsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
