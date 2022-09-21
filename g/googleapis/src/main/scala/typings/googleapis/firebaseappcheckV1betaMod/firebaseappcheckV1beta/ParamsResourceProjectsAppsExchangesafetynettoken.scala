package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsExchangesafetynettoken
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the Android app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    */
  var app: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleFirebaseAppcheckV1betaExchangeSafetyNetTokenRequest] = js.undefined
}
object ParamsResourceProjectsAppsExchangesafetynettoken {
  
  inline def apply(): ParamsResourceProjectsAppsExchangesafetynettoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsExchangesafetynettoken]
  }
  
  extension [Self <: ParamsResourceProjectsAppsExchangesafetynettoken](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleFirebaseAppcheckV1betaExchangeSafetyNetTokenRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
