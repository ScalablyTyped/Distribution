package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsGetvalidationresult
  extends StObject
     with StandardParameters {
  
  /**
    * If not specified, the agent's default language is used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The agent name. Format: `projects//locations//agents//validationResult`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsGetvalidationresult {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsGetvalidationresult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsGetvalidationresult]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsGetvalidationresult](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
