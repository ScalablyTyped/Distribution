package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2BatchUpdateEntityTypesResponse extends StObject {
  
  /** The collection of updated or created entity types. */
  var entityTypes: js.UndefOr[js.Array[GoogleCloudDialogflowV2EntityType]] = js.undefined
}
object GoogleCloudDialogflowV2BatchUpdateEntityTypesResponse {
  
  inline def apply(): GoogleCloudDialogflowV2BatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchUpdateEntityTypesResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowV2BatchUpdateEntityTypesResponse](x: Self) {
    
    inline def setEntityTypes(value: js.Array[GoogleCloudDialogflowV2EntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: GoogleCloudDialogflowV2EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
  }
}
