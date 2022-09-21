package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentGetvalidationresult
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The language for which you want a validation result. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The project that the agent is associated with. Format: `projects/` or `projects//locations/`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAgentGetvalidationresult {
  
  inline def apply(): ParamsResourceProjectsAgentGetvalidationresult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentGetvalidationresult]
  }
  
  extension [Self <: ParamsResourceProjectsAgentGetvalidationresult](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
