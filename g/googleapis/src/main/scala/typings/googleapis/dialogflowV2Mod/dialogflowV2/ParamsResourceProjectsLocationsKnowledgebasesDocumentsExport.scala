package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKnowledgebasesDocumentsExport
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the document to export. Format: `projects//locations//knowledgeBases//documents/`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2ExportDocumentRequest] = js.undefined
}
object ParamsResourceProjectsLocationsKnowledgebasesDocumentsExport {
  
  inline def apply(): ParamsResourceProjectsLocationsKnowledgebasesDocumentsExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKnowledgebasesDocumentsExport]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKnowledgebasesDocumentsExport](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2ExportDocumentRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
