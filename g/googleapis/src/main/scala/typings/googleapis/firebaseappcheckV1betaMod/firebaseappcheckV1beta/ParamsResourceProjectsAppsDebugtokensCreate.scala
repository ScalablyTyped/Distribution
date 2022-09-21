package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsDebugtokensCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the parent app in which the specified DebugToken will be created, in the format: ``` projects/{project_number\}/apps/{app_id\} ```
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleFirebaseAppcheckV1betaDebugToken] = js.undefined
}
object ParamsResourceProjectsAppsDebugtokensCreate {
  
  inline def apply(): ParamsResourceProjectsAppsDebugtokensCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsDebugtokensCreate]
  }
  
  extension [Self <: ParamsResourceProjectsAppsDebugtokensCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleFirebaseAppcheckV1betaDebugToken): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
