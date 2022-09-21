package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConversationdatasetsImportconversationdata
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Dataset resource name. Format: `projects//locations//conversationDatasets/`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2ImportConversationDataRequest] = js.undefined
}
object ParamsResourceProjectsConversationdatasetsImportconversationdata {
  
  inline def apply(): ParamsResourceProjectsConversationdatasetsImportconversationdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConversationdatasetsImportconversationdata]
  }
  
  extension [Self <: ParamsResourceProjectsConversationdatasetsImportconversationdata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2ImportConversationDataRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
