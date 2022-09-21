package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConversationdatasetsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The conversation dataset to retrieve. Format: `projects//locations//conversationDatasets/`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsConversationdatasetsGet {
  
  inline def apply(): ParamsResourceProjectsConversationdatasetsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConversationdatasetsGet]
  }
  
  extension [Self <: ParamsResourceProjectsConversationdatasetsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
