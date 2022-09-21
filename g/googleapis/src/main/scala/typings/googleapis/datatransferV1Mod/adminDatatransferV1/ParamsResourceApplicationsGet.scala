package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceApplicationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * ID of the application resource to be retrieved.
    */
  var applicationId: js.UndefOr[String] = js.undefined
}
object ParamsResourceApplicationsGet {
  
  inline def apply(): ParamsResourceApplicationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceApplicationsGet]
  }
  
  extension [Self <: ParamsResourceApplicationsGet](x: Self) {
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
  }
}
