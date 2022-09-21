package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceGoogleserviceaccountsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the Google Cloud project that the Google service account is associated with.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceGoogleserviceaccountsGet {
  
  inline def apply(): ParamsResourceGoogleserviceaccountsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceGoogleserviceaccountsGet]
  }
  
  extension [Self <: ParamsResourceGoogleserviceaccountsGet](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
