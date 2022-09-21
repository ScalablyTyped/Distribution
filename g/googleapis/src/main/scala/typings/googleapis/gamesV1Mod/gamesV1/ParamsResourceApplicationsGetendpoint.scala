package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceApplicationsGetendpoint
  extends StObject
     with StandardParameters {
  
  /**
    * The application ID from the Google Play developer console.
    */
  var applicationId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of endpoint being requested.
    */
  var endPointType: js.UndefOr[String] = js.undefined
}
object ParamsResourceApplicationsGetendpoint {
  
  inline def apply(): ParamsResourceApplicationsGetendpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceApplicationsGetendpoint]
  }
  
  extension [Self <: ParamsResourceApplicationsGetendpoint](x: Self) {
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setEndPointType(value: String): Self = StObject.set(x, "endPointType", value.asInstanceOf[js.Any])
    
    inline def setEndPointTypeUndefined: Self = StObject.set(x, "endPointType", js.undefined)
  }
}
