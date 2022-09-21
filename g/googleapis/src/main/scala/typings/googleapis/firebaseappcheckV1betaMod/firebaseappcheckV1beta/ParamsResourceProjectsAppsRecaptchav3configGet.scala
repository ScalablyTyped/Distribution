package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsRecaptchav3configGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the RecaptchaV3Config, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaV3Config ```
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsRecaptchav3configGet {
  
  inline def apply(): ParamsResourceProjectsAppsRecaptchav3configGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsRecaptchav3configGet]
  }
  
  extension [Self <: ParamsResourceProjectsAppsRecaptchav3configGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
