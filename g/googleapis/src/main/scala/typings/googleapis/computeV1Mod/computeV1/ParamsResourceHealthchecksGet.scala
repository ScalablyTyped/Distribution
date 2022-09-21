package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceHealthchecksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the HealthCheck resource to return.
    */
  var healthCheck: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceHealthchecksGet {
  
  inline def apply(): ParamsResourceHealthchecksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceHealthchecksGet]
  }
  
  extension [Self <: ParamsResourceHealthchecksGet](x: Self) {
    
    inline def setHealthCheck(value: String): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
