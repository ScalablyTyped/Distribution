package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsJobtriggersActivate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the trigger to activate, for example `projects/dlp-test-project/jobTriggers/53234423`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGooglePrivacyDlpV2ActivateJobTriggerRequest] = js.undefined
}
object ParamsResourceProjectsJobtriggersActivate {
  
  inline def apply(): ParamsResourceProjectsJobtriggersActivate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobtriggersActivate]
  }
  
  extension [Self <: ParamsResourceProjectsJobtriggersActivate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGooglePrivacyDlpV2ActivateJobTriggerRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
