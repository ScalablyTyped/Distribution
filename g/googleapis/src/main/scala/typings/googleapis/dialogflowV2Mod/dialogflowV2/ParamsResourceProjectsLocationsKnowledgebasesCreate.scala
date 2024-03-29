package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKnowledgebasesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The project to create a knowledge base for. Format: `projects//locations/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2KnowledgeBase] = js.undefined
}
object ParamsResourceProjectsLocationsKnowledgebasesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsKnowledgebasesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKnowledgebasesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKnowledgebasesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2KnowledgeBase): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
