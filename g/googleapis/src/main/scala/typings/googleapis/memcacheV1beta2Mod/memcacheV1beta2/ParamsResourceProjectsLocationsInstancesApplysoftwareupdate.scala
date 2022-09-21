package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesApplysoftwareupdate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the Memcached instance for which software update should be applied.
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApplySoftwareUpdateRequest] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesApplysoftwareupdate {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesApplysoftwareupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesApplysoftwareupdate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesApplysoftwareupdate](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setRequestBody(value: SchemaApplySoftwareUpdateRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
