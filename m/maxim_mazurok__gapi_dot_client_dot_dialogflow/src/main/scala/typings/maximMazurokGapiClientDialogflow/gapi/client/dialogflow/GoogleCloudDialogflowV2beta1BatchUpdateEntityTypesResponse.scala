package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse extends StObject {
  
  /** The collection of updated or created entity types. */
  var entityTypes: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1EntityType]] = js.undefined
}
object GoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse {
  
  inline def apply(): GoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse](x: Self) {
    
    inline def setEntityTypes(value: js.Array[GoogleCloudDialogflowV2beta1EntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: GoogleCloudDialogflowV2beta1EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
  }
}
