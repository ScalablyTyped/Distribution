package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest extends StObject {
  
  /** Required. The names entity types to delete. All names must point to the same agent as `parent`. */
  var entityTypeNames: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest {
  
  inline def apply(): GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowV2BatchDeleteEntityTypesRequest](x: Self) {
    
    inline def setEntityTypeNames(value: js.Array[String]): Self = StObject.set(x, "entityTypeNames", value.asInstanceOf[js.Any])
    
    inline def setEntityTypeNamesUndefined: Self = StObject.set(x, "entityTypeNames", js.undefined)
    
    inline def setEntityTypeNamesVarargs(value: String*): Self = StObject.set(x, "entityTypeNames", js.Array(value :_*))
  }
}
