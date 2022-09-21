package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsGenerateplayintegritychallenge
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the app, in the format: ``` projects/{project_number\}/apps/{app_id\} ``` If necessary, the `project_number` element can be replaced with the project ID of the Firebase project. Learn more about using project identifiers in Google's [AIP 2510](https://google.aip.dev/cloud/2510) standard.
    */
  var app: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleFirebaseAppcheckV1betaGeneratePlayIntegrityChallengeRequest] = js.undefined
}
object ParamsResourceProjectsAppsGenerateplayintegritychallenge {
  
  inline def apply(): ParamsResourceProjectsAppsGenerateplayintegritychallenge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsGenerateplayintegritychallenge]
  }
  
  extension [Self <: ParamsResourceProjectsAppsGenerateplayintegritychallenge](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleFirebaseAppcheckV1betaGeneratePlayIntegrityChallengeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
