package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAppsRecaptchaconfigBatchget
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The relative resource names of the RecaptchaConfigs to retrieve, in the format: ``` projects/{project_number\}/apps/{app_id\}/recaptchaConfig ``` A maximum of 100 objects can be retrieved in a batch.
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The parent project name shared by all RecaptchaConfigs being retrieved, in the format ``` projects/{project_number\} ``` The parent collection in the `name` field of any resource being retrieved must match this field, or the entire batch fails.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAppsRecaptchaconfigBatchget {
  
  inline def apply(): ParamsResourceProjectsAppsRecaptchaconfigBatchget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAppsRecaptchaconfigBatchget]
  }
  
  extension [Self <: ParamsResourceProjectsAppsRecaptchaconfigBatchget](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
