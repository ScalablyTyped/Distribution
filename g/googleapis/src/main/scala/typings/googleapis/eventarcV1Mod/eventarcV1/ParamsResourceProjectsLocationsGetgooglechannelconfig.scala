package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGetgooglechannelconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the config to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGetgooglechannelconfig {
  
  inline def apply(): ParamsResourceProjectsLocationsGetgooglechannelconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGetgooglechannelconfig]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGetgooglechannelconfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
