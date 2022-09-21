package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConversationdatasetsImportconversationdata
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
object ParamsResourceProjectsLocationsConversationdatasetsImportconversationdata {
  
  inline def apply(): ParamsResourceProjectsLocationsConversationdatasetsImportconversationdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConversationdatasetsImportconversationdata]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConversationdatasetsImportconversationdata](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2ImportConversationDataRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
