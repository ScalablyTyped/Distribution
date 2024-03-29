package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKnowledgebasesDocumentsReload
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the document to reload. Format: `projects//locations//knowledgeBases//documents/`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1ReloadDocumentRequest] = js.undefined
}
object ParamsResourceProjectsLocationsKnowledgebasesDocumentsReload {
  
  inline def apply(): ParamsResourceProjectsLocationsKnowledgebasesDocumentsReload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKnowledgebasesDocumentsReload]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKnowledgebasesDocumentsReload](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1ReloadDocumentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
