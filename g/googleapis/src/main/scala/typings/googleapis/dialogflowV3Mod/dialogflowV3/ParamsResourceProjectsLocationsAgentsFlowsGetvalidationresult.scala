package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult
  extends StObject
     with StandardParameters {
  
  /**
    * If not specified, the agent's default language is used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The flow name. Format: `projects//locations//agents//flows//validationResult`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsFlowsGetvalidationresult](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
