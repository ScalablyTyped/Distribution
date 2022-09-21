package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKnowledgebasesDocumentsImport
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The knowledge base to import documents into. Format: `projects//locations//knowledgeBases/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1ImportDocumentsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsKnowledgebasesDocumentsImport {
  
  inline def apply(): ParamsResourceProjectsLocationsKnowledgebasesDocumentsImport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKnowledgebasesDocumentsImport]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKnowledgebasesDocumentsImport](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1ImportDocumentsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
