package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsRecaptchaconfigGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource name of the RecaptchaConfig, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaConfig ```
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsRecaptchaconfigGet {
  
  inline def apply(): ParamsResourceProjectsAppsRecaptchaconfigGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsRecaptchaconfigGet]
  }
  
  extension [Self <: ParamsResourceProjectsAppsRecaptchaconfigGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
